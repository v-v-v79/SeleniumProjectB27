package com.cydeo.tests.day4_cssSeleclor;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class CSS_SelectorEG3 {
    WebDriver driver;
    @BeforeClass
    public void driverSetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test(priority = 1)
    public void getTextGetAttribute() {
        driver.get("https://practice.cydeo.com/abtest");
        List<WebElement> list = driver.findElements(By.tagName("a"));
        System.out.println(list.size());
        for (WebElement webElement : list) {
            System.out.println(webElement.getText());
        }
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
