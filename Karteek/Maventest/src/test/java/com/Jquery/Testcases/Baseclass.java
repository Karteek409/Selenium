package com.Jquery.Testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Jquery.Utilities.Readconfig;
import com.beust.jcommander.Parameter;
import com.steadystate.css.util.Output;

public class Baseclass {
	public static WebDriver driver;
	
	static Readconfig rconfig=new Readconfig();
String url=rconfig.getapplicationurl();
String chromepath=rconfig.getchromepath();
String firefoxpath=rconfig.getfirefoxpath();
Baseclass() {
		System.setProperty("webdriver.gecko.driver",chromepath);
		driver = new FirefoxDriver();
	}

@BeforeClass
	public void Launching() {
			
		driver.get(url);
		System.out.println("data printed form before class");
		
	}
	
	@AfterClass
	public void Closing() {
	driver.quit();
	}
	
	public void capturescreen(WebDriver driver,String tname) {
		
		File fs=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
	}
	
}
