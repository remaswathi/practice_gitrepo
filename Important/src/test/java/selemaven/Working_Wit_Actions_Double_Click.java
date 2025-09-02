package selemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_Wit_Actions_Double_Click {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("selenium@gmaim.com");
		driver.findElement(By.id("pass")).sendKeys("sel123");
		
		//create an object of actions class
		Actions action=new Actions(driver);
				
		//double click button
		WebElement button=driver.findElement(By.name("login"));
		action.doubleClick(button).build().perform();

	}

}
