package advanceSelenium;

import java.io.FileInputStream;
import java.util.Properties;

public class DDTPropertiesFile {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis=new FileInputStream("D:\\Users\\kirit\\eclipse-workspace\\Important\\src\\test\\resources\\commondata.properties");
		
		Properties prop=new Properties();
		prop.load(fis);
		
		String BROWSER = prop.getProperty("Browser");
		String URL = prop.getProperty("Url");
		String USERNAME = prop.getProperty("Username");
		String PASSWORD = prop.getProperty("Password");
		
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}

}
