package Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extent_Reports implements ITestListener {
	
	public ExtentSparkReporter sparkreport;
	public ExtentReports extent;
	public ExtentTest test;
	
	public void onStart(ITestContext context) {
		sparkreport = new ExtentSparkReporter(System.getProperty("user.dir") + "/Reports/MyReports.html");
		
		sparkreport.config().setDocumentTitle("Automation Testing");
		sparkreport.config().setReportName("Functional Testing");
		sparkreport.config().setTheme(Theme.DARK);
		
		
		extent = new ExtentReports();
		extent.attachReporter(sparkreport);
		
		extent.setSystemInfo("Laptop name", "ASUS TUF");
		extent.setSystemInfo("Environment", "Eclipse IDE");
		extent.setSystemInfo("Tester name", "Prasanth");
		extent.setSystemInfo("OS", "Windows 11");
		extent.setSystemInfo("Browser name", "Chrome");
	}
	
	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.PASS, "TestCase is PASSED: " + result.getName());
	}
	
	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case is FAILED: " + result.getName());
		test.log(Status.FAIL, "Test case is FAILED cause: " + result.getThrowable());
	}
	
	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case is SKIPPED:" + result.getName());
	}
	
	public void onFinish(ITestContext context) {
		extent.flush();
	}
}

