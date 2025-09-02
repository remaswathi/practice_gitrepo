package selemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadowroot_Elements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=3");
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//section[contains(text(),'shadow')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//section[contains(text(),'shadow')][2]")).click();
		Thread.sleep(2000);
		//identify shadow element
		SearchContext shadow_host=driver.findElement(By.xpath("//form/div[1]")).getShadowRoot();
		shadow_host.findElement(By.cssSelector("input[type]='text']")).sendKeys("swathi");
		
		//identify shadow password element
		SearchContext shadow_host1=driver.findElement(By.xpath("//form/div[2]")).getShadowRoot();
		shadow_host1.findElement(By.cssSelector("input[type]='text']")).sendKeys("swathich");
		
		//script is correct but not getting expected
		
	}

}
