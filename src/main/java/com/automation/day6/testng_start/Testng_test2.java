package com.automation.day6.testng_start;

import com.automation.day6.DateUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Testng_test2 {

    @BeforeTest
    public void beforeTest2(){
        System.out.println("Before Test - 2 ");
    }

    @AfterTest
    public void afterTest2(){
        System.out.println("After Test - 2 ");
    }


   @Test
   public void testcaseFive(){

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
       driver.quit();
   }


    @Test
    public void testcaseSIx() {

        //dynamic dispatching - runtime polymorphism
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://jqueryui.com/droppable/");

        WebElement myFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(myFrame);

        //drag and drop using Actions class
        WebElement dragMe = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement dropOnMe = driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragMe ,dropOnMe).build().perform();

        String actualText = driver.findElement(By.xpath("//div[@id='droppable']/p")).getText();

        if(actualText.equals("Dropped!"))
            System.out.println("Test is passed..."+actualText);
        else {
            System.out.println("Test failed..."+actualText);
        }

        //move selenium's control out of frame
        driver.switchTo().defaultContent();


        driver.findElement(By.xpath("//a[text()='Slider']")).click();


        driver.quit();


    }



    }
