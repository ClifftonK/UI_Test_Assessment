import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Init the test
 */
public class BaseTest {

    public DesiredCapabilities setDesiredCapabilities() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//        desiredCapabilities.setBrowserName("Chrome");
        desiredCapabilities.setCapability("browser", "Chrome");
        return desiredCapabilities;
    }

    public WebDriver initDriver() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///Users/cliff/ui-test-assessment/employees.html"); //TODO pass this through properties file or config

        return driver;
    }
}
