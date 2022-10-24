package com.cydeo.tests.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.*;

public class BrowserUtils {
    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Exception caught in sleep method");
        }
    }

    public static void verifyTitle(WebDriver driver, String expectedTitle) {
        try {
            String actualTitle = driver.getTitle();
            Assert.assertEquals(actualTitle, expectedTitle);
        } catch (Exception e) {
            System.out.println("Trying GerTitle Exception was caught");
            e.printStackTrace();
        }

    }

    public static void login(WebDriver driver, String username, String password) {
        username = ConfigReader.getProperties(username);
        password = ConfigReader.getProperties(password);

        try {
            WebElement userNameInput = driver.findElement(By.xpath
                    ("//input[@id='prependedInput']"));
            userNameInput.sendKeys(username + Keys.ENTER);
        } catch (NoSuchElementException e) {
            System.out.println("Login Element is not found");
            throw new NoSuchElementException(e);
        }
        BrowserUtils.sleep(3);
        try {
            WebElement passWordInput = driver.findElement(By.xpath
                    ("//input[@id='prependedInput2']"));
            passWordInput.sendKeys(password + Keys.ENTER);
        } catch (NoSuchElementException e) {
            System.out.println("Password Element is not found");
            throw new NoSuchElementException(e);
        }
        BrowserUtils.sleep(3);

    }

    public static void goToPage(WebDriver driver, String environment) {
        try {
            driver.get(ConfigReader.getProperties(environment));
            BrowserUtils.sleep(3);
        } catch (Exception e) {
            System.out.println("Trying to getPage Exception was caught");
        }
    }

    public static void verifyModulesAppear
            (WebDriver driver, String username) {
        //String xPath = "";
        Set<String> set = new LinkedHashSet<>();
        List<String> list = new ArrayList<>();
        switch (username) {

            case "DriverUserName":
                //xPath = ConfigReader.getProperties("DriverModules");
                set = new LinkedHashSet<>(Arrays.asList
                        ("Fleet", "Customers", "Activities", "System"));
                try {
                    WebElement alertCloseButton = driver.findElement
                            (By.xpath("//button[@data-dismiss='alert']"));
                    alertCloseButton.click();
                }catch (Exception e) {
                    System.out.println("Trying to close Alert Exception was caught");
                    e.printStackTrace();
                }
                try {
                    list.add(driver.findElement(By.xpath("(//a[@class='unclickable'])[1]")).getText());
                    BrowserUtils.sleep(1);
                    list.add(driver.findElement(By.xpath("(//a[@class='unclickable'])[2]")).getText());
                    BrowserUtils.sleep(1);
                    list.add(driver.findElement(By.xpath("(//a[@class='unclickable'])[3]")).getText());
                    BrowserUtils.sleep(3);
                    list.add(driver.findElement(By.xpath("(//a[@class='unclickable'])[4]")).getText());
                } catch (Exception e) {
                    System.out.println("Trying Driver Access Exception was caught");
                    e.printStackTrace();
                }
                break;

            case "StoreManagerUsername":

            case "SalesManagerUsername":
                //xPath = ConfigReader.getProperties("SalesManagerModules");
                //xPath = ConfigReader.getProperties("StoreManagerModules");
                set = new LinkedHashSet<>(Arrays.asList("Dashboards", "Fleet", "Customers", "Sales",
                        "Activities", "Marketing", "Reports & Segments", "System"));
                try {
                    WebElement alertCloseButton = driver.findElement
                            (By.xpath("//button[@data-dismiss='alert']"));
                    alertCloseButton.click();
                }catch (Exception e) {
                    System.out.println("Trying to close Alert Exception was caught");
                    e.printStackTrace();
                }
                try {
                    list.add(driver.findElement(By.xpath("(//a[@class='unclickable'])[1]")).getText());
                    BrowserUtils.sleep(1);
                    list.add(driver.findElement(By.xpath("(//a[@class='unclickable'])[2]")).getText());
                    BrowserUtils.sleep(1);
                    list.add(driver.findElement(By.xpath("(//a[@class='unclickable'])[3]")).getText());
                    BrowserUtils.sleep(1);
                    list.add(driver.findElement(By.xpath("(//a[@class='unclickable'])[4]")).getText());
                    BrowserUtils.sleep(1);
                    list.add(driver.findElement(By.xpath("(//a[@class='unclickable'])[5]")).getText());
                    BrowserUtils.sleep(1);
                    list.add(driver.findElement(By.xpath("(//a[@class='unclickable'])[6]")).getText());
                    BrowserUtils.sleep(1);
                    list.add(driver.findElement(By.xpath("(//a[@class='unclickable'])[7]")).getText());
                    BrowserUtils.sleep(3);
                    list.add(driver.findElement(By.xpath("(//span[@class='title title-level-1'])[8]")).getText());
                } catch (Exception e) {
                    System.out.println("Trying Manager Access Exception was caught");
                    e.printStackTrace();
                }
                break;

        }
        try {
            WebElement logout1 = driver.findElement(By.xpath("//a[@href='javascript: void(0);']"));
            logout1.click();
            WebElement logout2 = driver.findElement(By.xpath("//a[@href='/user/logout']"));
            logout2.click();
        } catch (Exception e) {
            System.out.println("Trying Logout, Exception was caught");
            e.printStackTrace();
        }
        int k = 0;
        for (String eachModule : set) {
            Assert.assertEquals(list.get(k), eachModule);
            k++;
        }
    }
}


