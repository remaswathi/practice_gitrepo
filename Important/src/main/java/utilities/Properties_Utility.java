package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties_Utility {

	public String togetDataFromproperiesFile(String key) throws IOException {
FileInputStream fis = new FileInputStream("\"D:\\\\Users\\\\kirit\\\\eclipse-workspace\\\\Important\\\\src\\\\test\\\\resources\\\\commondata.properties\"");
Properties prop = new Properties();
		prop.load(fis);
		
		String value = prop.getProperty(key);
		return value;
	}
}
