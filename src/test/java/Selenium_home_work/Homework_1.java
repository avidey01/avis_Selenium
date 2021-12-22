package Selenium_home_work;

import Helper.Misc;
import Web.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework_1 {
    @Test //TestCase1
    public void findFBAccountLink() {
        //Step:1
        Driver.openUrl("https://www.facebook.com/");

        Misc.sleep(2);

        //Step:2

        String userID = "email";
        By userIDLocator = By.id(userID);
        WebElement userIDinBox = Driver.getDriver().findElement(userIDLocator);
        userIDinBox.sendKeys("%^&&*()");

        //Step:3

        String password = "pass";
        By passwordIdLocator = By.name(password);
        WebElement userPassword = Driver.getDriver().findElement(passwordIdLocator);
        userPassword.sendKeys("abcd@1234");

        /** String LoginButton="login";
         By logButtonLocator = By.name(LoginButton);
         WebElement UserLoginButton= Driver.getDriver().findElement(logButtonLocator);
         UserLoginButton.click();*/

        /** String LoginButton="//button[@name='login']";
         By logButtonLocator = By.xpath(LoginButton);
         WebElement UserLoginButton= Driver.getDriver().findElement(logButtonLocator);
         UserLoginButton.click();*/

        Driver.getDriver().findElement(By.xpath("//button[@name='login']")).click();

        //Step:4

        /** String findUrAcctLink = "Find your account and log in.";
         By findAcctLinkLocator = By.linkText(findUrAcctLink);
         WebElement findAcctLinkText= Driver.getDriver().findElement(findAcctLinkLocator);
         findAcctLinkText.click();*/

        Driver.getDriver().findElement(By.xpath("//a[text()='Find your account and log in.']")).click();


    }

    @Test  // Test case #2

    public void findMessengerAccountLink() {
        //Step:1
        Driver.openUrl("https://www.facebook.com/");

        Misc.sleep(2);

        //Step 2:
        Driver.getDriver().findElement(By.xpath("//a[@title='Check out Messenger.']")).click();

        //Step 3:

        Driver.getDriver().findElement(By.xpath("//button[@type='submit']")).click();

        //Step 4:

        String findAcctLink= "Find your account an";
        By findAccountLinkLocator= By.partialLinkText(findAcctLink);
        WebElement findAccountLinkText= Driver.getDriver().findElement(findAccountLinkLocator);
        Boolean isFindAccountLinkDisplaying= findAccountLinkText.isDisplayed();

        //boolean findAcctIsDisplay= Driver.getDriver().findElement(By.xpath("//a[text()='Find your account and log in.']")).isDisplayed();
        Assert.assertTrue(isFindAccountLinkDisplaying,"Find account link is not available");

        //Step 5:

        String messengerContinueButtonAttValue = "login";
        By messengerContinueButtonLocator= By.name(messengerContinueButtonAttValue);
        WebElement messengerContinueButton= Driver.getDriver().findElement(messengerContinueButtonLocator);
        boolean isMessengerContinueButtonEnable = messengerContinueButton.isEnabled();
        boolean isMessengerContinueButtonDisplaying=messengerContinueButton.isDisplayed()

        Assert.assertTrue(isMessengerContinueButtonEnable,"is not enable");
        Assert.assertTrue(isMessengerContinueButtonDisplaying,"is not Displaying");

        //Step 6:
        // I'm not able to find a good attribute for checkbox. I will keep working on this and send it over to you.







    }
}