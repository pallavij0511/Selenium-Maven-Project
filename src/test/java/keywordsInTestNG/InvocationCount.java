package keywordsInTestNG;

import org.testng.annotations.Test;

public class InvocationCount   //particular functionaly repetedly use karna hain to
{
	
	@Test(priority=4,invocationCount=3)
	public void jkl()
	{
		System.out.println("JKL is present");
	}
	
	
}
