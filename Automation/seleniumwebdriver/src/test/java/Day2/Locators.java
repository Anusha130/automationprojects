package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo-opencart.com/");
		 //name
		//WebElement  searchbox = driver.findElement(By.name("search"));
		//searchbox.sendKeys("Macbook");
		
		//In single step
		
		//driver.findElement(By.name("search")).sendKeys("mackbook");
		
		//ID
		//Boolean status=driver.findElement(By.id("logo")).isDisplayed();
		// System.out.println("Displayed : " + status);
		 
		 // Link text
		 //driver.findElement(By.linkText("Software")).click();
		
		 //partialLink text
		  //driver.findElement(By.partialLinkText("ts")).click();
		
		// class names
		// tagnames and class names multiple web elements
		//class name
		
		//List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));
		//System.out.println(headerLinks.size());
		
		//tag names
		//List<WebElement> links=driver.findElements(By.tagName("a"));
		//System.out.println(links.size());
		
		//List<WebElement> links=driver.findElements(By.tagName("img"));
		//System.out.println(links.size());
		  
		// WebElement elemen= driver.findElement(By.id("xyz")); //NoSuchElementException
		
		 
		 List<WebElement> elemen= driver.findElements(By.id("xyz"));
		 System.out.println(elemen.size());
		
		

	}

}
