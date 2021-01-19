/**
 * 
 */
package com.au.byteUX.Page.Package;

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
 * Page Object for RTO
 * 
 *
 */
public class UX_BKR_Lic_Permission_RTO {
	
WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//span[text()='Training Information']") @CacheLookup WebElement trainingInfoTab;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Training Delivery Method')]") @CacheLookup WebElement trainingDeliverMthdText;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Training Languages')]") @CacheLookup WebElement trainingLangText;
	@FindBy(how=How.XPATH,using="//div[starts-with(text(),'Training Areas')]") @CacheLookup WebElement trainingAreasText;
	@FindBy(how=How.XPATH,using="//div[starts-with(text(),'Units')]") @CacheLookup WebElement unitsText;
		
	@FindBy(how=How.XPATH,using="//span[text()='Trainer']") @CacheLookup WebElement trainerTab;
	@FindBy(how=How.XPATH,using="//div[text()='Trainers']") @CacheLookup WebElement trainersText;
		
	@FindBy(how=How.XPATH,using="//span[text()='Training']") @CacheLookup WebElement trainingTab;
	@FindBy(how=How.XPATH,using="//span[text()='Add Training']") @CacheLookup WebElement addTrainingBtn;
	
	@FindBy(how=How.XPATH,using="//span[text()='Payments']") @CacheLookup WebElement paymentsTab;
	@FindBy(how=How.XPATH,using="//div[starts-with(text(),'Payments')]") @CacheLookup WebElement paymentsText;
	
	@FindBy(how=How.XPATH,using="//span[text()='Export']") @CacheLookup WebElement exportRTOTab;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Export')]") @CacheLookup WebElement exportText;
	
	@FindBy(how=How.XPATH,using="//span[text()='Change History']") @CacheLookup WebElement changeHistoryRTOTab;
	@FindBy(how=How.XPATH,using="//span[starts-with(text(),'Date Changed')]") @CacheLookup WebElement dateChangedText;
	
	
	/*@FindBy(how=How.XPATH,using="//div[contains(text(),'Issue Certificate')]") @CacheLookup WebElement issueCertAction;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Certificates Issued')]") @CacheLookup WebElement certIssuedAction;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Request Stats Report')]") @CacheLookup WebElement reqStatsReportAction;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Order Blank Certificate Stock')]") @CacheLookup WebElement orderBlankCertAction;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Cancel Auth')]") @CacheLookup WebElement cancelAuthAction;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Trainer Management')]") @CacheLookup WebElement trainerMgtAction;*/
	
	//Actions
	@FindBy(how=How.XPATH,using="//div[text()='Issue Certificate']") @CacheLookup WebElement issueCertificate;
	@FindBy(how=How.XPATH,using="//span[text()='Issue Certificate']") @CacheLookup WebElement headerOnIssueCert;
	@FindBy(how=How.XPATH,using="//span[text()='Back']") @CacheLookup WebElement back;
	@FindBy(how=How.XPATH,using="//span[text()='No']") @CacheLookup WebElement clickNoBtn;
	@FindBy(how=How.XPATH,using="//span[text()='Cancel']") @CacheLookup WebElement clickCancelBtn;
	@FindBy(how=How.XPATH,using="//div[text()='Cancel Authorisation']") @CacheLookup WebElement cancelAuthorisation;
	@FindBy(how=How.XPATH,using="//span[text()='Cancel Registration']") @CacheLookup WebElement headerOnCancelAuth;
	@FindBy(how=How.XPATH,using="//html/body/div[18]/div[1]/.//div[2]/div") @CacheLookup WebElement cancelBtn;
		
	public UX_BKR_Lic_Permission_RTO(WebDriver driver)  //constructor
	{
		this.driver = driver;
	}
	
		
	public boolean trainingInfoTab(){
		try{
			//added a command to scroll the page 
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			System.out.println("page scrolled");
			Thread.sleep(2000);
			trainingInfoTab.click();
		System.out.println("Clicked on Training Info Tab");
		return true;
		}
		catch(Exception e){
			e.getMessage();
			return false;
		}
	}
	
	
	public boolean trainingInfoTabResult(){
	    	Boolean result=false;
	    	try{
	    		result= trainingDeliverMthdText.isDisplayed();
	    	}
	    	catch(Exception e){
	    		result= false;
	    		e.getMessage();
	    	}
			return result;	
	}
	
	
	public boolean trainerTab(){
		try{
			trainerTab.click();
		System.out.println("Clicked on Trainer Tab");
		return true;
		}
		catch(Exception e){
			e.getMessage();
			return false;
		}
	}
	
	
	public boolean trainerTabResult(){
	    	Boolean result=false;
	    	try{
	    		result= trainersText.isDisplayed();
	    	}
	    	catch(Exception e){
	    		result= false;
	    		e.getMessage();
	    	}
			return result;	
	}
	
	
	public boolean trainingTab(){
		try{
			trainingTab.click();
		System.out.println("Clicked on Training Tab");
		return true;
		}
		catch(Exception e){
			e.getMessage();
			return false;
		}
	}
	
	
	public boolean trainingTabResult(){
	    	Boolean result=false;
	    	try{
	    		result= addTrainingBtn.isEnabled();
	    	}
	    	catch(Exception e){
	    		result= false;
	    		e.getMessage();
	    	}
			return result;	
	}
	
	
	public boolean paymentsTab(){
		try{
			paymentsTab.click();
		System.out.println("Clicked on Payments Tab");
		return true;
		}
		catch(Exception e){
			e.getMessage();
			return false;
		}
	}
	
	
	public boolean paymentsTabResult(){
	    	Boolean result=false;
	    	try{
	    		result= paymentsText.isDisplayed();
	    	}
	    	catch(Exception e){
	    		result= false;
	    		e.getMessage();
	    	}
			return result;	
	}
	
	
	public boolean exportRTOTab(){
		try{
			exportRTOTab.click();
		System.out.println("Clicked on Export Tab");
		return true;
		}
		catch(Exception e){
			e.getMessage();
			return false;
		}
	}
	
	
	public boolean exportRTOTabResult(){
	    	Boolean result=false;
	    	try{
	    		result= exportText.isDisplayed();
	    	}
	    	catch(Exception e){
	    		result= false;
	    		e.getMessage();
	    	}
			return result;	
	}
	
	
	public boolean changeHistoryRTOTab(){
		try{
			changeHistoryRTOTab.click();
		System.out.println("Clicked on Change History Tab");
		return true;
		}
		catch(Exception e){
			e.getMessage();
			return false;
		}
	}
	
	
	public boolean changeHistoryRTOTabResult(){
	    	Boolean result=false;
	    	try{
	    		result= dateChangedText.isDisplayed();
	    	}
	    	catch(Exception e){
	    		result= false;
	    		e.getMessage();
	    	}
			return result;	
	}
	//Click Actions
	//Click on Issue Certificate
	 public boolean IssueCertificateClick(){
	    	try{
	    		issueCertificate.click();
			System.out.println("Clicked on Issue Certificate Action");
			return true;
	    	}
	    	catch(Exception e)
	    	{
	    		e.getMessage();
	    		return false;
	    	}
		}
	 //Get Issue certificate form Result
	 public Boolean getheaderOnIssueCert(){
	    	Boolean result=false;
	    	try{
	    		result= headerOnIssueCert.isDisplayed();
	    	}
	    	catch(Exception e)
	    	{
	    		result= false;
	    		e.getMessage();
	    	}
			return result;
		}
public Boolean clickNoButton() {
		 
		 Boolean result=false;
	    	try{
	    		clickNoBtn.click();
	    		result = true;
	    	}
	    	catch(Exception e)
	    	{
	    		result= false;
	    		e.getMessage();
	    	}
			return result;
	 }
		
		//click back button
	 public void backButtonClick(){
	    	try{
	    		back.click();
	    	}
	    	catch(Exception e)
	    	{
	    	      System.out.println("Failed to click back button");
	    		e.getMessage();
	    	}
		}	
	 //Click Cancel Button
		 public Boolean clickCancelButton() {
			 
			 Boolean result=false;
		   	try{
		   		clickCancelBtn.click();
		   		result = true;
		   	}
		   	catch(Exception e)
		   	{
		   		result= false;
		   		e.getMessage();
		   	}
				return result;
		}
	//Click Cancel Authorisation Action
			public Boolean clickCancelAuthorisation() {
				 
				 Boolean result=false;
			   	try{
			   		cancelAuthorisation.click();
			   		result = true;
			   	}
			   	catch(Exception e)
			   	{
			   		result= false;
			   		e.getMessage();
			   	}
					return result;
			}
	//Get header On Cancel Auth form
			public Boolean headerOnCancelAuth(){
			   	Boolean result=false;
			   	try{
			   		result= headerOnCancelAuth.isDisplayed();
			   	}
			   	catch(Exception e)
			   	{
			   		result= false;
			   		e.getMessage();
			   	}
					return result;
				}
}
