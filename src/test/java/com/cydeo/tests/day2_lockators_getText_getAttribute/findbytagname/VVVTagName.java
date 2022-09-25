package com.cydeo.tests.day2_lockators_getText_getAttribute.findbytagname;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VVVTagName {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        driver.get("http://practice.cydeo.com");
//
//        WebElement aExamples = driver.findElement(By.tagName("h2"));
//        System.out.println(aExamples.getText());

        driver.get("https://www.vvvappliance.com//service-fridge.html");
        WebElement ourAims = driver.findElement(By.cssSelector(".inset-md-right-30>h1"));
        System.out.println(ourAims.getText());
        WebElement bestRef = driver.findElement(By.cssSelector("div[class=\"well-custom\"]>h5"));
        System.out.println(bestRef.getText());
        WebElement inputName = driver.findElement(By.cssSelector("div>#contact-name"));
        inputName.sendKeys("Viacheslav");
//        Thread.sleep(4000);
//        driver.quit();
    }
}
