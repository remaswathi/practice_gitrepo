package selemaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Working_with_Implicitlywait {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		//implicit wai
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.quit();
	}

}
