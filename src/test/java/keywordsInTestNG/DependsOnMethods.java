package keywordsInTestNG;

import org.junit.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods    //one method depends on another method
{
	@Test(dependsOnMethods={"abc"})
	public void def()
	{
		System.out.println("DEF is present");
	}
	
	@Test
	public void abc()
	{
		System.out.println("ABC is present");
		Assert.fail();
	}
	
	@Test
	public void ghi()
	{
		System.out.println("GHI is present");
	}
	
	
	
	

}
