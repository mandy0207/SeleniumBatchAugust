package learnListeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {

	
	@Test
	public void mytest1() {
		System.out.println("I m in mytest 1");
		Assert.fail();
	}
	
	@Test
	public void mytest2() {
	System.out.println("I m in mytest 2");	
	}
}
