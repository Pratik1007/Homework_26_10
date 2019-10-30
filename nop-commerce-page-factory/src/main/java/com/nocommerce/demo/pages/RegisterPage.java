package com.nocommerce.demo.pages;

import com.nocommerce.demo.utility.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Util {

//    By registerLink = By.xpath("//a[@class='ico-register']");
//    By registerWelcomeText = By.xpath("//div[@class='page-title']");
//    By selectGender = By.xpath("//input[@id='gender-male']");
//    By firstName = By.id("FirstName");
//    By lastName = By.id("LastName");
//    By dayOfBirth = By.xpath("//select[@name='DateOfBirthDay']");
//    By monthOfBirth = By.xpath("//select[@name='DateOfBirthMonth']");
//    By yearOfBirth = By.xpath("//select[@name='DateOfBirthYear']");
//    By emailField = By.id("Email");
//    By companyField = By.id("Company");
//    By password = By.id("Password");
//    By confirmPassword = By.id("ConfirmPassword");
//    By registerBtn = By.xpath("//input[@id='register-button']");
//    By welcomeText = By.xpath("//div[text()='Your registration completed']");


    @FindBy (className = "ico-register")
    WebElement _registerLink;
    @FindBy (xpath = "//div[@class='page-title']")
    WebElement _registerWelcomeText;
    @FindBy (xpath = "//input[@id='gender-male']")
    WebElement _selectGender;
    @FindBy (id = "FirstName")
    WebElement _firstName;
    @FindBy (id = "LastName")
    WebElement _lastName;
    @FindBy (xpath = "//select[@name='DateOfBirthDay']")
    WebElement _dayOfBirth;
    @FindBy (xpath = "//select[@name='DateOfBirthMonth']")
    WebElement _monthOfBirth;
    @FindBy (xpath = "//select[@name='DateOfBirthYear']")
    WebElement _yearOfBirth;
    @FindBy (id = "Email")
    WebElement _emailField;
    @FindBy (id = "Company")
    WebElement _companyField;
    @FindBy (id = "Password")
    WebElement _password;
    @FindBy (id = "ConfirmPassword")
    WebElement _confirmPassword;
    @FindBy (xpath = "//input[@id='register-button']")
    WebElement _registerBtn;
    @FindBy (xpath = "//div[text()='Your registration completed']")
    WebElement _welcomeText;





    public void clickOnRegisterLink() {
        clickOnElement(_registerLink);
    }

    public String registerText() {
        return getTextFromElement(_registerWelcomeText);
    }

    public void clickOnGender() {
        clickOnElement(_selectGender);
    }

    public void enterFirstName(String firstname) {
        sendTextToElement(_firstName, firstname);
    }

    public void enterLastName(String lastname) {
        sendTextToElement(_lastName, lastname);
    }

    public void enterDayOfBirth(String dayofbirth) {
        sendTextToElement(_dayOfBirth, dayofbirth);
    }

    public void enterMonthOfBirth(String monthofbirth) {
        sendTextToElement(_monthOfBirth, monthofbirth);
    }

    public void enterYearOfBirth(String yearofbirth) {
        sendTextToElement(_yearOfBirth, yearofbirth);
    }

    public void enterEmail(String email) {
        sendTextToElement(_emailField, email);
    }

    public void enterCompanyName(String company) {
        sendTextToElement(_companyField, company);
    }

    public void enterPassword(String Password) {
        sendTextToElement(_password, Password);
    }

    public void enterPasswordInConfirmPassword(String confirmpassword) {
        sendTextToElement(_confirmPassword, confirmpassword); }

    public void clickOnRegisterBtn() {
        clickOnElement(_registerBtn);
    }

    public String welcomeText() {
        return getTextFromElement(_welcomeText);
    }

}
