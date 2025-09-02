package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_XpathFindAllelements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		//Register page
		driver.findElement(By.className("ico-register")).click();
		Thread.sleep(3000);
		
		//identify the gender and click
		driver.findElement(By.id("gender-female")).click();
		Thread.sleep(3000);
		
		//identify the first name and pass text
		driver.findElement(By.className("text-box")).sendKeys("rama");
		Thread.sleep(3000);
		
		//identify the last name and pass text
		driver.findElement(By.id("LastName")).sendKeys("asdf");
		Thread.sleep(3000);
		
		//identify the email and pass text
		driver.findElement(By.id("Email")).sendKeys("asdf123@gmail.com");
		Thread.sleep(3000);
		
		//identify the password and pass text
		driver.findElement(By.className("password")).sendKeys("asdf@123");
		Thread.sleep(3000);
		
		//identify the confirm password and pass text
		driver.findElement(By.name("ConfirmPassword")).sendKeys("asdf@123");
		Thread.sleep(3000);
		
		//identify the Register Button
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(3000);
		
		
		
		//driver.close();
	
		

	}

}
