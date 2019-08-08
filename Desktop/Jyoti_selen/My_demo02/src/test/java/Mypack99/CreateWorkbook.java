package Mypack99;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class CreateWorkbook {
  @Test(enabled = false)
  public void f() throws IOException{
	 // XSSFWorkbook workbook = new XSSFWorkbook();
	  FileOutputStream out = new FileOutputStream (new File("demo.xlsx"));
	//  workbook.write(out);
	  out.close();
	  System.out.println("created excel file");  
  }
  
  @Test
  public void Read() throws IOException {
	  File src = new File ("C:\\Users\\training_d5.01.02\\Desktop\\Requirements for ALM.xlsx");
	  FileInputStream fis= new FileInputStream(src);

	  XSSFWorkbook workbook= new XSSFWorkbook(fis);
	  XSSFSheet sheet1= workbook.getSheetAt(0);

	   int rowCount= sheet1.getLastRowNum();
	   System.out.println("Total no of rows is:" +rowCount);
	   for(int i=0;i<=rowCount;i++)
	   {
	    String Data=sheet1.getRow(i).getCell(0).getStringCellValue();
	    System.out.println("Test data from excel sheet is:" +Data);
	    
	    String Data1=sheet1.getRow(i).getCell(1).getStringCellValue();
	    System.out.println("Test data from excel sheet is:" +Data1);   
	    
	    sheet1.getRow(0).createCell(2).setCellValue("Result");
	    sheet1.getRow(1).createCell(2).setCellValue("Valid_User");
	    sheet1.getRow(2).createCell(2).setCellValue("Valid_User");
	    
	    FileOutputStream out= new FileOutputStream(new File("C:\\Users\\training_d5.01.02\\Desktop\\Requirements for ALM.xlsx"));
	    workbook.write(out);
	    out.close();
	   }

	     workbook.close();


	  }
	  
  }
