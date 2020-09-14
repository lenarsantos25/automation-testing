package Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightStatus {
	public void FlightStatusPage(WebDriver driver) throws InterruptedException {
		driver.findElement(By.linkText("Flight status")).click();
		for(String childTab: driver.getWindowHandles()) {
			driver.switchTo().window(childTab);
		}
		// Search by flight number tab
//		driver.findElement(By.id("flightNumber")).sendKeys("AK 1774");
//		driver.findElement(By.xpath("//div[@class='container']//button")).click();
		
		Thread.sleep(2000);
		// Search by route
	
		driver.findElement(By.xpath("//div[@class='tab-header']//ul/li[2]")).click();
//		driver.findElement(By.xpath("//ul[@class='items']/aa-option[@id='aa-option-174']")).click();
		// if does not open
		
		// if open
//		driver.findElement(By.xpath("//ul[@class='items']/aa-option[@id='aa-option-487']")).click();
//		driver.findElement(By.xpath("//div[@class='container']//button")).click();
	}
}
