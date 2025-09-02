package advanceSelenium;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json {

	public static void main(String[] args) throws Throwable, ParseException {
		FileReader fir=new FileReader("./jason/Jsonfile.Json");
		
		//parse JSON physical file intojava object using JSONParser class
		JSONParser parser=new JSONParser();
		Object javaobjt=parser.parse(fir);
		
		//convert java object to json object(downcasting)
		JSONObject obj=(JSONObject)javaobjt;
		
		//ready data using get()
		Object BROWSER = obj.get("Browser").toString();
		System.out.println(BROWSER);
		Object URL = obj.get("Url").toString();
		System.out.println(URL);
		

	}

}
