package testsuite;

import com.nocommerce.demo.loadproperty.LoadProperty;
import com.nocommerce.demo.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import testbase.TestBase;

public class NopCommerce extends TestBase {


    @Test(groups = {"regression"})
    public  void userShouldNavigateToComputerPageSuccessfully(){

        HomePage homePage = new HomePage();
        ComputerPage computerPage = new ComputerPage();

        homePage.clickOnComputersLink();
        String expectedText = "Computers";
        Assert.assertEquals(computerPage.welcomeText(), expectedText);
    }
    @Test (groups = {"regression"})

    public void userShouldNavigateToDesktopPageSuccessfully(){

        ItemPage itemPage = new ItemPage();

        itemPage.clickOnBuildYourOwnComputer();

        String expectedText = "Build your own computer";
        Assert.assertEquals(itemPage.itemWelcomeText(), expectedText);

        itemPage.clickOnhddOption();
        itemPage.clickOnAddToCartBtn();

        String addToCartText = "The product has been added to your shopping cart";
        Assert.assertEquals(itemPage.itemNotification(), addToCartText);
    }

    @Test (groups = {"regression"})
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

        homePage.clickOnLoginLink();
        String expectedText = "Welcome, Please Sign In!";
        Assert.assertEquals(loginPage.welcomeText(), expectedText);
        loginPage.enterEmail(loadProperty.getProperty("email"));
        loginPage.password(loadProperty.getProperty("password"));
        loginPage.clickOnLoginButton();
    }

    @Test (groups = {"sanity"})

    public void userShouldNavigateToRegistePagerSuccessfully() {

        RegisterPage registerPage = new RegisterPage();
        HomePage homePage = new HomePage();
        LoadProperty loadProperty = new LoadProperty();


        homePage.clickOnRegisterLink();
        String expectedText = "Register";
        Assert.assertEquals(registerPage.registerText(), expectedText);
    }

    @Test (groups = {"regression"})

    public void userShouldRegisterSuccessfully() {

        RegisterPage registerPage = new RegisterPage();
        HomePage homePage = new HomePage();
        LoadProperty loadProperty = new LoadProperty();


        homePage.clickOnRegisterLink();
        String expectedText = "Register";
        Assert.assertEquals(registerPage.registerText(), expectedText);
        registerPage.clickOnGender();
        registerPage.enterFirstName(loadProperty.getProperty("firstname"));
        registerPage.enterLastName(loadProperty.getProperty("lastname"));
        registerPage.enterDayOfBirth(loadProperty.getProperty("dob-day"));
        registerPage.enterMonthOfBirth(loadProperty.getProperty("dob-month"));
        registerPage.enterYearOfBirth(loadProperty.getProperty("dob-year"));
        registerPage.enterEmail(loadProperty.getProperty("email"));
        registerPage.enterCompanyName(loadProperty.getProperty("companyname"));
        registerPage.enterPassword(loadProperty.getProperty("password"));
        registerPage.enterPasswordInConfirmPassword(loadProperty.getProperty("confirmPassword"));
        registerPage.clickOnRegisterBtn();

        String registrationConfirm = "Your registration completed";
        Assert.assertEquals(registerPage.welcomeText(), registrationConfirm);
    }

    @Test (groups = {"sanity"})

    public void userShouldNavigateToShoppingCartPage(){

        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

        shoppingCartPage.clickOnShoppinCartLink();
        String expectedText = "Shopping cart";
        Assert.assertEquals(shoppingCartPage.varifyWelcomeText(), expectedText);
    }
}
