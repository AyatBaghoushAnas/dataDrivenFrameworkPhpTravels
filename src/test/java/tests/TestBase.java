package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	public static WebDriver driver;
	
	
	@BeforeSuite
	public void startDriver()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.phptravels.net/register");
	}
	
	@AfterSuite
	public void closeDriver()
	{
		driver.quit();
	}
	
	
}
