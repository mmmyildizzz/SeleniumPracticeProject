package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        // 1 - set up the browser driver
        WebDriverManager.chromedriver().setup();

        // 2 - create instance of the selenium webdriver
        WebDriver driver = new ChromeDriver(); // this line opening an empty browser

        // this line will maximise the browser size
        driver.manage().window().maximize();

        // 3 - as an example we go to Tesla webpage
        driver.get("https://www.tesla.com");

        // get the title of the page:
        String currentTitle = driver.getTitle(); // brings tesla page title
        System.out.println("Current title = "+currentTitle); //tesla

        // stop code execution for 3 seconds
        Thread.sleep(3000); // this led Tesla website stay on for 3 seconds. without this going blank so quick

        // 4 - use selenium navigate back
        driver.navigate().back();

        // stop code execution for 3 seconds
        Thread.sleep(3000);

        // 5 - navigate forward
        driver.navigate().forward();

        // stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate refresh
        driver.navigate().refresh();

        // stop code execution for 3 seconds
        Thread.sleep(3000); // These are all optional.because selenium is very fast in order to see changing we
                                    // purposely stop code execution 3 seconds

        // 6 - use navigate().to() for example to google
        driver.navigate().to("https://www.google.com");

        currentTitle = driver.getTitle();
        System.out.println("Current title = "+currentTitle); // google

        // 7 - getTitle()
        driver.getTitle();
        System.out.println("Title is "+driver.getTitle());

        // 8 - get the current url by using selenium

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current Url = "+ currentUrl); //Current Url = https://www.google.com/

        driver.get("https://www.tesla.com");

        // 9 - this will close the currently opened window
        driver.close();

        // 10 - this will close all opened windows
        driver.quit();





    }
}
