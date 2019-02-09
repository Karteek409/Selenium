package methooverloading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Primusbank
{
	public static WebDriver driver;
	public  String demo;
	
	@BeforeTest
	public static void launchApp(String url)
	{
		System.setProperty("webdriver.chrome.driver","F:\\Practice\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);		
	}
		
	public boolean admniLogin(String uid,String pwd)
	{
		String expurl,acturl;
		expurl="adminflow";		
		driver.findElement(By.id("txtuId")).sendKeys(uid);
		driver.findElement(By.id("txtPword")).sendKeys(pwd);
		driver.findElement(By.id("login")).click();
		acturl=driver.getCurrentUrl();		
		if (acturl.contains(expurl)) 
		{
			return true;
		} else 
		{
			return false;
		}		
		
	}
	
	public static void closeApp()
	{
		driver.close();
	}

	
}