package keywordsInTestNG;

//import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class PriorityKeyword 
{
		@Test(priority=2)
		public void def()
		{
			System.out.println("DEF is present");
		}
		
		@Test(priority=3)
		public void ghi()
		{
			System.out.println("GHI is present");
		}
		
		@Test(priority=4)
		public void jkl()
		{
			System.out.println("JKL is present");
		}
		
		
		@Test(priority=5)
		public void mno()
		{
			System.out.println("MNO is present");
			//Assert.fail();
		}
		
		@Test(priority=1)
		public void abc()
		{
			System.out.println("ABC is present");
		}
		

		@Test
		public void xyz()
		{
			System.out.println("xyz is present");
		}

	}



