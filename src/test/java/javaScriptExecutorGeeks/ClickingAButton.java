package javaScriptExecutorGeeks;

/**
 * We can also use JavaScriptExecutor to click on any 
 * Web element on the page by passing using executeScript 
 * method and passing ("arguments[0].click(), element)
 */

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickingAButton {
	public WebDriver driver;
   public String Url = "http://www.ebay.com";

 @BeforeTest
 public void setDriver(){
	 WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get(Url);
}
 @Test
 public void clickButton(){
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath(".//*[@id='gh-ug']/a"));
        JavascriptExecutor jse = ((JavascriptExecutor)driver);
        jse.executeScript("arguments[0].click();",element );
}
 @AfterTest
 public void atEnd(){
  driver.quit();
  }
	
}
