package advanceSelenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_Campaign_with_Expected_Date {

	public static void main(String[] args) throws IOException, Throwable {
		//Reading data from Properties file
		FileInputStream fis=new FileInputStream("‪D:\\Users\\kirit\\eclipse-workspace\\Important\\src\\test\\resources\\commondata.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		String BROWSER = prop.getProperty("Browser");
		String URL = prop.getProperty("Url");
		String USERNAME = prop.getProperty("Username");
		String PASSWORD = prop.getProperty("Password");
		
		//Read data from excel
		FileInputStream fis1=new FileInputStream("‪‪./testdata_excel/createExcel.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		Sheet sh = wb.getSheet("Campaign");
		String campname = sh.getRow(1).getCell(2).getStringCellValue();
		String size = sh.getRow(1).getCell(2).toString();
		
		//Random nbr generate
		Random ran=new Random();
		int randomcount = ran.nextInt(1000);
		
		//Get date after 30 days
		 Date date=new Date();
		 SimpleDateFormat sim=new SimpleDateFormat("dd-MM-yyyy");
		 sim.format(date);
		 Calendar cal = sim.getCalendar();
		 cal.add(Calendar.DAY_OF_MONTH,30);
		 String daterequired = sim.format(cal.getTime());
		 
		WebDriver driver=null;
		if(BROWSER.equals("Edge"))
		 {
		 driver=new EdgeDriver();
		 }
		else if(BROWSER.equals("Chrome"))
		 {
		 driver=new ChromeDriver();
		 }
		else if(BROWSER.equals("Firefox"))
		 {
		 driver=new FirefoxDriver();
		 }
		 
		//login action
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get(URL);
		 driver.findElement(By.id("username")).sendKeys(USERNAME);
		 driver.findElement(By.id("inputPassword")).sendKeys(PASSWORD);
		 driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		 
		//create campaign
		 driver.findElement(By.xpath("//span[text()='Create Campaign']")).click();
		 driver.findElement(By.name("campaignName")).sendKeys(campname + 
		randomcount);
		 WebElement target = driver.findElement(By.name("targetSize"));
		 target.clear();
		 target.sendKeys(size);
		 Thread.sleep(2000);
		 WebElement expClosedate = 
		driver.findElement(By.name("expectedCloseDate"));
		 Actions act=new Actions(driver);
		 act.click(expClosedate).sendKeys(daterequired).perform();
		 
		 
		 driver.findElement(By.xpath("//button[text()='Create Campaign']")).click();
		 
		 //validation
		 WebElement toastmsg = 
		driver.findElement(By.xpath("//div[@role='alert']"));
		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.visibilityOf(toastmsg));
		 String msg = toastmsg.getText();
		 
		 
		 if(msg.contains(campname))
		 {
		 System.out.println("campaign created");
		 }
		 else {
		 System.out.println("campaign not created");
		 }
		 driver.findElement(By.xpath("//button[@arialabel='close']")).click();
		 
		 
		 //logout
		 WebElement icon = 
		driver.findElement(By.xpath("//div[@class='user-icon']"));
		 act.moveToElement(icon).perform();
		 WebElement logoutbtn = 
		driver.findElement(By.xpath("//div[@class='dropdown-item logout']"));
		 act.moveToElement(logoutbtn).click().perform();
		 
		 driver.quit();

	}

}
