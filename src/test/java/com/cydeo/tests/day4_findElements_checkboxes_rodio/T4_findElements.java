package com.cydeo.tests.day4_findElements_checkboxes_rodio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_findElements {


    public static void main(String[] args) {


        // TC #4: FindElements Task

            // 1. Open Chrome browser

        WebDriver driver =  WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //providing extra wait time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            // 2. Go to https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");


            // 3. Locate all the links in the page.
        
        // driver.findElements(By.tagName("a"));
            // for windows alt+enter (shortcut) --> click 'introduce local variable' --> change 'a' to allLinks

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));


        // 4. Print out the number of the links on the page

        System.out.println("allLinks.size() = " + allLinks.size()); // ==> 2 (there are two links)
        
        // 5. Print out the texts of the links. we need to use for each loop as:

        for (WebElement each : allLinks) {

            System.out.println("Text of link: " + each.getText());


            // 6. Print out the HREF attribute values of the links
            // we can use same for each loop for this one as well


            System.out.println("HREF Values: " + each.getAttribute("href"));
        }
    }
}
