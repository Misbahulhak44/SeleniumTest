package com.page;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {
	WebDriver driver;
	@BeforeTest(enabled=false)
	public void driverLoad()
	{
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	public void firstTest() throws IOException
	{
		String file="./xcelFile/data.xlsx";
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh=wb.getSheetAt(0);
			int lastRow=sh.getLastRowNum();
			System.out.println("Last Row Number is="+lastRow);
		
	}

}
