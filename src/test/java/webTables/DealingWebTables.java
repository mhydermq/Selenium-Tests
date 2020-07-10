package webTables;


import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

//selenium easy
public class DealingWebTables {
	
	    WebDriver driver;
	
		@BeforeClass
		public void setUp() {
			WebDriverManager.firefoxdriver().setup();		
			driver = new FirefoxDriver();
		driver.get("https://www.seleniumeasy.com/test/table-sort-search-demo.html");
		
		}
	   // printing the entire table texts
		@Test
		public void printTable(){
		WebElement t = driver.findElement(By.id("example"));
		System.out.println(t.getText());
   			
		}
     
    /**  tagname <tr> is to indicate that, it is a row in the web table.
      *  Tagname <tr> will be under tagname <tbody> So, we need to get 
      *  WebElement of <tbody> tag, so that we can get the count of <tr> tags & 
      *  ultimately total number of rows in the web table.
      */
		//fetching the number of rows in table
		@Test
		public void getTotalRows() {
			List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
			System.out.println("Number of rows in the table is: " + tableRows.size());
					}
		
		/**
		 * to get total number of columns in the web table, we need to count 
		 * total number of <td> tags in first <tr> tagname.
		*/
		//fetching total number of rows
		@Test
		public void getTotalColumns() {
			List<WebElement> tableColumns = driver.findElements(By.xpath("//table[@id='example']/tbody/tr[1]/td"));		
			System.out.println("Number of columns in table is: " + tableColumns.size());
		}
           		
		
		@AfterClass
		public void tearDown() {
		driver.quit();
		}
}
		
		
		
		
		



