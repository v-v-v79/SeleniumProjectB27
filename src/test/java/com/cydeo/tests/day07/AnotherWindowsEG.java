package com.cydeo.tests.day07;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class AnotherWindowsEG extends TestBase {

    @Test
    public void aFewWindows() {
        driver.get("https://practice.cydeo.com/windows");

        //Assert title is Windows
        String act = driver.getTitle();
        String exp = "Windows";
        Assert.assertEquals(act, exp);
        System.out.println(act);

        //Click to "Click here"
        WebElement clickHere = driver.findElement(By.xpath("//a[text()='Click Here']"));
        clickHere.click();
        act = driver.getTitle();
        System.out.println(act);
        BrowserUtils.sleep(4);


        WebElement clickCydeo = driver.findElement(By.xpath("//a[.='CYDEO']"));
        clickCydeo.click();
        BrowserUtils.sleep(4);

        //Switch new Window
        Set<String> allWindows = driver.getWindowHandles();
        for (String windowHandle : allWindows) {
            driver.switchTo().window(windowHandle);
            if(driver.getTitle().contains("Cydeo"))
                break;
        }
        System.out.println(driver.getTitle());

        WebElement applyNow = driver.findElement(By.xpath("//span[.='Apply Now']"));
        applyNow.click();
        BrowserUtils.sleep(4);

        System.out.println(driver.getTitle());
        //Assert Title is new Window
//        act = driver.getTitle();
//        exp = "New Window";
//        Assert.assertEquals(act, exp);



    }
}
