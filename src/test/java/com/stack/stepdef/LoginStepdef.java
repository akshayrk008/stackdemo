package com.stack.stepdef;

import com.stack.pagemanager.PageManager;
import com.stack.pageobjects.LoginPage;
import com.stack.utilities.IoOperations;
import com.stack.utilities.WaitClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginStepdef {

    WebDriver driver;
    String url = "https://bstackdemo.com/?signin=true";


    PageManager pageManager;

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        System.out.println("user is on login page");
    }

    @When("user enters valid {string} and {string}")
    public void userEntersValidAnd(String username, String password) {

        pageManager = new PageManager(driver);
        pageManager.loginPage.enterUsernameAndPAssword(username, password);


    }

    @Then("clicks on login button")
    public void clicksOnLoginButton() {

        pageManager.loginPage.clickonLoginBTN();
    }

    @And("user navigated to home page")
    public void userNavigatedToHomePage() {
        pageManager.waitClass.waitTillURL(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);

    }

    @Before
    public void OpenBrowser(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://bstackdemo.com/signin");
    }

    @After
    public void teardown(){
        driver.close();
        driver.quit();
    }
}
