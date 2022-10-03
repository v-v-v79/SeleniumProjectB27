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

public class LoginFunc {
    WebDriver driver;
    @BeforeClass
    public void driverSetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test(priority = 1)
    public void searchForApple() {
        driver.get("https://login1.nextbasecrm.com/");
        driver.findElement(By.xpath("//input[@placeholder='Login']"))
                .sendKeys("incorrect@email.com" + Keys.ENTER);
        driver.findElement(By.xpath("//input[@placeholder='Password']"))
                .sendKeys("incorrectPassword" + Keys.ENTER);
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
        String actual = driver.findElement(By.xpath
                ("//div[.='Incorrect login or password']")).getText();
        String expected = "Incorrect login or password";
        Assert.assertEquals(actual, expected);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
