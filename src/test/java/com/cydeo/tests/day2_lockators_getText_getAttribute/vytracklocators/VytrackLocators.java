package com.cydeo.tests.day2_lockators_getText_getAttribute.vytracklocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VytrackLocators {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://app.vytrack.com/user/login");
        WebElement userName = driver.findElement(By.id("prependedInput"));
        userName.sendKeys("abcd");

        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("absd");

        WebElement loginBtn = driver.findElement(By.id("_submit"));
        loginBtn.click();

        WebElement invalidUP = driver.findElement(By.className("alert"));
        if(invalidUP.getText().equals("Invalid user name or password."))
            System.out.println("Invalid name or password message TEST is PASSED");
        else
            System.out.println("Invalid name or password message TEST is FAILED");

        String actURl = driver.getCurrentUrl();
        if (actURl.contains("vytrack"))
            System.out.println("URL test PASSED");
        else
            System.out.println("URL test FAILED");

        driver.findElement(By.partialLinkText("Forgot")).click();

        if(driver.getTitle().equals("Forgot Password"))
            System.out.println("Forgot password Title test PASSED");
        else
            System.out.println("Forgot password Title test FAILED");
        driver.quit();
    }
}
