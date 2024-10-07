package learnListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class myListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test started :" + result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test successsful");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test execution finished");
	}
	
	
	
	

}
