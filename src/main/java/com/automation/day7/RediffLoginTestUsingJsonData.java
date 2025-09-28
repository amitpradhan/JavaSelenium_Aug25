package com.automation.day7;

import com.automation.utils.JsonDataLoader;
import com.automation.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class RediffLoginTestUsingJsonData {

    String jsonFilePath = System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\login.json";
    WebDriver driver = null;


    @BeforeMethod
    public void beforeMethodSetData(){
//        jsonFilePath = System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\login.json";
        driver = SeleniumUtils.launchApp("https://mail.rediff.com/cgi-bin/login.cgi");
    }

    @DataProvider
    public Object[][] rediffLoginData() throws Exception {
        return JsonDataLoader.getTestDataFromJsonFile(jsonFilePath);
    }

    @Test(dataProvider ="rediffLoginData" )
    public void rediffLoginTest(String uid, String pwd){
        driver.findElement(By.id("login1")).sendKeys(uid);
        driver.findElement(By.id("password")).sendKeys(pwd);
        driver.findElement(By.name("proceed")).click();
    }

    @AfterMethod
    public void closeApp(){
        driver.quit();
    }









}
