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

public class ButtonClickXpathEG {
    WebDriver driver;
    @BeforeClass
    public void driverSetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test(priority = 1)
    public void clickButtons() {
        driver.get("https://practice.cydeo.com/multiple_buttons");
        List<WebElement> list = driver.findElements
                (By.xpath("//button[@class='btn btn-primary']"));
        for (WebElement webElement : list) {
            webElement.click();
            WebElement result = driver.findElement
                    (By.xpath("//p[@id='result']"));
            System.out.println(result.getText());
        }
        System.out.println("list = " + list);
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
