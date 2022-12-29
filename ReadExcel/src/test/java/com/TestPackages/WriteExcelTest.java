package com.TestPackages;

import java.io.IOException;

import org.testng.annotations.Test;

import com.WriteExcel.WriteExcel;

public class WriteExcelTest 
{
	WriteExcel obj=new WriteExcel();
	@Test
	public void writeExcelTest() throws IOException
	{
		obj.writeExcel("Test", "Chandra", 0, 2);
	}
	@Test
	public void writeExcelTest1() throws IOException
	{
		obj.writeExcel("Test", "Bhanu", 1, 2);
	}

}
