package com.automation.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DatePicker {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\JavaSelenium_Aug25\\src\\test\\resources\\webdriver\\chromedriver-win64\\chromedriver.exe");

        //dynamic dispatching - runtime polymorphism
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://jqueryui.com/datepicker/");

        WebElement dateFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(dateFrame);

        //date picker input box
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();

        //click on next btn on calender
        driver.findElement(By.xpath("//a[@title='Next']/span")).click();

        //click on a date
        driver.findElement(By.xpath("//tbody/tr[3]/td[4]")).click();


//        driver.quit();









    }
}
