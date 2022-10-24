package com.cydeo.tests.day13_pom_explicitlywait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.tests.utilities.Driver;
import com.cydeo.tests.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_POM_EG extends TestBase {
    @Test
    public void test_POM_EG() {
        Driver.getDriver().get("https://library2.cydeo.com/login.html");
        LibraryLoginPage libraryLoginPage = new LibraryLoginPage();
        libraryLoginPage.inputUserName.sendKeys("aaa@bb.ccc");
        libraryLoginPage.inputPassword.sendKeys("12345");
        libraryLoginPage.singInButton.click();
        Assert.assertEquals(libraryLoginPage.wrongCredentialsAlert.getText(),
                "Sorry, Wrong Email or Password");
    }
}
