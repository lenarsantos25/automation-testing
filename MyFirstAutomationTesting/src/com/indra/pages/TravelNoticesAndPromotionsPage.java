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

import com.indra.action.TravelNoticesAndPromotionsAction;

public class TravelNoticesAndPromotionsPage {
	WebDriver driver;
	ChromeOptions options;
	String baseURL = "https://www.airasia.com/en/gb";
	String path = "E:\\ChromeDriver\\chromedriver.exe";

	TravelNoticesAndPromotionsAction tnpAction;

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

	@Test(priority=1)
	public void FirstPromotionPage() {
		tnpAction = new TravelNoticesAndPromotionsAction(driver);
		PageFactory.initElements(driver, TravelNoticesAndPromotionsPage.this);
		tnpAction.FirstPromotion();
	}
	

	@AfterMethod
	public void CloseTabs() {
		driver.close();
		driver.quit();
	}

	@AfterTest
	public void ExitDriver() {
		driver.quit();
	}
}
