package com.orangehrmlive.demo.opensource.testbase;


import com.orangehrmlive.demo.opensource.basepage.BasePage;
import com.orangehrmlive.demo.opensource.browserselector.BrowserSelector;
import com.orangehrmlive.demo.opensource.loadproperty.LoadProperty;
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