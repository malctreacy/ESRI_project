import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

class ParaBankTest {
    public String baseURL = "https://parabank.parasoft.com/parabank/index.htm";
    public FirefoxDriver driver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get(baseURL);
    }

    @AfterEach
    public void end(){
        driver.quit();
    }

    @Test()
    void testLoginSucceed() {
        RegisterUser newUser = new RegisterUser();
        newUser.addUser();

        // Target Login Elements
        WebElement username = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[3]/input"));

        // Login Attempt (Valid)
        username.sendKeys("test");
        password.sendKeys("test1");
        loginButton.click();

        String title = driver.getTitle();
        System.out.println(title);
        assertEquals(title, "ParaBank | Accounts Overview");
    }

    @Test()
    void testLoginFail(){
        // Target Login Elements
        WebElement username = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[3]/input"));

        // Login Attempt (Valid)
        username.sendKeys("test2");
        password.sendKeys("test2");
        loginButton.click();
        String title = driver.getTitle();
        assertEquals(title, "ParaBank | Error");
    }

}
