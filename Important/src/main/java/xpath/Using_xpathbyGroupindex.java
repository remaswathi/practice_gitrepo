package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_xpathbyGroupindex {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		
		//navigate to an application
		driver.get("https://www.facebook.com/");
		
		//identify the User name TF and pass the text
		driver.findElement(By.xpath("//input[3]")).sendKeys("selenium");
		
		//identify the password TextField and pass the text
		driver.findElement(By.xpath("//input[4]")).sendKeys("abc123");
		
		//identify login button
		driver.findElement(By.xpath("//button")).click();

		Thread.sleep(3000);
		//close the browser
		driver.quit();
	}

}
