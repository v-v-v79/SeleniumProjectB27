package com.cydeo.tests.day10_action_jsexec;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.TestBase;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class Registration_Form extends TestBase {
    @Test
    public void registration(){
        Faker faker = new Faker();
        driver.get("https://practice.cydeo.com/registration_form");
        WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstname.sendKeys(faker.name().firstName());
        BrowserUtils.sleep(3);

        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        String userName = faker.name().username().replace(".", "");
        username.sendKeys(userName);
        BrowserUtils.sleep(3);

        List<WebElement> genders = driver.findElements(By.xpath("//input[@type='radio']"));
        genders.get(faker.number().numberBetween(0, 1)).click();
        BrowserUtils.sleep(3);

        WebElement dateOfBirth = driver.findElement(By.xpath("//input[@name='birthday']"));
        dateOfBirth.sendKeys("10/03/1980");
        BrowserUtils.sleep(3);


        Select departmentDropdown = new Select(driver.findElement
                (By.xpath("//select[@name='department']")));
        departmentDropdown.selectByIndex(faker.number().numberBetween(1, 9));
        BrowserUtils.sleep(3);
    }
}
