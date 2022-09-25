package com.cydeo.tests.day2_lockators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarInsuranceAppVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.qa1.excelsoirinsurance.com/login");

        String expectedURL = "excelsoirinsurance";
        String actualURL = driver.getCurrentUrl();

        if(actualURL.contains(expectedURL))
            System.out.println("URL verification is PASSED");
        else
            System.out.println("URL verification FAILED");

        String exceptedTitle = "Login | Excelsoir Insurance";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(exceptedTitle))
            System.out.println("Title verification is PASSED");
        else
            System.out.println("Title verification is FAILED");
        driver.quit();
    }
}
