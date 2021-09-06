package com.page;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class BaseClass {

	public static void main(String args[]) throws IOException 
	{
		File file=new File("./xcelFile/data.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		int lastindex=sheet.getLastRowNum();
		System.out.println(lastindex);
		
		
	}
}
