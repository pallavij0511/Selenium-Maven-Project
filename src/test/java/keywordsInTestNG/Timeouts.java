package keywordsInTestNG;


import org.testng.annotations.Test;

public class Timeouts
{
	
	@Test(priority=1,timeOut=5000)
	public void def()
	{
		
		System.out.println("DEF is present");
	}
	
	@Test(priority=2,timeOut=5000)
	public void ghi() throws InterruptedException
	{
		Thread.sleep(6000);
		System.out.println("GHI is present");
	}
	
}
