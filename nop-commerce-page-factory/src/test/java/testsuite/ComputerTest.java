package testsuite;

import com.nocommerce.demo.pages.ComputerPage;
import com.nocommerce.demo.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.xml.XmlGroups;
import testbase.TestBase;

public class ComputerTest extends TestBase {

//    HomePage homePage = new HomePage();
//    ComputerPage computerPage = new ComputerPage();

    @Test (groups = {"sanity"})
    public  void userShouldNavigateToComputerPageSuccessfully(){

        HomePage homePage = new HomePage();
        ComputerPage computerPage = new ComputerPage();

        homePage.clickOnComputersLink();
        String expectedText = "Computers";
        Assert.assertEquals(computerPage.welcomeText(), expectedText);
    }


}
