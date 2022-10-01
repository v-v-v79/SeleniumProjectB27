package com.cydeo.tests.day5_testng;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGeg {

    @Test (priority = 1)
    public void myTest() {
        System.out.println("Test is running");
        String actual = "app";
        String expected = "app";
        Assert.assertEquals(actual, expected);
    }
    @Test (priority = 2)
    public void myTest2() {
        System.out.println("Test2 is running");
        String actual = "apple";
        String expected = "apple";
        Assert.assertTrue(actual.equals(expected));
    }
    @BeforeMethod
    public void setUpMethod() {
        System.out.println("BeforeMethod is running");
    }
    @AfterMethod
    public void tearDownMethod() {
        System.out.println("AfterMethod is running");
    }
    @BeforeClass
    public void setUp() {
        System.out.println("AfterMethod is running");
    }
    @AfterClass
        public void tearDown() {
            System.out.println("AfterMethod is running");
        }
}
