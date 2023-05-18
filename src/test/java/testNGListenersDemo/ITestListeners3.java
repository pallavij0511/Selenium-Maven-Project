package testNGListenersDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListeners3 implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result)
	{
		
		System.out.println("Test started and details are"+ result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println(" Test Successed "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test case failed"+result.getName());
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		
		System.out.println("Test case Skipped"+ result.getName());	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}

	@Override
	public void onStart(ITestContext context) 
	{
		
		
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		
	}
	
	

}
