package Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginClass {

	Boolean isPopUp;

	public void IncorrectLogin(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		WebElement popUpModal = driver.findElement(By.cssSelector("div[class='wrapper desktop']"));
		// popup modal
		if (popUpModal.isDisplayed()) {
			driver.findElement(By.className("buttontop")).click();
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("div[class='wzrk-alert wiz-show-animate']")).isDisplayed();
			driver.findElement(By.id("wzrk-confirm")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("sso-login-email-input")).sendKeys("sample");
			driver.findElement(By.id("sso-login-password-input")).sendKeys("password");
			//show password
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("mat-icon[class*='mat-icon]'")).click();
//			driver.findElement(By.className("sso-button")).click();
			// Button Click
		} else {
			driver.findElement(By.id("loginModal")).click();
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("div[class='wzrk-alert wiz-show-animate']")).isDisplayed();
			driver.findElement(By.id("wzrk-confirm")).click();
		}
	}

	public void ForgotPassword(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		WebElement popUpModal = driver.findElement(By.cssSelector("div[class='wrapper desktop']"));
		if (popUpModal.isDisplayed()) {
			driver.findElement(By.className("buttontop")).click();
			isPopUp = driver.findElement(By.cssSelector("div[class='wzrk-alert wiz-show-animate']")).isDisplayed();
			driver.findElement(By.id("wzrk-confirm")).click();
			driver.findElement(By.linkText("Forgot password?")).click();
			if (isPopUp.equals(true)) {
				driver.findElement(By.id("sso-forgot-password-email-input")).sendKeys("test@test.com");
				driver.findElement(By.xpath("//button[@class='sso-button']")).click();
				driver.findElement(By.xpath("//div[@class='forgot-click-to-login']")).click();
			} else {
				driver.findElement(By.id("sso-forgot-password-email-input")).sendKeys("test@test.com");
				driver.findElement(By.xpath("//button[@class='sso-button']")).click();
				driver.findElement(By.xpath("//div[@class='forgot-click-to-login']")).click();
			}
		}
	}

	public void LoginWithFacebook(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		WebElement popUpModal = driver.findElement(By.cssSelector("div[class='wrapper desktop']"));
		if (popUpModal.isDisplayed()) {
			driver.findElement(By.className("buttontop")).click();
			isPopUp = driver.findElement(By.cssSelector("div[class='wzrk-alert wiz-show-animate']")).isDisplayed();
			driver.findElement(By.id("wzrk-confirm")).click();
			if (isPopUp.equals(true)) {
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//div[@class='sso-social-title'])[1]")).click();
			} else {
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//div[@class='sso-social-title'])[1]")).click();
			}
		}
	}

	public void LoginWithGoogle(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		WebElement popUpModal = driver.findElement(By.cssSelector("div[class='wrapper desktop']"));
		if (popUpModal.isDisplayed()) {
			driver.findElement(By.className("buttontop")).click();
			isPopUp = driver.findElement(By.cssSelector("div[class='wzrk-alert wiz-show-animate']")).isDisplayed();
			driver.findElement(By.id("wzrk-confirm")).click();
			if (isPopUp.equals(true)) {
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//div[@class='sso-social-title'])[2]")).click();
			} else {
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//div[@class='sso-social-title'])[2]")).click();
			}
		}
	}
	
	public void LoginWithWeChat(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		WebElement popUpModal = driver.findElement(By.cssSelector("div[class='wrapper desktop']"));
		if (popUpModal.isDisplayed()) {
			driver.findElement(By.className("buttontop")).click();
			isPopUp = driver.findElement(By.cssSelector("div[class='wzrk-alert wiz-show-animate']")).isDisplayed();
			driver.findElement(By.id("wzrk-confirm")).click();
			if (isPopUp.equals(true)) {
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//div[@class='sso-social-title'])[3]")).click();
			} else {
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//div[@class='sso-social-title'])[3]")).click();
			}
		}
	}

	public void SignUp(WebDriver driver) {
		WebElement popUpMsg = driver.findElement(By.xpath("//div[@class='wrapper desktop']"));
		System.out.println(popUpMsg.isDisplayed());
		if(popUpMsg.isDisplayed()) {
			driver.findElement(By.className("buttontop")).click();
			driver.findElement(By.id("loginOrSignUp1")).click();
			driver.findElement(By.id("sso-signup-email-input")).sendKeys("test@gmail.com");
			driver.findElement(By.id("sso-signup-password-input")).sendKeys("passwordtest");
			driver.findElement(By.cssSelector("mat-icon[class*='mat-icon']")).click();
			driver.findElement(By.className("sso-button")).click();
		} else {
			driver.findElement(By.id("loginModal")).click();
			driver.findElement(By.id("loginOrSignUp1")).click();
			driver.findElement(By.id("sso-signup-email-input")).sendKeys("test@gmail.com");
			driver.findElement(By.id("sso-signup-password-input")).sendKeys("passwordtest");
			driver.findElement(By.cssSelector("mat-icon[class*='mat-icon']")).click();
			driver.findElement(By.className("sso-button")).click();
		}
	}
}
