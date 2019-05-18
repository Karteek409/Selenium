package com.jQueryui.Constants;

import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class JQueryuiConstants {
	public static WebDriver driver;
	public static String url="https://jqueryui.com/";
	public void reports(String obj) {	
		ExtentReports extent=new ExtentReports();
		ExtentTest logger=extent.createTest("jQuery Launching");
		ExtentHtmlReporter report=new ExtentHtmlReporter("F:\\Practice\\Seleniummvnpjt\\src\\test\\java\\com\\jQueryui\\Results\\"+obj+".html");
	 logger.log(Status.INFO, obj);
}
}