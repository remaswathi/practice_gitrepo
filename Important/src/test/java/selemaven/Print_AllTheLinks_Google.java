package selemaven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_AllTheLinks_Google {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
		List<WebElement> ref = driver.findElements(By.xpath("//a"));
		int s=ref.size();
		System.out.println(" total no.of links"+ s);
		

	}

}
