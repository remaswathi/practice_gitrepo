package selemaven;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Windoww {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/restaurants");
		Thread.sleep(1000);
		
		//identify the parent winow
		String parentwindo = driver.getWindowHandle();
		System.out.println(parentwindo);
		
		//execute the functionality which will open child window
		driver.findElement(By.xpath("//*[@id=\"seo-core-layout\"]/div[7]/div/div[1]/div[2]/a[5]/div/div/div")).click();
		
		//get all the windows opened(identify all windows including child windows
		 Set<String> childwindows=driver.getWindowHandles();
		 
		 //switch to child window
		 System.out.println(childwindows);
		 
		 //iterate on the set of child windows using switchto method
		 for(String window: childwindows) {
			 
		//switching to childbwindows using switch to medos
		driver.switchTo().window(window);
		String title=driver.getTitle();
		System.out.println(title);
		 }
		//switch back to the parent window
		 driver.switchTo().window(parentwindo);
		//
		 driver.close();
		
		
		

	}

}
