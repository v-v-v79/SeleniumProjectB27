package com.cydeo.tests.day10_action_jsexec;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class T6_Scroll_JavaScriptExecutor extends TestBase {

    @Test
    public void scrollDown() {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        driver.get("https://practice.cydeo.com/infinite_scroll");
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 750)");

        for(int i = 0; i < 10; i++) {
            BrowserUtils.sleep(3);
            js.executeScript("window.scrollBy(0, 750)");
        }
        for(int i = 0; i < 10; i++) {
            BrowserUtils.sleep(3);
            js.executeScript("window.scrollBy(0, -750)");
        }
    }
}
