package selemaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Autohealing {
@FindBy(id="email")
WebElement e1;

@FindBy(id="pass")
WebElement e2;

@FindAll({@FindBy(name ="loginbutton"), @FindBy(name="login")})
WebElement e3;

@Test

public void sample() {
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/login/");
    
    Autohealing a=PageFactory.initElements(driver, Autohealing.class);
    a.e1.sendKeys("selenium");
    a.e2.sendKeys("sele@123");
    a.e3.click();
    
}

}
