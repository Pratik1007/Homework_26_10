package com.automationpractice.maven.project.testsuit;

import com.automationpractice.maven.project.loadproperty.LoadProperty;
import com.automationpractice.maven.project.pages.HomePage;
import com.automationpractice.maven.project.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    HomePage homePage = new HomePage();
    LoadProperty loadProperty = new LoadProperty();


    @Test
    public void verifyWomenLink(){
        homePage.clickOnWomenLink();
        String expectedTextOfWomenLink = "You will find here all woman fashion collections.";
        Assert.assertEquals(homePage.womenText(),expectedTextOfWomenLink);
    }

    @Test
    public void verifyDressesLink(){
        homePage.clickOnDressesLink();
        String expectedTextOfDressesLink = "We offer dresses for every day, every style and every occasion.";
        Assert.assertEquals(homePage.dressesText(),expectedTextOfDressesLink);
    }

    @Test
    public void verifyTShirtLink(){
        homePage.clickOnTShirtLink();
        String expectedTextOfTShirtLink = "shapes and style of our collection!";
        Assert.assertEquals(homePage.tShirtText(), expectedTextOfTShirtLink);
    }

    @Test
    public void verifyIsLogoDisplayed(){
        homePage.isLogoDisplayed();
    }

    @Test
    public void verifySearchBtnFunctionality(){
        homePage.sendTextToSearchField();
        homePage.clickOnSearchBtn();
        String expectedTextSearch = "\"BLOUSE\"";
        Assert.assertEquals(homePage.searchText(),expectedTextSearch);
    }

    @Test
    public void verifyShoppingCartBtn(){
        homePage.clickOnShoppingCartTab();
        String expectedTextShoppingCartTab = "SHOPPING-CART SUMMARY";
        Assert.assertEquals(homePage.shoppingCartSummary(),expectedTextShoppingCartTab);
    }
}
