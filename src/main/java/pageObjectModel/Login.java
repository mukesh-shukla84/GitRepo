package pageObjectModel;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import utilityFunctions.CommonFunctions;

import org.openqa.selenium.support.FindBy;

public class Login extends CommonFunctions{
	WebDriver driver;
	
	public Login(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="usernameField")
	WebElement UserName; 
	
	@FindBy(xpath="//input[@type='password']")
	WebElement Password; 
	
	@FindBy(xpath="//*[@id=\"ButtonBox\"]/button[1]")
	WebElement  Submit; 
	
	@FindBy(xpath = "//*[contains(text(),'MARK3923')]")
	WebElement loggedUser;
	

	
	By usernameby = By.id("usernameField");
	public void loginApplication(String username, String password)
	{		
		WaitForElement(usernameby);
		UserName.sendKeys(username);
		Password.sendKeys(password);
		Submit.click();
	}
	
	public void launchApplication(String Url)
	{
		driver.get(Url);
	}
	
	public void validate_Login() throws InterruptedException
	{
		Thread.sleep(5000);
		if(loggedUser.isDisplayed())
		{
			System.out.println("Correct user name is displayed");
		}
		else
		{
			System.out.println("Correct user name is not displayed");
		}
		
	}
	
}
