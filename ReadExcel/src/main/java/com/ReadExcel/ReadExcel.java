package com.ReadExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel 
{
	@Test
	
	public void readExcel() throws IOException
	{
		String excelpath="C:\\Users\\hi\\Chandra\\HybridTestNGFrameWork\\ReadExcel\\TestData\\TestData.xlsx";
		String fileName="TestData";
		String sheetName="Test";
		
		File file=new File(excelpath);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet(sheetName);
		
		
		int rowCount=sheet.getLastRowNum();
		
	
		
		System.out.println("total rows"+rowCount);
		String data=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		for(int i=0;i<=rowCount;i++)
		{
			Row row=sheet.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++)
			{
				String datas=sheet.getRow(i).getCell(j).getStringCellValue();
			
				System.out.print(datas+" ");
			}
				System.out.println();
		}
		wb.close();
	}

}
