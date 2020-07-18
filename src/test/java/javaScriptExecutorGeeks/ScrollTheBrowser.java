package javaScriptExecutorGeeks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * We can scroll the current page on the browser with 
 * executeScript("window.scrollBy(0,50)") method and 
 * passing the pixels as a parameter. In the code below, 
 * once the URL gets loaded, the page will scroll down 
 * to the end of the page with 
 * executeScript("window.scrollBy(0,document.body.scrollHeight)") method. 
 * However, if we want to scroll vertically downward or upward 
 * using pixels we can just pass it to the parameter scrollby()
 *
 */
 
    public class ScrollTheBrowser {
	    public WebDriver driver;
        public String Url = "http://www.ebay.com";
 
      @BeforeTest
      public void setDriver() {
    	  WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get(Url);
 }
  @Test
  public void scrollPage(){         
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         JavascriptExecutor jse = ((JavascriptExecutor)driver);
         jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
}
    @AfterTest
    public void atEnd(){
    driver.quit();
  
  }	 
	 
}
