package com.jQueryui.Results;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultiThread {

	@Test
	public void Test1 () {
		System.setProperty("webdriver.gecko.driver", "F:\\Practice\\geckodriver.exe");
		WebDriver	driver = new FirefoxDriver();
	driver.get("https://jqueryui.com");
	driver.findElement(By.partialLinkText("API Documentation")).click();		
	
	//System.setProperty("webdriver.chrome.driver", "F:\\Practice\\chromedriver.exe");
	WebDriver driver2 = new FirefoxDriver();
		driver2.get("https://jqueryui.com");
		driver2.findElement(By.partialLinkText("API Documentation")).click();		
		}
}
