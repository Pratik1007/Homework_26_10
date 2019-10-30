package com.automationpractice.maven.project.testsuit;

import com.automationpractice.maven.project.loadproperty.LoadProperty;
import com.automationpractice.maven.project.pages.SigninPage;
import com.automationpractice.maven.project.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignTest extends TestBase {

    SigninPage signinPage = new SigninPage();
    LoadProperty loadProperty = new LoadProperty();

    @Test
    public void userShouldNavigateToSigninPageSuccessfully() {

        signinPage.clickOnSignInLink();

        String expectedText = "AUTHENTICATION";

    Assert.assertEquals(signinPage.welcomeText(), expectedText);

    }

}

