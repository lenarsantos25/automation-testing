package com.indra.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.indra.model.LoginModel;

public class LoginAction extends LoginModel {

	WebDriver driver;

	public LoginAction(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private void inputUsernameAndPassword(String username, String password) {
		usernameId.sendKeys(username);
		passwordId.sendKeys(password);
	}

	public void LoginAirasia(String username, String pass) {
		WaitUntilTheElementIsVisible(buttonTop, 10);
		if (!buttonTop.isDisplayed()) {
			loginSignUpButton.click();
		} else {
			buttonTop.click();

		}

		WaitUntilTheElementIsVisible(allowBtnId, 10);
		if (!allowBtnId.isDisplayed()) {
			this.inputUsernameAndPassword(username, pass);
			ClickAction(loginButton);
		} else {
			allowBtnId.click();
			this.inputUsernameAndPassword(username, pass);
			ClickAction(loginButton);
		}

	}

	public void ForgotPassword() {
		WaitUntilTheElementIsVisible(buttonTop, 10);
		if (!buttonTop.isDisplayed()) {
			loginSignUpButton.click();
		} else {
			buttonTop.click();

		}

		WaitUntilTheElementIsVisible(allowBtnId, 10);
		if (!allowBtnId.isDisplayed()) {
			ClickAction(forgotPassLink);
		} else {
			allowBtnId.click();
			ClickAction(forgotPassLink);

			WaitUntilTheElementIsVisible(forgotEmail, 5);
			InputAction(forgotEmail, "test@gmail.com");
			ClickAction(loginButton);
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
