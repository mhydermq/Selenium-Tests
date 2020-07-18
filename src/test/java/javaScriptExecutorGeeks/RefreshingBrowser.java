package javaScriptExecutorGeeks;


/**
 * We can use JavaScript Executor to refresh a browser window. 
 * We can perform similar action using driver.navigate().refresh() 
 * with WebDriver. Similarly, in this code, once the url gets loaded, 
 * the page will refresh again with the JavaScript method 
 * jse.executeScript("history.go(0)"). This is also a TestNG Project 
 * with @BeforeTest, @Test and @AfterTest annotations. First, the block 
 * of @BeforeTest will run where the Firefox driver get instantiated 
 * and get() method will invoke the given URL. Then, @Test method will 
 * run where, JavaScriptExecutor gets instantiated and executeScript() 
 * method will invoke ("history.go(0)"). Finally, @AfterTest block will 
 * executed and browser will be closed.
 */

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RefreshingBrowser{
	
	public WebDriver driver;
    public String Url = "http://www.ebay.com";
     
    @BeforeTest
    public void setDriver(){
    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(Url);
    }
  @Test
  public void refresh(){
             
            JavascriptExecutor jse = ((JavascriptExecutor)driver);
            jse.executeScript("history.go(0)");
  }
  @AfterTest
  public void atEnd(){
      driver.quit();
  }	

}
