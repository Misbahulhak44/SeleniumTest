package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	WebDriver driver;
	@BeforeTest
	public void driverLoad()
	{
		System.setProperty("webdriver.edge.driver.", "./driver/msedgedriver.exe");
		driver=new EdgeDriver();
		
	}

}
