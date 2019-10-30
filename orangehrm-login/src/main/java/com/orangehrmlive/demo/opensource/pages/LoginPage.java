package com.orangehrmlive.demo.opensource.pages;

import com.orangehrmlive.demo.opensource.utility.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Util {

//    By userNameField = By.id("txtUsername");
//    By passwordField = By.id("txtPassword");
//    By loginBtn = By.id("btnLogin");
//    By welcomeText = By.xpath("//h1[contains(text(),'Dashboard')]");

    @FindBy (id = "txtUsername")
    WebElement _userNameField;
    @FindBy (id = "txtPassword")
    WebElement _passwordField;
    @FindBy (id = "btnLogin")
    WebElement _loginBtn;
    @FindBy (xpath = "//h1[contains(text(),'Dashboard')]")
    WebElement _welcomeText;


    /*method for sending username in usernamefiled */
public void enterUsername (String username){
    sendTextToElement(_userNameField, username);
}
/*method for sending password in passwordfield*/
    public void enterPassword (String password){
        sendTextToElement(_passwordField, password);
    }
    /*method for click on login tab*/
    public void clickOnLoginBtn(){
        clickOnElement(_loginBtn);
    }

    /*method to get wecomtext*/
    public String welcomeText(){
        return getTextFromElement(_welcomeText);
    }
}
