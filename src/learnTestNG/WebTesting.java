package learnTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTesting {
	
	/**
	 * 1. Any method annotated with @Test only is considered test case
	 * 2. Execution of test case will follow alphabetical sequence of test case name
	 * 3. Execution of test cases can be prioritized based on priority. Lower the priority execution will happen first
	 *    eg. Priority={0,1,2}
	 * 4. If any test case is not given priority , it would be treated as zero priority  
	 * 5. If two test cases have same priority, alphabetical order will take precedence
	 * 6. BeforeTest will execute once only before all the test cases present inside class
	 * 7. AfterTest will execute once only after all the test cases present inside class
	 */
	
	@Test(priority=2)
	public void myFirstTest() {
		System.out.println("I am in first web test");
	}
	
	@Test(priority=1)
	public void mySecondTest(){
		System.out.println("I am in second web test");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("I am in before web test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("I am in after web test");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am in before method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("I am in after method");
	}
	
	
//	@Test
//	public void myThirdTest() {
//		System.out.println("I am in third web test");
//	}
//	
//	@Test
//	public void myFourthTest() {
//		System.out.println("I am in fourth  web test");
//	}
	
 
	
	

	

}
