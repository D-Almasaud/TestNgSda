package sda.tests.HomeWorks.Day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import sda.utilities.TestBase;

public class D17HW02 extends TestBase {
    @Test
    public void test01(){

        // Step 1: Go to URL: http://crossbrowsertesting.github.io/todoapp.html
        driver.get("https://crossbrowsertesting.github.io/todo-app.html");

        // Step 2: Checking Box todo-4 and Checking Box todo-5
        WebElement four = driver.findElement(By.xpath("//input[@name=\"todo-4\"]"));
        WebElement five = driver.findElement(By.xpath("//input[@name=\"todo-5\"]"));
        four.click();
        five.click();

        // Step 3: Assert that the list length is 2 after checking the boxes
        Assert.assertEquals(driver.findElements(By.xpath("//span[@class=\"done-true\"]")).size(), 2);

        // Step 4: Add a new todo item and assert its presence in the list
        String newTodoText = "NewToDo";
        driver.findElement(By.id("todotext")).sendKeys(newTodoText + Keys.ENTER);
        Assert.assertFalse(driver.findElements(By.xpath("//*[contains(text(),'" + newTodoText + "')]")).isEmpty());

        // Step 5: Archive old todos and assert that the list length is 0 after archiving
        driver.findElement(By.xpath("//a[contains(text(),'archive')]")).click();
        Assert.assertEquals(driver.findElements(By.xpath("//span[@class=\"done-true\"]")).size(), 0);
    }
}
