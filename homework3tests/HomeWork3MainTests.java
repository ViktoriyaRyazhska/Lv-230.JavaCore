package homework3;

import static org.junit.Assert.*;

import org.junit.Test;

public class HomeWork3MainTests {

//Tests for method used in solution of Task 1.a):		
	@Test
	public void testFloatNumbersWithinTheRangePositive() {
		assertTrue(HomeWork3Main.floatNumbersWithinTheRange(-5, 0, 5));
	}
	@Test
	public void testFloatNumbersWithinTheRangeNegative() {
		assertFalse(HomeWork3Main.floatNumbersWithinTheRange(7, 0, 5));
	}

//Tests for methods used in solution of Task 1.b):		
	@Test
	public void testAreEnteredNumbersEqualPositive() {
		assertTrue(HomeWork3Main.areEnteredNumbersEqual(10, 10, 10));
	}
	@Test
	public void testAreEnteredNumbersEqualNegative() {
		assertFalse(HomeWork3Main.areEnteredNumbersEqual(10, 5, 10));
	}
	@Test
	public void testGetMaxNumberNegative() {
		int actual = 10;
		int expected = HomeWork3Main.getMaxNumber(1, 5, 10);
		assertEquals(actual, expected);
	}
	@Test
	public void testGetMinNumberNegative() {
		int actual = 1;
		int expected = HomeWork3Main.getMinNumber(1, 5, 10);
		assertEquals(actual, expected);
	}
//Tests for method used in solution of Task 1.c):	
	@Test
	public void testhttpErrorIDCheckKnownErrors() {
		String actual = "BadRequest";
		String expected = HomeWork3Main.httpErrorIDCheck(400);
		assertEquals(actual, expected);
	}
	
	@Test
	public void testhttpErrorIDCheckUnknownErrors() {
		String actual = "Unknown Error!";
		String expected = HomeWork3Main.httpErrorIDCheck(1);
		assertEquals(actual, expected);
	}
//Tests for method used in solution of Task 2.c):
	
}
