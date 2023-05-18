package testNGAnnotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageFactoryActiTime.ActiTimeHomePage;
import pageFactoryActiTime.ActiTimeLoginPage;

public class ActiTimeLogoVerify
{    
	  //Scenario: To verify actitime logo and homepage.
	  //Actitime Logo verify using Annotations

		
		WebDriver driver;
		ActiTimeLoginPage login;
		ActiTimeHomePage home;
		
		@BeforeClass
		public void openBrowser() 
		{
			System.out.println("Opening browser");
			ChromeOptions co = new ChromeOptions(); 

			 co.addArguments("--remote-allow-origins=*");
			
			 
			System.setProperty("webdriver.chrome.driver","D:\\SELENIUM SETUP\\chrome 111\\chromedriver.exe");
			 driver=new ChromeDriver(co);
			
			driver.manage().window().maximize();
			driver.get("http://localhost/login.do");
			
			System.out.println("Open chrome Successfully");
			
			login=new ActiTimeLoginPage(driver);
			home=new ActiTimeHomePage (driver);
			
		}
		
		@AfterClass
		public void closingBrowser()
		{
			System.out.println("Browser is closing");
			driver.quit();
		}
		
		@BeforeMethod
		public void loginActitime()
		{
			System.out.println("login in process");
			login.setActiTimeUn();
			login.setActiTimePwd();
			login.setActiTimeLogin();
			System.out.println("login completed");
		}
		
		@AfterMethod
		public void logoutActitime()
		{
			System.out.println("Logging out");
			home.setActiTimeLogout();
		}
		
		@Test
		public void scenarioVerifyLogo()
		{
			System.out.println("Checking 1st scenarion");
			home.setActiTimeLogo();
			System.out.println("Scenario pass logo verified..");
		}
}





