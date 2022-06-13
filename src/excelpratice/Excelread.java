package excelpratice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelread {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//	FileInputStream file= new FileInputStream("C:\\Users\\suren\\OneDrive\\Documents\\Book1.xlsx");
//		XSSFWorkbook wb = new XSSFWorkbook(file);
//		XSSFSheet sheet = wb.getSheet("Sheet1");
//		XSSFRow  row =  sheet.getRow(0);
//		XSSFCell cell =row.getCell(1);
//		System.out.println(cell);
//		
	//Write	
		FileInputStream file1= new FileInputStream ("C:\\Users\\suren\\OneDrive\\Documents\\Book1.xlsx");
		XSSFWorkbook wb1=new XSSFWorkbook(file1); 
		XSSFSheet sh = wb1.getSheet("Sheet1");
		XSSFRow rw=sh.getRow(0);

		XSSFCell cel =rw.getCell(1);
		cel.setCellType(CellType.STRING);
		cel.setCellValue("qaplanet inst sadar sihhhhhh**ng writes nothing  ");
		System.out.print("it is k");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\suren\\OneDrive\\Desktop\\sadar.xlsx");
		wb1.write(fos);
		fos.close();
		System.out.println("Plz check ur excelsheetL");
		
	}

}
