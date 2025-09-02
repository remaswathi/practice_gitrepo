package selemaven;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Multiple_Windows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		String parentwindow=driver.getWindowHandle();
		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(2000);
		 //facbk=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[4]/ul/li[1]/a")).click();
		
		Set<String>childwindows=driver.getWindowHandles();
		
		//driver.findElement(By.id("«r3»"));
		for(String window:childwindows) {
			driver.switchTo().window(window);
			//enter email in the email textfield
			if (driver.getTitle().contains("Facebook")) {
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"«r11»\"]")).sendKeys("swathiremalli.ks@gmail.com");
				Thread.sleep(2000);
				driver.close();
			}
		}
		
		//switch back to parent window
		driver.switchTo().window(parentwindow);
		Thread.sleep(2000);
		
		//enter mobiles on search field of demowebshop
		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
//super executed practice again