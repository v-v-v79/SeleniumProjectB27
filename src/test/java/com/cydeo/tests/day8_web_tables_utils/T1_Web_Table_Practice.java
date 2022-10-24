package com.cydeo.tests.day8_web_tables_utils;

import com.cydeo.tests.utilities.TestBase;
import com.cydeo.tests.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Web_Table_Practice extends TestBase {
    @Test
    public void order_name_verify_test(){

        //2. Verify Bob’s name is listed as expected.
        //Expected: “Bob Martin”

        WebElement bobMartinName =
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));

        String expectedBobName = "Bob Martin";
        String actualBobName = bobMartinName.getText();

        Assert.assertEquals(actualBobName,expectedBobName);

        //3. Verify Bob Martin’s order date is as expected
        //Expected: 12/31/2021

        // You can also use this xpath:  //td[.='Bob Martin']/../td[5]
        WebElement bobMartinOrderDate =
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));

        Assert.assertEquals(bobMartinOrderDate.getText(),"12/31/2021");


    }

    @Test
    public void test2(){
        String customerOrderDate1 = WebTableUtils.returnOrderDate(driver,"Alexandra Gray");
        System.out.println("customerOrderDate1 = " + customerOrderDate1);

    }
}
