package Web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    static WebDriver driver;
    public static void openUrl(String url) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
    }

    public static WebDriver getDriver() {
        return driver;
    }

        public static void quitWebPage() {
            driver.quit();
    }

}