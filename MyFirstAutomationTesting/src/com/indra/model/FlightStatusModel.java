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
	
	@FindBy(xpath="(//div[@class='dropdown-container']/ul/aa-option/div)[2]")
	public WebElement labelText;
	
	@FindBy(xpath="(//div[@class='container']/button)[2]")
	public WebElement routeSearchButton;
	
	@FindBy(id="dest-autocomplete")
	public WebElement destRoute;
	
}
