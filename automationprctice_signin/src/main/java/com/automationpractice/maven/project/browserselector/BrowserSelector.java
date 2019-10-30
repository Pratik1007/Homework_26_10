package com.automationpractice.maven.project.browserselector;

import com.automationpractice.maven.project.basepage.BasePage;
import com.automationpractice.maven.project.loadproperty.LoadProperty;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends BasePage {

    String projectPath = System.getProperty("user.dir");

    String baseUrl = new LoadProperty().getProperty("baseUrl");

    public void selectBrowser(String browser) {

        System.out.println("Browser Selected "+browser);

        if (browser.equalsIgnoreCase("chrome")) {

            System.setProperty("webdriver.chrome.driver",projectPath +"\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        } else if (browser.equalsIgnoreCase("firefox")) {

            System.setProperty("webdriver.gecko.driver", projectPath + "\\drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        } else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", projectPath + "\\drivers\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } else {
            System.out.println("Wrong Browser");
        }
    }
}
