import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Extentreporttest {
public static WebDriver driver;
public static String url="https://www.amazon.com//gifts";
ExtentReports rep;
ExtentTest loge;
	@BeforeTest
	public void reportgen() {
		rep.startTest("getting page title");
		//System.setProperty("webdriver.chrome.driver", "F:\\Practice\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		loge=rep.startTest("pagetitle");
		System.out.println("data get generated");
	}
	}
