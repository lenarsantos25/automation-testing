package SampleTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;

public class TestClassTwo extends TestBase{
	@Test
	public void TestMethodThree() {
		System.out.println("I am TestMethod 3");
	}

	@AfterClass
	public void myAfterClass() {
		System.out.println("I am After Class");
	}

	@BeforeClass
	public void myBeforeClass() {
		System.out.println("I am Before Class");
	}

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
