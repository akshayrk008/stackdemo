package com.stack.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IoOperations {

    WebDriver driver;

    public IoOperations(WebDriver driver){
        this.driver = driver;
    }

    public void sendData(WebElement element, String text){
        element.sendKeys(text);
    }

    public void clickElement(WebElement element){
        element.click();
    }

    public void isElementisEnabled(WebElement element){
        if (element.isEnabled()){
            System.out.println("element is enabled");
        }else{
            System.out.println("element is not present");
        }
    }
}
