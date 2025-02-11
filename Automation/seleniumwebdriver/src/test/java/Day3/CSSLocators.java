package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();//for maximize the window
		
		// Tag id
		// syntax tagname#id 
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-Shirts");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-Shirts");
		
		
		//tag class
		//syntax tagname.class
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-Shirts");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-Shirts");
		
		
		// tag attribute
		//syntax tag[attribute="value"]
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-Shirts");
	    //driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("T-Shirts");
		
		
		// tag Class attribute
		// syntax tag.classname[attribute="value"]
		//driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("T-Shirts");
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Shirts");
		
		

	}

}
