package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_Config_Practice {

    //public WebDriver driver;

   // @BeforeMethod

    //public void setupMethod() {

        //We are getting browserType dynamically from our configuration.properties file
       // String browserType = ConfigurationReader.getProperty("browser");
       // driver = WebDriverFactory.getDriver("Chrome");
      //  driver.manage().window().maximize();
      //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  //  }

    @Test

    public void google_search_test() {
        // Driver.getDriver() --> driver
        Driver.getDriver().get("https://www.google.com");

                //3- Write “apple” in search box
        WebElement googleSearchBox = Driver.getDriver().findElement(By.xpath("//input[@name='q']"));

        googleSearchBox.sendKeys("apple" + Keys.ENTER);
                //4- Verify title:
                    //Expected: apple - Google Search
        String expectedTitle = "apple - Google Search";
        String actualTitle = Driver.getDriver().getTitle();


        Assert.assertEquals(expectedTitle, actualTitle);


    }

}

/*



    //Use `configuration.properties` for the following:
    //1. The browser type
    //2. The URL
    //3. The search keyword
    //4. Make title verification dynamic. If search value changes, title
    //assertion should not fail.
 */