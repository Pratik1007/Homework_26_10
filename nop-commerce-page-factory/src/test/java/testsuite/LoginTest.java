package testsuite;

import com.nocommerce.demo.loadproperty.LoadProperty;
import com.nocommerce.demo.pages.HomePage;
import com.nocommerce.demo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import testbase.TestBase;

/**
 * Crated By Paratik
 */

public class LoginTest extends TestBase {

//    HomePage homePage = new HomePage();
//    LoginPage loginPage = new LoginPage();
//    LoadProperty loadProperty = new LoadProperty();

    @Test (groups = {"sanity"})
    public void userShouldNavigateToLoginPageSuccessfully() {

        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        LoadProperty loadProperty = new LoadProperty();

        homePage.clickOnLoginLink();
        String expectedText = "Welcome, Please Sign In!";
        Assert.assertEquals(loginPage.welcomeText(), expectedText);
    }

    @Test (groups = {"regression"})
    public void userShouldLoginSuccessfully(){

        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        LoadProperty loadProperty = new LoadProperty();

        loginPage.enterEmail(loadProperty.getProperty("email"));
        loginPage.password(loadProperty.getProperty("password"));
        loginPage.clickOnLoginButton();
    }

}
