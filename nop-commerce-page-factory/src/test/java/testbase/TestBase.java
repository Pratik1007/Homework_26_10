package testbase;



import com.nocommerce.demo.basepage.BasePage;
import com.nocommerce.demo.browserselector.BrowserSelector;
import com.nocommerce.demo.loadproperty.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends BasePage {
    String browser = new LoadProperty().getProperty("browser");

    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        browserSelector.selectBrowser(browser);
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }
}
