package IRCTC;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Irctc_Project {
	@Test
	public void irctcTest() throws InterruptedException {
		
		// Disable browser notifications
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().window().maximize();
        
        Alert a = new Alert();
        a.accept();
        
        driver.findElement(By.xpath("(//input[@aria-autocomplete='list'])[1]")).sendKeys("secunderabad");

//        // Click to activate 'From' station input
//        WebElement fromInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='From*']")));
//        fromInput.click();
//        fromInput.sendKeys("secunderabad");

        // Wait for suggestions to appear
        Thread.sleep(2000); // Better to replace with explicit wait if class is predictable

        // Get all suggestion items
        List<WebElement> suggestions = driver.findElements(By.xpath("//span[contains(@class,'ng-star-inserted')]"));

        for (WebElement suggestion : suggestions) {
            if (suggestion.getText().contains("SECUNDERABAD JN")) {
                suggestion.click();
                break;
            }
        }
        
        driver.findElement(By.xpath("(//input[@aria-autocomplete='list'])[2]")).sendKeys("chandigarh");;

        // Get all suggestion items
        List<WebElement> sugg = driver.findElements(By.xpath("//span[contains(@class,'ng-star-inserted')]"));

        for (WebElement to : sugg) {
            if (to.getText().contains("CHANDIGARH - CDG ")) {
                to.click();
                break;
            }
        }
        
        WebElement checkbox =driver.findElement(By.xpath("(//label[@class='css-label_c t_c'])[3]"));
     // Check if it's not already selected
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
        
        
       driver.findElement(By.xpath("(//button[@class='search_btn train_Search'])[2]")).click();
        // Optional: wait to see selection
        Thread.sleep(3000);
       // driver.quit();
	    
		

	}
}
