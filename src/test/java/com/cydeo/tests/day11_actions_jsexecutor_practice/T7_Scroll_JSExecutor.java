package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T7_Scroll_JSExecutor {

    @Test

    public void T7_Scroll_JSExecutor(){

                //TC #7: Scroll using JavascriptExecutor
                //1- Open a Chrome browser
                //2- Go to: https://practice.cydeo.com/large
        Driver.getDriver().get("https://practice.cydeo.com/large");
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));

        //downcasting our driver type to JavascriptExecutor, so we are able to use the methods coming from that interface
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

                //3- Scroll down to “Cydeo” link
        BrowserUtils.sleep(2);
        js.executeScript("arguments[0].scrollIntoView(true)", cydeoLink);
                // arguments[0]==> [0] means first index that is cydeoLink

        //4- Scroll up to “Home” link
        BrowserUtils.sleep(2);
        js.executeScript("arguments[1].scrollIntoView(true)", cydeoLink, homeLink);
        // or: js.executeScript("arguments[0].scrollIntoView(true)", homeLink); with index number 0
                //arguments[1]==> means index 1 that is homelink

        //5- Use below provided JS method only


        //JavaScript method to use : arguments[0].scrollIntoView(true)

        //we are trying to use a JavaScript function (method) which selects the web elements by index number, and
            //scrolls until they are in the view
        // js.executeScript ==> this method accepts and applies the javascript method
        // arguments[0] ==> here we are passing the index number of the argument
        // .scrollIntoView(true)==> scroll until the argument[0] is in visible on the screen
        // cydeoLink ==> this is where we pass our arguments


        //Note: You need to locate the links as web elements and pass them as
        //arguments into executeScript() method
    }
}
