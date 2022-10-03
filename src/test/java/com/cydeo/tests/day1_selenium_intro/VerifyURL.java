package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyURL {
    WebDriver driver;
    @BeforeClass
    public void driverSetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test (priority = 1)
    public void verifyTitle() {
        driver.get("https://practice.cydeo.com");
        String actual = driver.getTitle();
        String expected = "Practice";
        Assert.assertEquals(actual, expected, "PASSED");
    }
    @Test (priority = 2)
    public void verifyURL() {
        driver.get("https://practice.cydeo.com");
        boolean expected = driver.getCurrentUrl().contains("cydo");
        Assert.assertTrue(expected, "URL does not contains cydo");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
