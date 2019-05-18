

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Extentreporttest<paramNN> {
public static WebDriver driver;

	
Extentreporttest(){
System.setProperty("webdriver.chrome.driver", "F:\\Practice\\chromedriver.exe");
driver = new ChromeDriver();
}


	@Parameters("testcases")
	@Test
	public void reportgen(paramNN j) {
	//rep.createTest("getting page title");
	
	//startTest("getting page title");
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com//gifts");
		//loge=rep.createTest("pagetitle");
		//loge=rep.startTest("");
		System.out.println("data get generated:     "+j);
	
	}

@Parameters("testcases")
@Test
public void repportgen21() {
	String curl=driver.getCurrentUrl();
	System.out.println(curl+ " current url is generated");
}
	}
