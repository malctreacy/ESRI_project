import org.openqa.selenium.firefox.FirefoxDriver;

public class ParaBankTest {
    public static void main(String [] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "geckodriver");
        FirefoxDriver driver = new FirefoxDriver();

        // Parabank Mainpage

        // Target Login Elements

        // Close out Driver
        driver.quit();
    }
}
