package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTestIntro {

    public static void main(String[] args) {

        // 1- Setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        // 2- Create instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        // driver.get("https://www.google.com");

        driver.navigate().to("https://www.google.com"); // will go to Chrome website

        driver.navigate().back(); // return from Chrome to empty page

        driver.navigate().forward(); // again return to Google website

        driver.navigate().refresh(); // refresh the webpage
    }

}
