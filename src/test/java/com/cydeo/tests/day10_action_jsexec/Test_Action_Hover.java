package com.cydeo.tests.day10_action_jsexec;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Action_Hover {
    @Test
    public void hover_test(){
        Driver.getDriver().get("https://practice.cydeo.com/hovers");
        WebElement image1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement image2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement image3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user1']"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user2']"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user3']"));

        Actions actions = new Actions(Driver.getDriver());

        //Hover over to first image
        actions.moveToElement(image1).perform();
        //Assert: name "user1" is displayed
        Assert.assertTrue(user1.isDisplayed());

        actions.moveToElement(image2).perform();
        Assert.assertTrue(user2.isDisplayed());

        actions.moveToElement(image3).perform();
        Assert.assertTrue(user3.isDisplayed());

    }
}
