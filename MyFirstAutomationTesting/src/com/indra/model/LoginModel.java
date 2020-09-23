package com.indra.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginModel {
	
	@FindBy(id="loginModal")
	public WebElement loginSignUpButton;
	
	@FindBy(className="buttontop")
	public WebElement buttonTop;
	
	@FindBy(id="wzrk-confirm")
	public WebElement allowBtnId;
	
	@FindBy(id="sso-login-email-input")
	public WebElement usernameId;
	
	@FindBy(id="sso-login-password-input")
	public WebElement passwordId;
	
	@FindBy(className="sso-button")
	public WebElement loginButton;
	
	@FindBy(id="sso-forgot-password-email-input")
	public WebElement forgotEmail;
	
	@FindBy(linkText="Forgot password?")
	public WebElement forgotPassLink;
	
	

}
