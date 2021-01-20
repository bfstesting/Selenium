/**
 * 
 */
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
public class UX_User_Invitation {

WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//span[text()='OK']") @CacheLookup WebElement selectOK;
	@FindBy(how=How.XPATH,using="//span[text()='Cancel']") @CacheLookup WebElement selectCancel;
	@FindBy(how=How.XPATH,using="//span[text()='User Invitation']") @CacheLookup WebElement verifyFormTitle;
	@FindBy(how=How.NAME,using="EmailAddress") @CacheLookup WebElement enterEmail;
	@FindBy(how=How.NAME,using="ConfirmEmail") @CacheLookup WebElement enterConfirmEmail;
	@FindBy(how=How.XPATH,using="//div[15]/div[1]/div/div/div[2]/div") @CacheLookup WebElement formCloseX;
	@FindBy(how=How.XPATH,using="//div[2]/.//div[1]/div/.//div/.//span[text()='Save']") @CacheLookup WebElement formSaveBtn;
	@FindBy(how=How.XPATH,using="//div[2]/.//div[1]/div/.//div/.//span[text()='Close']") @CacheLookup WebElement formCloseBtn;
	@FindBy(how=How.XPATH,using="//tr[1]/td/label[.//span[text()='Email']]/div/div/div[2]") @CacheLookup WebElement sendEmail;
	@FindBy(how=How.XPATH,using="//label[.//span[text()='Confirm Email']]/div/div/div[2]") @CacheLookup WebElement sendConfirmEmail;
	@FindBy(how=How.XPATH,using="//span[text()='Yes']") @CacheLookup WebElement selectYes;
	@FindBy(how=How.XPATH,using="//span[text()='No']") @CacheLookup WebElement selectNo;
	
	
	//License Category selection for multiple categories
	
	
	
	//Errors - invalid email address is provided - get text for below xpath's to verify
	@FindBy(how=How.XPATH,using="//div[starts-with(text(),'The specified')]") @CacheLookup WebElement invalidEmailE1;
	@FindBy(how=How.XPATH,using="//div[starts-with(text(),'Please')]") @CacheLookup WebElement invalidEmailE2;
	
	
	public UX_User_Invitation(WebDriver driver)  //constructor
	{
		this.driver = driver;
	}
	
		
	public boolean SendUserInvitation(String emailAddress){
		try{
			//added a command to scroll the page 
			selectOK.click();
			Thread.sleep(1000);
			enterEmail.clear();
			enterEmail.sendKeys(emailAddress);
			enterConfirmEmail.clear();
			enterConfirmEmail.sendKeys(emailAddress);
			
			//completed only up-till here.
			
			
			selectYes.click();
		System.out.println("Clicked on Training Info Tab");
		return true;
		}
		catch(Exception e){
			e.getMessage();
			return false;
		}
	}
	
	
	
	
}
