package com.indra.action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.indra.model.CheckinModel;

public class CheckinAction extends CheckinModel {
	WebDriver driver;

	public CheckinAction(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void CheckIn() {
		CommonCodes();
		InputAction(bookingNumberId, "12345");
		InputAction(surnameId, "surname");
		ClickAction(searchBtn);
	}
	
	private void CommonCodes() {
		ClickAction(checkInLinkText);
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
