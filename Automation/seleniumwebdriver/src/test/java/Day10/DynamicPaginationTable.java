package Day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo3x.opencartreports.com/admin/");
		driver.manage().window().maximize();
		
		WebElement username =driver.findElement(By.xpath("//input[@id='input-username']"));
		username.clear();
		username.sendKeys("demo");
		
		WebElement userpassword = driver.findElement(By.xpath("//input[@id='input-password']"));
		userpassword.clear();
		userpassword.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		
		driver.findElement(By.xpath("")).click();
		
		String text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']")).getText();
		
		 //int total_pages=text.substring(text.indexOf("(")+1, text.indexOf("pages")-1);
		int total_pages=Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("pages")-1));
		
		//repating pages
		
		
		
	
		

	}

}
