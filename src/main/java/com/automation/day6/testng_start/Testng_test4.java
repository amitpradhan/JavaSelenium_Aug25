package com.automation.day6.testng_start;

import org.testng.annotations.*;

public class Testng_test4 {

    @BeforeClass
    public void beforeClass2(){
        System.out.println("Before class-2");
    }

    @AfterClass
    public void afterClass2(){
        System.out.println("After class-2");
    }


  @Test
    public void testcaseThree(){
      System.out.println("In Testcase three");
  }

    @Test
    public void testcaseFour(){
        System.out.println("In Testcase four");
    }






}
