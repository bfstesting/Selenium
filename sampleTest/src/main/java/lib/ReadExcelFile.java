package lib;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	
	public static Object[][] ReadXlFile (String excelPath, String sheetName) {
		try {
			File src = new File(excelPath);
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheet(sheetName);
			} catch(Exception e) 
			{
			System.out.println("Unable to read the Excel File" + e.getMessage());
			}
		//return;
		//object[][] data = new object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		//System.out.println("Inside ReadXlFile function");
		
		int rowCount = sheet.getLastRowNum() + 1;
		int colCount = sheet.getRow(0).getLastCellNum();
		Object data[][] = new Object[rowCount-1][colCount];
		
		for (int i=1;i<rowCount;i++) {
			//System.out.println("i = " + i);
			for (int j=0;j<colCount;j++)
			{ 
				//System.out.println("j = " + j);
				//credentials[i-1][j] = config.getData(i, j);
				//String cellData = ReadFile.getData(i, j);
				//System.out.println(cellData + " | ");
				data[i-1][j] = sheet.getRow(i).getCell(j).toString();
				
			}
			//System.out.println("For j loop completed");
		
		} 
		//System.out.println("for i loop completed");
		return data;
	}
	
	public String getData(int row, int column) {
		//sheet = wb.getSheetAt(sheetnumber);
		String data = sheet.getRow(row).getCell(column).getStringCellValue();
		System.out.println(data);
		return data;
	}
	
	public int getRowCount() throws Exception {
		int row = sheet.getLastRowNum();
				//sheet.getPhysicalNumberOfRows();
		//row = row + 1;
		//System.out.println("Rows = " + row);
		return row;
	}
	
	public int getColCount() throws Exception {
		int colCount = sheet.getRow(0).getLastCellNum();
				//sheet.getRow(0).getPhysicalNumberOfCells();
		//row = row + 1;
		//System.out.println(colCount);
		return colCount;
	}
	
	public void getCellDataNumber(int row, int col)
	{
		double data = sheet.getRow(row).getCell(col).getNumericCellValue();
			
	}
	

}
