package sda.tests.HomeWorks.Day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

    /*
    Test Case1: Positive Login Test
    Open page https://practicetestautomation.com/practice-test-login/
    Type username student into Username field
    Type password Password123 into Password field
    Click Submit button.
    Verify new page URL contains practicetestautomation.com/logged-in-successfully/
    Verify new page contains expected text ('Congratulations' or 'successfully logged in')
    Verify button Log out is displayed on the new page.
    */
    public class D15HW01 extends TestBase {

        @Test
        public void SoftTest() {
            // Open the page
            driver.get("https://practicetestautomation.com/practice-test-login/");

            // Type username and password
            driver.findElement(By.id("username")).sendKeys("student");
            driver.findElement(By.id("password")).sendKeys("Password123");


            // Click Submit button
            WebElement submitButton = driver.findElement(By.id("submit"));
            submitButton.click();

            // Verifications using soft assertions
            SoftAssert softAssert = new SoftAssert();

            // Verify new page URL contains practicetestautomation.com/logged-in-successfully/
            String actualURL = driver.getCurrentUrl();
            softAssert.assertTrue(actualURL.contains("practicetestautomation.com/logged-in-successfully/"),
                    "URL verification failed");

            // Verify new page contains expected text
            WebElement loggedInMessage = driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/p[1]/strong"));
            softAssert.assertTrue(loggedInMessage.isDisplayed(), "Expected message not found");

            // Verify button Log out is displayed on the new page
            WebElement logoutButton = driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div"));
            softAssert.assertTrue(logoutButton.isDisplayed(), "Logout button is not displayed");

            // Assert all verifications
            softAssert.assertAll();
        }
        @Test
        public void HardTest() {
            // Open the page
            driver.get("https://practicetestautomation.com/practice-test-login/");

            // Type username and password
            driver.findElement(By.id("username")).sendKeys("student");
            driver.findElement(By.id("password")).sendKeys("Password123");

            // Click Submit button
            WebElement submitButton = driver.findElement(By.id("submit"));
            submitButton.click();


            // Verify new page URL contains practicetestautomation.com/logged-in-successfully/
            String actualURL = driver.getCurrentUrl();
            Assert.assertTrue(actualURL.contains("practicetestautomation.com/logged-in-successfully/"),
                    "URL verification failed");

            // Verify new page contains expected text
            WebElement loggedInMessage = driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/p[1]/strong"));
            Assert.assertTrue(loggedInMessage.isDisplayed(), "Expected message not found");

            // Verify button Log out is displayed on the new page
            WebElement logoutButton = driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div"));
            Assert.assertTrue(logoutButton.isDisplayed(), "Logout button is not displayed");

        }}