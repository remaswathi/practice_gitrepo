package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_contains {

	public static void main(String[] args) throws InterruptedException {
		//launching the browser
				WebDriver driver= new ChromeDriver();
				
				//maximize
				driver.manage().window().maximize();
				
				//navigate to an application
				driver.get("https://www.facebook.com/");
				
				//identify the User name TF and pass the text
				driver.findElement(By.xpath("//input[contains@placeholder,'Email address']")).sendKeys("selenium");
				
				//identify the password TextField and pass the text
				driver.findElement(By.xpath("//input[contains(@placeholder,'Pass']")).sendKeys("abc123");
				
				//identify login button
				driver.findElement(By.xpath("//button[contains(text(),'log')")).click();

				Thread.sleep(3000);
				//close the browser
				driver.quit();
	}

}
