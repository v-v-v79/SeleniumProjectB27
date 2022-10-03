package com.cydeo.tests.day4_cssSeleclor;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class CSS_SelectorEG2 {
    WebDriver driver;
    @BeforeClass
    public void driverSetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test(priority = 1)
    public void getTextGetAttribute() {
        driver.get("https://practice.cydeo.com/forgot_password");
        WebElement home = driver.findElement(By.cssSelector("[href='/']"));
        WebElement forgotPassword = driver.findElement(By.cssSelector("div>h2"));
        WebElement email = driver.findElement(By.cssSelector("label[for='email']"));
        WebElement emailInput = driver.findElement(By.cssSelector("input[name='email']"));
        WebElement retrievePasswordButton = driver.findElement(By.cssSelector("[id='form_submit']"));
        WebElement poweredByCydeo = driver.findElement(By.cssSelector("[style='text-align: center;']"));
        List<WebElement> list = new ArrayList<>();
        list.add(home);
        list.add(forgotPassword);
        list.add(email);
        list.add(emailInput);
        list.add(retrievePasswordButton);
        list.add(poweredByCydeo);
        for (WebElement webElement : list) {
            if (webElement.isDisplayed())
                System.out.println(webElement.getText() + " is displayed");
            else
                System.out.println(webElement.getText() + "is NOT displayed");
        }
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
