package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GetTitleEG {
    WebDriver driver;
    @BeforeClass
    public void driverSetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void getTile() {
        driver.get("https://www.cydeo.com");
        String actual = driver.getTitle();
        String expected = "Cydeo";
        Assert.assertEquals(actual, expected);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
