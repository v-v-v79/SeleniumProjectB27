package com.cydeo.tests.day4_cssSeleclor;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class CheckBoxEG {
    WebDriver driver;
    @BeforeClass
    public void driverSetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test(priority = 1)
    public void checkBoxes() {
        driver.get("https://practice.cydeo.com/checkboxes");
        List<WebElement> list = driver.findElements(By.cssSelector("input[type='checkbox']"));
        System.out.println(list.size());
        Assert.assertTrue(!list.get(0).isSelected());
        Assert.assertTrue(list.get(1).isSelected());
        list.get(0).click();
        list.get(1).click();
        Assert.assertTrue(list.get(0).isSelected());
        Assert.assertTrue(!list.get(1).isSelected());
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
