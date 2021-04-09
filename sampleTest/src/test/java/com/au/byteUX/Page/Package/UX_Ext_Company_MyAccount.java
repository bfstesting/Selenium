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
public class UX_Ext_Company_MyAccount {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//div[(text()='Update Account Details')]") @CacheLookup WebElement DCR;
	@FindBy(how=How.XPATH,using="//div[(text()='Send User Invitation')]") @CacheLookup WebElement sendInvite;
	@FindBy(how=How.XPATH,using="//span[text()='Authorisations']") @CacheLookup WebElement authorisation;
	@FindBy(how=How.XPATH,using="//span[text()='Contacts']") @CacheLookup WebElement contacts;
	@FindBy(how=How.XPATH,using="//span[text()='Interests']") @CacheLookup WebElement interests;
	@FindBy(how=How.XPATH,using="//span[text()='Unpaid Invoices']") @CacheLookup WebElement unpaidInvoices;
	@FindBy(how=How.XPATH,using="//span[text()='All Invoices']") @CacheLookup WebElement allInvoices;
	@FindBy(how=How.XPATH,using="//span[text()='Audits']") @CacheLookup WebElement audits;
	@FindBy(how=How.XPATH,using="//span[text()='Inspections']") @CacheLookup WebElement inspections;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Account holder information')]") @CacheLookup WebElement accountHeaderText;
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Authority Number')]") @CacheLookup WebElement authTabResult;
	@FindBy(how=How.XPATH,using="//span[contains(text(),'First Name')]") @CacheLookup WebElement contactTabResult;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Interests')]") @CacheLookup WebElement interestTabResult;
	@FindBy(how=How.XPATH,using="//div[text()='Unpaid Invoices']") @CacheLookup WebElement invoicesTabResult;
	@FindBy(how=How.XPATH,using="//div[text()='All Invoices']") @CacheLookup WebElement allInvoicesTabResult;
	@FindBy(how=How.XPATH,using="//div[text()='Audits']") @CacheLookup WebElement auditsTabResult;
	@FindBy(how=How.XPATH,using="//div[text()='Inspections']") @CacheLookup WebElement inspectionsTabResult;
	@FindBy(how=How.XPATH,using="//span[text()='Update Account Request Form']") @CacheLookup WebElement updateAccountDetailsForm;
	@FindBy(how=How.XPATH,using="//span[text()='']") @CacheLookup WebElement saveAndClose;
	@FindBy(how=How.XPATH,using="//span[text()='OK']") @CacheLookup WebElement okSendUserInvite;
	@FindBy(how=How.XPATH,using="//span[text()='User Invitation']") @CacheLookup WebElement senduserInviteForm;
	//@FindBy(how=How.XPATH,using="//span[text()='User Invitation']") @CacheLookup WebElement closeUserInvite;

	public UX_Ext_Company_MyAccount(WebDriver driver)  //constructor
	{
		this.driver = driver;
	}
	//update account details
	public boolean updateAccountDetails() 
	{
		try{
			DCR.click();
			System.out.println("Clicked on Update Account Details");
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
			System.out.println("Clicked on Send User Invitation");
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
	
	//click on unpaid invoices tab
	public boolean invoicesTab()
	{
		try{
			unpaidInvoices.click();
			System.out.println("Clicked on unpaid Invoices Tab");
    		return true;
    	}
    	catch(Exception e)
    	{
    	    e.getMessage();
    	    return false;
    	}
	}
	
	//click on All invoices
	public boolean allInvoicesTab()
	{
		try{
			allInvoices.click();
			System.out.println("Clicked on All Invoices Tab");
    		return true;
    	}
    	catch(Exception e)
    	{
    	    e.getMessage();
    	    return false;
    	}
	}

	//click on Auidts
		public boolean auditsTab()
		{
			try{
				audits.click();
				System.out.println("Clicked on Audits Tab");
	    		return true;
	    	}
	    	catch(Exception e)
	    	{
	    	    e.getMessage();
	    	    return false;
	    	}
		}
		//click on Inspections tab
		public boolean inspectionsTab()
		{
			try{
				inspections.click();
				System.out.println("Clicked on inspections Tab");
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
	// verify unpaid Invoices tab result
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
	// verify All Invoices tab result
    public Boolean getAllInvoicesTabResult() {
		Boolean result=false;
    	try{
    		result= allInvoicesTabResult.isDisplayed();
    	}
    	catch(Exception e)
    	{
    		result= false;
    		e.getMessage();
    	}
		return result;
	}
    // verify Audit tab result
    public Boolean getAuditTabResult() {
		Boolean result=false;
    	try{
    		result= auditsTabResult.isDisplayed();
    	}
    	catch(Exception e)
    	{
    		result= false;
    		e.getMessage();
    	}
		return result;
	}
 // verify inspection tab result
    public Boolean getInspectionTabResult() {
		Boolean result=false;
    	try{
    		result= inspectionsTabResult.isDisplayed();
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
    		Thread.sleep(2000);
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
