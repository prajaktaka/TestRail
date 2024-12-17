package Pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LogIn
{
	
	WebDriver driver;
	
	@FindBy(partialLinkText ="Log in")
	WebElement e1;

	@FindBy(xpath ="/html/body/div[3]/div/div/div[2]/form/div[1]/input")
	WebElement e3;

	@FindBy(id ="loginpassword")
	WebElement e4;

	@FindBy(xpath ="/html/body/div[3]/div/div/div[3]/button[2]")
	WebElement e5;
		
	public LogIn(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

	public void Click_On_Log_In() 
	{
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		e1.click();
		e3.sendKeys("studymailid12@gmail.com");
		e4.sendKeys("Prajakta@123");
		e5.click();
	}
}
