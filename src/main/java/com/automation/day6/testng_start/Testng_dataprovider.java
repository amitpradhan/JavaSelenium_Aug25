package com.automation.day6.testng_start;

import com.automation.day7.RediffLoginTestUsingJsonData;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testng_dataprovider {
    /**
     * 1 - Dataprovider annotated method returns two dimensional Object array
     */
    @DataProvider(name = "loginData")
    public Object[][] loginData(){
        Object[][] data = new Object[3][2];
        //1st row
        data[0][0] = "user1";
        data[0][1] = "pwd1";
        //2nd row
        data[1][0] = "user2";
        data[1][1] = "pwd2";
        //3rd row
        data[2][0] = "user3";
        data[2][1] = "pwd3";
        return data;
    }

    @Test(dataProvider = "rediffLoginData" , dataProviderClass= RediffLoginTestUsingJsonData.class)
    public void login(String username , String password){
        System.out.println("Username is ->"+username);
        System.out.println("Password is ->"+password);
    }



}
