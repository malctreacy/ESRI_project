import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class RegisterUser {

        // Should take multiple user registrations..
        static void addUser(){
            System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
            FirefoxDriver driver = new FirefoxDriver();
            driver.get("https://parabank.parasoft.com/parabank/register.htm");

            // Locate Registration Elements
            WebElement firstName = driver.findElement(By.name("customer.firstName"));
            WebElement lastName = driver.findElement(By.name("customer.lastName"));
            WebElement address = driver.findElement(By.name("customer.address.street"));
            WebElement city = driver.findElement(By.name("customer.address.city"));
            WebElement state = driver.findElement(By.name("customer.address.state"));
            WebElement zip = driver.findElement(By.name("customer.address.zipCode"));
            WebElement SSN = driver.findElement(By.name("customer.ssn"));
            WebElement registerButton = driver.findElementByXPath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input");
            // Username Entry Field
            WebElement username = driver.findElement(By.name("customer.username"));

            // Password Entry Field
            WebElement password = driver.findElement(By.name("customer.password"));
            WebElement passwordVerification = driver.findElement(By.name("repeatedPassword"));

            // Add New User Information
            firstName.sendKeys("Kobe");
            lastName.sendKeys("Bryant");
            address.sendKeys("1234 Main Street");
            city.sendKeys("Redlands");
            state.sendKeys("CA");
            zip.sendKeys("92359");
            SSN.sendKeys("123456789");
            username.sendKeys("test");
            password.sendKeys("test1");
            passwordVerification.sendKeys("test1");

            // Register Button
            registerButton.click();

            driver.quit();
        }

}
