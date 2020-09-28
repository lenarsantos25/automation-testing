package com.indra.action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.indra.model.MyBookingsModel;

public class MyBookingsAction extends MyBookingsModel {

	WebDriver driver;
	
	public MyBookingsAction(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void FlightTab() {
		CommonCodes();
		ClickAction(departureCity);
		ClickAction(departureComboBox);
		InputAction(bookingNumber, "234111");
		InputAction(lastName, "Sample surname");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		ClickAction(submitBtn);
	}
	
	public void HotelTab() {
		CommonCodes();
		ClickAction(hotelTab);
		InputAction(orderNumber, "112345");
		InputAction(lastName, "surname");
		InputAction(emailAddress, "test@gmail.com");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		ClickAction(submitBtn);
	}
	
	public void RetrieveBooking() {
		CommonCodes();
		ClickAction(retrieveLinkText);
		InputAction(retrieveEmailId, "test@gmail.com");
		InputAction(retrievePassId, "password123");
		ClickAction(submitButtonId);
	}
	private void CommonCodes() {
		ClickAction(myBookingsLinkText);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		for(String childTab: driver.getWindowHandles()) {
			driver.switchTo().window(childTab);
		}
	}
	
	private void ClickAction(WebElement element) {
		element.click();
	}
	
	private void InputAction(WebElement element, String keys) {
		element.sendKeys(keys);
	}
}
