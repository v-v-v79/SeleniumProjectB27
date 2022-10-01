package com.cydeo.tests.day5_testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Selenium {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {

        // 1. SetUp browser

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void googleTitle(){

        // 2. Navigate to page

        driver.get("https://google.com");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";

        //Verify if title is Google

        Assert.assertEquals(actualTitle, expectedTitle, "Title is not matching");
    }
}
