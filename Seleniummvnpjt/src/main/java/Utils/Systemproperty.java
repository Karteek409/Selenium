package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Systemproperty {
	
	public static void main(String [] args) {	
	
	 ExtentHtmlReporter report=new ExtentHtmlReporter("./test-output/Htmloutput.html"); 
		ExtentReports extent=new ExtentReports();
		ExtentTest logger=extent.createTest("Login.test");
		
 }}
