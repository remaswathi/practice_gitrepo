package selemaven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_With_Selectclass {

	public static void main(String[] args) throws InterruptedException {

      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://demowebshop.tricentis.com/");
    Thread.sleep(2000);
      
      //click on books link
      driver.findElement(By.xpath("(//a[@href='/books'])[1]")).click();
      
      //identify the webelement sort by dropdown
      WebElement sort=driver.findElement(By.id("products-orderby"));
     
      //create an object of select class
      Select objsel=new Select(sort);
      
//      //the method using
//      objsel.selectByVisibleText("Price: Low to High");
//     Thread.sleep(2000);
//      
//      //display dropdown
//      WebElement display=driver.findElement(By.id("products-pagesize"));
//      Select objsel1=new Select(display);
//      
//     objsel1.selectByVisibleText("12");
//    Thread.sleep(2000);
//     
//      //view as dropdown
//     WebElement view1=driver.findElement(By.id("products-viewmode"));
//     Select objsel2=new Select(view1);
//     objsel2.selectByIndex(1);
     
      
      //get options method
      List<WebElement>sortby_values=objsel.getOptions();
      
      //iterate on the list to print the value
      for(WebElement value:sortby_values) {
    	  System.out.println(value.getText());
      }
      WebElement Display=driver.findElement(By.id("products-pagesize"));
      Select display_dropdown=new Select(Display);
      List<WebElement> display_values= display_dropdown.getOptions();
      
      for(WebElement display_valu:display_values) {
    	  System.out.println(display_valu.getText());
      }
      }
      

	}


//got the output