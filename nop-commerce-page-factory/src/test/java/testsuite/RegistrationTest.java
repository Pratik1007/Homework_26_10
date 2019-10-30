package testsuite;


import com.nocommerce.demo.loadproperty.LoadProperty;
import com.nocommerce.demo.pages.HomePage;
import com.nocommerce.demo.pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import testbase.TestBase;

public class RegistrationTest extends TestBase {

//    RegisterPage registerPage = new RegisterPage();
//    HomePage homePage = new HomePage();
//    LoadProperty loadProperty = new LoadProperty();

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

}
