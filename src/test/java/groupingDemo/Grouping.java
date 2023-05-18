package groupingDemo;

import org.testng.annotations.Test;

public class Grouping
{
	@Test(groups={"regression"})
	public void test1()
	{
		System.out.println("Test1 Method is present");
	}
	
	@Test(groups= {"sanity"})
	public void test2()
	{
		System.out.println("Test2 Method is present");
	}
	
	@Test(groups= {"smoke","regression"})
	public void test3()
	{
		System.out.println("Test3 Method is present");
	}
	
	@Test(groups= {"smoke"})
	public void test4()
	{
		System.out.println("Test4 Method is present");
	}
	
	
}
