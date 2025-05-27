package selemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
//		RemoteWebDriver driver = new ChromeDriver();
//		driver.get("file:///C:/Users/kirit/Documents/login.html");
//		driver.findElement(By.id("link1")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("signup")).click();
//		driver.findElement(By.partialLinkText("up")).click();
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/kirit/Documents/link.html");
		String str = driver.findElement(By.id("msg")).getText();
		System.out.println(str);
		String str1 = driver.findElement(By.name("link")).getText();
		System.out.println(str1);
		String str2 = driver.findElement(By.linkText("Link 2")).getText();
		System.out.println(str2);
		String str3 = driver.findElement(By.linkText("Text Msg2")).getText();
		System.out.println(str3);

	}

}
