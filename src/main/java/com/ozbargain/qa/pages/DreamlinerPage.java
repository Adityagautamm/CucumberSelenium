package com.ozbargain.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DreamlinerPage  {
	
	WebDriver driver;
	WebDriverWait wait;

	public DreamlinerPage(WebDriver driver, WebDriverWait wait) {
		this.driver=driver;
		 this.wait= wait;
		 PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//h1[contains(text(),'Jetstar Boeing 787 Dreamliner')]")
	WebElement pageHeader;
	
}
