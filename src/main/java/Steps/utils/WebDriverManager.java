import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {

    private static WebDriver driver;

    public static WebDriver getWebDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void quitWebDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
