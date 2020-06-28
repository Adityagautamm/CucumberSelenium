package com.ozbargain.qa.pages;



import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basics {
	
	WebDriver driver;
	FluentWait<WebDriver> fluentWait;
	Wait wait;
	JavascriptExecutor executor;
	
	 Actions builder;
	 public Basics(WebDriver driver, WebDriverWait wait) {
		// TODO Auto-generated constructor stub
		 this.driver=driver;
		 this.wait= wait;
		 fluentWait = new FluentWait<WebDriver>(driver);
		 builder= new Actions(driver);
		 executor = (JavascriptExecutor) driver;
	
	}
	 
	
	    public void waitForElementToBeClickable(WebElement element, int timeout, int pollTimeout) {
	        fluentWait.withTimeout(Duration.ofSeconds(timeout));
	        fluentWait.pollingEvery(Duration.ofSeconds(pollTimeout));
	        fluentWait.ignoring(NoSuchElementException.class);
	        fluentWait.until(ExpectedConditions.elementToBeClickable(element));
	        fluentWait.until(ExpectedConditions.visibilityOf(element));
	        
	    }
	 
	 
	 public void waitForElementsToBeVisible(List<WebElement> elements,  int timeout, int pollTimeout) {
		   
		        fluentWait.withTimeout(Duration.ofSeconds(timeout)); 
		        fluentWait.pollingEvery(Duration.ofSeconds(pollTimeout));
		        fluentWait.ignoring(NoSuchElementException.class);
		        fluentWait.until(ExpectedConditions.visibilityOfAllElements(elements));
		        
		    }
 
	



	public String getPageTitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}

	
	public String getPageHeader( WebElement element) {
		// TODO Auto-generated method stub
		return element.getText();
	}

	

	
	public void waitForPageTitle(String title) {
		try {
			wait.until(ExpectedConditions.titleContains(title));
			
			
		} catch (Exception e) {
			System.out.println("Some error occured while waiting for element");
		}
	}

	public void enterText(WebElement element, String text) {
		// TODO Auto-generated method stub
		element.clear();
		element.sendKeys(text);
	}
	
	public String getText(WebElement element) {
		// TODO Auto-generated method stub
		 return element.getText();
	}
	
	public void click(WebElement element)  {
		
		waitForElementToBeClickable(element, 10, 1);
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
		
	}
	
public String getURL()  {
		
		return driver.getCurrentUrl();
	}
	
	/*public void click(String element) {
		// TODO Auto-generated method stub
		System.out.println(element);
	} */
	
	public void mouseOverElement(WebElement element) {
		// TODO Auto-generated method stub
		builder.moveToElement(element);
	}

	
	public void performAction() {
		// TODO Auto-generated method stub
		builder.build().perform();
	}
	
	public void switchToFrame(int index) {
		driver.switchTo().frame(0);
		
	}
	
	public Set<String> getWindows() {
		return driver.getWindowHandles();
		
	}
	
	
	
}
