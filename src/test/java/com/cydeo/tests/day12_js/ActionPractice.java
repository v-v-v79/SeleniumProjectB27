package com.cydeo.tests.day12_js;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionPractice {
    @Test
    public void testActionPageUpDown() {
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");

        // Create an Actions object to use methods coming from Actions class
        Actions actions = new Actions(Driver.getDriver());

        //4- Scroll using Actions class “moveTo(element)” method
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

        actions.moveToElement(cydeoLink).perform();

        BrowserUtils.sleep(3);
//        2- Scroll back up to “Home” link using PageUP button
        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP, Keys.PAGE_UP).perform();

        Driver.closeDriver();
    }
}

