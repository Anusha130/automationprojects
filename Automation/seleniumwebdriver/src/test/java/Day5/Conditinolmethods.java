package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditinolmethods {
	// access these commands through webelement and it is returns boolean values
	// isdispalyed()
	// isenabled()
	// isselected()

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		driver.manage().window().maximize();
		 
		// isdisplayed 
		//WebElement logo =driver.findElement(By.xpath("//img[@title='OpenCart - Demo']"));
		//System.out.println(" Display status of logo : "+logo.isDisplayed());
		
		//boolean status =driver.findElement(By.xpath("//img[@title='OpenCart - Demo']")).isDisplayed();
		//System.out.println(status);

		// isEnabled

		boolean status =driver.findElement(By.xpath("//img[@title='OpenCart - Demo']")).isEnabled();
		System.out.println(status);
	}

}
