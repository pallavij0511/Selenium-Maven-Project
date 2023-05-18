package assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssignmentActiTime 
{
	@Test
	public void actiTime()
	{
		ChromeOptions co = new ChromeOptions(); 

		 co.addArguments("--remote-allow-origins=*");
		
		 
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM SETUP\\chrome 111\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("http://localhost/user/submit_tt.do");
		driver.manage().window().maximize();
		
		String expected="actiTIME - Login";
	    String actual = driver.getTitle();
	    
	    System.out.println("ActiTimeTitle");
	    
	    Assert.assertEquals(expected,actual);
	}

}
