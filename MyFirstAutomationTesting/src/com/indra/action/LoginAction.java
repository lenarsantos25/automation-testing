package com.indra.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.indra.model.LoginModel;

public class LoginAction extends LoginModel {

	WebDriver driver;
	WebElement popUpLoginButton, popUpAllowButton, forgotPassLinkText;

	public LoginAction(WebDriver driver) {
		this.driver = driver;
	}

	private void inputUsernameAndPassword(String username, String password) {
		WebElement usernameElement = driver.findElement(usernameId);
		usernameElement.sendKeys(username);

		WebElement passwordElement = driver.findElement(passwordId);
		passwordElement.sendKeys(password);
	}

	private void clickButton(WebElement element) {
		element.click();
	}

	private void inputEmail(WebElement element, String email) {
		element.sendKeys(email);
	}

	public void LoginAirasia(String username, String pass) {
		WaitUntilTheElementIsVisible(driver.findElement(buttonTop), 10);
		popUpLoginButton = driver.findElement(buttonTop);
		if (!popUpLoginButton.isDisplayed()) {
			driver.findElement(loginSignUpButton).click();
		} else {
			popUpLoginButton.click();

		}

		WaitUntilTheElementIsVisible(driver.findElement(allowBtnId), 10);
		popUpAllowButton = driver.findElement(allowBtnId);
		if (!popUpAllowButton.isDisplayed()) {
			this.inputUsernameAndPassword(username, pass);
			this.clickButton(driver.findElement(loginButton));
		} else {
			popUpAllowButton.click();
			this.inputUsernameAndPassword(username, pass);
			this.clickButton(driver.findElement(loginButton));
		}

	}

	public void ForgotPassword() {
		WaitUntilTheElementIsVisible(driver.findElement(buttonTop), 10);
		popUpLoginButton = driver.findElement(buttonTop);
		if (!popUpLoginButton.isDisplayed()) {
			driver.findElement(loginSignUpButton).click();
		} else {
			popUpLoginButton.click();

		}

		WaitUntilTheElementIsVisible(driver.findElement(allowBtnId), 10);
		popUpAllowButton = driver.findElement(allowBtnId);
		if (!popUpAllowButton.isDisplayed()) {
			forgotPassLinkText = driver.findElement(forgotPassLink);
			forgotPassLinkText.click();
		} else {
			popUpAllowButton.click();
			forgotPassLinkText = driver.findElement(forgotPassLink);
			forgotPassLinkText.click();

			WaitUntilTheElementIsVisible(driver.findElement(forgotEmail), 5);
			inputEmail(driver.findElement(forgotEmail), "test@gmail.com");
			this.clickButton(driver.findElement(loginButton));
		}

	}

	private void WaitUntilTheElementIsVisible(WebElement element, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
