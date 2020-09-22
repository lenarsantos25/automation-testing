package SampleTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AfterMethodExample {
	
	@BeforeMethod
	public void myBeforeMethod() {
		System.out.println("I am Before Method");
	}

	@Test
	public void TestMethodOne() {
		System.out.println("I am TestMethod 1");
	}

	@Test
	public void TestMethodTwo() {
		System.out.println("I am TestMethod 2");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I am After Method");
	}

}
