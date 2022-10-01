package com.cydeo.tests.day6_js_testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsEG {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {

        // 1. SetUp browser

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/javascript_alerts");
    }
    @Test
    public void alertTask(){

        //Click JS Alert button

        WebElement clickForJsAlertButton = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        clickForJsAlertButton.click();

        //Click "OK" fom Alert window

        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        //Verify that it works

        WebElement textMessage = driver.findElement(By.xpath("//p[@id='result']"));
        String actualTM = textMessage.getText();
        String expectedTM = "You successfully clicked an alert";
        Assert.assertEquals(actualTM, expectedTM);
    }
    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }
}
