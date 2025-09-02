package advanceSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ninja_Advsel1 {

	public static void main(String[] args) {
		 WebDriver driver=new EdgeDriver(); 
	     driver.manage().window().maximize(); 
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	      
	     //login to NINZA CRM 
	     driver.get("http://49.249.28.218:8098/"); 
	     driver.findElement(By.id("username")).sendKeys("rmgyantra"); 
	     driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999"); 
	     driver.findElement(By.xpath("//button[text()='Sign In']")).click(); 
	      
	     //create projects
	   driver.findElement(By.linkText("//span[text()='Create Project']")).click();
	     
	     
	     //create project
	     driver.findElement(By.className("projectName")).sendKeys("radha"); 
	     driver.findElement(By.name("teamSize")).sendKeys("TYP12"); 
	    driver.findElement(By.name("createdBy")).sendKeys("krishna"); 
//	    driver.findElement(By.name("status")
//	    driver.findElement(By.xpath("//button[text()='Create Campaign']")).click(); 
//	   
//	   
//	  //validation 
//	    WebElement toastmsg = driver.findElement(By.xpath("//div[@role='alert']")); 
//	    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10)); 
//	    //wait.until(ExpectedCondition.visibilityOf(toastmsg)); 
//	    String msg = toastmsg.getText(); 
//	     
//	   
//	  if(msg.contains("TYP12")) 
//	  { 
//	   System.out.println("campaign created"); 
//	  } 
//	  else { 
//	   System.out.println("campaign not created"); 
//	  } 
//	  driver.findElement(By.xpath("//button[@aria-label='close']")).click(); 
//	   
//	   
//	  //logout 
//	  WebElement icon = driver.findElement(By.xpath("//div[@class='usericon']")); 
//	  Actions act=new Actions(driver); 
//	  act.moveToElement(icon).perform(); 
//	  WebElement logoutbtn 
//	=driver.findElement(By.xpath("//div[@class='dropdown-item logout']"));
//	  act.moveToElement(logoutbtn).click().perform();
	  driver.quit();
	}

}
