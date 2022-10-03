package com.cydeo.tests.day2_lockators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GetTextGetAttribute {
    WebDriver driver;
    @BeforeClass
    public void driverSetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test(priority = 1)
    public void getTextGetAttribute() {
        driver.get("https://practice.cydeo.com/registration_form");
        String actualText = driver.findElement(By.xpath("//h2")).getText();
        String expected = "Registration form";
        Assert.assertEquals(actualText, expected);
        WebElement attribute = driver.findElement(By.xpath("//input"));
        String actAtr = attribute.getAttribute("placeholder");
        String expectedAtr = "first name";
        Assert.assertEquals(actAtr, expectedAtr);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
