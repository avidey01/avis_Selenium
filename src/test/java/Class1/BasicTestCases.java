package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

public class BasicTestCases {

    // Verify NFL URL is correct after launching the webpage
    // Verify  NFL Title is correct after launching the page
    @Test
    public void verifyNflurl() {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.nfl.com/";
        driver.get(url);

        String urlFromWeb = driver.getCurrentUrl();
        Assert.assertEquals(urlFromWeb, url, " NFL is not not correct URL after launch");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();

        // Verify  NFL Title is correct after launching the page

    }
       @Test
        public void verifyTitle (){

           System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            String url = "https://www.nfl.com/";
            driver.get(url);

            String titleFromWeb=driver.getTitle();
            Assert.assertEquals(titleFromWeb,"NFL Title is correct after launch","NFL title is not correct");

           try {
               Thread.sleep(500);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
        driver.quit();


    }
}
