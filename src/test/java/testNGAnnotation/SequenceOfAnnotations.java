package testNGAnnotation;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SequenceOfAnnotations 
{
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before suite is present");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test is present");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class is present");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method is present");
	}
	
	@Test
	public void test()
	{
		System.out.println("Test is present");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method is present");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class is present");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test is present");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite is present");
	}
	
	
	
	
	

}
