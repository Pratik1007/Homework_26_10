package com.orangehrmlive.demo.opensource.testsuit;

import com.orangehrmlive.demo.opensource.loadproperty.LoadProperty;
import com.orangehrmlive.demo.opensource.pages.LoginPage;
import com.orangehrmlive.demo.opensource.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

//    LoginPage loginPage = new LoginPage();
//    LoadProperty loadProperty = new LoadProperty();

    @Test

    public void userShouldLoginSuccessfully(){

        LoginPage loginPage = new LoginPage();
        LoadProperty loadProperty = new LoadProperty();

        loginPage.enterUsername(loadProperty.getProperty("username"));
        loginPage.enterPassword(loadProperty.getProperty("password"));
        loginPage.clickOnLoginBtn();
        String expectedText = "Dashboard";
        Assert.assertEquals(loginPage.welcomeText(), expectedText);
    }
}
