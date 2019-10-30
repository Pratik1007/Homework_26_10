package com.automationpractice.maven.pagefactory.project.testsuit;

import com.automationpractice.maven.pagefactory.project.loadproperty.LoadProperty;
import com.automationpractice.maven.pagefactory.project.pages.SigninPage;
import com.automationpractice.maven.pagefactory.project.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignTest extends TestBase {

//    SigninPage signinPage = new SigninPage();
//    LoadProperty loadProperty = new LoadProperty();

    @Test
    public void userShouldNavigateToSigninPageSuccessfully() {

        SigninPage signinPage = new SigninPage();

        signinPage.clickOnSignInLink();

        String expectedText = "AUTHENTICATION";

    Assert.assertEquals(signinPage.welcomeText(), expectedText);

    }

}

