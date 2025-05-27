package selemaven;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
	//typecast to get the capabilities of takescreenshot interface to the driver instance
	
	//Typecast
	TakesScreenshot ts=(TakesScreenshot)driver;
	
	//Temprovary location
	 File srcfile=ts.getScreenshotAs(OutputType.FILE);
	 //Destination file
	 File destfile=new File(".d/.jpg");
	 org.openqa.selenium.io.FileHandler.copy(srcfile, destfile);
	 //driver.close();
	 
	 //this i dont know where the screenshot stored
	 
	 
	 
	 

	}

}
