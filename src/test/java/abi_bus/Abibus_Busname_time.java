package abi_bus;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Abibus_Busname_time {
	@Test
	public void abiBusproject() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.abhibus.com/");
		
		Actions a=new Actions(driver);
		
		WebElement fromtextfield=driver.findElement(By.xpath("(//div[@class='text-sm text-grey col'])[1]"));
		fromtextfield.sendKeys("seconderabad");
		driver.findElement(By.xpath("//div[text()='Secunderabad']"));
		fromtextfield.click();
		
		Thread.sleep(2000);
		
		WebElement totextfield=driver.findElement(By.xpath("(//div[@class='text-sm text-grey col'])[2]"));
		totextfield.sendKeys("tirupathi");
		driver.findElement(By.linkText("//div[text()='Tirupathi']"));
		
	}
}
