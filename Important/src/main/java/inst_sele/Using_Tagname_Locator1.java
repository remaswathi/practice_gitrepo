package inst_sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Tagname_Locator1 {

	public static void main(String[] args) {
WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement ele: links) {
			System.out.println(ele.getText());
		}
		
		driver.quit();

	}

}
