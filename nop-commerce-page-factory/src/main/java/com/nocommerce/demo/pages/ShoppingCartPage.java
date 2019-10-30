package com.nocommerce.demo.pages;

import com.nocommerce.demo.utility.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Crated By Pratik
 */
public class ShoppingCartPage extends Util {

//    By shoppingCartLink = By.xpath("//span[@class='cart-label']");
//    By welcomTextshoppingcart = By.xpath("//h1[contains(text(),'Shopping cart')]");

    @FindBy (xpath = "//span[@class='cart-label']")
    WebElement _shoppingCartLink;
    @FindBy (xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement _welcomTextShoppingCart;

    public void clickOnShoppinCartLink() {
        clickOnElement(_shoppingCartLink);
        // clickOnElement(shoppingCartLink);
    }

    public String varifyWelcomeText() {
        return getTextFromElement(_welcomTextShoppingCart);
    }
}
