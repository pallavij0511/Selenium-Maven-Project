package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert 
{
	//Assertion Practice
	
	@Test
	public void test1()
	{
		String expected="ABC";
		String actual="ABC";
		
		Assert.assertEquals(expected,actual);
	}
	
	@Test
	public void test2()
	{
		System.out.println("Start");
		Assert.assertEquals(13,13,"count is not matched please check with Dev name");
		
		//pass
		System.out.println("Middle");
		Assert.assertEquals(13, 12,"count is not matched please check with Dev Name");
		
		//fail
		System.out.println("End");
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(13,13,"count is not matched please check with Dev name");
	}
	
	@Test
	public void test4()
	{
		
		//Assert.assertTrue(5>0); //pass
		
		String name="Pallavi";
		//Assert.assertTrue(name.contains("lla"));
		//Assert.assertFalse(name.contains("lla"));
		//Assert.assertNull(name);
		Assert.assertNotNull(name);
		
		
	}
	
	



}
