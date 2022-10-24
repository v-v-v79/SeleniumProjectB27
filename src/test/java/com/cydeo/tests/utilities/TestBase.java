package com.cydeo.tests.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {
    protected static WebDriver driver;
    @BeforeMethod
    public void driverSetUp() {
        driver = WebDriverFactory.getDriver(ConfigReader.getProperties("browser"));
        BrowserUtils.sleep(1);
        assert driver != null;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void tearDown() {
        Driver.getDriver().quit();
    }
}
