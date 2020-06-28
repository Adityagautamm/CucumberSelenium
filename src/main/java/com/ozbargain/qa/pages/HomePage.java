package com.ozbargain.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.ozbargain.qa.base.TestBase;

public class HomePage {
	WebDriver driver;
	WebDriverWait wait;

	
	public HomePage(WebDriver driver, WebDriverWait wait) {
		this.driver=driver;
		this.wait= wait;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	@FindBy(xpath="//*[@id='tabNav-0']")
	 WebElement flights;
	

	
	@FindBy(xpath="//*[@id='tabNav-1']")
	WebElement hotelAndAirBnb;
	
	@FindBy(xpath="//*[@id='tabNav-2']")
	WebElement holidays;
	
	@FindBy(xpath="//*[@id='tabNav-3']")
	 WebElement cars;
	
	//@FindBy(xpath="//*[@id=\"tabPanel-3\"]//span[contains(@class,'tabContent__btn')]")
		@FindBy(xpath="//*[(contains(@href, 'https://www.jetstar.com/au/en/car-hire') ) and  not (contains(@tabindex,'-1'))]/span")
		WebElement searchCarsButton;
	
	@FindBy(xpath="(//div[contains(@class,'b0h_b0i b0l_b0m')]/button)[2]")
	 public WebElement returnTripDropdown;
	
	@FindBys (@FindBy(xpath="//button[contains(@class,'list-button')]"))
	List<WebElement> returnTripSuggestion;
	
	@FindBy(xpath="//div[contains(@data-auto,'flightTypeTravellers')]/div/div[2]/button")
	 public WebElement passengerButton;
	
	
	@FindBy(xpath="//input[contains(@name,'adults')]")
	 public WebElement adultTextbox;
	
	@FindBy(xpath="//input[contains(@name,'children')]")
	 public WebElement childrenTextbox;

	@FindBy(xpath="//input[contains(@name,'infants')]")
	 public WebElement infantsTextbox;
	

	
	@FindBy(xpath="//div[contains(@id,'dd-travellers')]/div/button[contains(@aria-controls,'dd-travellers')]")
	 public WebElement passengerConfirmButton;
	
	
	@FindBy(xpath="(//div[contains(@class,'sector__field')]/div/button)[1]")
	WebElement fromFlightLocationButton;
	
	@FindBy(xpath="//input[contains(@id,'search-outbound')]")
	WebElement fromFlightLocationTextBox;
	
	@FindBy(xpath="//input[contains(@id,'search-inbound')]")
	WebElement toFlightLocationTextBox;
	
	
	@FindBys(@FindBy(xpath="//Li[contains(@data-test,'li')]"))
	List<WebElement> flightLocationSuggestion;
	
	
	
	// COntains and not contains example
	//@FindBy(xpath="//button[(contains (@class,'i1_jc') and contains(@aria-expanded,'false')) and not (contains (@class,'i1_kh'))]")
	
	@FindBy(xpath="(//div[contains(@class,'sector__field')]/div/button)[2]")
	WebElement toFlightLocationButton;

	@FindBy(xpath="//div[contains(@class,'sector__field--date')]/button")
	WebElement flightDateButton;
	
	
	//  month= //div[contains(@data-auto,'monthScroller')]/div/div/button
	//date webelement=//div[contains(@data-auto,'calendarGrid')]/div/button
	
	@FindBy(xpath="//footer[contains(@data-auto, 'calendarReview')]/div[contains(@class,'gutter')]/div/div/button")
	WebElement searchFlighButton;
	
	
	
	
	//*[@id="accommodation-2"]
	@FindBy(xpath="//div[contains(@aria-label,'accommodationType')]/label[2]")
	WebElement airBnbRadioButton;
	
	@FindBy(xpath="//div[contains(@aria-label,'accommodationType')]/label[1]")
	WebElement hotelsRadioButton;
	
	@FindBy(xpath="//div[contains(@data-auto, 'accommodationLocation')]")
	WebElement airBnbLocationButton;
	
	@FindBy(xpath="//*[@id=\"location-search\"]")
	WebElement airBnbLocationTextbox;
	
	
	@FindBys (@FindBy(xpath="//ul[contains(@class, 'bp')]/li"))
	List<WebElement> airBnbLocationSuggestion;
	
	@FindBy(xpath="//div[contains(@data-auto, 'accommodationDates')]")
	WebElement airBnbdateButton;
	
	@FindBy(xpath="//button[contains(@class,'button_base')]")
	WebElement confirmAirBnbDateButton;
	
	@FindBy(xpath="//div[contains(@data-auto, 'accommodationGuests')]/div/button")
	WebElement whoButton;
	
	@FindBy(xpath="//div[contains(@class,'btn-container')]")
	WebElement doneButton;
	
	@FindBy(xpath="//div[contains(@data-auto, 'accommodationSubmit')]/button")
	WebElement searchAirBnbButton;

	@FindBy(xpath="//div[contains(@data-schema-name,'holidaySearch')]/div[1]/div/div/div/button")
	WebElement travellerButton;
	
	
	@FindBy(xpath="(//button[contains(@class,'button_base')])[2]")
	WebElement confirmTavellerButton;
			
	
	@FindBy(xpath="//div[contains(@data-schema-name,'holidaySearch')]/div[2]/div[1]/div/button")
	WebElement fromHolidayLocationButton;
	
	@FindBy(xpath="//input[contains(@name,'holidayLocations-outbound')]")
	WebElement fromHolidayLocationTextbox;
	
	
	@FindBys(@FindBy(xpath="//li[contains(@data-test,'li')]/button"))
	List<WebElement> holidayLocationSuggestions;
	
	
	@FindBy(xpath="//div[contains(@data-schema-name,'holidaySearch')]/div[2]/div[2]/div/button")
	WebElement toHolidayLocationButton;

	@FindBy(xpath="//input[contains(@name,'holidayLocations-inbound')]")
	WebElement toHolidayLocationTextbox;
	
	@FindBy(xpath="//div[contains(@data-auto,'holidayDates')]/div/button")
	WebElement holidayDatesButton;

	
	@FindBy(xpath="//button[contains(@class,'button_base')]")
	WebElement confirmHolidayDatesButton;

	
	@FindBy(xpath="//div[contains(@data-schema-name,'holidaySearch')]/div[2]/div[4]/button")
	WebElement searchHolidayButton;
	
	

	
	

}
