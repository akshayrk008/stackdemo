package com.stack.pageobjects;

import com.stack.pagemanager.PageManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;
    PageManager pageManager;


    @FindBy(how = How.XPATH, using = "//div[@id = 'username']")
    WebElement userName;

    @FindBy(how=How.XPATH, using = "//div[text()='Select Password']")
    WebElement passWord;

    @FindBy(how = How.ID, using = "login-btn")
    WebElement loginBTN;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void enterUsernameAndPAssword(String username, String password){
        pageManager = new PageManager(driver);
        pageManager.waitClass.waitTillText(userName);
        pageManager.ioOperations.sendData(userName, username);

        pageManager.waitClass.waitTillText(passWord);
        pageManager.ioOperations.sendData(passWord, password);
    }

    public void clickonLoginBTN(){

        pageManager.waitClass.waitTillText(loginBTN);
        pageManager.ioOperations.clickElement(loginBTN);

    }


}
