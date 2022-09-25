package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://vvvappliance.com");
//        Thread.sleep(4000);
//        driver.navigate().to("https://www.vvvappliance.com/services.html");
//        Thread.sleep(4000);
//        driver.navigate().to("https://www.vvvappliance.com/service-fridge.html");
//        Thread.sleep(4000);
//        driver.navigate().back();
//        Thread.sleep(4000);
//        driver.navigate().to("https://www.vvvappliance.com/service-oven.html");
//        Thread.sleep(4000);
//        driver.navigate().back();
//        Thread.sleep(4000);
//        driver.navigate().to("https://vvvappliance.com");
//        Thread.sleep(4000);
        driver.navigate().refresh();
        String currentTitle = driver.getTitle();
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);
        System.out.println(currentTitle);
        driver.quit();
    }
}
