package com.nocommerce.demo.pages;

import com.nocommerce.demo.utility.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Crated By Pratik
 */
public class ComputerPage extends Util {

    //    By computersLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')] ");
    //    By welcomeTextOfComputers = By.xpath("//h1[contains(text(),'Computers')]");
    //    By deskTopsLink = By.xpath("//h2[@class='title']//a[contains(text(),'Desktops')]");
    //    By noteBooksLink = By.xpath("//h2[@class='title']//a[contains(text(),'Notebooks')]");
    //    By softwareLink = By.xpath("//h2[@class='title']//a[contains(text(),'Software')]");


    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')] ")
    WebElement _computerLink;
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement _welcomeTextOfComputers;
    @FindBy(xpath = "//h2[@class='title']//a[contains(text(),'Desktops')]")
    WebElement _deskTopsLink;
    @FindBy(xpath = "//h2[@class='title']//a[contains(text(),'Notebooks')]")
    WebElement _noteBooksLink;
    @FindBy(xpath = "//h2[@class='title']//a[contains(text(),'Software')]")
    WebElement _softwareLink;


    public void clickOnComputersLink() {
        clickOnElement(_computerLink);
    }
    public void clickOnDesktopsLink() {
        clickOnElement(_deskTopsLink);
    }

    public void clickOnNotebooksLink() {
        clickOnElement(_noteBooksLink);
    }

    public void clickOnSoftwareLink() {
        clickOnElement(_softwareLink);
    }

    public String welcomeText() {
        return getTextFromElement(_welcomeTextOfComputers);
    }
}