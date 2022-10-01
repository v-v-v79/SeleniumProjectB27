package com.cydeo.tests.day6_js_testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IframeEG {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {

        // 1. SetUp browser

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/iframe");
    }
    @Test
    public void iframeTask() {
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));
        WebElement textArea = driver.findElement(By.xpath("//p"));
        System.out.println(textArea.getText());
    }
    @AfterMethod
    public void tearDownMethod() {
        driver.quit();
    }
}


