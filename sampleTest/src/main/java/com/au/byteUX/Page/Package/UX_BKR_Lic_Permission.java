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
 *
 */
public class UX_BKR_Lic_Permission {
	
WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//div[4]/.//span[text()='Training Information']") @CacheLookup WebElement trainingInfoTab;
	@FindBy(how=How.XPATH,using="//div[4]/.//div[contains(text(),'Training Delivery Method')]") @CacheLookup WebElement trainingDeliverMthdText;
	@FindBy(how=How.XPATH,using="//div[4]/.//div[contains(text(),'Training Languages')]") @CacheLookup WebElement trainingLangText;
	@FindBy(how=How.XPATH,using="//div[4]/.//div[4]/.//div[starts-with(text(),'Training Areas')]") @CacheLookup WebElement trainingAreasText;
	@FindBy(how=How.XPATH,using="//div[4]/.//div[starts-with(text(),'Units')]") @CacheLookup WebElement unitsText;
	
	
	@FindBy(how=How.XPATH,using="//div[4]/.//span[text()='Training']") @CacheLookup WebElement trainingTab;
	@FindBy(how=How.XPATH,using="//div[4]/.//div[text()='Trainers']") @CacheLookup WebElement trainersText;
	
	@FindBy(how=How.XPATH,using="//div[4]/.//span[text()='Trainer']") @CacheLookup WebElement trainerTab;
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
	
		
	public void trainingInfoTab()
	{
		trainingInfoTab.click();
		//add scripts for rowInNoticesTab
		if (trainingDeliverMthdText.isDisplayed() == true)
		{
			System.out.println("Training Delivery Method Grid is displayed" + trainingDeliverMthdText.getText());
		}
		else
		{
			System.out.println("Failed to load Training Delivery Method Grid");
		}
		
		if (trainingLangText.isDisplayed() == true)
		{
			System.out.println("Training Language Grid is displayed" + trainingLangText.getText());
		}
		else
		{
			System.out.println("Failed to load Training Language Grid");
		}
		
		if (trainingAreasText.isDisplayed() == true)
		{
			System.out.println("Training Areas Grid is displayed" + trainingAreasText.getText());
		}
		else
		{
			System.out.println("Failed to load Training Areas Grid");
		}
		
		if (unitsText.isDisplayed() == true)
		{
			System.out.println("Training Units Grid is displayed" + unitsText.getText());
		}
		else
		{
			System.out.println("Failed to load Training Units Grid");
		}
	}
	
	public void trainerTab()
	{
		trainerTab.click();
		//add scripts for rowInNoticesTab
		if (trainingDeliverMthdText.isDisplayed() == true)
		{
			System.out.println("Training Delivery Method Grid is displayed" + trainingDeliverMthdText.getText());
		}
		else
		{
			System.out.println("Failed to click or load Training Information Tab");
		}
	}

}
