package com.automation.day1_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\JavaSelenium_Aug25\\src\\test\\resources\\webdriver\\chromedriver-win64\\chromedriver.exe");

        //dynamic dispatching - runtime plymorphism
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        System.out.println("Title of page ->"+driver.getTitle());
        Thread.sleep(5000);
        driver.close(); //driver.quit();






    }


}
