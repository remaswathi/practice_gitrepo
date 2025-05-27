package selemaven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ConfigrationTestannotation {
	@BeforeMethod
	public void configBM() {
		System.out.println("BOM");
	}
	
	@AfterSuite
	public void afterSuit() {
		System.out.println("Aftersuit");
	}
	
	@AfterMethod
	public void conAM() {
		System.out.println("AM");
	}
@Test
public void createCont() {
	System.out.println("Test");
}

@AfterClass
public void conAC() {
	System.out.println("AC");
}

@BeforeMethod
public void conBM() {
	System.out.println("BOM2");
}

@BeforeSuite
public void beforeSuit() {
	System.out.println("BS");
}

}
