package generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.ActitimeHomePage;
import pom.ActitimeLoginPage;

public class BaseTest implements AutoConstant 
{
	public WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@BeforeMethod
	public void logintoapp() throws InterruptedException, IOException 
	{
		
		ActitimeLoginPage login=new ActitimeLoginPage(driver);
		login.loginMethod();
	}
	
	@AfterMethod
	public void logoutfromapp()
	{
		ActitimeHomePage home=new ActitimeHomePage(driver);
		home.logoutMethod();
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
}