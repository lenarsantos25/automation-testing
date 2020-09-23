package com.indra.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.indra.action.MyBookingsAction;

public class MyBookingsPage {
	WebDriver driver;
	
	String baseURL = "https://www.airasia.com/en/gb";
	String path = "E:\\ChromeDriver\\chromedriver.exe";

	MyBookingsAction mybookingsAction;

	@BeforeTest
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", path);
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		driver = new ChromeDriver();
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
	
	@AfterMethod
	public void QuitDriver() {
		driver.close();
		driver.quit();
	}
	
	@AfterTest
	public void QuitTest() {
		driver.quit();
	}
}
