package selemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WorkingwithActions {

	@Test
	public void actions()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		//create an object of actions class
		Actions action=new Actions(driver);
		
		//move to element
		WebElement computers=driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
		action.moveToElement(computers).build().perform();
		
		WebElement desktop=driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]"));
		//action.moveToElement(desktop).build().perform(); or
		action.moveToElement(desktop).click().build().perform();
		
		
	}

}
