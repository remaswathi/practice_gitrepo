package WebPAGES_POM;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {
	FileInputStream fis1=new FileInputStream("‪C:\\Users\\kirit\\Desktop\\TestScript.xlsx");
	Workbook wb = WorkbookFactory.create(fis1);
	Sheet sh = wb.getSheet("Campaign");
	String campname = sh.getRow(1).getCell(2).getStringCellValue();
	String size = sh.getRow(1).getCell(3).toString();

}   /////do tomo
