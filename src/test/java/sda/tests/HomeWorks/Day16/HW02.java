package sda.tests.HomeWorks.Day16;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilities.TestBase;

    public class HW02 extends TestBase {

        @Test
        @Parameters({ "username", "password" })
        public void testPositiveLogin(String username, String password) {
            driver.get("https://practicetestautomation.com/practice-test-login/");
            driver.findElement(By.id("username")).sendKeys(username);
            driver.findElement(By.id("password")).sendKeys(password);
            driver.findElement(By.id("submit")).click();

            Assert.assertTrue(driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/"),
                    "URL verification failed");
            Assert.assertTrue(driver.getPageSource().contains("Congratulations")
                            || driver.getPageSource().contains("successfully logged in"),
                    "Expected message not found");
            Assert.assertTrue(driver.findElement(By.id("log_out")).isDisplayed(), "Logout button is not displayed");
        }

        @Test
        @Parameters({ "username", "password" })
        public void testNegativeUsername(String username, String password) {
            driver.get("https://practicetestautomation.com/practice-test-login/");
            driver.findElement(By.id("username")).sendKeys(username);
            driver.findElement(By.id("password")).sendKeys(password);
            driver.findElement(By.id("submit")).click();

            Assert.assertTrue(driver.getPageSource().contains("Your username is invalid!"),
                    "Error message text verification failed");
        }

        @Test
        @Parameters({ "username", "password" })
        public void testNegativePassword(String username, String password) {
            driver.get("https://practicetestautomation.com/practice-test-login/");
            driver.findElement(By.id("username")).sendKeys(username);
            driver.findElement(By.id("password")).sendKeys(password);
            driver.findElement(By.id("submit")).click();

            Assert.assertTrue(driver.getPageSource().contains("Your password is invalid!"),
                    "Error message text verification failed");
        }
    }
