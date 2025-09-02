package selemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws Exception  {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions action=new Actions(driver);
		
//		//source webemenet identifyieng
//		WebElement source=driver.findElement(By.xpath("//*[@id=\"box3\"]"));
//		
//		//target webelement
//		WebElement target=driver.findElement(By.xpath("//*[@id=\"box103\"]"));
//		
//		action.dragAndDrop(source, target).build().perform();
		
		//source webelement
		WebElement rome=driver.findElement(By.id("box6"));
		WebElement italy=driver.findElement(By.id("box106"));
		action.dragAndDrop(rome, italy).build().perform();
		

	}

}
