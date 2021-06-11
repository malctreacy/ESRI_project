import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class ParaBankTest {
    public static void main(String [] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "geckodriver");
        FirefoxDriver driver = new FirefoxDriver();

        // Parabank Mainpage
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        // Target Login Elements
        WebElement username = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[3]/input"));

        // Close out Driver
        driver.quit();
    }
}
