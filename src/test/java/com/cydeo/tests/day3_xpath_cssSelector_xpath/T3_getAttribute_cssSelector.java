package com.cydeo.tests.day3_xpath_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {

    public static void main(String[] args) {


        // TC#3: NextBaseCRM, locators, getText(), getAttribute() practice

        //  1. Open a Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        //  2. Go to https://login1.nextbasecrm.com/

        driver.get("https://login1.nextbasecrm.com/");


        //  3. Verify "log in" button text is as expected:
        //          Expected: Log in

        // WebElement signButton = driver.findElement(By.className("login-btn")); // this is the method we used to
                                                                                    // use before cssSelector. But
                                                                                // we want to use cssSelector. There
                                                                                // are several options for that:
            //                          tagName[attribute='value'] --> here tagName is "input" so:
            //                          input[class='login-btn']
        // WebElement signButton = driver.findElement(By.cssSelector("input[class='login-btn']")); // --> or use another
                                                                        // attribute value other than 'login-btn', type
                                                                        // attribute as 'submit':

        //WebElement signButton = driver.findElement(By.cssSelector("input[type='submit']")); // or another one:
        WebElement signButton = driver.findElement(By.cssSelector("input[value='Log In']"));

        String expectedButtonText = "Log In";

        //Getting the value of the attribute "value"
        String actualButtonText = signButton.getAttribute("value");

        System.out.println("actualButtonText = " + actualButtonText);

        if (actualButtonText.equals(expectedButtonText)){
            System.out.println("Log In button text verification PASSED!");
        }else {
            System.out.println("Log In button text verification FAILED!!!");
        }

        // PS: inspect and decide which locator you should be using to locate web elements
        // PS2: Pay attention to where to get the text of this button from

    }
}
