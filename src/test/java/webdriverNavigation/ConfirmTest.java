package webdriverNavigation;


import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;



 
public class ConfirmTest {
    static WebDriver driver;
    private static String url = "http://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
 
    //Setup Driver
    @BeforeClass
    public static void setupTest() throws NullPointerException{
    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //Navigate to URL
        driver.navigate().to(url);
        //Maximize the browser window
        driver.manage().window().maximize();
    }
 
    @Test
    public void ConfirmExampleTest() {
        //Switch to iframeResult iframe because all elements located in this iframe
        //It will be described in next topics
        driver.switchTo().frame("iframeResult");
 
        //Find "Try it" button
        WebElement confirmButton = driver.findElement(By.cssSelector("html>body>button"));
 
        //Actual Text Element
        WebElement actualConfirmMessage = driver.findElement(By.cssSelector("#demo"));
 
        //******************************
        // Accept Test (Test Scenario-1)
        //******************************
 
        //Click confirm button ("Try it" button)
        confirmButton.click();
 
        //Accept the alert (Click Ok button)
        driver.switchTo().alert().accept();
 
        //Assertion
        Assert.assertEquals(actualConfirmMessage.getText(),"You pressed OK!");
 
        //******************************
        // Dismiss Test (Test Scenario-2)
        //******************************
 
        //Click confirm button ("Try it" button)
        confirmButton.click();
 
        //Accept the alert (Click Cancel)
        driver.switchTo().alert().dismiss();
 
        //Assertion
        Assert.assertEquals(actualConfirmMessage.getText(),"You pressed Cancel!");
    }
 
    //Close Driver
    @AfterClass
    public static void quitDriver() {
        driver.quit();
    }
}
