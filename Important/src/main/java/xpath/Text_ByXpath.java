package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text_ByXpath {

	public static void main(String[] args) {
		//launching the browser
		WebDriver driver= new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		
		//navigate to an application
		driver.get("https://www.facebook.com/");
		
		//identify the User name TF and pass the text
		//driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("selenium");
		
		//identify the password TextField and pass the text
		//driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("abc123");
		
		//identify login button
		//driver.findElement(By.xpath()).click();
		
		
		
	}

}
