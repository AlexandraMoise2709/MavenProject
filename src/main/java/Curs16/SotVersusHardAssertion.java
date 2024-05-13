package Curs16;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SotVersusHardAssertion {

	
	
	/*
	 * 1.hard assertion cand conditia nu se indeplineste intrerupem exeutia
	 * 2.soft assertion
	 */
	@Ignore
	public void hardAssertExample() {
		
		
		System.out.println("Code here");
		assertFalse(true);
		System.out.println("Some other code here");
		assertNotNull(null);
		System.out.println("Final code here");
	}
	
	@Test
	public void softAssert() {
		System.out.println("Code here");
		SoftAssert sa = new SoftAssert();
		sa.assertFalse(true);
		System.out.println("Some other code here");
		sa.assertNotNull(null);
		System.out.println("Final code here");
		sa.assertAll();
	}
	
	
	
}
