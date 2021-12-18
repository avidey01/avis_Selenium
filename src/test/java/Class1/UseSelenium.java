package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UseSelenium {

    @Test
    public void useSelenium(){

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.nfl.com/");

        //how to maximize the browser
        //driver.manage().window().maximize();

        //Very very important method to remember

        String url= "https://www.nfl.com/";

        /**
         * How to add the wait
         * Thread.sleep()
         */

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /**
         * To get the current Url of the web page use below method
                *Method: getCurrentUrl
         */

        String webUrl= driver.getCurrentUrl(); // uebUrl = https://www.nfl.com

        Assert.assertEquals(url, webUrl,"NFL was not launch properly");

        /**
         * how to get the page title
            *  getTitle() to get the title of the page
         */

        String pageTitle= driver.getTitle();
        System.out.println(pageTitle);

        /**
         * How to close web Browser
            *Method
                * Close() - Close will close only the tab is associated with the driver
                * quit() - close all web window that was open deu to automation code
         */
        driver.quit();

    }
}
