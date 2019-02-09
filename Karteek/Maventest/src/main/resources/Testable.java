import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
class Testable{
@Test
	public void master {
		
//System.setProperty("webdriver.chrome.driver", "F:\\Practice\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://www.flipkart.com");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

System.out.println(driver.getTitle());
}}