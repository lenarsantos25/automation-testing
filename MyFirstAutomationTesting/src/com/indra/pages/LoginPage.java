package com.indra.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.indra.action.LoginAction;

public class LoginPage {
	WebDriver driver;
	WebDriverWait wait;
	WebElement popUpLoginButton;
	
	String baseURL = "https://www.airasia.com/en/gb";
	String path = "E:\\ChromeDriver\\chromedriver.exe";

	LoginAction loginAction;
	
	@BeforeTest
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", path);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	@Test (priority=1)
	public void loginPage() {
		loginAction = new LoginAction(driver);
		loginAction.LoginAirasia("sample", "password123");
	}
	
	@Test (priority=2)
	public void forgotPassword() {
		loginAction = new LoginAction(driver);
		loginAction.ForgotPassword();
	}
	
	@AfterMethod
	public void quitDriver() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.close();
	}
	
	@AfterTest
	public void quitTest() {
		driver.quit();
	}
	

	
}
