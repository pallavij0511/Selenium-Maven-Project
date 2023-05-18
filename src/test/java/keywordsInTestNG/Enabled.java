package keywordsInTestNG;

import org.testng.annotations.Test;

public class Enabled    //if any test case we have not execute in program for that use
{
	@Test(priority=2,enabled=false)
	public void def()
	{
		System.out.println("DEF is present");
	}
	
	@Test(priority=1)
	public void abc()
	{
		System.out.println("ABC is present");
	}
	
	
}
