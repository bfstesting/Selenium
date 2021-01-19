package com.au.byteUX.Page.Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CertificatesIssued {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//div[text()='Certificates Issued']") @CacheLookup WebElement certificatesIssued;
	@FindBy(how=How.XPATH,using="//span[text()='Reprint Certificate']") @CacheLookup WebElement headerOnCertIssued;

	@FindBy(how=How.XPATH,using="//div/div/div[2]/div[2]/.//div[3]/table[1]/.//span") @CacheLookup WebElement selectTrainerToChangeName;
	@FindBy(how=How.XPATH,using="//div[text()='Request Name Change']") @CacheLookup WebElement requestNameChange;
	@FindBy(how=How.XPATH,using="//span[text()='Certificate Change Request']") @CacheLookup WebElement headerOnNameChange;
	@FindBy(how=How.XPATH,using="//span[text()='Reprint Certificate']") @CacheLookup WebElement getCertificateIssuesHeaderText;
	@FindBy(how=How.XPATH,using="//div[.//span[text()='RESULTS']]/.//div[starts-with(text(),'Certificate') and contains(text(),')')]") @CacheLookup WebElement getTableHeader;
	@FindBy(how=How.XPATH,using="//div[.//span[text()='RESULTS']]/div[2]/div[2]/div/div/div/div[2]/.//table[1]") @CacheLookup WebElement selectCertificate;
	@FindBy(how=How.XPATH,using="//div[text()='Reprint']") @CacheLookup WebElement clickReprint;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Please enter reprint')]") @CacheLookup WebElement getReprintPopupText;
	@FindBy(how=How.XPATH,using="//div[text()='Request Name Change']") @CacheLookup WebElement clickReqNameChng;
	@FindBy(how=How.XPATH,using="//span[text()='Certificate Change Request']") @CacheLookup WebElement getCertChgReqHeadTxt;
	

	
	public CertificatesIssued(WebDriver driver)  //constructor
	{
		this.driver = driver;
	}
	
	//Click on Certificates Issued
	 public boolean certificatesIssuedClick(){
	    	try{
	    		
	    		certificatesIssued.click();
			System.out.println("Clicked on Certificates Issued Action");
			return true;
	    	}
	    	catch(Exception e)
	    	{
	    		e.getMessage();
	    		return false;
	    	}
		}
	//Get certificates Issued Action Result
	 public Boolean getheaderOnRePrintCertIssued(){
	    	Boolean result=false;
	    	try{
	    		result= headerOnCertIssued.isDisplayed();
	    	}
	    	catch(Exception e)
	    	{
	    		result= false;
	    		e.getMessage();
	    	}
			return result;
		}	 
	 
	 public String getReprintCertResultCount()
	 {
		 String headerText = getTableHeader.getText();
		 
		 System.out.println("No. of Certificates available: "+headerText.substring(13,14));
		 
		 
		 return headerText.substring(13,14);
	 }
	 
	 public Boolean getCertificateIssuesHeaderText() {
		 
		 Boolean result=false;
	    	try{
	    		result= getCertificateIssuesHeaderText.isDisplayed();
	    		System.out.println("Certificate Issued Header Text is Displayed");
	    	}
	    	catch(Exception e)
	    	{
	    		result= false;
	    		e.getMessage();
	    	}
			return result;
		 
	 }
	 
	 public Boolean selectCertificate() {
		 Boolean result=false;
	    	try{
	    		selectCertificate.click();
	    		System.out.println("certificate is selected");
	    		result = true;
	    	}
	    	catch(Exception e)
	    	{
	    		//System.out.println("Error in selecting certificate: "+e.getMessage());
	    		result= false;
	    	}
			return result;
	 }
	 
	 public Boolean clickReprint() {
		 Boolean result=false;
	    	try{
	    		result= clickReprint.isDisplayed();
	    		
	    	}
	    	catch(Exception e)
	    	{
	    		result= false;
	    		e.getMessage();
	    	}
			return result;
	 }
	 
	 public Boolean getReprintPopupText()
	 {
		 
		 
		 Boolean result=false;
	    	try{
	    		result = getReprintPopupText.isDisplayed();
	    		
	    	}
	    	catch(Exception e)
	    	{
	    		result= false;
	    		e.getMessage();
	    	}
			return result;
		 
	 }
	 
	
	 public Boolean clickRequestNameChange()
	 {
		 Boolean result=false;
	    	try{
	    		clickReqNameChng.click();
	    		result = true;
	    	}
	    	catch(Exception e)
	    	{
	    		result= false;
	    		e.getMessage();
	    	}
			return result;
	 }
	 
	 public Boolean getCertChngReqHeadTxt() {
		 	 
		 Boolean result=false;
	    	try{
	    		result =  getCertChgReqHeadTxt.isDisplayed();
	    		
	    	}
	    	catch(Exception e)
	    	{
	    		result= false;
	    		e.getMessage();
	    	}
			return result;
		 
	 }
	 
}


