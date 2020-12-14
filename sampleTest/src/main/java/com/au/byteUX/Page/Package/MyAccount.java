package com.au.byteUX.Page.Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


/**
 * @author sarkah01
 *
 */
public class MyAccount {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//div[(text()='Update Account Details')]") @CacheLookup WebElement DCR;
	@FindBy(how=How.XPATH,using="//div[(text()='Send User Invitation')]") @CacheLookup WebElement sendInvite;
	@FindBy(how=How.XPATH,using="//span[text()='Authorisations']") @CacheLookup WebElement authorisation;
	@FindBy(how=How.XPATH,using="//span[text()='Contacts']") @CacheLookup WebElement contacts;
	@FindBy(how=How.XPATH,using="//span[text()='Interests']") @CacheLookup WebElement interests;
	@FindBy(how=How.XPATH,using="//span[text()='Invoices']") @CacheLookup WebElement invoices;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Account holder information')]") @CacheLookup WebElement accountHeaderText;
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Authority Number')]") @CacheLookup WebElement authTabResult;
	@FindBy(how=How.XPATH,using="//span[contains(text(),'First Name')]") @CacheLookup WebElement contactTabResult;
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Pref Comm Method')]") @CacheLookup WebElement interestTabResult;
	@FindBy(how=How.XPATH,using="//div[text()='Unpaid Invoices']") @CacheLookup WebElement invoicesTabResult;
	@FindBy(how=How.XPATH,using="//span[text()='Update Account Request Form']") @CacheLookup WebElement updateAccountDetailsForm;
	@FindBy(how=How.XPATH,using="//span[text()='']") @CacheLookup WebElement saveAndClose;
	@FindBy(how=How.XPATH,using="//span[text()='OK']") @CacheLookup WebElement okSendUserInvite;
	@FindBy(how=How.XPATH,using="//span[text()='User Invitation']") @CacheLookup WebElement senduserInviteForm;
	//@FindBy(how=How.XPATH,using="//span[text()='User Invitation']") @CacheLookup WebElement closeUserInvite;

	public MyAccount(WebDriver driver)  //constructor
	{
		this.driver = driver;
	}
	//update account details
	public boolean updateAccountDetails() 
	{
		try{
			DCR.click();
			System.out.println("Update Account Details form is open");
			Thread.sleep(5000);
    		return true;
    	}
    	catch(Exception e)
    	{
    	    e.getMessage();
    	    return false;
    	}
	}
	//Send User Invite
	public boolean sendUserInvite()
	{
		try{
			sendInvite.click();
			System.out.println("Send User Invitation form is open");
			Thread.sleep(5000);
    		return true;
    	}
    	catch(Exception e)
    	{
    	    e.getMessage();
    	    return false;
    	}
	}
	
	//click on Authorisation tab
	public boolean authorisationTab()
	{
		try{
			authorisation.click();
			System.out.println("Clicked on Authorisation Tab");
    		return true;
    	}
    	catch(Exception e)
    	{
    	    e.getMessage();
    	    return false;
    	}
	}
	
	// click on contacts tab
	public boolean contactsTab()
	{
		try{
			contacts.click();
			System.out.println("Clicked on Contacts Tab");
    		return true;
    	}
    	catch(Exception e)
    	{
    	    e.getMessage();
    	    return false;
    	}
	}
	
	//click on interests tab
	public boolean interestsTab() 
	{
		try{
			interests.click();
			System.out.println("Clicked on Interests Tab");
    		return true;
    	}
    	catch(Exception e)
    	{
    	    e.getMessage();
    	    return false;
    	}
	}
	
	//click on invoices tab
	public boolean invoicesTab()
	{
		try{
			invoices.click();
			System.out.println("Clicked on Invoices Tab");
    		return true;
    	}
    	catch(Exception e)
    	{
    	    e.getMessage();
    	    return false;
    	}
	}
	//verifying Account Header is displayed
	public Boolean getAccountHeaderText()
	{
		Boolean result=false;
    	try{
    		result= accountHeaderText.isDisplayed();
    	}
    	catch(Exception e)
    	{
    		result= false;
    		e.getMessage();
    	}
		return result;
	}
	//Verify Auth Tab Result
	public Boolean getAuthTabResult() {
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
	//verify Contact tab result
	public Boolean getContactTabResult() {
		Boolean result=false;
    	try{
    		result= contactTabResult.isDisplayed();
    	}
    	catch(Exception e)
    	{
    		result= false;
    		e.getMessage();
    	}
		return result;
	}
	// verify Interest tab result
	public Boolean getInterestTabResult() {
		Boolean result=false;
    	try{
    		result= interestTabResult.isDisplayed();
    	}
    	catch(Exception e)
    	{
    		result= false;
    		e.getMessage();
    	}
		return result;
	}
	// verify Invoices tab result
    public Boolean getInvoicesTabResult() {
		Boolean result=false;
    	try{
    		result= invoicesTabResult.isDisplayed();
    	}
    	catch(Exception e)
    	{
    		result= false;
    		e.getMessage();
    	}
		return result;
	}
    
    //Verify UpdatePrmiary Location form in My Account- exists
    public Boolean getUpdateAccountDetailsResult() {
		Boolean result=false;
    	try{
    		result= updateAccountDetailsForm.isDisplayed();
    	}
    	catch(Exception e)
    	{
    		result= false;
    		e.getMessage();
    	}
		return result;
	}
    
    //Save and close update primary location form
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
    
    //verify send user invite form in MyAccount - exists
    public Boolean getsendUserInviteResult() {
		Boolean result=false;
    	try{
    		result= senduserInviteForm.isDisplayed();
    	}
    	catch(Exception e)
    	{
    		result= false;
    		e.getMessage();
    	}
		return result;
	}
    
    public boolean okButtonClick()  
    {
    	try{
    		okSendUserInvite.click();
    		return true;
    	}
    	catch(Exception e)
    	{
    	      System.out.println("Failed to click Ok button in send user invite");
    		e.getMessage();
    	}
		return false;
    	
	}
	
	/*
	
	public void addInterests() throws InterruptedException
	{
		interests.click();
		
		LoginPage AddButton = PageFactory.initElements(driver, LoginPage.class);
		AddButton.addTemplate();
		
		while
		
		for (int i = 0; i < 5; i++)
		{
			System.out.println("Total number of rows = ");
		}
		
		private table tables = new table;
			//	driver.findElement(By.xpath("//div[4]/div/div/div[2]/div[2]/div[2]/div[1]"));
		//div[4]/div/div/div[2]/div[2]/div[2]/div[1]/div[3]/table[3]/tbody/tr/td[3]/div
		
		
		System.out.println("Clicked on Invoices Tab");
	}
	*/

}
