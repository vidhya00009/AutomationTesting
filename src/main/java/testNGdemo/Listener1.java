package testNGdemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener1 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("On test is start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("On test is success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("On test is Failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("On test is Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("On test is failed within success percentage");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("On test is  with time out");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("On start");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("On finish");
	}
	//ITestListener is a Interface 
	//Interface---->means 
}
