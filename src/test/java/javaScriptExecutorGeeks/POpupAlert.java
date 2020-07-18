package javaScriptExecutorGeeks;

/**
 * Using executeScript of JavaScriptExecutor, we can send 
 * an alert on the webpage. In this code, once the page loads, 
 * a pop-up will be shown containing the message “hello java code geeks”. 
 * This is a TestNG Project with @BeforeTest, @Test and @AfterTest annotations. 
 * First, the block of @BeforeTest will run where the Firefox driver 
 * get instantiated and get() method will invoke the given URL. 
 * Then, @Test will run where, JavaScriptExecutor gets instantiated 
 * and executeScript() method will invoke the pop up alert. Finally, 
 * @AfterTest block will executed and browser will be closed.
 */
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class POpupAlert{
    
    public WebDriver driver;
    public String Url = "http://www.ebay.com";
     
    @BeforeTest
    public void setDriver(){
    	WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get(Url);
    }
  @Test
  public void jspopUp(){
             
            JavascriptExecutor jse = ((JavascriptExecutor)driver);
            jse.executeScript("alert('hello Java Code Geeks');");
  }
  @AfterTest
  public void atEnd(){
      driver.quit();
  }
}
