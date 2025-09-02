package selemaven;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		//click on search-button without entering serachbtn
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		//handle the alert
		Alert alrt=driver.switchTo().alert();
		alrt.accept();
		System.out.println("alert was handled successfully");
		driver.findElement(By.id("small-searchterms")).sendKeys("alert was handled");
		
	}

}
