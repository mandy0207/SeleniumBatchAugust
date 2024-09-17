package learnTestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MobileTesting {

	
	@Test(groups="Smoke")
	public void myfirstMobileTest() {
		System.out.println("I am in first Mobile Test");
	}
	
	@Test(groups="Regression")
	public void mysecondMobileTest() {
		System.out.println("I am in second mobile test");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am in before suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("I am in after suite");
	}
	
	
	/*
	 * @BeforeTest public void beforeTest() {
	 * System.out.println("I am in before mobile test"); }
	 */
	/*
	 * @BeforeClass public void beforeClass() {
	 * System.out.println("I am in mobile before class "); }
	 * 
	 * @AfterClass public void afterClass() {
	 * System.out.println("I am in after mobile class"); }
	 */
	
	/*
	 * @AfterTest public void afterTest() {
	 * System.out.println("I am in after mobile test"); }
	 */
	
	
	//
	
	/**
	 * Suite
	 * Test
	 * class
	 * 
	 */
	
}
