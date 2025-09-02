package selemaven;

import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Keyboard {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	Actions action=new Actions(driver);
	
//	WebElement searchtextfield=driver.findElement(By.id("small-searchterms"));
//	action.moveToElement(searchtextfield).click().sendKeys("mobiles").perform();
//	
//	//key up and key down
//	action.moveToElement(searchtextfield).click()
//	.keyDown(Keys.SHIFT).sendKeys("mobiles").keyUp(Keys.SHIFT).perform();
//	
	
//	action.scrollByAmount(0, 500).perform();
	
	WebElement myaccount=driver.findElement(By.linkText("My account;"));
	action.scrollToElement(myaccount).perform();
	driver.quit();
	
	
	
	}

}
