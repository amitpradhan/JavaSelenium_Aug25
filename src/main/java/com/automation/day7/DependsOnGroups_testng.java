package com.automation.day7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroups_testng {


    @Test(dependsOnGroups = {"loginTest", "smoke"})
    public void makePayment(){
        System.out.println("makePayment");
          }

}
