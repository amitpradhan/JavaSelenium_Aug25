package com.automation.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Jquery_Droppable {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\JavaSelenium_Aug25\\src\\test\\resources\\webdriver\\chromedriver-win64\\chromedriver.exe");

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
