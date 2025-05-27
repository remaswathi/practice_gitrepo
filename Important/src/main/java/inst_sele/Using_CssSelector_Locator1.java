package inst_sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_CssSelector_Locator1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.cssSelector("input[value='search store']")).sendKeys("computers");
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		Thread.sleep(3000);
		driver.quit();


	}

}
