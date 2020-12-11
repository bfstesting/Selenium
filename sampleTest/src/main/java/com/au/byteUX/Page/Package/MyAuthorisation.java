package com.au.byteUX.Page.Package;

import static org.testng.Assert.assertTrue;

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
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Cancel Authorisation')]") @CacheLookup WebElement cancelAuthAction;
	@FindBy(how=How.XPATH,using="//span[(text()='My Authorisation')]") @CacheLookup WebElement authTabResult;
	@FindBy(how=How.XPATH,using="//span[(text()='Notification Type')]") @CacheLookup WebElement noticesTabResult;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'EXPORT REGISTRATION INFO')]") @CacheLookup WebElement exportTabResult;
	@FindBy(how=How.XPATH,using="//span[text()='Date Changed']") @CacheLookup WebElement changeHistoryTabResult;
	@FindBy(how=How.XPATH,using="//div[text()='Update primary location']") @CacheLookup WebElement updatePrimaryLocation;
	@FindBy(how=How.XPATH,using="//span[text()='Cancel Registration']") @CacheLookup WebElement cancelAuthActionResult;
	@FindBy(how=How.XPATH,using="//span[text()='Update Primary Location Form']") @CacheLookup WebElement updatePrimaryLocationResult;
	@FindBy(how=How.XPATH,using="//span[text()='Notice of sale or disposal of Beehives']") @CacheLookup WebElement noticeActionResult;
	@FindBy(how=How.XPATH,using="//span[text()='']") @CacheLookup WebElement saveAndClose;
    @FindBy(how=How.XPATH,using="//span[text()='']") @CacheLookup WebElement saveAndCloseNotice;

	@FindBy(how=How.XPATH,using="//span[text()='Cancel']") @CacheLookup WebElement popUpCancel;



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
		catch (InterruptedException e)		{			e.getMessage();		}		
	}
	
	
	public void multipleAuthorisation_select_RTO ()
	{
		try {
			selectRTOPermission.click();
			Thread.sleep(1000);
		}
		catch (InterruptedException e)		{			e.getMessage();		}		
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
		catch (InterruptedException e)		{			e.getMessage();		}		
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
		catch (InterruptedException e)		{			e.getMessage();		
		}		
	}
	
	
	public void noticesTab() 
	{
		try {
		noticesTab.click();
		System.out.println("Clicked on Notices Tab");	
	}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
	public boolean getNoticesTabResult()  
	{
		return noticesTabResult.isDisplayed();		
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
		noticeAction.click();
		Thread.sleep(1000);
		System.out.println("Exiting noticeAction method");
	}
	
    public Boolean getAuthTabResult()  throws InterruptedException
    {
    		
		return  authTabResult.isDisplayed();//one method
	}
    
    public boolean getExportTabResult()  throws InterruptedException
    {
		return exportTabResult.getText() != null;  //one method 
	}
	
    public boolean getChangeHistoryTabResult()  throws InterruptedException
    {
    	//assertTrue(changeHistoryTabResult.isSelected());
    	return changeHistoryTabResult.isDisplayed();
		
	}
    //Actions
    
    public void updatePrimaryLocationClick()  
    {
    	try{
    		updatePrimaryLocation.click();
		System.out.println("Clicked on update Primary Location Action");
    	}
    	catch(Exception e)
    	{
    		e.getMessage();
    	}
	}
    
    public void noticeActionClick() throws InterruptedException
    {
    	try{
    		noticeAction.click();
    		System.out.println("Clicked on Notice of sale Action");
    	}
    	catch(Exception e)
    	{
    	      System.out.println("Failed to click Notice of sale Action");
    		e.getMessage();
    	}
    	
	}
    
    public void cancelAuthActionClick()  
    {
    	try{
    		cancelAuthAction.click();
    		System.out.println("Clicked on cancel Auth Action");
    	}
    	catch(Exception e)
    	{
    	      System.out.println("Failed to click cancel Auth Action");
    		e.getMessage();
    	}
    	
	}
    
    public void saveAndCloseClick()  
    {
    	try{
    		saveAndClose.click();
    	}
    	catch(Exception e)
    	{
    	      System.out.println("Failed to click Save and Close");
    		e.getMessage();
    	}
    	
	}
    
    public void saveAndCloseNoticeClick()  throws InterruptedException
    {
    	saveAndCloseNotice.click();
	}

    public void popupCancelClick()  throws InterruptedException
    {
    	popUpCancel.click();
	}
    public boolean getupdatePrimaryLocationResult()  throws InterruptedException
    {

    	return updatePrimaryLocationResult.isDisplayed();
		
	}
    
    public boolean getnoticeActionResult() throws InterruptedException
    {
    	
    	return noticeActionResult.isDisplayed();	
	}
  
    public boolean getcancelAuthActionResult()  
    {
    	Boolean result=false;
    	try{
    		result= cancelAuthActionResult.isDisplayed();
    	}
    	catch(Exception e)
    	{
    		result= false;
    	      System.out.println("Failed to load cancel Auth Result");
    		e.getMessage();
    	}
		return result;
    	
	}
    
}
