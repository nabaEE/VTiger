package commonLibraries;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class FileUtils
{
	String path="./Data/commonData.property.txt";
	String excelPath="./Data/Lead.xlsx";
 public Properties getPropertyData() throws FileNotFoundException
 {
	 FileInputStream fis= new FileInputStream(path);
	 Properties pObj= new Properties();
	 try {
	pObj.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return pObj;
	 
 }
 
 public String getExcelData(String sheetName, int rowNum, int colNum) throws Exception
 {
	 FileInputStream fis1= new FileInputStream(excelPath);
	 Workbook wb= WorkbookFactory.create(fis1);
	 Sheet sh=wb.getSheet(sheetName);
	 Row row=sh.getRow(rowNum);
	 Cell col=row.getCell(colNum);
	 String data=sh.getRow(rowNum).getCell(colNum).getStringCellValue();
	 return data;
	 
}
 
 public void setExcelDta(String sheetName, int rowNum, int colNum, String data) throws Exception
 {
	 FileInputStream fis1= new FileInputStream(excelPath);
	 Workbook wb= WorkbookFactory.create(fis1);
	 Sheet sh=wb.getSheet(sheetName);
	 Row row=sh.getRow(rowNum);
	 Cell cel=row.createCell(colNum);
	  cel.setCellValue(data);
	  FileOutputStream fos= new FileOutputStream(excelPath);
	  wb.write(fos);
	  wb.close();
	 
 }


}
