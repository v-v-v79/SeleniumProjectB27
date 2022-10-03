package com.cydeo.tests.day2_lockators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ForgotPassword {
    WebDriver driver;
    @BeforeClass
    public void driverSetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test(priority = 1)
    public void getTextGetAttribute() {
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");
        driver.findElement(By.xpath
                ("//div[@class='login-item']//input[@name='USER_LOGIN']"))
                .sendKeys("ddd@hhh.com" + Keys.ENTER);
        driver.findElement(By.xpath("//button[.='Reset password']")).click();
        WebElement warning = driver.findElement(By.xpath(
                "//div[.='Login or E-mail not found']"));
        Assert.assertTrue(warning.getText().equals("Login or E-mail not found"));
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
