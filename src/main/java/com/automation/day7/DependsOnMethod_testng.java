package com.automation.day7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod_testng {

    @Test(groups = "loginTest")
    public void loginTest() {
        System.out.println("User login successful.");
        Assert.assertEquals("Login" , "Login");
    }
    @Test(groups = "smoke" ,dependsOnMethods = {"loginTest"})
    public void searchProduct() {
        System.out.println("Searching product ");
        Assert.assertEquals(10,20);

    }
    @Test(dependsOnMethods = {"loginTest" ,"searchProduct" })
    public void addToCart(){
        System.out.println("Adding to Card");
          }




}
