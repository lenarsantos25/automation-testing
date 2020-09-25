package com.indra.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightStatusModel {

	@FindBy(linkText="Flight status")
	public WebElement flightStatusLinkText;
	
	// Search by Flight Number
	@FindBy(id="flightNumber")
	public WebElement flightNumber;
	
	@FindBy(xpath="//button[contains(text(), 'Find flights')]")
	public WebElement flightButton;
	
	// Search by route
	@FindBy(xpath="//li[contains(text(), 'Search by route')]")
	public WebElement searchByRouteTab;
	
	@FindBy(id="origin-autocomplete")
	public WebElement originRoute;
	
	@FindBy(xpath="//aa-option[@id='aa-option-172']/div")
	public WebElement labelText;
	
	@FindBy(id="dest-autocomplete")
	public WebElement destRoute;
	
}
