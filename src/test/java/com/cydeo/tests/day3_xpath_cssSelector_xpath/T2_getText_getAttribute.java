package com.cydeo.tests.day3_xpath_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {

    public static void main(String[] args) {

        // TC#2: NextBaseCRM, locators, getText(), getAttribute() practice
            // 1. Open a Chrome browser

        WebDriver driver= WebDriverFactory.getDriver("chrome"); // we use our utilities own custom method.
        driver.manage().window().maximize();

            // 2. Go to: https://login1.nextbasecrm.com/

        driver.get("https://login1.nextbasecrm.com/");

            // 3. Verify "Remember me" label text is as expected:

        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));


            //      Expected: Remember me on this computer

        String expectedRememberMeLabel = "Remember me on this computer";
        String actualRememberMeLabel = rememberMeLabel.getText();

        if (actualRememberMeLabel.equals(expectedRememberMeLabel)){
            System.out.println("Label verification PASSES");
        }else {
            System.out.println("Label verification FAILED");
        }


            // 4. Verify "forgot password" link text is as expected:
            //      Expected: Forgot your password?

        WebElement forgotPasswordLink =  driver.findElement(By.className("login-link-forgot-pass"));

        String expectedForgotPasswordLinkText = "Forgot your password?";
        String actualForgotPasswordLinkText = forgotPasswordLink.getText();

        if (actualForgotPasswordLinkText.equals(expectedForgotPasswordLinkText)){
            System.out.println("Forgot password link verification PASSED");
        }else {
            System.out.println("actualForgotPasswordLinkText = " + actualForgotPasswordLinkText);
                                                                //actualForgotPasswordLinkText = FORGOT YOUR PASSWORD?
            System.out.println("expectedForgotPasswordLinkText = " + expectedForgotPasswordLinkText);
                                                                //expectedForgotPasswordLinkText = Forgot your password?

            System.out.println("Forgot password link verification FAILED"); //Forgot password link verification FAILED.
                                    // Because actual one is all capital letters therefore failed. this is either
                                    // a mistake of developer or a mistake of the person who prepared this task.
                                    // Normally by these literal, verification should pass.


        }

            // 5. Verify "forgot password" href attribute's value contains expected:
            //      Expected: forgot_password=yes

        String expectedInHref = "forgot_password=yes";
        String actualHrefAttributeValue = forgotPasswordLink.getAttribute("href");

        System.out.println("actualHrefAttributeValue = " + actualHrefAttributeValue);

        if (actualHrefAttributeValue.contains(expectedInHref)){
            System.out.println("HREF attribute value verification PASSED");
        }else{
            System.out.println("HREF attribute value verification FAILED!!!");
        }



       // PS: Inspect and decide which locator you should be using to locate web elements.
    }
}
