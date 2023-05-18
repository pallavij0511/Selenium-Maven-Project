package testNGListenersDemo;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(testNGListenersDemo.ITestListeners2.class)
public class KeywordsInTestNG 
{

	
	@Test(priority = 1)
	public void def()
	{
		System.out.println("DEF Present");
		Assert.fail();
	}
	
	@Test(priority = 2, timeOut=5000)
	public void ghi() throws InterruptedException
	{
		Thread.sleep(6000);
		System.out.println("GHI Present");
		
	}
	
	@Test(priority = 3, invocationCount=3)
	public void jkl()
	{
		System.out.println("JKL Present");
	}
	
	@Test(priority = 4, enabled = false)
	public void abc()
	{
		System.out.println("ABC Present");
	}
	
	@Test(priority = 5, dependsOnMethods = {"def"})
	public void mno()
	{
		System.out.println("MNO Present");
	}
	

}
