package com.indra.action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.indra.model.FlightStatusModel;

public class FlightStatusAction extends FlightStatusModel{

	WebDriver driver;

	public FlightStatusAction(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void SearchFlightNumber() {
		CommonCodes();
		InputAction(flightNumber, "AK 6117");
		ClickAction(flightButton);
	}
	
	public void SearchByRoute() {
		CommonCodes();
		ClickAction(searchByRouteTab);
		ClickAction(originRoute);
		InputAction(originRoute, "a");
		WaitUntilTheElementIsVisible(labelText, 2);
		ClickAction(labelText);
	}
	
	private void CommonCodes() {
		ClickAction(flightStatusLinkText);
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
	
	private void WaitUntilTheElementIsVisible(WebElement element, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
