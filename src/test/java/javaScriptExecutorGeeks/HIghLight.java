package javaScriptExecutorGeeks;
/*
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HighLight {
	@Test 
	public void highLightElement() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	    
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		WebElement elem = driver.findElement(By.id("searchInput"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//using executeScript() method to pass the arguments
		//here we passed values based on CSS style, yellow background color with solid red border
		js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;');",elem);
		Thread.sleep(2000);
	    driver.quit();
	    
	}
}

*/
