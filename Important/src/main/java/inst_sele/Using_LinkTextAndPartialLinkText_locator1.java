package inst_sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_LinkTextAndPartialLinkText_locator1 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("shopping")).click();
		Thread.sleep(3000);
		driver.quit();


	}

}
