package com.cydeo.tests.day4_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_getText_getAttribute {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("http://www.youtube.com/");
        WebElement searchWindow = driver.findElement(By.cssSelector("input[name=\"search_query\"]"));
        WebElement searchButton = driver.findElement(By.xpath("//*[@id='search-icon-legacy']"));
        searchWindow.sendKeys("Ived11");
        searchButton.click();
        Thread.sleep(3000);
        WebElement ived11Channel = driver.findElement(By.xpath("//a[@id='main-link']//yt-formatted-string[@class='style-scope ytd-channel-name']"));
        ived11Channel.click();
        Thread.sleep(5000);
        driver.close();
        driver.quit();

    }
}
