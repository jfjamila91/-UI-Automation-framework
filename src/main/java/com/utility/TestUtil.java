package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.base.BaseClass;
import com.google.common.io.Files;

public class TestUtil extends BaseClass{
	
	public static final long implicit_wait_time = 10;
	public static final long page_load_wait_time = 10;
	public static String path = "/Users/jamila/eclipse-workspace/WalmartAutomationProject/data/WalmartTestData.xlsx";
	static Workbook book;
	static Sheet sheet;
	public static FileInputStream file;
	public TestUtil() {
		
	}
//--data provider	
	public static Object[][] getTestData(String sheetName) {		
	  try {
		file  = new FileInputStream(path);
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}try {
		book = WorkbookFactory.create(file);
	} catch (EncryptedDocumentException | IOException e) {
		
		e.printStackTrace();	}
	
//--getting table raws and columns	
	sheet = book.getSheet(sheetName);
	Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(1).getLastCellNum()];
	System.out.println("Total found "+sheet.getLastRowNum()+ " raw's and "+sheet.getRow(0).getLastCellNum()
			         +" column's in this table....\n");
	
	for(int i =0; i<sheet.getLastRowNum(); i++) {
		for(int j = 0; j<sheet.getRow(0).getLastCellNum(); j++) {
			data[i][j]= sheet.getRow(i+1).getCell(j).toString(); // 
			System.out.print(data[i][j]+" \t");		
		}
		System.out.println("\n");
	}
	return data;
	}
	public static WebElement selectMethod(String locator) {
		Select select = new Select(driver.findElement(By.className(locator)));
		return (WebElement) select;
	}	
	public void takeScreenshoot() throws IOException{
		
//----- Convert web driver to TakeScreenshot
		File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(screenShot, new File("/Users/jamila/eclipse-workspace/OnlineShopping/screenshot"
		+System.currentTimeMillis()+".jpeg"));
		
	}

	

}
