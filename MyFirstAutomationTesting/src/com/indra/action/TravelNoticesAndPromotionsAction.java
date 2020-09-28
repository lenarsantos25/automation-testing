package com.indra.action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.indra.model.TravelNoticesAndPromotionsModel;

public class TravelNoticesAndPromotionsAction extends TravelNoticesAndPromotionsModel {
	WebDriver driver;

	public TravelNoticesAndPromotionsAction(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void FirstPromotion() {
		String parent = driver.getWindowHandle();
		ClickAction(firstCard);
		CommonCodes(parent);
		ClickAction(secondCard);
		CommonCodes(parent);
		ClickAction(thirdCard);
		CommonCodes(parent);
		ClickAction(fourthCard);
		CommonCodes(parent);
	}

	private void ClickAction(WebElement element) {
		element.click();
	}

	private void CommonCodes(String parent) {
		for (String childTab : driver.getWindowHandles()) {
			driver.switchTo().window(childTab);
		}
		driver.close();
		driver.switchTo().window(parent);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

}
