package Curs16;

import org.testng.annotations.*;
import org.testng.annotations.BeforeSuite;

public class BeforeAfterAnnotation {

	@BeforeSuite
	public void beforeSuite() {
		
		System.out.println("Before suite");
		
	}
	
	@AfterSuite
	public void afterSuite() {
		
		System.out.println("After suite");
		
	}
	
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("Before test");
		
	}
	
	@AfterTest
	public void afterTest() {
		
		System.out.println("After test");
		
	}
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Before class");
		
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("After class");
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("Before method");
		
	}
	
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("After method");
		
	}
	
	@Test
	public void test1() {
		
		System.out.println("Test 1");
		
	}
	
	@Test
	public void test2() {
		
		System.out.println("Test 2");
		
	}
	
	@Test
	public void test3() {
		
		System.out.println("Test 3");
		
	}
	
	
	
	
}
