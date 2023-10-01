package utilities;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	public static Object[][] readDataFromExcelSheet(String excelPath,String sheetName) throws IOException {
		XSSFWorkbook workbook=new XSSFWorkbook(excelPath);
		XSSFSheet sheet=workbook.getSheet(sheetName);
		XSSFRow row=sheet.getRow(2);
//		XSSFCell cell=row.getCell(0);
//		String username=cell.getStringCellValue();
//		System.out.println(username);
//		
//		XSSFCell cell1=row.getCell(1);
//		String password=cell1.getStringCellValue();
//		System.out.println(password);
		
	
		int noOfRows=sheet.getLastRowNum()+1;
		System.out.println("No.of Rows in Excel are :="+noOfRows);
		
		int noOfCellsInRow=sheet.getRow(0).getLastCellNum();
		
		Object[][] obj=new Object[noOfRows-1][noOfCellsInRow];
		
		for(int i=1;i<noOfRows;i++) {
			String userName=sheet.getRow(i).getCell(0).getStringCellValue();
			String passWord=sheet.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(userName+"-----"+passWord);
		}
		
		System.out.println("****************");
		
		for(int i=1;i<noOfRows;i++) {
			int noOfCells=sheet.getRow(i).getLastCellNum();
			System.out.println("No.of cells in a row:="+noOfCells);
			for(int j=0;j<noOfCells;j++) {
				String value=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(value);
				obj[i-1][j]=value;
			}
		}
		
		workbook.close();
		
		return obj;
		
	}

	public static void main(String args[]) throws IOException {
		Object[][] obj=readDataFromExcelSheet("testdata/Credentials.xlsx","Login");
		System.out.println("Reading object[][] from main method");
		for( int i=0;i<obj.length;i++) {
			for(int j=0;j<obj[i].length;j++) {
				System.out.println(obj[i][j]);
			}
		}
	}
}
