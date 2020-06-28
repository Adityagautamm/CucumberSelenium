package Steps;

import static org.testng.Assert.assertTrue;

import java.io.Console;
import java.util.List;
import java.util.Set;
import java.time.Month;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import com.ozbargain.qa.base.TestBase;

import cucumber.api.java.en.Given;
import org.junit.Assert;


public class homePageSteps extends TestBase {
	
	 WebElement localElement = null;
	 List<WebElement> localElements =  null;
	
	
//	 //Reg Exp:
//	 //1. \"([^\"]*)\"
//	 //2. \"(.*)\"
	

//@Given("^user clicks on \"(.*)\" link$")

@Given("^user clicks on \"(.*)\" (?:link|button)$")
//public void user_clicks_on_element_link(String element)  {
public void user_clicks_on(String element) throws Exception  {


	//allPageDictionary.basics.click(allPageDictionary.homePage.cars);
	if (allPageDictionary.searchInElementDictionary(element))
	{
		allPageDictionary.basics.click(
		allPageDictionary.getFromElementDictionary(element));
	}
	else {
		
		throw new Exception("element not present in dictionary");
	}
		
	
} 


@Given("^user enters \"([^\"]*)\" on \"([^\"]*)\" textbox$")
public void user_enters_on_textbox(String text, String element) throws Exception  {


	if (allPageDictionary.searchInElementDictionary(element))
	{
		allPageDictionary.basics.enterText(
		allPageDictionary.getFromElementDictionary(element), text);
	}
	else {
		
		throw new Exception("element not present in dictionary");
	}
	

}

@Given("^user is on page with url like \"([^\"]*)\"$")
public void user_is_on_page_with_url_like(String expectedUrl)  {

	Set<String> allWindows= allPageDictionary.basics.getWindows();
	Boolean notifier= false;
	for(String currentWindow : allWindows){
		   driver.switchTo().window(currentWindow);
			
if (allPageDictionary.basics.getURL().contains(expectedUrl)) {
	notifier= true;	
}

		}
		
		Assert.assertTrue(notifier);
	}



@Given("^user selects \"([^\"]*)\" from \"([^\"]*)\" dropdown$")
public void user_selects_from_dropdown(String text, String element) throws Exception  {


	if (allPageDictionary.searchInElementsListDictionary(element))
	{
		Thread.sleep(1000);
		Boolean clicked= false;
	   localElements = allPageDictionary.getFromElementsListDictionary(element);
	    allPageDictionary.basics.waitForElementsToBeVisible(localElements, 5, 1); // to wait for element to be visible
	   
		for (WebElement ele : localElements){
		 String myText = ele.getText();
		 if (myText.contains(text)) {
			allPageDictionary.basics.click(ele);
			clicked=true;
			break;
	}
		 }
		
		 if(!clicked) {
				throw new Exception("suggestion text doesnt exist in suggestions dropdown");
						
		}
		
		 
		}
	else {
		
		throw new Exception("element not present in dictionary");
	}
	

}


@Given("^user select date \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" from (?:holidays|hotelandairbnb) calender$")
public void user_select_date_from_holidays_calender(String date, String month, String year) throws Throwable {
	
 
	WebElement month1= driver.findElement(By.xpath("(//time/div[1]/div[1]/h3)[1]"));
	WebElement month2= driver.findElement(By.xpath("(//time/div[1]/div[1]/h3)[2]"));
	WebElement nextButton= driver.findElement(By.xpath("//time[2]/div[1]/div[1]/button"));
	String monthString= null;
	//to convert month name to month number, 
	// and convert to string as I need to use it in xpath
    int monthNumber= Month.valueOf(month.toUpperCase()).getValue();
	if(monthNumber>10) { 
	monthString= Integer.toString(monthNumber);
	}
	else {
		
		monthString="0"+ Integer.toString(monthNumber);
			
	}
	
	boolean notifier= false;
	
	while(!notifier) {
		
		allPageDictionary.basics.waitForElementToBeClickable(month1, 4, 1);
		if (allPageDictionary.basics.getText(month1).contains(month) &&
				allPageDictionary.basics.getText(month1).contains(year)) {
			WebElement date2 = driver.findElement(By.xpath("//button/time[contains(@datetime,'"+year+"-"+monthString+"-"+date+"')]"));
			
				allPageDictionary.basics.click(date2);
					
			notifier=true;
			}
		if (allPageDictionary.basics.getText(month2).contains(month) &&
				allPageDictionary.basics.getText(month2).contains(year)) {
			WebElement date2 = driver.findElement(By.xpath("//button/time[contains(@datetime,'"+year+"-"+monthString+"-"+date+"')]"));
			
				allPageDictionary.basics.click(date2);
					
			notifier=true;
			}
		
		else{
			
			allPageDictionary.basics.click(nextButton);
		}
	}
		
	
}



@Given("^user select date \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" from calender$")
public void user_select_date_from_calender(String date, String month3, String year) throws Throwable {
	
 
	WebElement month1= driver.findElement(By.xpath("(//*[contains(@ng-bind,'getMonthLabel(month)')])[1]"));
	WebElement month2= driver.findElement(By.xpath("(//*[contains(@ng-bind,'getMonthLabel(month)')])[2]"));
	WebElement nextButton= driver.findElement(By.xpath("//button[contains(@data-comp-id,'ct-calendar-nav-next')]"));

	boolean month= false;
	
	while(!month) {
		
		allPageDictionary.basics.waitForElementToBeClickable(month1, 4, 1);
		if (allPageDictionary.basics.getText(month1).contains(month3) &&
				allPageDictionary.basics.getText(month1).contains(year)) {
			WebElement date2 = driver.findElement(By.xpath("//td[@aria-label='"+date+" "+month3+" "+year+"' and @data-enabled='true']"));
			
				allPageDictionary.basics.click(date2);
					
			month=true;
			}
		
		if (allPageDictionary.basics.getText(month2).contains(month3) &&
				allPageDictionary.basics.getText(month2).contains(year)) {
			WebElement date2 = driver.findElement(By.xpath("//td[@aria-label='"+date+" "+month3+" "+year+"' and @data-enabled='true']"));
			allPageDictionary.basics.click(date2);
							
					month=true;
					}
		
		
		else{
			
			allPageDictionary.basics.click(nextButton);
		}
	}
		
	
}

@Given("^user select (?:return|departure) date \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" from flight calender$")
public void user_select_return_date_from_flight_calender(String date, String month, String year) throws Throwable {
	
//if you put givenMonth or web elements outside loop, system wont find them again after the while
// loop go another loop, so make sure to re find them by instantiating the element inside the loop
	

	boolean notifier= false;
	
	while(!notifier) {
		List<WebElement> givenMonth= driver.findElements(By.xpath("//div[contains(@data-auto,'monthScroller')]/div/div/button"));
		WebElement nextButton= driver.findElement(By.xpath("(//div[contains(@data-auto,'monthScroller')]/div/button)[2]"));

		allPageDictionary.basics.waitForElementsToBeVisible(givenMonth, 5, 1);
		
		for (WebElement monthElement : givenMonth){
			 String monthText = monthElement.getText();
			 if (monthText.contains(month) && monthText.contains(year) ) {
				allPageDictionary.basics.click(monthElement);
			//	notifier= true;
				
			Thread.sleep(2000);
			// as date element is only visible when one clicks on the month, if one 
			// doesn't instantiate or find element once month is clicked then he gets
			//stateElementException
			List<WebElement> givenDate= driver.findElements(By.xpath("//*[contains(@data-auto,'calendarGrid')]/div/button[contains(@tabindex,'0')]/div/div"));
				
				for (WebElement dateElement : givenDate){
					try {
					 String dateText = dateElement.getText();
					 //System.out.println(dateText);
					 if (dateText.contains(date) ) {
						
						 allPageDictionary.basics.click(dateElement);
						 notifier= true;
						 break;
					 }
					}
					
					catch(StaleElementReferenceException e) {
						System.out.print("element is not on the page, update your element or re instantiate it");
					}
					
				}  
				
		}
			 if (notifier) {
				break;
				 }	 
			 
			 
			 }
			 
		 if (!notifier) {
			allPageDictionary.basics.click(nextButton);
		 }
		 
		 if (notifier) {
				break;
				 }
}

}
}