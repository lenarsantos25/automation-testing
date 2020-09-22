package com.indra.model;

import org.openqa.selenium.By;

public class LoginModel {
	
	public By loginSignUpButton = By.id("loginModal");
	public By buttonTop = By.className("buttontop");
	public By allowBtnId = By.id("wzrk-confirm");
	
	public By usernameId = By.id("sso-login-email-input");
	public By passwordId = By.id("sso-login-password-input");
	public By loginButton = By.className("sso-button");
	
	public By forgotEmail = By.id("sso-forgot-password-email-input");
	public By forgotPassLink = By.linkText("Forgot password?");
	
}
