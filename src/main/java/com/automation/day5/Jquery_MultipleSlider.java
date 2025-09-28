package com.automation.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Jquery_MultipleSlider {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\JavaSelenium_Aug25\\src\\test\\resources\\webdriver\\chromedriver-win64\\chromedriver.exe");

        //dynamic dispatching - runtime polymorphism
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://jqueryui.com/slider/#multiple-vertical");

//        driver.findElement(By.xpath("//a[text()='Multiple sliders']")).click();

        WebElement sliderMultipleFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(sliderMultipleFrame);

        //master slider button , move left side
        WebElement masterSliderBtn = driver.findElement(By.xpath("//div[@id='master']/child::span"));

        Actions actions = new Actions(driver);
        Thread.sleep(3000);
        actions.dragAndDropBy(masterSliderBtn , -40 , 0).build().perform();

        //vertical sliders
        WebElement verticalSlider1 = driver.findElement(By.xpath("//div[@id='eq']/child::span[3]/span"));
        WebElement verticalSlider2 = driver.findElement(By.xpath("//div[@id='eq']/child::span[5]/span"));


        // Scroll the element into view
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", verticalSlider1);

        actions.dragAndDropBy(verticalSlider1 , 0 , 50).build().perform();
        Thread.sleep(3000);
        actions.dragAndDropBy(verticalSlider2, 0 , -50).build().perform();
        Thread.sleep(3000);


        driver.quit();
















    }
}
