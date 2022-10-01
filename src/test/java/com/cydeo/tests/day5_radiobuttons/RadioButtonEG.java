package com.cydeo.tests.day5_radiobuttons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RadioButtonEG {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/radio_buttons");
//        WebElement hockeyButton = driver.findElement(By.xpath("//input[@id='hockey']"));
//        hockeyButton.click();
//        System.out.println(hockeyButton.isSelected());
//        if(hockeyButton.isSelected())
//            System.out.println("Hockey button is selected");
//        else
//            System.out.println("Hockey button is not selected");
//        driver.quit();
//        driver.close();
        //test all radio buttons
        List<WebElement> sportRadioButtons = driver.findElements(By.xpath("//input[@name='sport']"));
        for (WebElement eachSport: sportRadioButtons) {
            eachSport.click();
            if(eachSport.isSelected())
                System.out.println(eachSport.getAttribute("id") + " Radio button is selected");
        }
        driver.quit();
        //driver.close();
    }
}
