package com.ozbargain.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.POIXMLProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ozbargain.qa.pages.AllPageDictionary;
import com.ozbargain.qa.util.EventListenerClass;
import com.ozbargain.qa.util.TestUtil;


public class TestBase {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static EventListenerClass eventListener;
	public static AllPageDictionary allPageDictionary;
	

	public static void initialization() {

		//Properties file set up
		prop = new Properties();
		System.out.println("file creating");
		
		try {
			FileInputStream ip= new FileInputStream(
			"C:\\Users\\Aditya Gautam\\eclipse-workspace\\HybridPageObjectModel\\src\\main\\java\\com\\ozbargain\\qa\\config\\config.properties");
			prop.load(ip);
		}
		
	
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	//Setting up Driver
		
		String browserName = prop.getProperty("browser");
		
		if (browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aditya Gautam\\Desktop\\curious fella\\Automation\\webdriver\\chrome\\chromedriver.exe");
			                                               
			 driver= new ChromeDriver();
		}
		
		wait= new WebDriverWait(driver, 15);
		
		e_driver= new EventFiringWebDriver(driver);
		// Now create object of  EventListnerHandler to register it with 
		//EventFiringWebDriver
		eventListener= new EventListenerClass();
		e_driver.register(eventListener);
		driver=e_driver;
		
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 //dynamic wait
		 driver.manage().timeouts().pageLoadTimeout(TestUtil.PageTimout, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(TestUtil.ImplicitWAiT, TimeUnit.SECONDS);
		 
		driver.get(prop.getProperty("url"));
		
		
		// Instantiating the Page
		allPageDictionary= new AllPageDictionary(driver,wait);
		
		
	}
	
	
	public static void tearDown() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
	
	

}
