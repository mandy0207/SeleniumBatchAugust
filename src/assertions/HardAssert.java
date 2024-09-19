package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

	@Test
	public void hardAssertTest() {
		/**
		 * whenever assertion fails it will stop the program, abruptly and will not move execution ahead
		 */
		String actualName= "Sneha Joseph";
		String expectedName= "Sneha Joseph";
		
		Assert.assertEquals(actualName, expectedName, "Name is not matching");
		
		System.out.println("statement 1");
		//will accept true only
		Assert.assertTrue(false);
		
		//will except false only
		Assert.assertFalse(false);
		System.out.println("statement 2");
		
	
		
	}
}
