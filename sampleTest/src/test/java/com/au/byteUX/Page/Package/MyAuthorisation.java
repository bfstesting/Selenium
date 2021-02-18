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

import com.au.byteUX.Package.ScrollByPage;

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
	
	//@FindBy(how=How.XPATH,using="//span[text()='Add Hive Brand']") @CacheLookup WebElement addHiveBrandBtn;
	@FindBy(how=How.XPATH,using="//div[2]/div[1]/div/div/div[2]/div[1]/.//div[2]/div") @CacheLookup WebElement addHiveBrandBtn;
	@FindBy(how=How.XPATH,using="//div[2]/div[1]/div/div/div[3]/div[1]/.//div[2]/div") @CacheLookup WebElement addHiveLocationBtn;
	@FindBy(how=How.XPATH,using="//span[text()='Notices']") @CacheLookup WebElement noticesTab;
	@FindBy(how=How.XPATH,using="//span[text()='Export']") @CacheLookup WebElement exportTab;
	@FindBy(how=How.XPATH,using="//span[text()='Change History']") @CacheLookup WebElement changeHistoryTab;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Notice of sale')]") @CacheLookup WebElement noticeAction;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Renew my')]") @CacheLookup WebElement renewAction;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Cancel Authorisation')]") @CacheLookup WebElement cancelAuthAction;
	@FindBy(how=How.XPATH,using="//span[(text()='My Authorisation')]") @CacheLookup WebElement authTabResult;
	@FindBy(how=How.XPATH,using="//span[(text()='Notification Type')]") @CacheLookup WebElement noticesTabResult;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Export')]") @CacheLookup WebElement exportTabResult;
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
	
	
	public boolean multipleAuthorisation_select_Bee(){
		try {
			selectBeePermission.click();
			Thread.sleep(1000);
			return true;
		}
		catch (Exception e)		{			e.getMessage();	
		return false;		
	}
	}
	public boolean multipleAuthorisation_select_RTO(){
		try {
			selectRTOPermission.click();
			Thread.sleep(1000);
			return true;
		}
		catch (InterruptedException e)		{			e.getMessage();		}
		return false;		
	}
	
	
	public void addHiveBrand(){
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
	
	
	public void addHiveLocation(){
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
	
	
	public boolean noticesTab(){
		try {
		noticesTab.click();
		System.out.println("Clicked on Notices Tab");
		return true;
	}
		catch(Exception e)
		{
			e.getMessage();
			return false;
		}
	}
	
	public boolean getNoticesTabResult(){
		Boolean result=false;
    	try{
    		result= noticesTabResult.isDisplayed();
    	}
    	catch(Exception e)
    	{
    		result= false;
    		e.getMessage();
    	}
		return result;
				
	}
	
	public boolean exportTabClick(){
		try {
			exportTab.click();
			System.out.println("Clicked on Export Tab");
			return true;
		}
			catch(Exception e)
			{
				e.getMessage();
				return false;
			}
	}
	
	
	public boolean changeHistoryTabClick(){
		try {
			changeHistoryTab.click();
			System.out.println("Clicked on Change History Tab");
			return true;
		}
			catch(Exception e)
			{
				e.getMessage();
				return false;
			}
	}
	
	public Boolean noticeAction(){
		try {
			noticeAction.click();
			Thread.sleep(1000);
			System.out.println("Exiting noticeAction method");
			return true;
		}
			catch(Exception e)
			{
				e.getMessage();
				return false;
			}
	}
	
    public Boolean getAuthTabResult(){
    	Boolean result=false;
    	try{
    		result= authTabResult.isDisplayed();
    	}
    	catch(Exception e)
    	{
    		result= false;
    		e.getMessage();
    	}
		return result;	
	}
    
    public boolean getExportTabResult(){
		Boolean result=false;
    	try{
    		result= exportTabResult.isDisplayed();
    	}
    	catch(Exception e)
    	{
    		result= false;
    		e.getMessage();
    	}
		return result;
    }
	
    public boolean getChangeHistoryTabResult(){
    	Boolean result=false;
    	try{
    		result= changeHistoryTabResult.isDisplayed();
    	}
    	catch(Exception e)
    	{
    		result= false;
    		e.getMessage();
    	}
		return result;
	}
    //Actions
    
    public boolean updatePrimaryLocationClick(){
    	try{
    		updatePrimaryLocation.click();
		System.out.println("Clicked on update Primary Location Action");
		return true;
    	}
    	catch(Exception e)
    	{
    		e.getMessage();
    		return false;
    	}
	}
    
    public Boolean noticeActionClick(){
    	try{
    		noticeAction.click();
    		System.out.println("Clicked on Notice of sale Action");
    		return true;
    	}
    	catch(Exception e)
    	{
    		e.getMessage();
    		return false;
    	}
    	
	}
    
    public Boolean cancelAuthActionClick(){
    	try{
    		cancelAuthAction.click();
    		System.out.println("Clicked on cancel Auth Action");
    		return true;
    		
    	}
    	catch(Exception e)
    	{
    	    e.getMessage();
    	    return false;
    		
    	}
    	
	}
    
    public void saveAndCloseClick(){
    	try{
    		saveAndClose.click();
    	}
    	catch(Exception e)
    	{
    	      System.out.println("Failed to click Save and Close");
    		e.getMessage();
    	}
    	
	}
    
    public void saveAndCloseNoticeClick(){
    	try{
    		saveAndCloseNotice.click();
    	}
    	catch(Exception e)
    	{
    	      System.out.println("Failed to click Save and Close");
    		e.getMessage();
    	}
	}

    public boolean popupCancelClick(){
    	try{
    		JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			System.out.println("page scrolled");
			Thread.sleep(2000);
    		/*ScrollByPage scrollByPage= new ScrollByPage();
    		scrollByPage.ByPage();
    		System.out.println("Page scrolled");*/
    		popUpCancel.click();
    		System.out.println("Clicked cancel on the Popup");
    		return true;
    	}
    	catch(Exception e)
    	{
    	      System.out.println("Failed to click Cancel on the popup");
    		e.getMessage();
    	}
    	return false;
	}
    
    public Boolean getupdatePrimaryLocationResult(){
    	Boolean result=false;
    	try{
    		result= updatePrimaryLocationResult.isDisplayed();
    	}
    	catch(Exception e)
    	{
    		result= false;
    		e.getMessage();
    	}
		return result;
	}
    
    
    public Boolean getnoticeActionResult(){
    	Boolean result=false;
    	try{
    		result= noticeActionResult.isDisplayed();
    	}
    	catch(Exception e)
    	{
    		result= false;
    		e.getMessage();
    	}
		return result;
	}
  
    public Boolean getcancelAuthActionResult(){
    	Boolean result=false;
    	try{
    		result= cancelAuthActionResult.isDisplayed();
    	}
    	catch(Exception e)
    	{
    		result= false;
    		e.getMessage();
    	}
		return result;
    	
	}
    
}
