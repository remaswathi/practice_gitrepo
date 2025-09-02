package selemaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_Register {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.linkText("//div[text()='Continue']")).click();
		driver.findElement(By.id("register_Layer")).click();
		WebElement name = driver.findElement(By.id("name"));
		 name.sendKeys("Rswathi");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("swathir.ece405@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Krishna@206");
		
		WebElement mobile = driver.findElement(By.id("name"));
		mobile.sendKeys("6281846980");
		
		driver.findElement(By.className("main-2")).click();

	}

}

//ask
