package utilityFunctions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunctions {

	WebDriver driver;
	public CommonFunctions(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="pt1:_UISmmLink::icon")
	WebElement Menu; 

	public void WaitForElement(By findBy)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(findBy));
		System.out.println("Inside Wait");

	}
	
	public void SelectResponsibility(String strRole, String strForm)
	{
			
		WaitForElement(By.linkText(strRole));
		driver.findElement(By.linkText(strRole)).click();
		driver.findElement(By.linkText(strForm)).click();
				
	}

}
