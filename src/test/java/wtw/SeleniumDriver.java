package wtw;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.asserts.SoftAssert;

import org.testng.annotations.Parameters;


public class SeleniumDriver extends BaseTest
{

	public WebDriver driver;
	public ExtentReports extent;
	
	@BeforeSuite
	public void TestMethod4()
	{
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void TestMethod5()
	{
		System.out.println("After Suite");
	}
	
	
	@BeforeTest
	public void ExtentConfig()
	{
		String path = System.getProperty("user.dir") + "\\reports\\index.html"; 
		ExtentSparkReporter reporter = new ExtentSparkReporter(path); 
		reporter.config().setReportName("Automation Result");
		reporter.config().setDocumentTitle("Execution Result");
		
		extent = new ExtentReports(); 
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Mukesh Shukla");
	}
	
	@Test
	public void ESS_UpdateName() throws IOException 
	{
		ExtentTest tests = extent.createTest("Initial Demo"); 
		objLogin =LaunchApplication();
		//objLogin.loginApplication("mark3923", "testing123");
		//objLogin.SelectResponsibility("Self-Service Time & Expense - US 1501", "Create Timecard");
		//Assert.fail("Results do not match");
		
		//tests.addScreenCaptureFromBase64String(System.getProperty("user.dir") + "\\reports\\index.html");
		//extent.flush();
		//driver.quit();
	}
	
	@AfterTest 
	public void AfterTest() throws IOException 
	{
		
		System.out.println("After Test");
		
	}
	
	
	@Parameters({"Demo"})
	@Test (groups= {"Smoke Test"})
	public void TestMethod1(String Val)
	{
		
		System.out.println(Val);
	}
	
	
	@Test(groups= {"Smoke Test"})
	public void TestMethod2()
	{
		SoftAssert softassert = new SoftAssert();
		System.out.println("Test Method2");
		softassert.assertEquals("Mukesh", "Shukla", "Failed Assert");
		System.out.println("Test Method2 - After fail");
		
		
	}
	
	@Test(groups= {"Smoke Test"})
	public void TestMethod3()
	{
		System.out.println("Test Method3");
	}
	
	

}
