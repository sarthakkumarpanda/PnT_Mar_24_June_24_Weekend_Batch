package com.automation.Day14_28th_Apr_2024_DataProvider_ExcelSheet;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Topic1_ExcelCode {
	
	/*
	 Rule1 - Add APACHE POI dependencies in pom.xml file.
	 Rule2 - Create an .xlsx file and have the data
	 Rule3 - Close the Excel sheet if you have opened in your laptop
	 Rule4 - Copy that Excel sheet and paste it inside the package in which you are writing your code
	 */
	public static FileInputStream ip;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellType celltype;
	
	public static Object[][] readFromExcelSheetTNLogin(String sheetName) throws Exception {
		
     //Rule 5 - Create the Object of FileInputStream class and pass the path of the Excel sheet in the constructor
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\automation\\Day14_28th_Apr_2024_DataProvider_ExcelSheet\\ExcelData.xlsx");

	//Rule 6 - Create the Object of XSSFWorkbook and pass the FileInputStream reference in the constructor
		workbook = new XSSFWorkbook(ip); //this workbook may have 100 of sheets
		
	//Rule 7 - use the workbook reference to address individual sheet
		sheet = workbook.getSheet(sheetName); //from those n no of sheets get me that particular sheet which has my login data
		
    //Rule 8 - we have to identify no of rows and no of cols
		int rows = sheet.getLastRowNum(); //I do not know how many rows are there so I gave a generalized value
		int cols = sheet.getRow(0).getLastCellNum();
		
	//Rule 9 - Create a 2-D Object Array and then return the Object Array
		Object[][] data = new Object[rows][cols];
		
		for(int i=0 ; i<rows ; i++) {
			row = sheet.getRow(i+1);
			for(int j=0 ; j<cols ; j++) {
					 cell = row.getCell(j);
					 celltype = cell.getCellType();
					
					switch(celltype) {
					case STRING:
						data[i][j] = cell.getStringCellValue();
						break;
						
					case NUMERIC:
						data[i][j] = Integer.toString((int)cell.getNumericCellValue());
						break;
						
					case BOOLEAN:
						data[i][j] = cell.getBooleanCellValue();
						break;
				}
			 }
		}
		return data;
	}
	
	
	@DataProvider
	public Object[][] getTNLoginExcelData() throws Exception {
		Object[][] data = Topic1_ExcelCode.readFromExcelSheetTNLogin("LoginTN");
		return data;
	}
	
	
	public static Object[][] readFromExcelSheetTNRegister(String sheetName) throws Exception {
		
	ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\automation\\Day14_28th_Apr_2024_DataProvider_ExcelSheet\\ExcelData.xlsx");
    workbook = new XSSFWorkbook(ip);
	sheet = workbook.getSheet(sheetName); 
			
	 int rows = sheet.getLastRowNum(); 
	 int cols = sheet.getRow(0).getLastCellNum();
			
	
			Object[][] data = new Object[rows][cols];
			
			for(int i=0 ; i<rows ; i++) {
				row = sheet.getRow(i+1);
				for(int j=0 ; j<cols ; j++) {
						 cell = row.getCell(j);
						 celltype = cell.getCellType();
						
						switch(celltype) {
						case STRING:
							data[i][j] = cell.getStringCellValue();
							break;
							
						case NUMERIC:
							data[i][j] = Integer.toString((int)cell.getNumericCellValue());
							break;
							
						case BOOLEAN:
							data[i][j] = cell.getBooleanCellValue();
							break;
					}
				 }
			}
			return data;
}
	
	@DataProvider
	public Object[][] getTNRegisterExcelData() throws Exception {
		Object[][] data = Topic1_ExcelCode.readFromExcelSheetTNRegister("RegisterTN");
		return data;
	}
	
}
