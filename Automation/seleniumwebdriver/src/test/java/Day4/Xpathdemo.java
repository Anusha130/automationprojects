package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathdemo {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver(); 
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//Xpath is defined has a xml path
		// It is syntax or language for finding any element on the web page using xml path expression.
		// xpath is used to find the location of any element on a web page using html dom structure.
	
		// xpath with the single attribute
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("T-Shirts");
		
		//Xpath with the multiple attribute
		//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Tshirts");
		
		//driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("T-shirts");
		//driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']")).sendKeys("T-shirts");
		
		
		//Xpath with text - inner text
		//driver.findElement(By.xpath("//*[text()='MacBook']")).click();
		
		/*
		 * boolean displayed
		 * =driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		 * System.out.println(displayed);
		 * 
		 * String
		 * textmethod=driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		 * System.out.println(textmethod);
		 */
		 
		 //xpath with contains method 
		 //syntax : //input[contains(@ attriubte-> placeholder,value->'Sea')]
		 // when u used contains method  specify the  name of the attribute and specify the value of the attribute 
		 // and also no need give full name of the value attribute.partical value is enough. 
		  
		 //driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Shirts");
		
		//Chained Xpath
		// syntax: //*[attribute ='value']/linked class a/ linked class b
		
		 boolean displayed =driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		  System.out.println(displayed);

	}

}
