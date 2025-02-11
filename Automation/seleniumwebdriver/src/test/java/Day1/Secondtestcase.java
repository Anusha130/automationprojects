package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Secondtestcase {
	
	/*Test case

	1)  Launch browser (Chrome)
	2) open URL https:// demo.nopCommerce.com/
	3) Validate title should be " nopCommerce demo store "
	4) close browser

	*/

	public static void main(String[] args) {
		
		//1)  Launch browser (Chrome)
		
		WebDriver driver = new ChromeDriver();
		
		//2) open URL https://demo.nopcommerce.com/
		
		driver.get("https://demo.nopcommerce.com/");
		
		//3) Validate title should be " nopCommerce demo store "
		
		//<title>nopCommerce demo store</title>
		
	String act_Tittle= driver.getTitle();
	if(act_Tittle.equals("nopCommerce demo store "))
	{
		System.out.println("Testcase is passed");
	}
	else {
		System.out.println("Testcase is failed");
	}
	
	//4) close browser
	
	driver.close();	
		

	}

}
