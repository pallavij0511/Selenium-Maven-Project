package pageFactoryActiTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeHomePage
{
	//declaration
	
		@FindBy(xpath="//img[@height='61']")
		private WebElement logo;
		
		@FindBy(xpath="//a[@id='logoutLink']")
		private WebElement logout;
		
		WebDriver driver;
		
		//initialization
		public ActiTimeHomePage (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//usage
		
		public void setActiTimeLogo()
		{
			boolean res = logo.isDisplayed();
			if(res==true)
			{
				System.out.println("Test case passed:"+res);
			}
			else
			{
				System.out.println("Test case failed:"+res);
			}
		}
		
		public void setActiTimeLogout()
		{
			logout.click();
		}
		
		

}
