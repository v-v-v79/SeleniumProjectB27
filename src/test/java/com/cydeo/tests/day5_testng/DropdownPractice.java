package com.cydeo.tests.day5_testng;

import com.cydeo.tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownPractice extends TestBase {

    @Test
    public void dressSort() throws InterruptedException {
        driver.get("https://automationpractice.com/index.php?id_category=3&controller=category#/");
        Select select = new Select(driver.findElement(By.xpath
                ("//select[@id='selectProductSort']")));
        select.selectByValue("price:desc");
        Thread.sleep(4000);
        WebElement dress = driver.findElement(By.xpath
                ("(//a[@title='Printed Chiffon Dress'])[1]"));
        String actual = dress.getText();
        String expected = "Printed Chiffon Dress";
        try {
            Assert.assertEquals(actual, expected);
            System.out.println("Test is PASSED");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("EXCEPTION");
        }
    }
}
