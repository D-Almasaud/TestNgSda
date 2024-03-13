package sda.tests.HomeWorks.Day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

/*
Test Case3: Negative Password Test
Open page https://practicetestautomation.com/practice-test-login/
Type username student into Username field
Type password incorrectPassword into Password field
Click Submit button
Verify error message is displayed
Verify error message text is Your password is invalid!
*/
public class D15HW03 extends TestBase {

    @Test
    public void negativePasswordTest() {
        // Open the page
        driver.get("https://practicetestautomation.com/practice-test-login/");

        // Type correct username and incorrect password
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("incorrectPassword");

        // Click Submit button
        driver.findElement(By.id("submit")).click();

        // Verifications using soft assertions
        SoftAssert softAssert = new SoftAssert();

        // Verify error message is displayed
        WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"error\"]"));
        softAssert.assertTrue(errorMessage.isDisplayed(), "Error message is not displayed");

        // Verify error message text is Your password is invalid!
        String expectedErrorMessage = "Your password is invalid!";
        String actualErrorMessage = errorMessage.getText();
        softAssert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message text verification failed");

        // Assert all verifications
        softAssert.assertAll();
    }
}
