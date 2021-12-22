package class2;

import Helper.Misc;
import Web.Driver;
import org.testng.annotations.Test;

public class UseSelenium_2 {

    @Test
    public void useSelenium() {

        //  /**
        // * System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        //  * WebDriver driver = new ChromeDriver();
        //  * String facebookUrl = "https://www.facebook.com";
        //   * driver.get(facebookUrl);
        //   * driver.navigate().back();
        //   * Misc.sleep(5);
        //   * driver.navigate().forward();
        //   * Misc.sleep(5); */

        // /**
        //   * how to go back/forward in a web page
        //    * back method : back()
        //   * forward method : forward()
        //   **/

        Driver.openUrl("https://www.facebook.com.");

        Driver.getDriver().navigate().back();
        Misc.sleep(5);

        Driver.getDriver().navigate().forward();
        Misc.sleep(5);

        Driver.quitWebPage();
    }

@Test
        public void refreshWebPage(){
            Driver.openUrl("https://www.cheapair.com");
            Misc.sleep(5);
            Driver.getDriver().navigate().refresh();
            Driver.quitWebPage();
        }

}
