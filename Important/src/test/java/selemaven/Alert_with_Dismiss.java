package selemaven;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert_with_Dismiss {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		//Thread.sleep(2000);
		
		//driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/p/a[1]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/p/a[2]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/p/a[3]/img")).click();
		Alert alrt=driver.switchTo().alert();
		alrt.accept();
		driver.findElement(By.xpath("//*[@id='layers']/div/div/div")).click();//now alert should come
		driver.quit();

	}

}
