import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class RegisterUser {

        // Should take multiple user registrations..
        static void addUser() throws InterruptedException{
            System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
            FirefoxDriver driver = new FirefoxDriver();
            driver.get("https://parabank.parasoft.com/parabank/register.htm");

            // Locate Registration Elements
            WebElement firstName = driver.findElement(By.name("customer.firstname"));
            WebElement lastName = driver.findElement(By.name("customer.lastname"));
            WebElement address = driver.findElement(By.name("customer.address.street"));
            WebElement city = driver.findElement(By.name("customer.address.city"));
            WebElement state = driver.findElement(By.name("customer.address.state"));
            WebElement zip = driver.findElement(By.name("customer.address.zipCode"));
            WebElement SSN = driver.findElement(By.name("customer.ssn"));

            // Username Entry Field
            WebElement username = driver.findElement(By.name("customer.username"));

            // Password Entry Field
            WebElement password = driver.findElement(By.name("customer.password"));
            WebElement passwordVerification = driver.findElement(By.name("repeatedPassword"));

            Thread.sleep(1000);
        }

}
