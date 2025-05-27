package selemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_AutosuggetionDropDown {

	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver= new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(3000);
		
//		driver.findElement(By.id("small-searchterms")).sendKeys("compu");
//		driver.findElement(By.xpath("(//a[contains(text(),'Build your own computer')])[1]")).click();
		
		WebDriver driver= new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);

		//identify the searchfield in flipcart
		driver.findElement(By.name("q")).sendKeys("puma");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(text(),'puma')])[2]")).click();
		
			
		
	}

}
