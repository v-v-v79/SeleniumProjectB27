package com.cydeo.tests.day12_js;

import com.cydeo.tests.utilities.Driver;
import com.cydeo.tests.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Circle_DragAndDrop extends TestBase {
    @Test
    public void testDragDrop(){
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));

        WebElement acceptCookies = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        acceptCookies.click();

        Actions actions = new Actions(Driver.getDriver());

        actions.dragAndDrop(smallCircle, bigCircle);
        actions.clickAndHold(smallCircle).
                pause(2000).moveToElement(bigCircle).pause(2000).release().perform();

        String actualTextOgBigCircle = bigCircle.getText();
        String expectedTextOgBigCircle = "You did great!";

        Assert.assertEquals(actualTextOgBigCircle, expectedTextOgBigCircle);
    }
}
