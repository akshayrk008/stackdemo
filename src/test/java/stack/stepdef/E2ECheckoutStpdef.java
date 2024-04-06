package stack.stepdef;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stack.pageobjects.CheckoutPage;
import stack.pageobjects.SuceDemoLogin_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2ECheckoutStpdef {

    
    SuceDemoLogin_Page loginPage;
    CheckoutPage checkoutPage;
    WebDriver driver;

    @Given("user is On HomePage")
    public void user_is_on_home_page() {
    	driver = new ChromeDriver();
       loginPage = new SuceDemoLogin_Page();
       loginPage.navigateToLoginPage(driver);
       loginPage.enterUsernameAndPassword(driver, "standard_user", "secret_sauce");
       loginPage.clickOnLoginButton(driver);
    }

    @When("user click on any item")
    public void user_click_on_any_item() {
    	 checkoutPage = new CheckoutPage();
         checkoutPage.addItemToCart(driver);
    	
    }

    @When("click on cart icon")
    public void click_on_cart_icon() {

    	checkoutPage.clickOnCartIconAndCheckoutButton(driver);
    }

    @When("click on checkout button")
    public void click_on_checkout_button() {

    	System.out.println("checkout is done");
    }

    @When("enters {string} and {string} and {string}")
    public void enters_and_and(String firstname, String lastname, String zipcode) {
    	checkoutPage.enterInformation(driver, firstname, lastname, zipcode);
        
    	
    }

    @When("click on continue Button")
    public void click_on_continue_button() {
       
    	 checkoutPage.clickOnContinueButton(driver);
    }

    @When("click on finish button")
    public void click_on_finish_button() {
        
    	 checkoutPage.clickOnFinishButton(driver);
    }

    @Then("order placed successfully")
    public void order_placed_successfully() {
    	 System.out.println("validate order is success or not");
    }

    @Then("user navigate back to home screen after successfull order")
    public void user_navigate_back_to_home_screen_after_successfull_order() {
    	checkoutPage.navigateBackToHome(driver);
    }
}
