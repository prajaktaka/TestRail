package Pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Register 
{
	
	WebDriver driver;
	/*@FindBy(xpath ="//*[@id=\"demo-page\"]/body/div[7]/header/nav/ul/li[3]/span")
	WebElement e1;*/
	
	@FindBy(partialLinkText ="Sign up")
	WebElement e2;
	
	@FindBy(id="sign-username")
	WebElement e3;

	@FindBy(id ="sign-password")
	WebElement e4;

	@FindBy(xpath ="/html/body/div[2]/div/div/div[3]/button[2]")
	WebElement e5;

	@FindBy(xpath ="/html/body/div[2]/div/div/div[3]/button[1]")
	WebElement e6;


		
	public Register(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

	public void Click_On_Register() throws InterruptedException {

		/*driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		e1.click();*/
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			e2.click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			e3.sendKeys("studymailid12@gmail.com");
			e4.sendKeys("Prajakta@123");
			e5.click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.switchTo().alert().accept();
			e6.click();
	}
}

