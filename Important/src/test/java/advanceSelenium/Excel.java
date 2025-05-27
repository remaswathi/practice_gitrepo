package advanceSelenium;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis= new FileInputStream("D:\\Users\\kirit\\eclipse-workspace\\Important\\testdata_excel\\createExcel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh= wb.getSheet("campaign");
		Row r = sh.getRow(2);
		String Campname=r.getCell(1).toString();
		System.out.println(Campname);
		String targetsize=r.getCell(1).toString();
		System.out.println(targetsize);
		wb.close();
	}

}
