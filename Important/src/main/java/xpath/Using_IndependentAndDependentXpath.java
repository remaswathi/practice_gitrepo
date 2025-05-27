package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_IndependentAndDependentXpath {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement price = driver.findElement(By.xpath("//a[text()='$25 Virtual Gift Card']/../../div[@class='add-info']/div/span"
				+ ""));
		System.out.println(price.getText());
		
		driver.quit();
	}

}
