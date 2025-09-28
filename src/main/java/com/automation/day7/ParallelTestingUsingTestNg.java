package com.automation.day7;

import org.testng.annotations.Test;

import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class ParallelTestingUsingTestNg {


    @Test
    public void testOne() throws InterruptedException {
        System.out.println("Test One : "+ Thread.currentThread().threadId());
        System.out.println(Thread.currentThread().getName());
            Thread.sleep(2000);
    }
    @Test
    public void testTwo() throws InterruptedException {
        System.out.println("Test Two : "+ Thread.currentThread().threadId());
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(2000);
    }


    @Test
    public void testThree() throws InterruptedException {
        System.out.println("Test Three : "+ Thread.currentThread().threadId());
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(2000);
    }


    @Test
    public void testFour() throws InterruptedException {
        System.out.println("Test Four : "+ Thread.currentThread().threadId());
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(2000);
    }


}
