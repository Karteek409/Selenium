package com.jQueryui.Tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import com.jQueryui.Constants.JQueryuiConstants;

public class Launching extends JQueryuiConstants{
	
	
	@Test(priority=0)
	public String launchbrowser() {
		 System.setProperty("webdriver.chrome.driver","F:\\Practice\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("url");
		return "launchbrowser";
	}
	@Test
	public void closingbrowser() {
		String tr="sdggdhhdfhtyryeereu";
		String test[]=tr.split("y");
		
		driver.close();
	}
	
	//@Parameter("testcases")
	@Test
	public void clickinglinks() {
		driver.get(url);
		AssertJUnit.assertEquals("jQuery UI", driver.getTitle());
	
	}
	
	
}
