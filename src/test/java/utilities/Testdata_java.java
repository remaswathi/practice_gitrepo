package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Testdata_java {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./sa/mcom.properties");
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
