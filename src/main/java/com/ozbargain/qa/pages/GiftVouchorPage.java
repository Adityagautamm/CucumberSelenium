package com.ozbargain.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GiftVouchorPage  {
	WebDriver driver;
	WebDriverWait wait;
	
	public GiftVouchorPage(WebDriver driver, WebDriverWait wait) {
		this.driver=driver;
		 this.wait= wait;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//span[@class= 'ke_g']")
	WebElement pageHeader;

}
