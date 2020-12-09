package com.au.byteUX.Page.Package;

import java.sql.Driver;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
	@CacheLookup WebElement selectBeePermission;
	
	
	@FindBy(how=How.XPATH,using="//tbody/tr[.//td[2]/div[text()='"
			+ "RTO Approval" //Enter the permission name 
			+ "'] and .//td[5]/div[text()='"
			+ "Approved" // Status of the permission
			+ "']]")
	@CacheLookup WebElement selectRTOPermission;
	
	@FindBy(how=How.XPATH,using="//span[text()='Add Hive Brand']") @CacheLookup WebElement addHiveBrandBtn;
	@FindBy(how=How.XPATH,using="//span[text()='Add Hive Location']") @CacheLookup WebElement addHiveLocationBtn;
	@FindBy(how=How.XPATH,using="//span[text()='Notices']") @CacheLookup WebElement noticesTab;
	@FindBy(how=How.XPATH,using="//span[text()='Export']") @CacheLookup WebElement exportTab;
	@FindBy(how=How.XPATH,using="//span[text()='Change History']") @CacheLookup WebElement changeHistoryTab;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Notice of sale')]") @CacheLookup WebElement noticeAction;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Renew my')]") @CacheLookup WebElement renewAction;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Cancel Auth')]") @CacheLookup WebElement cancelAuthAction;
	@FindBy(how=How.XPATH,using="//span[(text()='My Authorisation')]") @CacheLookup WebElement authTabResult;
	@FindBy(how=How.XPATH,using="//span[(text()='Notification Type')]") @CacheLookup WebElement noticesTabResult;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'EXPORT REGISTRATION INFO')]") @CacheLookup WebElement exportTabResult;
	@FindBy(how=How.XPATH,using="//span[text()='Date Changed']") @CacheLookup WebElement changeHistoryTabResult;

	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy ");
	Date date = new Date();
	String date1= dateFormat.format(date);
	
	String entry = "//table[1]/.//td[3]/div[text()='" + date1 + "']";
		
	
	@FindBy(how=How.XPATH,using="//table[1]/.//td[3]/div[text()='"
	+ "25/11/2020" //Get this date field from system date
	+ "']") @CacheLookup WebElement rowInNoticesTab;
	
	
	
	public MyAuthorisation(WebDriver driver)  //constructor
	{
		this.driver = driver;
	}
	
	
	public String date() throws InterruptedException
	{
		return date1;		
	}
	
	
	public void multipleAuthorisation_select_Bee ()
	{
		try {
			selectBeePermission.click();
			Thread.sleep(1000);
		}
		catch (InterruptedException e)		{			e.printStackTrace();		}		
	}
	
	
	public void multipleAuthorisation_select_RTO ()
	{
		try {
			selectRTOPermission.click();
			Thread.sleep(1000);
		}
		catch (InterruptedException e)		{			e.printStackTrace();		}		
	}
	
	
	public void addHiveBrand()
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
	
	
	public void addHiveLocation()
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
	
	
	public void noticesTab()
	{
		noticesTab.click();
		System.out.println("Clicked on Notices Tab");
	
		//add scripts for rowInNoticesTab
		//rowInNoticesTab.isDisplayed();		
	}
	
	public String getNoticesTabResult() {
		return noticesTabResult.getText();		
	}
	public void exportTabClick() throws InterruptedException
	{
		exportTab.click();
		System.out.println("Clicked on Export Tab");
	}
	
	
	public void changeHistoryTabClick() throws InterruptedException
	{
		changeHistoryTab.click();
		System.out.println("Clicked on Change History Tab");
	}
	
	public void noticeAction() throws InterruptedException
	{
		System.out.println("Inside noticeAction method");
		noticeAction.click();
		Thread.sleep(1000);
		System.out.println("Exiting noticeAction method");
	}
	
    public String getAuthTabResult() {
		return authTabResult.getText();
	}
    
    public String getExportTabResult() {
		return exportTabResult.getText();
	}
	
    public String getChangeHistoryTabResult() {
		return changeHistoryTabResult.getText();
	}
	
	

}
