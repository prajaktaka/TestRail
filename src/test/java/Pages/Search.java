package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search
{
		WebDriver driver;
		
		@FindBy(xpath ="/html/body/div[5]/div/div[2]/div/div[1]/div/a/img")
		WebElement e1;
		
		@FindBy(xpath ="/html/body/div[5]/div/div[2]/div[2]/div/a")
		WebElement e2;
			
		public Search(WebDriver driver)
		{
			this.driver=driver;
			
			PageFactory.initElements(driver, this);
		}

		public void Click_On_Add() 
		{
			
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			e1.click();
			
			e2.click();
		}
}

