package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

//import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.TestRailManager.TestRailManager;

import Pages.Register;
import Pages.LogIn;
import Pages.Search;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Main
{
	WebDriver driver;
	protected String  TestCaseID;

	Register register;
	LogIn login;
	Search add;
		
		@BeforeTest
		public void TestSetUp() throws InterruptedException
		{
			//System.setProperty("webdriver.chrome.driver","E:/Selenium/Chrome/chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			

			
			
			driver = new ChromeDriver();
			
			driver.get("https://www.demoblaze.com/");
			driver.manage().window().maximize();
		
		}

		@Test
	    public void Testng() throws InterruptedException
	    {	
			TestCaseID = "3780";
			
			register=new Register(driver);
			register.Click_On_Register();
		}
		@Test
		public void Testng1() throws InterruptedException 
		{
			TestCaseID="3781";
			login= new LogIn(driver);
			login.Click_On_Log_In();
		}
		@Test
		public void Testng2() throws InterruptedException 
		{
			TestCaseID="3782";
			add= new Search(driver);
			add.Click_On_Add();
		}
		
		
		@AfterMethod
		public void AddResult(ITestResult result)
		{
			
			if(result.getStatus()==ITestResult.SUCCESS)
			{
				TestRailManager.AddResult(TestCaseID, TestRailManager.Test_Case_Pass_Status, "Pass");
			}
			else if(result.getStatus()==ITestResult.FAILURE)
			{
				TestRailManager.AddResult(TestCaseID, TestRailManager.Test_Case_Fail_Status, "Error");
			}
		}
		
}

