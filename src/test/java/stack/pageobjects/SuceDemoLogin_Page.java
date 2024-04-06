package stack.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.WaitClass;

import java.time.Duration;

public class SuceDemoLogin_Page {

    public static final By usernameLocator = By.id("user-name");
    public static final By passwordLocator = By.id("password");
    public static final By loginButtonLocator = By.id("login-button");

    public void navigateToLoginPage(WebDriver driver){
    	
    	driver.get("https://www.saucedemo.com/");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }


    public void enterUsernameAndPassword(WebDriver driver, String username, String password){
        WaitClass.waitForElementPresent(driver, usernameLocator, 10);
        driver.findElement(usernameLocator).sendKeys(username);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WaitClass.waitForElementPresent(driver,passwordLocator, 10);
        driver.findElement(passwordLocator).sendKeys(password);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickOnLoginButton(WebDriver driver){
        WaitClass.waitForElementPresent(driver, loginButtonLocator, 10);

        driver.findElement(loginButtonLocator).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
