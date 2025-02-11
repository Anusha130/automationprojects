package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Test case

1)  Launch browser (Chrome)
2) open URL https:// demo.opencart.com/
3) Validate title should be " your Store"
4) close browser

*/

public class Firsttestcase {

	public static void main(String[] args) {
		//1)  Launch browser (Chrome)
		ChromeDriver driver =new ChromeDriver();
		
		//WebDriver driver =new ChromeDriver();
		
		//2) open URL https:// demo.opencart.com/
		
		driver.get("https://demo-opencart.com/");
		
		//3) Validate title should be "Your Store"
		//<title>Your Store</title>
		
		String  act_Tittle =driver.getTitle();
		if(act_Tittle.equals("Your Store")) 
		{
			System.out.println("Test case passed");
		
		}
		else {
			System.out.println("test case failed");
		}
		
		
		//4) close browser
	
		driver.close();
		//driver.quit();

	}
	
	/*Test case

	1)  Launch browser (Chrome)
	2) open URL https:// demo.nopCommerce.com/
	3) Validate title should be " nopCommerce demo store "
	4) close browser

	*/
	
	
	
	

}
