package com.nocommerce.demo.pages;

import com.nocommerce.demo.utility.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Crated By Pratik
 */
public class ItemPage extends Util {

//    By buildYourOwnComputer = By.xpath("//div[@class='product-grid home-page-product-grid']//div[1]//div[1]//div[1]//a[1]//img[1]");
//    By itemWelcomeText = By.xpath("//h1[contains(text(),'Build your own computer')]");
//    By hddOption = By.xpath("//input[@id='product_attribute_3_7']");
//    By addToCartBtn = By.xpath("//input[@id='add-to-cart-button-1']");
//    By addtoCartNotification = By.xpath("//div[@class='bar-notification success']");

    @FindBy (xpath = "//div[@class='product-grid home-page-product-grid']//div[1]//div[1]//div[1]//a[1]//img[1]")
    WebElement _buildYourOwnComputer;
    @FindBy (xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement _itemWelcomeText;
    @FindBy (xpath = "//input[@id='product_attribute_3_7']")
    WebElement _hddOption;
    @FindBy (xpath = "//input[@id='add-to-cart-button-1']")
    WebElement _addToCartBtn;
    @FindBy (xpath = "//div[@class='bar-notification success']")
    WebElement _addtoCartNotification;




    public void clickOnBuildYourOwnComputer(){
        clickOnElement(_buildYourOwnComputer);
    }

    public String itemWelcomeText(){
        return getTextFromElement(_itemWelcomeText);
    }

    public void clickOnhddOption(){
        clickOnElement(_hddOption);
    }

    public void clickOnAddToCartBtn(){
        clickOnElement(_addToCartBtn);
    }

    public String itemNotification(){
        return getTextFromElement(_addtoCartNotification);
    }

}

