package xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Working_Irctc {

	public static void main(String[] args) {
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("start maximized");
			opt.addArguments("disable notifications");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.irctc.co.in/nget/train-search");
		
		
		
//		
//				
//				Actions a =new Actions(driver);
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//				WebElement from = driver.findElement(By.xpath("//*[@id=\"origin\"]"));
//				from.findElement(By.xpath("//*[@id=\"pr_id_1_list\"]/li[2]/span/strong")).click();
//				boolean date = driver.findElement(By.xpath("(//a[@draggable=\"false\"])[1]")).isSelected();
//				List<WebElement> to = driver.findElements(By.xpath("(//span[@class='ng-star-inserted'])[1]"));
//				//to.click();
//				driver.findElement(By.xpath("(//span[@class='ng-star-inserted'])[1]"));
//				
//				
//			}
//
//		}


	}

}
