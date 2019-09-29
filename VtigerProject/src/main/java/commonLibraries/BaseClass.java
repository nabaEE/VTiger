package commonLibraries;

import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjectRepository.LoginPage;

public class BaseClass extends FileUtils
{
	public static WebDriver driver;
	@BeforeClass()
	@Parameters("browser")
	public void openBrowser(String browserName)
	{
		if(browserName.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromeserver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		}
		else if(browserName.equals("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void login() throws Exception
	{
		//create an object of fileutils class
		FileUtils flib= new FileUtils();
		//store the properites object
	    Properties pObj=flib.getPropertyData(); 
	    driver.get(pObj.getProperty("url"));
	    WebDriverUtils.waitForPageToLoad(driver);
	    //declare the chrome driver
	    LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
	    lp.loginToApp(pObj.getProperty("username"), pObj.getProperty("password"));
	}
	
	@AfterMethod()
	public void logout() {
		
   WebElement	wb1= driver.findElement(By.xpath("//img[@style='padding: 0px;padding-left:5px']/../../../tr[1]/td[2]/img"));
	 Actions act= new Actions(driver);
	 act.moveToElement(wb1).perform();
	 driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	  }
	
	@AfterClass
	public void closeBrowswer()
	{
		driver.close();
	}
}