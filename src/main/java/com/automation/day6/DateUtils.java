package com.automation.day6;

import com.sun.source.tree.BreakTree;

import java.time.LocalDate;

public class DateUtils {

    public static String getCurrentDate(){
        LocalDate todaysDate = LocalDate.now();
        return todaysDate.toString();
    }

    public static int getDayOfMonth(){
        return LocalDate.now().getDayOfMonth();
//        LocalDate todaysDate = LocalDate.now();
//        return todaysDate.getDayOfMonth();
    }

    public static int getMonth(){
        LocalDate todaysDate = LocalDate.now();
        return todaysDate.getMonthValue();
    }

    public static int getYear(){
        LocalDate todaysDate = LocalDate.now();
        return todaysDate.getYear();
    }



    public static void main(String[] args) {
        System.out.println(getCurrentDate());
        System.out.println(getDayOfMonth());
        System.out.println(getMonth());
        System.out.println(getYear());
    }
}
