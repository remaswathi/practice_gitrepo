package selemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_Actionsclass_ContextClick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		//create an object of actions class
		Actions action=new Actions(driver);
						
		WebElement rightclick_button=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		action.contextClick(rightclick_button).build().perform();
		
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[4]"))).click().perform();

	}

}
