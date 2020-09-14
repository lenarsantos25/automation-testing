package Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckInClass {
	public void CheckInPage(WebDriver driver) throws InterruptedException {
		driver.findElement(By.linkText("Check-in")).click();
		Thread.sleep(2000);
		for (String childTab : driver.getWindowHandles()) {
			driver.switchTo().window(childTab);
		}
		Thread.sleep(2000);
		driver.findElement(By.id("bookingNumberInput")).sendKeys("123456");
		driver.findElement(By.id("surnameInput")).sendKeys("testsurname");
		driver.findElement(By.xpath("//button[@class='waves-effect waves-light']")).click();
	}
}
