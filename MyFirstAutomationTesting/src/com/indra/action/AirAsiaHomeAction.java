package com.indra.action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.indra.model.AirAsiaHomeModel;

public class AirAsiaHomeAction extends AirAsiaHomeModel {
	
	WebDriver driver;
	
	public AirAsiaHomeAction(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Flights() {
		ClickAction(flightTab);
		ClickAction(fromRouteField);
		ClearInputField(fromRouteField);
		InputAction(fromRouteField, "Manila (MNL)");
		InputAction(toRouteField, "Kuala Lumpur");
		ClickAction(departureDateField);
		ClickAction(departDateCalendar);
		ClickAction(returnDateCalendar);
		InputAction(promoCodeField, "VA1234");
		ClickAction(searchFlightBtn);
	}
	
	public void Hotels() {
		ClickAction(hotelTab);
		InputAction(destinationField, "Kuala Lumpur");
		ClickAction(checkInField);
		ClickAction(checkInDate);
		ClickAction(checkoutDate);
		ClickAction(hotelsContainer);
		ClickAction(roomAdultComboBox);
		ClickMultipleTimesAction(addAdult, 2);
		ClickMultipleTimesAction(addChildren, 5);
		ClickMultipleTimesAction(addInfant, 3);
		ClickAction(searchButton);
	}
	
	public void Snap() {
		ClickAction(snapTab);
		ClickAction(fromRouteField);
		ClearInputField(fromRouteField);
		InputAction(fromRouteField, "Manila (MNL)");
		InputAction(toRouteField, "Kuala Lumpur");
		ClickAction(departureDateField);
		ClickAction(departDateCalendar);
		ClickAction(returnDateCalendar);
		InputAction(promoCodeField, "VA1234");
		ClickAction(searchFlightBtn);
	}
	
	public void Shop() {
		ClickAction(shopTab);
	}
	
	public void Activites() {
		ClickAction(activitiesTab);
		InputAction(activityField, "test activities");
		ClickAction(searchActivityButton);
	}
	
	public void Insurance() {
		ClickAction(insuranceTab);
	}
	
	public void Deals() {
		
	}
	
	private void ClickAction(WebElement webElement) {
		webElement.click();
	}
	
	private void ClickMultipleTimesAction(WebElement webElement, int times) {
		for(int i = 0; i < times; i++) {
			webElement.click();
		}
	}
	
	private void InputAction(WebElement webElement, String keys) {
		webElement.sendKeys(keys);
	}
	
	private void ClearInputField(WebElement webElement) {
		webElement.sendKeys(Keys.BACK_SPACE);
	}
	
	
}
