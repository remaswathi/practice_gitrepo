package selemaven;

import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayOrangeHrm {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String  title= driver.getTitle();
		
		if(title.equals("orangehrm login"))
		{
			System.out.println(" page displayed");
			
		}
		else
		{
			System.out.println(" page not displayed");
		}
		
		driver.close();		

	}

}
