package assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion1 
{
	


	@Test
	public void Test1()
	{
		SoftAssert a=new SoftAssert();
		System.out.println("start");
		
     	a.assertEquals(13, 13, "count is not matched pls check with dev name");
		System.out.println("miidle");
		a.assertEquals(13, 12, "count is not matched pls check with dev name");
		System.out.println("end");
		
    	a.assertAll();
	}

}



