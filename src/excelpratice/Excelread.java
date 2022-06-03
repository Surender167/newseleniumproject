package excelpratice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelread {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	FileInputStream file= new FileInputStream("C:\\Users\\suren\\OneDrive\\Documents\\Book1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		XSSFRow  row =  sheet.getRow(0);
		XSSFCell cell =row.getCell(1);
		System.out.println(cell);
		
	}

}
