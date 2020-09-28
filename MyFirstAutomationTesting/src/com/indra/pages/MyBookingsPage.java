package com.indra.pages;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.indra.action.MyBookingsAction;

public class MyBookingsPage {
	WebDriver driver;
	ChromeOptions options;
	String baseURL = "https://www.airasia.com/en/gb";
	String path = "E:\\ChromeDriver\\chromedriver.exe";

	MyBookingsAction mybookingsAction;

	@BeforeTest
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", path);
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
	}

	@BeforeMethod
	public void LaunchURL() {
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@Test (priority=1)
	public void  FlightTabPage() {
		mybookingsAction = new MyBookingsAction(driver);
		PageFactory.initElements(driver, MyBookingsPage.class);
		mybookingsAction.FlightTab();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Test (priority=2)
	public void HotelTabPage() {
		mybookingsAction = new MyBookingsAction(driver);
		PageFactory.initElements(driver, MyBookingsPage.class);
		mybookingsAction.HotelTab();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Test (priority=3)
	public void RetrievePage() {
		mybookingsAction = new MyBookingsAction(driver);
		PageFactory.initElements(driver, MyBookingsPage.class);
		mybookingsAction.RetrieveBooking();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void CloseTabs() {
		driver.close();
		driver.quit();
	}

	@AfterTest
	public void ExitDriver() {
		driver.quit();
	}
}
