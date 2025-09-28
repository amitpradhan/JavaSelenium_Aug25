package com.automation.day6.testng_start;

import org.testng.annotations.*;

public class Testng_all_annotations {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("In before suite annotated method.");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("In before class annotated method.");

    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("In before test annotated method.");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("In before method annotated method.");
    }
    @Test
    public void testcaseOne(){
        System.out.println("Test case one..");
    }

    @Test
    public void testcaseTwo(){
        System.out.println("Test case two..");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("In after method annotated method.");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("In after test annotated method.");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("In after class annotated method.");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("In after suite annotated method.");
    }








}
