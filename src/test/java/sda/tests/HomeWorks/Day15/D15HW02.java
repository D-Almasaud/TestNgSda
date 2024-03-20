package sda.tests.HomeWorks.Day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sda.utilities.TestBase;

/*
Test Case2: Negative Username Test
Open page https://practicetestautomation.com/practice-test-login/
Type username incorrectUser into Username field.
Type password Password123 into Password field.
Click Submit button.
Verify error message is displayed.
Verify error message text is Your username is invalid!
*/
public class D15HW02 extends TestBase {

    @Test
    public void negativeUsernameTest() {
        // Open the page
        driver.get("https://practicetestautomation.com/practice-test-login/");

        // Type incorrect username and password
        driver.findElement(By.id("username")).sendKeys("incorrectUser");
        driver.findElement(By.id("password")).sendKeys("Password123");

        // Click Submit button
         driver.findElement(By.id("submit")).click();


        // Verifications using soft assertions
        SoftAssert softAssert = new SoftAssert();

        // Verify error message is displayed
        WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"error\"]"));
        softAssert.assertTrue(errorMessage.isDisplayed(), "Error message is not displayed");

        // Verify error message text is Your username is invalid!
        String expectedErrorMessage = "Your username is invalid!";
        String actualErrorMessage = errorMessage.getText();
        softAssert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message text verification failed");

        // Assert all verifications
        softAssert.assertAll();
    }
}


