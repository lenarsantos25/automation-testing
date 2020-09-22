package SampleTestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeClassExample {
	
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
}
