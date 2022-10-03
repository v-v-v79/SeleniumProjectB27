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

public class GoogleGoBack {
    WebDriver driver;
    @BeforeClass
    public void driverSetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test(priority = 1)
    public void getGmailTitle() {
        driver.get("https://google.com");
        WebElement gmail = driver.findElement(By.xpath
                ("//div[@class='LX3sZb']//a[@data-pid='23']"));
        gmail.click();
        boolean gmailTitle = driver.getTitle().contains("Gmail");
        Assert.assertTrue(gmailTitle);
        driver.navigate().back();
        Assert.assertTrue(driver.getTitle().contains("Google"));
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

