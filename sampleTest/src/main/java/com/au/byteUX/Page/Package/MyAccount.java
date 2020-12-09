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
	

	public MyAccount(WebDriver driver)  //constructor
	{
		this.driver = driver;
	}
	
	public void updateAccountDetails() throws InterruptedException
	{
		DCR.click();
		System.out.println("Update Account Details form is open");
		Thread.sleep(5000);
	}
	
	
	public void sendUserInvite() throws InterruptedException
	{
		sendInvite.click();
		System.out.println("Send User Invitation form is open");
		Thread.sleep(5000);
	}
	
	
	public void authorisationTab() throws InterruptedException
	{
		authorisation.click();
		System.out.println("Clicked on Authorisation Tab");
	}
	
	
	public void contactsTab() throws InterruptedException
	{
		contacts.click();
		System.out.println("Clicked on Contacts Tab");
	}
	
	
	public void interestsTab() throws InterruptedException
	{
		interests.click();
		System.out.println("Clicked on Interests Tab");
	}
	
	
	public void invoicesTab() throws InterruptedException
	{
		invoices.click();
		System.out.println("Clicked on Invoices Tab");
	}
	
	public String getAccountHeaderText()
	{
		return accountHeaderText.getText();
		
	}
	
	public String getAuthTabResult() {
		
		return authTabResult.getText();
	}
	
	public String getContactTabResult() {
		
		return contactTabResult.getText();
	}
	
	public String getInterestTabResult() {
		
		return interestTabResult.getText();
	}
	
    public String getInvoicesTabResult() {
		
		return invoicesTabResult.getText();
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
