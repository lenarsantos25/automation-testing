package com.indra.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckinModel {

	@FindBy(linkText="Check-in")
	public WebElement checkInLinkText;
	
	@FindBy(id="bookingNumberInput")
	public WebElement bookingNumberId;
	
	@FindBy(id="surnameInput")
	public WebElement surnameId;
	
	@FindBy(xpath="//button[@class='waves-effect waves-light']")
	public WebElement searchBtn;
}
