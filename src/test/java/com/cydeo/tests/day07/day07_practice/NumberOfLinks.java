package com.cydeo.tests.day07.day07_practice;

import com.cydeo.tests.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class NumberOfLinks extends TestBase {

    @Test
    public void linkCounter(){
        driver.get("https://www.openxcell.com/");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        int i = 0;
        for (WebElement link : links) {
            i++;
        }
        System.out.println(i);
        i = 0;
        int j = 0;
        for (WebElement link : links) {
            if(link.getText() != "") {
                j++;
            }
            if(link.getText() == "")
                i++;
        }
        System.out.println(j);
        System.out.println(i);
    }
}
