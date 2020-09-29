package com.indra.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.indra.model.AirAsiaHomeModel;

public class AirAsiaHomeAction extends AirAsiaHomeModel {
	
	WebDriver driver;
	
	public AirAsiaHomeAction(WebDriver driver) {
		this.driver = driver;
	}
	
	public void Flights() {
		ClickAction(flightTab);
		ClickAction(fromRouteField);
	}
	
	public void Hotels() {
		ClickAction(hotelTab);
	}
	
	public void Snap() {
		ClickAction(snapTab);
	}
	
	public void Shop() {
		ClickAction(shopTab);
	}
	
	public void Activites() {
		ClickAction(activitiesTab);
	}
	
	public void Insurance() {
		ClickAction(insuranceTab);
	}
	
	public void Deals() {
		
	}
	
	private void ClickAction(WebElement webElement) {
		webElement.click();
	}
}
