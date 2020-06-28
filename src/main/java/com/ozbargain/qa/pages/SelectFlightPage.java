package com.ozbargain.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectFlightPage  {
	
	
	WebDriver driver;
	WebDriverWait wait;
	
	public SelectFlightPage(WebDriver driver, WebDriverWait wait) {
		this.driver=driver;
		this.wait= wait;
		PageFactory.initElements(driver, this);
	
	}

	@FindBy(xpath="//*[contains(@id, 'chooseFlights')]")
	WebElement pageHeader;

	
	@FindBy(xpath="(//*[@class='section-heading__route'])[1]")
	WebElement derpartingFlightHeader;
	
	@FindBy(xpath="(//*[@class='section-heading__route'])[2]")
	WebElement returnFlightHeader;
	
	
}
