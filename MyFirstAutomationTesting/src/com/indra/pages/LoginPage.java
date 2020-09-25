package com.indra.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.indra.action.LoginAction;

public class LoginPage {
	WebDriver driver;
	ChromeOptions options;
	String baseURL = "https://www.airasia.com/en/gb";
	String path = "E:\\ChromeDriver\\chromedriver.exe";

	LoginAction loginAction;

	@BeforeTest
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", path);
	}

	@BeforeMethod
	public void LaunchURL() {
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@Test(priority = 1)
	public void LoginPages() {
		loginAction = new LoginAction(driver);
		PageFactory.initElements(driver, LoginPage.class);
		loginAction.LoginAirasia("sample", "password123");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test(priority = 2)
	public void ForgotPassword() {
		loginAction = new LoginAction(driver);
		PageFactory.initElements(driver, LoginPage.class);
		loginAction.ForgotPassword();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void CloseTabs() {
		driver.close();
	}

	@AfterTest
	public void ExitDriver() {
		driver.quit();
	}

}
