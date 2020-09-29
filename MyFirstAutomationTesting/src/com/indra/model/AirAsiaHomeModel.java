package com.indra.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AirAsiaHomeModel {

	//Flights Tab
	@FindBy(xpath="//p[contains(text(), 'Flights')]")
	public WebElement flightTab;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-13awgt0 r-11yh6sk']/input)[1]")
	public WebElement fromRouteField;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-13awgt0 r-11yh6sk']/input)[2]")
	public WebElement toRouteField;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-13awgt0 r-11yh6sk']/input)[3]")
	public WebElement departDateField;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-13awgt0 r-11yh6sk']/input)[4]")
	public WebElement returnDateField;
	
	@FindBy(id="aa-web-search-button")
	public WebElement searchFlightBtn;
	
	
	//Hotel Tab
	@FindBy(xpath="//p[contains(text(), 'Hotels')]")
	public WebElement hotelTab;
	
	@FindBy(xpath="//p[contains(text(), 'SNAP')]")
	public WebElement snapTab;
	
	@FindBy(xpath="//p[contains(text(), 'Shop')]")
	public WebElement shopTab;
	
	@FindBy(xpath="//p[contains(text(), 'Activities')]")
	public WebElement activitiesTab;
	
	@FindBy(xpath="//p[contains(text(), 'Insurance')]")
	public WebElement insuranceTab;
	
	@FindBy(xpath="//p[contains(text(), 'Deals')]")
	public WebElement dealsTab;
	
	
}
