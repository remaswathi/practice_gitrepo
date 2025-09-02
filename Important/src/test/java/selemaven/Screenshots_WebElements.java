package selemaven;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots_WebElements {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
//webelement here we want screenshot
		WebElement searchtxt=driver.findElement(By.id("small-searchterms"));
		searchtxt.sendKeys("mobiles");
//screenshot 3 steps 1Typecast
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcfile=searchtxt.getScreenshotAs(OutputType.FILE);
		File destfile = new File("C:\\Users\\kirit\\Pictures\\Screenshots/searchfield.png");
		FileHandler.copy(srcfile, destfile);
		
		System.out.println("screenshot of searchfield is successfull");
		WebElement searchbtn=driver.findElement(By.xpath("//input[@type='submit']"));
		File src1=searchbtn.getScreenshotAs(OutputType.FILE);
		File destfile1 = new File("C:\\Users\\kirit\\Pictures\\Screenshots./searchbtn.png");
		FileHandler.copy(srcfile, destfile);
		
		
		
		
	}

}
