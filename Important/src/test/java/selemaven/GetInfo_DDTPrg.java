package selemaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GetInfo_DDTPrg {
@Test(@dataProvider=)
public void getprdTest() {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.amazon.in/");
	
	//search product
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone",Keys.ENTER);
	driver.findElement(By.xpath("(//span[text()='Apple iPhone 13 (128GB) - Blue'])[1]"));
	System.out.println("iphone");
	
	@DataProvider
	public Object[] [] getData(){
	object[] [] objarr=new Object[3] [2];
	
	
}
}
