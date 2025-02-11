package Day5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethods {
	// getMethods : we can access these methods through Webdriver instance 
	// get methods are work on web pages not the web elements

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		
		//get(url) - open the url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		//gettittle -returns the tittle of the page
         System.out.println(driver.getTitle());	
         
        // getcurrenturl - returns the current url page
         System.out.println(driver.getCurrentUrl());
         
         //getpagesource - return the pagesource code
        // System.out.println(driver.getPageSource());
         
         //getwindowHandle() - returns id of the single browser window
        //String str= driver.getWindowHandle();
        // System.out.println("Window ID = "+ str);
         
         
         //getwindowHandles() - returns id of the multiple browser window
          driver.findElement(By.linkText("OrangeHRM, Inc")).click();// this will opens new browser window
          
          Set<String> Windowids=driver.getWindowHandles();
          System.out.println(Windowids);
 
	}

}
