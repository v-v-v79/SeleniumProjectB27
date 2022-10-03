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

public class EtsyTitle {
    WebDriver driver;
    @BeforeClass
    public void driverSetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test(priority = 1)
    public void getTextGetAttribute() {
        driver.get("https://etsy.com");
        driver.findElement(By.xpath("//input[@data-id='search-query']"))
                .sendKeys("wooden spoon" + Keys.ENTER);
        boolean exp = driver.getTitle().contains("Wooden spoon");
        Assert.assertTrue(exp);
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
