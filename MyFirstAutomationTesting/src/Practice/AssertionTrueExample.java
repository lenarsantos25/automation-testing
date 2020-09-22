package Practice;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class AssertionTrueExample {
	@Test
	public void myTest() {
		assertTrue(checkBigger(5, 5));
	}

	public boolean checkBigger(int x, int y) {
		boolean result;
		if (x > y) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
	
	
	@Test
	public void myTestWithMessage() {
		assertTrue(checkBigger(5, 10), "First Number is smaller than second number");
	}
}
