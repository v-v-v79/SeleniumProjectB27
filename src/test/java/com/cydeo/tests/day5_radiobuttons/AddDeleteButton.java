package com.cydeo.tests.day5_radiobuttons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddDeleteButton {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/add_remove_elements/");
        Thread.sleep(3000);
        WebElement addButton = driver.findElement(By.xpath("//button[text()='Add Element']"));
        addButton.click();
        Thread.sleep(3000);
        WebElement deleteButton = driver.findElement(By.xpath("//button[@class='added-manually']"));
        deleteButton.click();
        Thread.sleep(3000);
        try {
            System.out.println(deleteButton.isDisplayed());
        }
        catch (StaleElementReferenceException e) {
            System.out.println("Exception");
        }
        driver.quit();
    }
}
