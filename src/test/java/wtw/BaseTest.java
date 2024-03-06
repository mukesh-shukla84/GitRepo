package wtw;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities; 
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjectModel.Login;

public class BaseTest 
{
	public ChromeDriver driver;
	public String AppURL; 
	public Login objLogin;
	
	public ChromeDriver BaseTestInilializer() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fin = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\resources\\Project.properties");
		prop.load(fin);
		String browsername = prop.getProperty("Browser");
		AppURL = prop.getProperty("URL");
		System.out.println("URL" + AppURL);
		if(browsername.equalsIgnoreCase("chrome"))
		{			
			System.out.println("Inside base2" + browsername);
			System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\121\\chromedriver.exe");
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--remote-allow-origins=*");
			//chromeOptions.addArguments("--disable notifications");
			DesiredCapabilities cp = new DesiredCapabilities(); 
			cp.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
			chromeOptions.merge(cp); 
			
			//WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(chromeOptions);
			
			
			//System.out.println("property set");
			//driver = new ChromeDriver(chromeOptions);
			//driver = new ChromeDriver();
			
			
		}
	 return driver;
	}
	
	
	public Login LaunchApplication() throws IOException
	{
		driver = BaseTestInilializer();
		System.out.println("URL" + AppURL);
		objLogin = new Login(driver);
	    driver.get(AppURL);
		//objLogin.launchApplication(AppURL);
		Assert.assertEquals("Test", "Test");
		//driver.quit();
		return objLogin;
	}
	
}
