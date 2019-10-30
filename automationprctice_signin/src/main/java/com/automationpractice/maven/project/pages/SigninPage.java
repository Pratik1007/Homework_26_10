package com.automationpractice.maven.project.pages;

import com.automationpractice.maven.project.utility.Util;
import org.openqa.selenium.By;

public class SigninPage extends Util {

    By signInLink = By.xpath("//a[@class='login']");
    By welcomeText = By.xpath("//h1[@class='page-heading']");

    public void clickOnSignInLink() {

        clickOnElement(signInLink);
    }

    public String welcomeText() {

        return getTextFromElement(welcomeText);
    }
}
