package selemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_ClickAndHold {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions action=new Actions(driver);
		WebElement washington=driver.findElement(By.id("box3"));
		
		WebElement united_states=driver.findElement(By.id("box103"));
		action.clickAndHold(washington).moveToElement(united_states).click().perform();
		 
		

	}

}
