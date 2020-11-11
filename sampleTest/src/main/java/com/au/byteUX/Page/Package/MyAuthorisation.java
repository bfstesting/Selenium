package com.au.byteUX.Page.Package;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author sarkah01
 *
 */
public class MyAuthorisation {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//tbody/tr[.//td[2]/div[text()='"
			+ "Beekeeper Recreational" //Enter the permission name 
			+ "'] and .//td[5]/div[text()='"
			+ "Renewal Pending" // Status of the permission
			+ "']]")
	@CacheLookup WebElement selectPermission;
	
	@FindBy(how=How.XPATH,using="//span[text()='Add Hive Brand']") @CacheLookup WebElement addHiveBrandBtn;
	@FindBy(how=How.XPATH,using="//span[text()='Add Hive Location']") @CacheLookup WebElement addHiveLocationBtn;
	
	
	public MyAuthorisation(WebDriver driver)  //constructor
	{
		this.driver = driver;
	}
	
	
	public void multipleAuthorisation_select1 ()
	{
		try {
			selectPermission.click();
			Thread.sleep(1000);
		}
		catch (InterruptedException e)		{			e.printStackTrace();		}		
	}
	
	
	public void addHiveBrand ()
	{
		try {
			//added a command to scroll the page - if I clicked on the button directly, the cursor was trying to click on the footer where the button is not available.
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			System.out.println("page scrolled");
			addHiveBrandBtn.click();
			Thread.sleep(1000);
		}
		catch (InterruptedException e)		{			e.printStackTrace();		}		
	}
	
	
	public void addHiveLocation ()
	{
		try {
			//added a command to scroll the page - if I clicked on the button directly, the cursor was trying to click on the footer where the button is not available.
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			System.out.println("page scrolled");
			addHiveLocationBtn.click();
			Thread.sleep(1000);
		}
		catch (InterruptedException e)		{			e.printStackTrace();		}		
	}

}
