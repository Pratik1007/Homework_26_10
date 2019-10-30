package com.nocommerce.demo.pages;

import com.nocommerce.demo.utility.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Crated By Pratik
 */
public class HomePage extends Util {

//    By registerLink = By.linkText("Register");
//    By loginLink = By.linkText("Log in");
//    By currencyList = By.id("customerCurrency");
//    By computersLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]");
//    By electronicsLink = By.linkText("Electronics ");
//    By apparelLink = By.linkText("Apparel ");
//    By digitalDownloadsLink = By.linkText("Digital downloads ");
//    By booksLink = By.linkText("Books ");
//    By jewelryLink = By.linkText("Jewelry ");
//    By giftCardsLink = By.linkText("Gift Cards ");
//    By searchStoreField = By.id("small-searchterms");
//    By searchLBtn = By.className("button-1 search-box-button");

    @FindBy (linkText = "Register")
    WebElement _registerLink;
    @FindBy (linkText = "Log in")
    WebElement _loginLink;
    @FindBy (id = "customerCurrency")
    WebElement _currencyList;
    @FindBy (xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]")
    WebElement _computersLink;
    @FindBy (linkText = "Electronics ")
    WebElement _electronicsLink;
    @FindBy (linkText = "Apparel ")
    WebElement _apparelLink;
    @FindBy (linkText = "Digital downloads ")
    WebElement _digitalDownloadsLink;
    @FindBy (linkText = "Books ")
    WebElement _booksLink;
    @FindBy (linkText = "Jewelry ")
    WebElement _jewelryLink;
    @FindBy (linkText = "Gift Cards ")
    WebElement _giftCardsLink;
    @FindBy (id = "small-searchterms")
    WebElement _searchStoreField;
    @FindBy (className = "button-1 search-box-button")
    WebElement _searchLBtn;




    public void clickOnRegisterLink (){
        clickOnElement(_registerLink);
    }

    public void clickOnLoginLink (){ clickOnElement(_loginLink); }

    public void selectCurrency (){
        clickOnElement(_currencyList);
        selectByVisibleTextFromDropDown(By.xpath("//option[contains(text(),'US Dollar')]"), "US Dollar");
    }

    public void clickOnComputersLink (){
        clickOnElement(_computersLink);
    }

    public void clickOnelectronicsLink(){
        clickOnElement(_electronicsLink);
    }

    public void clickOnApparelLink(){
        clickOnElement(_apparelLink);
    }

    public void clickOnDigitalDownloadsLink(){
        clickOnElement(_digitalDownloadsLink);
    }

    public void clickOnBooksLink(){
        clickOnElement(_booksLink);
    }

    public void clickOnJewelryLink(){
        clickOnElement(_jewelryLink);
    }

    public void clickOnGiftCardsLink(){
        clickOnElement(_giftCardsLink);
    }

    public void insertTxtInSearchField(){
        sendTextToElement(_searchStoreField, "Laptops");
    }

    public void clickOnSearchBtn(){
        clickOnElement(_searchLBtn);
    }

}
