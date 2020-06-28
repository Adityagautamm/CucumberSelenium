package com.ozbargain.qa.pages;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AllPageDictionary {
	WebDriver driver= null;
	WebDriverWait wait = null;
	

	public AllPageDictionary(WebDriver driver, WebDriverWait wait) {
		 this.driver=driver;
		 this.wait= wait;
		 basics= new Basics(driver, wait);
		 carHirePage= new CarHirePage(driver, wait);
		 homePage= new HomePage(driver, wait);
		 elementDictionary=new HashMap<String, WebElement>();
		 elementsListDictionary=new HashMap<String, List<WebElement>>();
		 elementAdder();
		
	}
	// Map object to store  all the elements
	 HashMap<String, WebElement> elementDictionary;
	 // Map to store store all ELEMENTS
	 HashMap<String, List<WebElement>> elementsListDictionary;
		
	//object of all pages
	public Basics basics;
	public HomePage homePage;
	public CarHirePage carHirePage;
	//public Basics basics= new Basics(driver, wait);
	//public CarHirePage carHirePage= new CarHirePage(driver, wait);
	public DreamlinerPage dreamlinerPage;
	public GiftVouchorPage giftVouchorPage;
	//public HomePage homePage= new HomePage(driver, wait);
	public SelectFlightPage selectFlightPage;
	
	
	
	 



	 
	 // to search in the element dictionary
	 public Boolean searchInElementDictionary(String name) {
        
		 return elementDictionary.containsKey(name);
   }
	 
	 public Boolean searchInElementsListDictionary(String name) {
	        
		 return elementsListDictionary.containsKey(name);
   }
	 
	// to get element from element dictionary using a key
	 public  WebElement getFromElementDictionary(String name) {
        
		 return elementDictionary.get(name);
	    }
	 
	 public  List<WebElement> getFromElementsListDictionary(String name) {
	        
		 return elementsListDictionary.get(name);
	    }
	 
	 // adding elements in the element dictionary
	 public void addInElementDictionary(String name, WebElement element) throws Exception {
        
		 
		 if(!elementDictionary.containsKey(name)){
			 elementDictionary.put(name, element);
		 }
		 
		 else {
			 
			 throw new Exception("Element already exist with same key name in the element Dictionary");
			 
		 }
   }
	 
 public void addInElementsListDictionary(String name, List<WebElement> list) throws Exception {
        
		 
		 if(!elementsListDictionary.containsKey(name)){
			 elementsListDictionary.put(name, list);
		 }
		 
		 else {
			 
			 throw new Exception("Element already exist with same key name in the element Dictionary");
			 
		 }
   }
	 
	 public void elementAdder() {
		try {
			addInElementDictionary("cars", homePage.cars);
			addInElementDictionary("search cars", homePage.searchCarsButton);
			addInElementDictionary("cars hire location", carHirePage.locationTextbox);
			addInElementsListDictionary("cars hire location suggestion", carHirePage.carlocationSuggestion);
			addInElementDictionary("car hire start date", carHirePage.carHireStartDate);
			addInElementDictionary("car hire from time dropdown", carHirePage.carHireFromTimeDropdown);
			addInElementsListDictionary("car hire from time", carHirePage.carHireFromTimeList);
			addInElementDictionary("car hire to time dropdown", carHirePage.carHireToTimeDropdown);
			addInElementsListDictionary("car hire to time", carHirePage.carHireToTimeList);
			addInElementDictionary("car hire end date", carHirePage.carHireEndDate);
			addInElementDictionary("car hire search button", carHirePage.searchButton);
			addInElementDictionary("return trip dropdown", homePage.returnTripDropdown);
			addInElementsListDictionary("return trip suggestion", homePage.returnTripSuggestion);
			addInElementDictionary("passenger button", homePage.passengerButton);
			addInElementDictionary("adult textbox", homePage.adultTextbox);
			addInElementDictionary("children textbox", homePage.childrenTextbox);
			addInElementDictionary("infants textbox", homePage.infantsTextbox);
			addInElementDictionary("passenger confirm button", homePage.passengerConfirmButton);
			addInElementDictionary("from flight location button", homePage.fromFlightLocationButton);
			addInElementDictionary("from flight location textbox", homePage.fromFlightLocationTextBox);
			addInElementDictionary("to flight location button", homePage.toFlightLocationButton);
			addInElementDictionary("to flight location textbox", homePage.toFlightLocationTextBox);
			addInElementsListDictionary("flight location suggestion", homePage.flightLocationSuggestion);
			addInElementDictionary("flight date button", homePage.flightDateButton);
			addInElementDictionary("search flight button", homePage.searchFlighButton);
			addInElementDictionary("hotels and airbnb button", homePage.hotelAndAirBnb);
			addInElementDictionary("hotels radio button", homePage.hotelsRadioButton);
			addInElementDictionary("airbnb radio button", homePage.airBnbRadioButton);
			addInElementDictionary("airbnb location button", homePage.airBnbLocationButton);
			addInElementDictionary("airbnb location textbox", homePage.airBnbLocationTextbox);
			addInElementsListDictionary("airbnb location suggestion", homePage.airBnbLocationSuggestion);
			addInElementDictionary("airbnb date button", homePage.airBnbdateButton);
			addInElementDictionary("airbnb confirm date button", homePage.confirmAirBnbDateButton);
			addInElementDictionary("who button", homePage.whoButton);
			addInElementDictionary("done button", homePage.doneButton);
			addInElementDictionary("search airbnb button", homePage.searchAirBnbButton);
			addInElementDictionary("holidays button", homePage.holidays);
			addInElementDictionary("traveller button", homePage.travellerButton);
			addInElementDictionary("confirm traveller button", homePage.confirmTavellerButton);
			addInElementDictionary("from holidays location button", homePage.fromHolidayLocationButton);
			addInElementDictionary("from holidays location textbox", homePage.fromHolidayLocationTextbox);
			addInElementDictionary("to holidays location button", homePage.toHolidayLocationButton);
			addInElementDictionary("to holidays location textbox", homePage.toHolidayLocationTextbox);
			addInElementsListDictionary("holidays location suggestion", homePage.holidayLocationSuggestions);
			addInElementDictionary("holidays dates button", homePage.holidayDatesButton);
			addInElementDictionary("confirm holidays button", homePage.confirmHolidayDatesButton);
			addInElementDictionary("search holidays button", homePage.searchHolidayButton);
			
			
			
		} catch (Exception e) {
		
			e.printStackTrace();
		} 
		
		 
		 
	 }
	 
	 
	
	 
	 
	 
	 

}
