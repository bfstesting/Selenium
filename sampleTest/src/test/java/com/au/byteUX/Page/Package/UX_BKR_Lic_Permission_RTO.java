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
	@FindBy(how=How.XPATH,using="//div[starts-with(text(),'EXPORT REGISTRATION')]") @CacheLookup WebElement exportText;
	
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
	@FindBy(how=How.XPATH,using="//div[text()='Certificates Issued']") @CacheLookup WebElement certificatesIssued;
	@FindBy(how=How.XPATH,using="//span[text()='Reprint Certificate']") @CacheLookup WebElement headerOnCertIssued;

	@FindBy(how=How.XPATH,using="//div/div/div[2]/div[2]/.//div[3]/table[1]/.//span") @CacheLookup WebElement selectTrainerToChangeName;
	@FindBy(how=How.XPATH,using="//div[text()='Request Name Change']") @CacheLookup WebElement requestNameChange;
	@FindBy(how=How.XPATH,using="//span[text()='Certificate Change Request']") @CacheLookup WebElement headerOnNameChange;
	//back btn
	//click No
	@FindBy(how=How.XPATH,using="//div[text()='Request Stats Report']") @CacheLookup WebElement requestStatsReport;
	@FindBy(how=How.XPATH,using="//span[text()='RTO Request']") @CacheLookup WebElement headerOnStatsReport;
	@FindBy(how=How.XPATH,using="//div[text()='Order Blank Certificate Stock']") @CacheLookup WebElement orderBlankCert;
	@FindBy(how=How.XPATH,using="//span[text()='RTO Request']") @CacheLookup WebElement headerOnOrderCert;
	@FindBy(how=How.XPATH,using="//div[text()='Cancel Authorisation']") @CacheLookup WebElement cancelAuthorisation;
	@FindBy(how=How.XPATH,using="//span[text()='Cancel Registration']") @CacheLookup WebElement headerOnCancelAuth;
	@FindBy(how=How.XPATH,using="//html/body/div[18]/div[1]/.//div[2]/div") @CacheLookup WebElement cancelBtn;
	@FindBy(how=How.XPATH,using="//div[text()='Trainer Management']") @CacheLookup WebElement trainerManagement;
	@FindBy(how=How.XPATH,using="//span[text()='Trainer Management']") @CacheLookup WebElement headerOnTrainerMgt;
	@FindBy(how=How.XPATH,using="//div[text()='Apply for New Trainer']") @CacheLookup WebElement applyNewTrainer;
	@FindBy(how=How.XPATH,using="//a[2]/.//span[text()='Trainer Application']") @CacheLookup WebElement headerOnApplyTrainer;
	@FindBy(how=How.XPATH,using="//div[3]/table/.//table[2]/.//td[1]/div/span") @CacheLookup WebElement selectTrainerToCancel;
	@FindBy(how=How.XPATH,using="//div[text()='Cancel Trainer']") @CacheLookup WebElement cancelTrainer;
	@FindBy(how=How.XPATH,using="//div[text()='Cancel Alert']") @CacheLookup WebElement headerOnCancelTrainer;
	@FindBy(how=How.XPATH,using="//span[text()='No']") @CacheLookup WebElement clickNoBtn;
	@FindBy(how=How.XPATH,using="//span[text()='Cancel']") @CacheLookup WebElement clickCancelBtn;
	@FindBy(how=How.XPATH,using="//span[text()='Reprint Certificate']") @CacheLookup WebElement getCertificateIssuesHeaderText;
	@FindBy(how=How.XPATH,using="//div[starts-with(text(),'Certificate')]") @CacheLookup WebElement getTableHeader;
	@FindBy(how=How.XPATH,using="//table[2]/tbody/tr/td[1]/div") @CacheLookup WebElement selectCertificate;
	@FindBy(how=How.XPATH,using="//div[text()='Reprint']") @CacheLookup WebElement clickReprint;
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Please enter reprint')]") @CacheLookup WebElement getReprintPopupText;
	@FindBy(how=How.XPATH,using="//div[text()='Request Name Change']") @CacheLookup WebElement clickReqNameChng;
	@FindBy(how=How.XPATH,using="//span[text()='Certificate Change Request']") @CacheLookup WebElement getCertChgReqHeadTxt;
		
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
			 
			 System.out.println("Length: "+headerText.length()+" Text: "+headerText);
			 
			 return headerText.substring(11, 13);
		 }
		 
		 public Boolean getCertificateIssuesHeaderText() {
			 
			 Boolean result=false;
		    	try{
		    		result= getCertificateIssuesHeaderText.isDisplayed();
		    		System.out.println("Get Certificate Issued Header Test is Displayed");
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
		    		result = true;
		    	}
		    	catch(Exception e)
		    	{
		    		result= false;
		    		e.getMessage();
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
}
