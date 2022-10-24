package com.cydeo.tests.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTableUtils {

    //Method #1 info:
    //• Name: returnOrderDate ()
    //• Return type: String
    //• Arg1: WebDriver driver
    //• Arg2: String costumerName
    //This method should accept a costumerName and return the costumer order date as a String.
    public static String returnOrderDate(WebDriver driver, String costumerName){

        // String locator = "//td[.='" + costumerName + "']/following-sibling::td[3]";
        WebElement customerOrderDate = driver.findElement(By.xpath("//td[.='" + costumerName + "']/following-sibling::td[3]"));
        return customerOrderDate.getText();
    }
}
