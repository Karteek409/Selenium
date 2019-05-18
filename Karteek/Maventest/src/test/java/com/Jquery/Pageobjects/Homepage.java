package com.Jquery.Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;

public class Homepage {

	WebDriver homedriver;
	public Homepage(WebDriver hdriver) {
		homedriver=hdriver;
		PageFactory.initElements(hdriver, this);
		
	}
	
	//@FindBy(xpath="//a[contains(text(),'Draggable')]")
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Draggable')]")
	WebElement draggable;
	
	@FindBy(xpath="//a[contains(text(),'Droppable')]")
	
	WebElement Resizable;
	
	
	public void click() {
		draggable.click();
		Resizable.click();
	}
	
	
}
