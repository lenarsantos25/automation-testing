package Base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestBase {
	@BeforeSuite
	public void myBeforeSuite() {
		System.out.println("Selenium Open");
	}
	
	@AfterSuite
	public void myAfterSuite() {
		System.out.println("Selenium Close");
	}
	
	@BeforeTest
	public void myBeforeTest() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void myAfterTest() {
		System.out.println("After Test");
	}
}
