package com.cydeo.tests.day12_js;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.Driver;
import com.cydeo.tests.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T7_JSExecutor extends TestBase {
    @Test
    public void test7_js_scroll() {
        Driver.getDriver().get("https://practice.cydeo.com/large");
        //down casting to JS executor Interface
        JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));
        BrowserUtils.sleep(1);
        js.executeScript("arguments[0].scrollIntoView(true)", cydeoLink);
        //js.executeScript("arguments[0].scrollIntoView(true)", cydeoLink, homeLink);
        //js.executeScript("arguments[1].scrollIntoView(true)", cydeoLink, homeLink);
        BrowserUtils.sleep(3);
        js.executeScript("arguments[0].scrollIntoView(true)", homeLink);
        BrowserUtils.sleep(3);
    }
}
