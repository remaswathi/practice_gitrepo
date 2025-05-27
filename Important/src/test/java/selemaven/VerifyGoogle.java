package selemaven;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyGoogle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String  title= driver.getTitle();
		
		if(title.equals())//doubt
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
