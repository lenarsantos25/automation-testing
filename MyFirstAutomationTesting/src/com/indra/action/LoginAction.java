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

	public void SignUpAirasia(String email, String password) {
		WaitUntilTheElementIsVisible(buttonTop, 10);
		if (!buttonTop.isDisplayed()) {
			loginSignUpButton.click();
		} else {
			buttonTop.click();
		}
		ClickAction(signupTab);
		emailId.sendKeys(email);
		passId.sendKeys(password);
		ClickAction(signupButton);
	}

	public void LoginAirasia(String username, String pass) {
		WaitUntilTheElementIsVisible(buttonTop, 10);
		if (!buttonTop.isDisplayed()) {
			loginSignUpButton.click();
		} else {
			buttonTop.click();
		}
		inputUsernameAndPassword(username, pass);
		ClickAction(loginButton);
	}

	public void ForgotPassword() {
		WaitUntilTheElementIsVisible(buttonTop, 10);
		if (!buttonTop.isDisplayed()) {
			loginSignUpButton.click();
		} else {
			buttonTop.click();

		}

		ClickAction(forgotPassLink);

		WaitUntilTheElementIsVisible(forgotEmail, 5);
		InputAction(forgotEmail, "test@gmail.com");
		ClickAction(loginButton);

	}

	public void LoginWithFacebook() {
		WaitUntilTheElementIsVisible(buttonTop, 10);
		if (!buttonTop.isDisplayed()) {
			loginSignUpButton.click();
		} else {
			buttonTop.click();

		}
		ClickAction(loginWithFacebook);

	}

	public void LoginWithGoogle() {
		WaitUntilTheElementIsVisible(buttonTop, 10);
		if (!buttonTop.isDisplayed()) {
			loginSignUpButton.click();
		} else {
			buttonTop.click();

		}
		ClickAction(loginWithGoogle);

	}

	public void LoginWithWeChat() {
		WaitUntilTheElementIsVisible(buttonTop, 10);
		if (!buttonTop.isDisplayed()) {
			loginSignUpButton.click();
		} else {
			buttonTop.click();

		}
		ClickAction(loginWithWeChat);

	}

	private void inputUsernameAndPassword(String username, String password) {
		usernameId.sendKeys(username);
		passwordId.sendKeys(password);
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
