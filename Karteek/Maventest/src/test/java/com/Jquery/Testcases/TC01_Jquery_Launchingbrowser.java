package com.Jquery.Testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import com.Jquery.Pageobjects.Homepage;

public class TC01_Jquery_Launchingbrowser extends Baseclass{
	
	public static Homepage hp=new Homepage(driver);

	
	@Test
	public void UrlLaunch() {
		Homepage hp=new Homepage(driver);
		driver.get(url);
		hp.click();
		Assert.assertTrue(true);
	}

	@Test
	public void url() {
		Homepage hp=new Homepage(driver);
		driver.get(url);
		
	}
}
