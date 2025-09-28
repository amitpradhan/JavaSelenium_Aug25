package com.automation.day7;

import com.automation.utils.JsonDataLoader;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestJsonDataUsingDataProvider {
    String jsonFilePath = null;

    @BeforeTest
    public void beforeTestSetData(){
        jsonFilePath = System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\login.json";

    }
    @DataProvider
    public Object[][] loginData1() throws Exception {
        return JsonDataLoader.getTestDataFromJsonFile(jsonFilePath);
    }

    @Test(dataProvider ="loginData1")
    public void testLoginUsingJsonAndDataProvider(String username , String password) throws Exception {
        System.out.println("User Id: "+username);
        System.out.println("Passwords: "+password);
        System.out.println("*************************************");


    }



}
