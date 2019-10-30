package com.automationpractice.maven.pagefactory.project.testsuit;

import com.automationpractice.maven.pagefactory.project.loadproperty.LoadProperty;
import com.automationpractice.maven.pagefactory.project.pages.HomePage;
import com.automationpractice.maven.pagefactory.project.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    HomePage homePage = new HomePage();
//    LoadProperty loadProperty = new LoadProperty();

    @Test
    public void verifyWomenLink(){

        HomePage homePage = new HomePage();

        homePage.clickOnWomenLink();
        String expectedTextOfWomenLink = "You will find here all woman fashion collections.";
        Assert.assertEquals(homePage.womenText(),expectedTextOfWomenLink);
    }

    @Test
    public void verifyDressesLink(){

        HomePage homePage = new HomePage();

        homePage.clickOnDressesLink();
        String expectedTextOfDressesLink = "We offer dresses for every day, every style and every occasion.";
        Assert.assertEquals(homePage.dressesText(),expectedTextOfDressesLink);
    }

    @Test
    public void verifyTShirtLink(){

        HomePage homePage = new HomePage();

        homePage.clickOnTShirtLink();
        String expectedTextOfTShirtLink = "shapes and style of our collection!";
        Assert.assertEquals(homePage.tShirtText(), expectedTextOfTShirtLink);
    }

    @Test
    public void verifyIsLogoDisplayed() {

        HomePage homePage = new HomePage();

        homePage.isLogoDisplayed();
    }

    @Test
    public void verifySearchBtnFunctionality(){

        HomePage homePage = new HomePage();

        homePage.sendTextToSearchField();
        homePage.clickOnSearchBtn();
        String expectedTextSearch = "\"BLOUSE\"";
        Assert.assertEquals(homePage.searchText(),expectedTextSearch);
    }

    @Test
    public void verifyShoppingCartBtn(){

        HomePage homePage = new HomePage();

        homePage.clickOnShoppingCartTab();
        String expectedTextShoppingCartTab = "SHOPPING-CART SUMMARY";
        Assert.assertEquals(homePage.shoppingCartSummary(),expectedTextShoppingCartTab);
    }
}
