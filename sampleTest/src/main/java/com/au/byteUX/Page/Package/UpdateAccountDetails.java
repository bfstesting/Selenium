/**
 * 
 */
package com.au.byteUX.Page.Package;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * @author sarkah01
 *
 */
public class UpdateAccountDetails {

	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//div/textarea")
	@CacheLookup	WebElement reason;
	
	@FindBy(how = How.XPATH, using = "//fieldset[.//div[text()='Legal']]/.//input")
	@CacheLookup	List<WebElement> LegalFields;
	
	@FindBy(how = How.XPATH, using = "//fieldset[.//div[text()='Other']]/.//input")
	@CacheLookup	List<WebElement> OtherFields;
	
	@FindBy(how = How.XPATH, using = "//fieldset[.//div[text()='Address']]/.//input")
	@CacheLookup	List<WebElement> AddressFields;

	@FindBy(how = How.XPATH, using = "//span[text()='Supporting Documents']")
	@CacheLookup	WebElement SupportingDocs;

	// Attachment Fields
	/*
	@FindBy(how = How.XPATH, using = "//div[text()=' ']")
	@CacheLookup	WebElement DocField;
	
	@FindBy(how = How.XPATH, using = "//div[1]/div/div/div/div[1]/input")
	@CacheLookup	WebElement Clip;
	
	@FindBy(how = How.XPATH, using = "//div[1]/div/div/div/div[1]/input")
	@CacheLookup	WebElement Clip;
	*/
	
	@FindBy(how = How.XPATH, using = "//span[text()='No']")
	@CacheLookup	WebElement DialogForPremisesNO;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Yes']")
	@CacheLookup	WebElement DialogForPremisesYES;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Thank you, your request has been received. The changes to your account will appear on the portal within 10 business days. Would you also like to update your primary location details?']")
	@CacheLookup	WebElement QuestionToUpdatePremises;
	
	@FindBy(how = How.XPATH, using = "//a[2]/span/span/span[text()='Update Primary Location Form']")
	@CacheLookup	List<WebElement> PrimaryLocationFormTitle;
	

	public UpdateAccountDetails(WebDriver driver) // constructor
	{
		this.driver = driver;
	}

	public void updateAllFields(String Reason1, String CompanyName, String ABN, String ACN, String Address,
			String MobileNumber, String PhoneNumber, String PhoneNumber2, String FaxNumber, String CompanyEmailID,
			String CompanyWWW) {
		try {
			reason.sendKeys(Reason1);

			LegalFields.get(0).clear();
			LegalFields.get(0).sendKeys(CompanyName);

			LegalFields.get(1).clear();
			LegalFields.get(1).sendKeys(ABN);

			LegalFields.get(2).clear();
			LegalFields.get(2).sendKeys(ACN);

			AddressFields.get(0).clear();
			AddressFields.get(0).sendKeys(Address);

			OtherFields.get(0).clear();
			OtherFields.get(0).sendKeys(MobileNumber);

			OtherFields.get(1).clear();
			OtherFields.get(1).sendKeys(PhoneNumber);

			OtherFields.get(2).clear();
			OtherFields.get(2).sendKeys(PhoneNumber2);

			OtherFields.get(3).clear();
			OtherFields.get(3).sendKeys(FaxNumber);

			OtherFields.get(4).clear();
			OtherFields.get(4).sendKeys(CompanyEmailID);

			OtherFields.get(5).clear();
			OtherFields.get(5).sendKeys(CompanyWWW);

			Thread.sleep(2000);

			/*
			 * //Not able to get the control on the attachment window that open up. Need
			 * more investigation. Parking this for now. SupportingDocs.click();
			 * 
			 * LoginPage LPage = new LoginPage(driver); LPage.addTemplate();
			 * 
			 * DocField.click(); Clip.click();
			 * 
			 */

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void update1Field_To_Open_PrimaryLocation_Update_Form(String Reason1, String MobileNumber) {
		try {
			reason.sendKeys(Reason1);
			Thread.sleep(2000);
			OtherFields.get(0).clear();
			Thread.sleep(2000);
			OtherFields.get(0).sendKeys(MobileNumber);
			Thread.sleep(2000);
			LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
			loginPage.saveForm();
			Thread.sleep(2000);
			System.out.println("Text on the dialog box: " + QuestionToUpdatePremises.getText());
			DialogForPremisesYES.click();
			Thread.sleep(5000);
			System.out.println("Primary Location Update form is open where form title is: " + PrimaryLocationFormTitle); 
			//LPage.backButton();
			System.out.println("Update Account Details form is submitted. Please approve/reject");
						
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	

}