package org.com.training.Selenium.utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelDataProviderClass {

	 static Logger logger = LogManager.getLogger(ConfigDataProvider.class);
	 XSSFWorkbook wb;
	 XSSFSheet st;
	 
	public ExcelDataProviderClass() {
 
		try {
		File file=new File("C:\\Users\\Shah_Bano\\Desktop\\Test.xlsx");
		FileInputStream fis;
		
			fis = new FileInputStream(file);
			 wb=new XSSFWorkbook(fis);
		} catch (Exception e) {
			logger.info("Sheet not accessible");
		}
		
		
	
	}
	
	public String getSheetData(int sheetNumber, int row, int col)
	{
		st=wb.getSheetAt(sheetNumber);
		return st.getRow(row).getCell(col).getStringCellValue();
	}
	
}
