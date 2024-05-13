package Curs16;

import org.testng.annotations.Test;

public class TestPriorityExample {

	@Test(priority = 1)
	public void one() {
		
		System.out.println("FIrst");
	}
	
	@Test(priority = 2)
	public void two() {
		
		System.out.println("Second");
	}
	
	@Test(priority = 3)
	public void three() {		
		System.out.println("Third");
	}
	
	@Test
	public void four() {		
		System.out.println("Fourth");
	}

	@Test
	public void five() {		
		System.out.println("Fifth");
	}
}
