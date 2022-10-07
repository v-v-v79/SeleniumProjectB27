package com.cydeo.tests.day6_js_testing;

import com.cydeo.tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WindowsBookingCom extends TestBase {

    @Test
    public void changeWindows() {
        driver.get("https://www.booking.com/");
        WebElement discover = driver.findElement(By.xpath
                ("//span[.='Discover monthly stays']"));
        discover.click();
        String mainWindow = driver.getWindowHandle();
        for (String windows : driver.getWindowHandles()) {
            driver.switchTo().window(windows);
            System.out.println("windows = " + windows);
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }
        driver.switchTo().window(mainWindow);
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }

}
