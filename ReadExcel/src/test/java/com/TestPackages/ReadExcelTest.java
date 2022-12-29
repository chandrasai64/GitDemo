package com.TestPackages;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ReadExcel.ExcelLibrary;

public class ReadExcelTest {

	@Test
	public void readExcelTest() throws IOException
	{
		ExcelLibrary excellibrary=new ExcelLibrary();
		String data=excellibrary.readData("Test", 5, 1);
		System.out.println(data);
	}
}
