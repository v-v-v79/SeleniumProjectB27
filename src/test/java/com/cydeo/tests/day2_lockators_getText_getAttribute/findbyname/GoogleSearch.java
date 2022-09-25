package com.cydeo.tests.day2_lockators_getText_getAttribute.findbyname;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args)throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        WebElement searchTab = driver.findElement(By.name("q"));
        searchTab.sendKeys("selenium" + Keys.ENTER);
        Thread.sleep(4000);
        driver.quit();
    }
}
