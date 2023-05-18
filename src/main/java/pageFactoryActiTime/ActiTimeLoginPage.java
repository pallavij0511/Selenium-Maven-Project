package pageFactoryActiTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLoginPage 
{
	//declaration
			@FindBy(xpath="//input[@id='username']")
			private WebElement un;
			
			
			@FindBy(xpath="//input[@name='pwd']")
			private WebElement pwd;
			
			@FindBy(xpath="//a[@id='loginButton']")
			private WebElement login;
			WebDriver driver;
			
			//initialization
			public ActiTimeLoginPage (WebDriver driver)
			{
				
				PageFactory.initElements(driver,this);
			}
			
			//usage
			public void setActiTimeUn()
			{
				un.sendKeys("admin");
			}
			public void setActiTimePwd() 
			{
				pwd.sendKeys("manager");
			}
			public void setActiTimeLogin()
			{
				login.click();
			}
			
			

}
