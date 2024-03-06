package step_Definition;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.WebDriver;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import wtw.BaseTest;

public class Step_Definition_Implementation extends BaseTest {
	
	public WebDriver driver;
	
	
	 @Given("Application is launched")
	 public void Application_is_launched() throws IOException
	 {
		 objLogin = LaunchApplication();
		 //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 }
	 
	 @When("^Enter correct credentials (.+) and (.+)$")
	 public void Enter_Credentials(String username, String password)
	 {
		 objLogin.loginApplication(username, password);
	 }
	 
	 @Then("Login should be successful")
	 public void Validate_Login() throws InterruptedException
	 {
		 	objLogin.validate_Login();		
			
	 }
	 
	 @And("^User Selects Role (.+)$")
	 public void Select_Role(String role)
	 {
		 System.out.println("inside role");
	 }
	 
	 @And("^User clicks (.+)$")
	 public void Clicks_form(String form)
	 {
		 System.out.println("inside form");
	 }
	 
	 @And("^User enters (.+)$")
	 public void Enter_TimePeriod(String time_period)
	 {
		 System.out.println("inside time period");
	 }
	 
	 @And("^Project and Task entered (.+) and (.+)")
	 public void Enter_Project_Task(String project, String task)
	 {
		 System.out.println("project and task");
	 }
	 
	 @When("User Submits time_card")
	 public void user_submits_time_card() {
		 System.out.println("submit timecard");
	 }

	 @Then("Time card should be submitted sucessfully")
	 public void time_card_should_be_submitted_sucessfully() {
		 System.out.println("inside verify timecard");
	 }
}
