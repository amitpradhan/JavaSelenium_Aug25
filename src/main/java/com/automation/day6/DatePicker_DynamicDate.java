package com.automation.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DatePicker_DynamicDate {

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

        //get today's date
        int todayDayOfMonth = DateUtils.getDayOfMonth();
//        int todayDayOfMonth = DateUtils.getDayOfMonth()+2;

        //xpath construction for today's date
        String xpathStart = "//table[@class='ui-datepicker-calendar']/tbody/descendant::a[@data-date='";
        String xpathEnd = "']";
        String todayXpath = xpathStart + todayDayOfMonth +xpathEnd;

        System.out.println(todayXpath);

        //click on today's date
        driver.findElement(By.xpath(todayXpath)).click();






    }
}
