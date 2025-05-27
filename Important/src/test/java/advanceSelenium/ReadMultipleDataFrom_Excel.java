package advanceSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFrom_Excel {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis1= new FileInputStream("D:\\Users\\kirit\\eclipse-workspace\\Important\\excel_1\\exceldata.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		Sheet sh= wb.getSheet("Mobile");
		int rowcount = sh.getLastRowNum();

		System.out.println(rowcount);
		for(int row=1;row<=rowcount;row++) 
		{ 
		String prodcategory =sh.getRow(row).getCell(0).getStringCellValue(); 
		String prodname = sh.getRow(row).getCell(1).getStringCellValue(); 
		System.out.println(prodcategory+"==="+prodname); 
		}
		wb.close();

	}

}
