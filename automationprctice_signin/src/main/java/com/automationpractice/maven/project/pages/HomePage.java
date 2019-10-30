package com.automationpractice.maven.project.pages;

import com.automationpractice.maven.project.utility.Util;
import org.openqa.selenium.By;

public class HomePage extends Util {

    By womenLink = By.xpath("//a[@class='sf-with-ul'][contains(text(),'Women')]");
    By welcomeTextWomenLink = By.xpath("//strong[contains(text(),'You will find here all woman fashion collections.')]");
    By dressesLink = By.xpath("//body[@id='index']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a[1]");
    By welcomeTextDressesLink = By.xpath("//p[contains(text(),'We offer dresses for every day, every style and ev')]");
    By tShirtLink = By.xpath("//body[@id='index']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[3]/a[1]");
    By welcomeTextTShirtLink = By.xpath("//p[contains(text(),'shapes and style of our collection!')]");
    By logoDisplay = By.xpath("//img[contains(@class,'logo img-responsive')]");
    By searchField = By.xpath("//input[@id='search_query_top']");
    By searchBtn = By.xpath("//button[@name='submit_search']");
    By welcomeTextSearh = By.xpath("//span[contains(@class,'lighter')]");
    By shoppingCartTab = By.xpath("//div[@class='shopping_cart']/a[@rel ='nofollow']");
    By welcomeTextShoppingCart = By.xpath("//h1[@id='cart_title']");

    public void clickOnWomenLink (){
        clickOnElement(womenLink);
    }
    public String womenText (){return getTextFromElement(welcomeTextWomenLink);}

    public void clickOnDressesLink(){
        clickOnElement(dressesLink);
    }
    public String dressesText(){return getTextFromElement(welcomeTextDressesLink);}

    public void clickOnTShirtLink(){
        clickOnElement(tShirtLink);
    }
    public String tShirtText(){return getTextFromElement(welcomeTextTShirtLink);}

    public void isLogoDisplayed(){
        verifyThatElementIsDisplayed(logoDisplay);
    }

    public void sendTextToSearchField(){
        clickOnElement(searchField);
        sendTextToElement(searchField, "Blouse");
    }
    public String searchText(){return getTextFromElement(welcomeTextSearh);}
    public void clickOnSearchBtn(){
        clickOnElement(searchBtn);
    }
    public void clickOnShoppingCartTab(){
        clickOnElement(shoppingCartTab);
    }
    public String shoppingCartSummary(){return getTextFromElement(welcomeTextShoppingCart);}


}
