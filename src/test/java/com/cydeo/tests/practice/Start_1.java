package com.cydeo.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Start_1 {
    WebDriver driver;

    @BeforeClass
    public void setDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @BeforeMethod
    public void getWebPage() throws InterruptedException {
        driver.get("https://startappliancerepair.com/");
        Thread.sleep(4000);
    }

    @AfterMethod
    public void closeDriver() {
        driver.close();
    }

    @Test
    public void homePageFunctionality() {
        try {
            WebElement lock = driver.findElement(By.xpath(
                    "//div//i[@class='fi-lock']"));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", lock);
            Thread.sleep(4000);
            WebElement userName = driver.findElement(By.xpath(
                    "//input[@class='input username']"));
            js.executeScript("arguments[0].click();", userName);
            userName.sendKeys("admin");
            WebElement password = driver.findElement(By.xpath(
                    "//input[@class='input password']"));
            js.executeScript("arguments[0].click();", password);
            password.sendKeys("!3Oo9u0N#pvneOoy$S)U%cXZ" + Keys.ENTER);
            WebElement services = driver.findElement(By.xpath("//div[@class=" +
                    "'elementor-container elementor-column-gap-no']//i[@class='fa fa-angle-down']"));
            WebElement dishwasher = driver.findElement(By.xpath("//div[@class=" +
                    "'elementor-container elementor-column-gap-no']//a[@href=" +
                    "'https://startappliancerepair.com/services/service-dishwasher/']"));
            Thread.sleep(4000);
            js.executeScript("arguments[0].click();", dishwasher);

            //admin !3Oo9u0N#pvneOoy$S)U%cXZ
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("EXCEPTION CAUGHT");
        }
    }
}
