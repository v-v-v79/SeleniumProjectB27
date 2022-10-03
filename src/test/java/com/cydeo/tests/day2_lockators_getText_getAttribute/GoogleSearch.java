package com.cydeo.tests.day2_lockators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleSearch {
    WebDriver driver;
    @BeforeClass
    public void driverSetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test(priority = 1)
    public void searchForApple() {
        driver.get("https://google.com");
        driver.findElement(By.xpath("//input[@name='q']"))
                .sendKeys("apple" + Keys.ENTER);
        System.out.println(driver.getTitle());
        boolean expected = driver.getTitle().contains("apple");
        Assert.assertTrue(expected);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

