package com.automation.day7;

import org.testng.annotations.Test;

public class ParallelTestingUsingTestNg_2 {


    @Test
    public void testFive() throws InterruptedException {
        System.out.println("Test Five : "+ Thread.currentThread().threadId());
        System.out.println(Thread.currentThread().getName());
            Thread.sleep(2000);
    }
    @Test
    public void testSix() throws InterruptedException {
        System.out.println("Test Six : "+ Thread.currentThread().threadId());
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(2000);
    }


    @Test
    public void testSeven() throws InterruptedException {
        System.out.println("Test Seven : "+ Thread.currentThread().threadId());
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(2000);
    }


    @Test
    public void testEight() throws InterruptedException {
        System.out.println("Test Eight : "+ Thread.currentThread().threadId());
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(2000);
    }


}
