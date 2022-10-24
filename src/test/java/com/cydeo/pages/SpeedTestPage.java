package com.cydeo.pages;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpeedTestPage {
    public SpeedTestPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//a[normalize-space()='Results']")
    public WebElement resultLink;

    @FindBy (xpath = "//span[@class='start-text']")
    public WebElement goButton;

    @FindBy (xpath = "//canvas[@class='gauge-speed-text']")
    public WebElement gaugeSpeedNeedle;

    @FindBy (css = ".result-data-large.number.result-data-value.download-speed")
    public WebElement downloadSpeed;
}
