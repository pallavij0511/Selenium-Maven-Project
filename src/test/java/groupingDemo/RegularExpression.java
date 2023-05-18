package groupingDemo;

import org.testng.annotations.Test;

public class RegularExpression 
{
	@Test(groups= {"US101.regression"})
	public void test1()
	{
		System.out.println("Test101 method present");
	}
	
	
	@Test(groups= {"US102.sanity"})
	public void test2()
	{
		System.out.println("Test102 sanity method present");
	}
	
	@Test(groups= {"US102.regression"})
	public void test3()
	{
		System.out.println("Test102 regression method present");
	}
	
	@Test(groups= {"US102.smoke"})
	public void test4()
	{
		System.out.println("Test102 smoke method present");
	}



}
