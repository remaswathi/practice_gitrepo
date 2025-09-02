package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class test_excel {

	public static void main(String[] args) throws RuntimeException, IOException {
		FileInputStream fis= new FileInputStream("./excel1/run.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh= wb.getSheet("Mobile");
		//Row r=sh.getLastRowNum();
		int rowcount = sh.getLastRowNum();
		//System.out.println(rowcount); 
		for(int row=0;row<=rowcount;row++) 
		{ 
		String Product =sh.getRow(5).getCell(0).getStringCellValue(); 
		String name = sh.getRow(6).getCell(0).getStringCellValue(); 
		System.out.println(Product+"==="+name); 
		}
		
		

	}

}





