package com.cydeo.tests.day6_js_testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowsEG {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod() {
        // 1. SetUp browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void windowTask(){
        driver.get("https://practice.cydeo.com/windows");

        //Assert title is Windows
        String act = driver.getTitle();
        String exp = "Windows";
        Assert.assertEquals(act, exp);
        System.out.println(act);

        //Click to "Click here"
        WebElement clickHere = driver.findElement(By.xpath("//a[text()='Click Here']"));
        clickHere.click();
        act = driver.getTitle();
        System.out.println(act);

        //Switch new Window
        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
            System.out.println(windowHandle);
            System.out.println(driver.getTitle());
        }
        //Assert Title is new Window
        act = driver.getTitle();
        exp = "New Window";
        Assert.assertEquals(act, exp);

        //driver.switchTo().window(mainWindow);

    }
    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }
}
