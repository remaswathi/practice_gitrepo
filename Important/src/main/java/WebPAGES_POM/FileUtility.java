package WebPAGES_POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileUtility {

	public String getDataFromPropertiesfile(String key) throws Throwable {
		//Reading data from Properties file
		FileInputStream fis=new FileInputStream("./Commondata/Cd.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String data= prop.getProperty(null);
		return data;
	}

}



//ask fis 