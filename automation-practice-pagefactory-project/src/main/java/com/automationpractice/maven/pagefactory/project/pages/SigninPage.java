package com.automationpractice.maven.pagefactory.project.pages;

import com.automationpractice.maven.pagefactory.project.utility.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigninPage extends Util {

//    By signInLink = By.xpath("//a[@class='login']");
//    By welcomeText = By.xpath("//h1[@class='page-heading']");

    @FindBy (xpath = "//a[@class='login']")
    WebElement _signInLink;
    @FindBy (xpath = "//h1[@class='page-heading']")
    WebElement _welcomeText;

    public void clickOnSignInLink() {

        clickOnElement(_signInLink);
    }

    public String welcomeText() {

        return getTextFromElement(_welcomeText);
    }
}
