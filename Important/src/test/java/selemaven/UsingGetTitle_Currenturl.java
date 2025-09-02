package selemaven;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGetTitle_Currenturl {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/restaurants");
		String  title= driver.getTitle();
		System.out.println("Title is:" + title);
		driver.getCurrentUrl();
		String url=driver.getCurrentUrl();
		System.out.println("Title is:" + title);
		
		//ask
	}

}
