package com.stack.pagemanager;

import com.stack.pageobjects.LoginPage;
import com.stack.utilities.IoOperations;
import com.stack.utilities.WaitClass;
import org.openqa.selenium.WebDriver;

public class PageManager {
    WebDriver driver;
    public LoginPage loginPage;
    public IoOperations ioOperations;
    public WaitClass waitClass;
    public PageManager(WebDriver driver){
        this.driver = driver;
        loginPage = new LoginPage(driver);
        ioOperations = new IoOperations(driver);
        waitClass = new WaitClass(driver);
    }




}
