package selemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Closed_ShadowRootElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
		Thread.sleep(1000);
		//login Attached text
		driver.findElement(By.xpath("//h1[text()='Login']")).click();
		Actions action=new Actions(driver);
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys("swathi").perform();//un
		
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys("krishna").perform();//pwd
		driver.quit();
		
	}

}
