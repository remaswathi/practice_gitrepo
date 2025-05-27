package selemaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Working_With_Fluents {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement searcjtxt=driver.findElement(By.id("small-searchterms"));
		
		//fluent wait every second it will go n chek
		FluentWait wait=new FluentWait(driver);
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.withTimeout(Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(searcjtxt));
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		WebElement searchpage=driver.findElement(By.xpath("//h1[text()='Search']"));
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.withTimeout(Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(searcjtxt));
		//driver.quit();

	}

}
