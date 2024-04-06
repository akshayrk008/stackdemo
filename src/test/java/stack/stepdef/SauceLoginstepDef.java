package stack.stepdef;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stack.pageobjects.SuceDemoLogin_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SauceLoginstepDef {
    WebDriver driver;
    SuceDemoLogin_Page loginPage;


    @Given("user is on the sauce demo login page")
    public void userIsOnTheSauceDemoLoginPage() {
        loginPage = new SuceDemoLogin_Page();
        loginPage.navigateToLoginPage(driver);
        System.out.println("user is on login page");
    }

    @When("user enter {string} and {string}")
    public void userEnterAnd(String username, String password) {
        loginPage = new SuceDemoLogin_Page();
        loginPage.enterUsernameAndPassword(driver, username, password);


    }

    @Then("After clicking on login button user should be landed on home page")
    public void afterClickingOnLoginButtonUserShouldBeLandedOnHomePage() {

        loginPage = new SuceDemoLogin_Page();
        loginPage.clickOnLoginButton(driver);
    }


}
