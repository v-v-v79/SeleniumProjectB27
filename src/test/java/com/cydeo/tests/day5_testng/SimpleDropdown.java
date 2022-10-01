package com.cydeo.tests.day5_testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleDropdown {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod() {

        // 1. SetUp browser

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void simpleDropDown() {
        driver.get("https://practice.cydeo.com/dropdown");
        Select select = new Select(driver.findElement(By.id("dropdown")));
        String actual = select.getFirstSelectedOption().getText();
        String expected = "Please select an option";
        Assert.assertEquals(actual, expected);
        Select select1 = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        String actual1 = select1.getFirstSelectedOption().getText();
        String expected1 = "Select a State";
        Assert.assertEquals(actual1, expected1);

    }
    @AfterMethod
    public void tearDownMethod() {
        driver.quit();
    }
}
