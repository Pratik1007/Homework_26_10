package com.automationpractice.maven.pagefactory.project.pages;

import com.automationpractice.maven.pagefactory.project.utility.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Util {

//    By womenLink = By.xpath("//a[@class='sf-with-ul'][contains(text(),'Women')]");
//    By welcomeTextWomenLink = By.xpath("//strong[contains(text(),'You will find here all woman fashion collections.')]");
//    By dressesLink = By.xpath("//body[@id='index']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a[1]");
//    By welcomeTextDressesLink = By.xpath("//p[contains(text(),'We offer dresses for every day, every style and ev')]");
//    By tShirtLink = By.xpath("//body[@id='index']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[3]/a[1]");
//    By welcomeTextTShirtLink = By.xpath("//p[contains(text(),'shapes and style of our collection!')]");
//    By logoDisplay = By.xpath("//img[contains(@class,'logo img-responsive')]");
//    By searchField = By.xpath("//input[@id='search_query_top']");
//    By searchBtn = By.xpath("//button[@name='submit_search']");
//    By welcomeTextSearch = By.xpath("//span[contains(@class,'lighter')]");
//    By shoppingCartTab = By.xpath("//div[@class='shopping_cart']/a[@rel ='nofollow']");
//    By welcomeTextShoppingCart = By.xpath("//h1[@id='cart_title']");


    @FindBy (xpath = "//a[@class='sf-with-ul'][contains(text(),'Women')]")
    WebElement _womenLink;
    @FindBy (xpath = "//strong[contains(text(),'You will find here all woman fashion collections.')]")
    WebElement _welcomeTextWomenLink;
    @FindBy (xpath = "//body[@id='index']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a[1]")
    WebElement _dressesLink;
    @FindBy (xpath = "//p[contains(text(),'We offer dresses for every day, every style and ev')]")
    WebElement _welcomeTextDressesLink;
    @FindBy (xpath = "//body[@id='index']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[3]/a[1]")
    WebElement _tShirtLink;
    @FindBy (xpath = "//p[contains(text(),'shapes and style of our collection!')]")
    WebElement _welcomeTextTShirtLink;
    @FindBy (xpath = "//img[contains(@class,'logo img-responsive')]")
    WebElement _logoDisplay;
    @FindBy (xpath = "//input[@id='search_query_top']")
    WebElement _searchField;
    @FindBy (xpath = "//button[@name='submit_search']")
    WebElement _searchBtn;
    @FindBy (xpath = "//span[contains(@class,'lighter')]")
    WebElement _welcomeTextSearch;
    @FindBy (xpath = "//div[@class='shopping_cart']/a[@rel ='nofollow']")
    WebElement _shoppingCartTab;
    @FindBy (xpath = "//h1[@id='cart_title']")
    WebElement _welcomeTextShoppingCart;




    public void clickOnWomenLink (){
        clickOnElement(_womenLink);
    }
    public String womenText (){return getTextFromElement(_welcomeTextWomenLink);}

    public void clickOnDressesLink(){
        clickOnElement(_dressesLink);
    }
    public String dressesText(){return getTextFromElement(_welcomeTextDressesLink);}

    public void clickOnTShirtLink(){
        clickOnElement(_tShirtLink);
    }
    public String tShirtText(){return getTextFromElement(_welcomeTextTShirtLink);}

    public void isLogoDisplayed(){
        verifyThatElementIsDisplayed(_logoDisplay);
    }

    public void sendTextToSearchField(){
        clickOnElement(_searchField);
        sendTextToElement(_searchField, "Blouse");
    }
    public String searchText(){return getTextFromElement(_welcomeTextSearch);}
    public void clickOnSearchBtn(){
        clickOnElement(_searchBtn);
    }
    public void clickOnShoppingCartTab(){
        clickOnElement(_shoppingCartTab);
    }
    public String shoppingCartSummary(){return getTextFromElement(_welcomeTextShoppingCart);}


}
