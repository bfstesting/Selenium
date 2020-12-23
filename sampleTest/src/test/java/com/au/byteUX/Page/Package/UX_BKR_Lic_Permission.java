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
public class UX_BKR_Lic_Permission {
	
WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//div[4]/.//span[text()='Training Information']") @CacheLookup WebElement trainingInfoTab;
	@FindBy(how=How.XPATH,using="//div[4]/.//div[contains(text(),'Training Delivery Method')]") @CacheLookup WebElement trainingDeliverMthdText;
	@FindBy(how=How.XPATH,using="//div[4]/.//div[contains(text(),'Training Languages')]") @CacheLookup WebElement trainingLangText;
	@FindBy(how=How.XPATH,using="//div[4]/.//div[4]/.//div[starts-with(text(),'Training Areas')]") @CacheLookup WebElement trainingAreasText;
	@FindBy(how=How.XPATH,using="//div[4]/.//div[starts-with(text(),'Units')]") @CacheLookup WebElement unitsText;
		
	@FindBy(how=How.XPATH,using="//div[4]/.//span[text()='Trainer']") @CacheLookup WebElement trainerTab;
	@FindBy(how=How.XPATH,using="//div[4]/.//div[text()='Trainers']") @CacheLookup WebElement trainersText;
		
	@FindBy(how=How.XPATH,using="//div[4]/.//span[text()='Training']") @CacheLookup WebElement trainingTab;
	@FindBy(how=How.XPATH,using="//div[4]/.//div[4]/.//span[text()='Add Training']") @CacheLookup WebElement addTrainingBtn;
	
	@FindBy(how=How.XPATH,using="//div[4]/.//span[text()='Payments']") @CacheLookup WebElement paymentsTab;
	@FindBy(how=How.XPATH,using="//div[4]/.//div[starts-with(text(),'Payments')]") @CacheLookup WebElement paymentsText;
	
	@FindBy(how=How.XPATH,using="//div[4]/.//span[text()='Export']") @CacheLookup WebElement exportRTOTab;
	@FindBy(how=How.XPATH,using="//div[4]/.//div[starts-with(text(),'EXPORT REGISTRATION')]") @CacheLookup WebElement exportText;
	
	@FindBy(how=How.XPATH,using="//div[4]/.//span[text()='Change History']") @CacheLookup WebElement changeHistoryRTOTab;
	@FindBy(how=How.XPATH,using="//div[4]/.//span[starts-with(text(),'Date Changed')]") @CacheLookup WebElement dateChangedText;
	
	
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Issue Certificate')]") @CacheLookup WebElement issueCertAction;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Certificates Issued')]") @CacheLookup WebElement certIssuedAction;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Request Stats Report')]") @CacheLookup WebElement reqStatsReportAction;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Order Blank Certificate Stock')]") @CacheLookup WebElement orderBlankCertAction;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Cancel Auth')]") @CacheLookup WebElement cancelAuthAction;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Trainer Management')]") @CacheLookup WebElement trainerMgtAction;
	
		
	public UX_BKR_Lic_Permission(WebDriver driver)  //constructor
	{
		this.driver = driver;
	}
	
		
	public boolean trainingInfoTab(){
		try{
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
	
	
	

}
