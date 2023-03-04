package com.cydeo.utilities;

    // NEW METHOD CREATION

    // Method Name: getDriver
    // Static method
    // Accept String arg: browserType
    //      - This arg will determine what type of browser is opened
    //      - If "chrome" is passed --> it will open Chrome browser
    //      - If "firefox" is passed --> it will open firefox browser
    // Return type: "WebDriver"


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    public static WebDriver getDriver(String browserType) {

        if (browserType.equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("firefox")) {

            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();

        }else {
            System.out.println("Given browser type is not exist or currently not supported");
            System.out.println("Driver = null");
            return null;
        }
    }


}
