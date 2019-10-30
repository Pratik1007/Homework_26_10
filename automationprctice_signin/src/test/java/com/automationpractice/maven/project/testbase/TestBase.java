package com.automationpractice.maven.project.testbase;


import com.automationpractice.maven.project.basepage.BasePage;
import com.automationpractice.maven.project.browserselector.BrowserSelector;
import com.automationpractice.maven.project.loadproperty.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestBase extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    String browser = new LoadProperty().getProperty("browser");

    @BeforeMethod
    public void setUp(){
        browserSelector.selectBrowser(browser);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}