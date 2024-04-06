package stack.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.IoOperations;
import utilities.WaitClass;

public class CheckoutPage {

    public static final By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    public static final By cartIcon = By.xpath("//a[@class = 'shopping_cart_link']");
    public static final By checkoutButton = By.id("checkout");
    public static final By firstNameField = By.id("first-name");
    public static final By lasNameField = By.id("last-name");
    public static final By zipCodeField = By.id("postal-code");
    public static final By continueButton = By.id("continue");
    public static final By finishButton = By.id("finish");
    public static final By goBackToHomeLocator = By.id("back-to-products");
    public static final By successMessageLocator = By.xpath("//span");

    public void addItemToCart(WebDriver driver){
        WaitClass.waitForElementPresent(driver, addToCartButton, 10);
        driver.findElement(addToCartButton).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void clickOnCartIconAndCheckoutButton(WebDriver driver){
        WaitClass.waitForElementPresent(driver, cartIcon, 10);
        driver.findElement(cartIcon).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WaitClass.waitForElementPresent(driver, checkoutButton, 10);
        driver.findElement(checkoutButton).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void enterInformation(WebDriver driver, String firstName, String LastName, String ZipCode){
        WaitClass.waitForElementPresent(driver, firstNameField, 10);
        driver.findElement(firstNameField).sendKeys(firstName);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WaitClass.waitForElementPresent(driver, lasNameField, 10);
        driver.findElement(lasNameField).sendKeys(LastName);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WaitClass.waitForElementPresent(driver, zipCodeField, 10);
        driver.findElement(zipCodeField).sendKeys(ZipCode);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void clickOnContinueButton(WebDriver driver){
        WaitClass.waitForElementPresent(driver, continueButton, 10);
        driver.findElement(continueButton).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickOnFinishButton(WebDriver driver){
    	IoOperations.scrollToElement(driver, driver.findElement(finishButton));
        WaitClass.waitForElementPresent(driver, finishButton, 10);
        driver.findElement(finishButton).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void navigateBackToHome(WebDriver driver){

        if (driver.findElement(successMessageLocator).isDisplayed()){
            driver.findElement(goBackToHomeLocator).click();
        }
        else {
            System.out.println("order is failed!!!!");
        }


    }


}
