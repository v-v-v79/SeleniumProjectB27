package com.cydeo.tests.vytrack_local;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.TestBase;
import org.testng.annotations.Test;

public class TestModulesAppearance extends TestBase {

    @Test (priority = 1)
    public void getModules_StoreManagers(){

        BrowserUtils.goToPage(driver,"env");
        BrowserUtils.login(driver, "StoreManagerUsername", "password");
        BrowserUtils.verifyModulesAppear(driver, "StoreManagerUsername");
    }
    @Test (priority = 2)
    public void getModules_SalesManagers(){

        BrowserUtils.goToPage(driver,"env");
        BrowserUtils.login(driver, "SalesManagerUsername", "password");
        BrowserUtils.verifyModulesAppear(driver, "SalesManagerUsername");
    }

    @Test (priority = 3)
    public void getModules_Driver() {

        BrowserUtils.goToPage(driver,"env");
        BrowserUtils.login(driver, "DriverUserName", "password");
        BrowserUtils.verifyModulesAppear(driver, "DriverUserName");
    }
}
