package sda.tests.HomeWorks.Day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilities.TestBase;

public class HW01 extends TestBase {

    @Test
    @Parameters("keyword")
    public void testSearchKeyword(String keyword) {
        // Go to Google
        driver.get("https://www.google.com");

        // Search for the keyword
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(keyword);
        searchBox.submit();

        // Get the search result text
        String searchResultText = driver.findElement(By.id("search")).getText();

        // Assert that the result text contains the keyword
        Assert.assertTrue(searchResultText.contains(keyword),
                "Search result does not contain the keyword: " + keyword);



    }
}
