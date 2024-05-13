package Curs16;

import static org.testng.Assert.assertEquals;

import org.testng.TestException;
import org.testng.annotations.Test;

public class AssertionExample {

	String actualResult = "test";
	
	String expectedResults = "Masina";
	
	public void checkEquality() {
		
		if (expectedResults.equals(actualResult)) {
			
			System.out.println("Test is passed");
		} else 
			System.out.println("Test is failed");
			throw new TestException("Expected " + expectedResults + "but got " + actualResult);
	}
	
	@Test
	public void checkEquality2() {
		
		assertEquals(expectedResults,actualResult);
		
	}
	
}
