package selemaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//Thread.sleep(3000);
	     WebElement searcjtxt=driver.findElement(By.id("small-searchterms"));
	
		//webdriverwai is nothing but the explicit wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(searcjtxt));
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//Thread.sleep(3000);
		WebElement searchpage=driver.findElement(By.xpath("//h1[text()='Search']"));
		wait.until(ExpectedConditions.visibilityOf(searchpage));
		//driver.quit();
	}

}
