package com.indra.action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.indra.model.SupportModel;

public class SupportAction extends SupportModel {

	WebDriver driver;

	public SupportAction(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Support() {
		CommonCodes();
		InputAction(searchBox, "Airport Tax");
		ClickAction(searchButton);
	}
	private void CommonCodes() {
		ClickAction(supportLinkText);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		for (String childTab : driver.getWindowHandles()) {
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
