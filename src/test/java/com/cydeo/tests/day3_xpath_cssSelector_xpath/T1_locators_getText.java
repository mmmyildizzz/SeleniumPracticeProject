package com.cydeo.tests.day3_xpath_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {


    public static void main(String[] args) {


        // TC#1: NextBaseCRM, locators and getText practice

        // 1. Open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // WebDriver driver = WebDriverFactory.getDriver("chrome"); // this is our custom utilities code.
        driver.manage().window().maximize();

        // 2. Go to https://login1.nextbasecrm.com/

        driver.get("https://login1.nextbasecrm.com/");


        // 3. Enter incorrect username: "incorrect"

        // driver.findElement(By.className("login-inp")).sendKeys("incorrect"); ==> this is one way. Another way:
        WebElement inputUsername = driver.findElement(By.className("login-inp"));
        inputUsername.sendKeys("incorrect");

        // 4. Enter incorrect password: "incorrect"

        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("incorrect");


        // 5. Click to lo gin button

        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();


        // 6. Verify error message text is as expected:
        //      Expected: Incorrect login or password

       WebElement errorMessage = driver.findElement(By.className("errortext"));

       String expectedErrorMessage = "Incorrect login or password";
       String actualErrorMessage = errorMessage.getText();

       if (actualErrorMessage.equals(expectedErrorMessage)){
           System.out.println("Error message verification PASSED");
       }else {
           System.out.println("Error message verification FAILED");
       }








    }
}
