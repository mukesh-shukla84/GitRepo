package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilityFunctions.CommonFunctions;

public class Enter_Timecard extends CommonFunctions
{

WebDriver driver;
	
	public Enter_Timecard(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="A251N1display")
	WebElement Task; 
	
	@FindBy(xpath="//*[@id=\"ButtonBox\"]/button[1]")
	WebElement  Submit; 
	
	@FindBy(xpath = "//select[@id='N78']")
	Select TimePeriod;
	
	@FindBy(xpath = "//input[@id='A231N1display']")
	WebElement ProjectName;
	
	@FindBy(xpath = "//textarea[@id='B16_0_N1']")
	WebElement Comments;
	
	@FindBy(css= "#B22_1_1")
	WebElement Hours;
	
	public void Enter_Timecard(String prjName, String task, String hrs)
	{
		TimePeriod.selectByValue("February 11,2024 - February 17,2024");
		ProjectName.sendKeys(null);
		Task.sendKeys(null);
		Hours.sendKeys(null);
	}
	
	
	
}
