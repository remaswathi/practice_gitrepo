package WebPAGES_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_homePage {
	//constructor
	public Pom_homePage(WebDriver Driver) {
		PageFactory.initElements(Driver, this);
	}
	
	//webelements
	@FindBy(id="small-searchterms")
	WebElement searchtext;
	
	
	
	
	
	
	
	

}
