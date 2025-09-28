package com.automation.day7;

import com.automation.utils.JsonDataLoader;
import com.automation.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DependsOnMethodUsingSelenium_testng {
    WebDriver driver;
    String jsonData =System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\rediff_login.json";

    @DataProvider
    public Object[][] getRediffLoginData() throws Exception {
        return JsonDataLoader.getTestDataFromJsonFile(jsonData);
    }

    @Test(dataProvider = "getRediffLoginData")
    public void rediffLoginTest(String userId, String pwd) {
        driver = SeleniumUtils.launchApp("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.id("login1")).sendKeys(userId);
        driver.findElement(By.id("password")).sendKeys(pwd);
        driver.findElement(By.name("proceed")).click();
        System.out.println("User login successful.");
        Assert.assertEquals(driver.getTitle(), "Rediffmail Login");
    }


   @Test(dependsOnMethods = {"rediffLoginTest"})
    public void verifyUrl() {
        System.out.println("URL:  "+driver.getCurrentUrl());

    }




}
