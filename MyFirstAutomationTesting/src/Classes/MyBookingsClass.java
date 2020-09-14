package Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyBookingsClass {

	public void FlightTab(WebDriver driver) throws InterruptedException {
		commonCodes(driver);
		driver.findElement(By.id("input-depCity")).click();
		// Departure City
		driver.findElement(By.xpath("//div[@id='mat-autocomplete-0']//mat-option[@id='mat-option-3']")).click();
		// booking number
		driver.findElement(By.id("input-pnr")).sendKeys("412345");
		// surname
		driver.findElement(By.id("input-lastName")).sendKeys("santos");
		// click search button
		driver.findElement(By.cssSelector("button[class='btn aasbw-button']")).click();
	}

	public void HotelTab(WebDriver driver) throws InterruptedException {
		commonCodes(driver);
		driver.findElement(By.xpath("//div[@id='tabs-container']//div[2]")).click();
		driver.findElement(By.id("input-orderNumber")).sendKeys("123456");
		driver.findElement(By.id("input-lastName")).sendKeys("santos");
		driver.findElement(By.id("input-email")).sendKeys("santoslenar25@gmail.com");
		driver.findElement(By.cssSelector("button[class='btn aasbw-button']")).click();
	}

	public void RetrieveBooking(WebDriver driver) throws InterruptedException {
		commonCodes(driver);
		driver.findElement(By.xpath("//a//mat-chip[@class='notif-chip']")).click();
		driver.findElement(By.id("unified-itin-emailId")).sendKeys("test@gmail.com");
		driver.findElement(By.id("unified-itin-password")).sendKeys("testpassword");
		driver.findElement(By.id("unified-itin-submit-button")).click();
		Thread.sleep(2000);
		WebElement warningMsg = driver.findElement(By.id("warning-error-unified-itin"));
		if (warningMsg.isDisplayed()) {
			// Forgot Password
			driver.findElement(By.id("unified-itin-forgot-password-link")).click();
			Thread.sleep(2000);
			WebElement contentBox = driver.findElement(By.xpath("//div[@id='content-box']"));

			if (contentBox.isDisplayed()) {
				driver.findElement(By.id("view-itin-unregistered-emailId")).sendKeys("test@gmail.com");
				driver.findElement(By.id("view-itin-unregistered-itinerary-number")).sendKeys("09423");
				driver.findElement(By.id("view-itin-unregistered-submit-button")).click();
			} 
		}
	}

	private void commonCodes(WebDriver driver) throws InterruptedException {
		driver.findElement(By.linkText("My bookings")).click();
		Thread.sleep(2000);
		for (String childTab : driver.getWindowHandles()) {
			driver.switchTo().window(childTab);
		}
		Thread.sleep(2000);
	}

}
