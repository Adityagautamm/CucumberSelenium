package com.ozbargain.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CarHirePage  {
	WebDriver driver;
	WebDriverWait wait;

	
	public CarHirePage(WebDriver driver, WebDriverWait wait) {
		 this.driver=driver;
		 this.wait= wait;
		PageFactory.initElements(driver, this);
	
	
	}
	
	@FindBy(xpath="//*[@id='pickupLocation']")
	WebElement locationTextbox;
	
	//it will look for all the elements that satisfy @findBy, there can be more than one @FindBy
	@FindBys (@FindBy(xpath="//*[contains(@class,'ct-drop-down-option')]/span[contains(@ng-bind-html,'::item.label')]"))
	List<WebElement> carlocationSuggestion;
	
	
	@FindBy(xpath="//*[@id=\"ct-pickup-calendar\"]/div[@placeholder='Start date']")
	WebElement carHireStartDate;
	
	
	@FindBy(xpath="//*[@id='ct-return-calendar']/div[@placeholder='End date']")
	WebElement carHireEndDate;
	
	/*
	@FindBy(xpath="//*[@id='pickupDate']")
	WebElement startDateButton;
	
	@FindBy(xpath="(//*[starts-with(@aria-label, '28 ')])[1]")
	WebElement fromDate;
	*/
	@FindBy(xpath="//*[@id = 'ct-pickup-timers']")
	WebElement carHireFromTimeDropdown;
	
	
	@FindBy(xpath="//*[@id='returnTime']")
	WebElement carHireToTimeDropdown;
	
	
	@FindBys (@FindBy(xpath="//*[@id=\"ct-pickup-timers\"]/ct-time-picker-custom/div/ul/li[contains(@class,'ct-timepicker-custom-box--options')]"))
	List<WebElement> carHireFromTimeList;
	
	
	@FindBys (@FindBy(xpath="//*[@id=\"ct-return-timers\"]/ct-time-picker-custom/div/ul/li[contains(@class,'ct-timepicker-custom-box--options')]"))
	List<WebElement> carHireToTimeList;
	
	
	
	@FindBy(xpath="//*[@id='ct-button-search']")
	WebElement searchButton;
	
	/*
	@FindBy(xpath="//*[@id = 'returnDate']")
	WebElement endDateButton;
	

	@FindBy(xpath="(//*[starts-with(@aria-label, '28 ')])[2]")
	WebElement toDate;
	
	@FindBy(xpath="//*[@id = 'ct-return-timers']")
	WebElement toTimeDropdown;
	
	*/
	
	
	
	
}
