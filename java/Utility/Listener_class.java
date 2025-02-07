package Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener_class implements ITestListener{
	
	public void onStart(ITestContext context) {
		System.out.println("Test is starting");
	}
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test is started");
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case runned successfully");
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case is failed");
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case is skipped");
	}
	
	public void onFinish(ITestContext context) {
		System.out.println("Test is finished");
	}
	

}
