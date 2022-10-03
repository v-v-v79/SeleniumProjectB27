package com.cydeo.tests.day2_lockators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassNameLocator {
    WebDriver driver;
    @BeforeClass
    public void driverSetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test(priority = 1)
    public void getGmailTitle() {
        driver.get("https://practice.cydeo.com/inputs");
        driver.findElement(By.className("nav-link")).click();
        Assert.assertTrue(driver.getTitle().equals("Practice"));
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
