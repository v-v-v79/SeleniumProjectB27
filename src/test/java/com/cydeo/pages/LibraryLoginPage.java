package com.cydeo.pages;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {
    public LibraryLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (id = "inputEmail")
    public WebElement inputUserName;

    @FindBy (xpath = "//input[@id='inputPassword']")
    public WebElement inputPassword;

    @FindBy (xpath = "//button[text()='Sign in']")
    public WebElement singInButton;

    @FindBy (xpath = "//div[text()='This field is required.']")
    public WebElement errorAlert;

    @FindBy (xpath = "//div[text()='Please enter a valid email address.']")
    public WebElement incorrectEmailAlert;

    @FindBy (xpath = "//div[text()='Sorry, Wrong Email or Password']")
    public WebElement wrongCredentialsAlert;
}
