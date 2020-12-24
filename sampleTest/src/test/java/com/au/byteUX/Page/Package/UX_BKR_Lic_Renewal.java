/**
 * 
 */
package com.au.byteUX.Page.Package;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author sarkah01
 *
 */
public class UX_BKR_Lic_Renewal {

	WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Renew my Authorisation']")	@CacheLookup WebElement renewMyAuthorisation;
	@FindBy(how = How.XPATH, using = "//div[4]/.//div[2]/div[1]/div[3]/.//td[2]/div")	@CacheLookup WebElement totalNoOfHives;
	@FindBy(how = How.XPATH, using = "//div[7]/.//tr[2]/td[2]/.//input")	@CacheLookup WebElement changeClassNO;
	@FindBy(how = How.XPATH, using = "//div[7]/.//tr[2]/td[3]/.//input")	@CacheLookup WebElement changeClassYES;
	@FindBy(how = How.NAME, using = "ConsentFinal")	@CacheLookup WebElement consent;
	@FindBy(how = How.XPATH, using = "//span[text()='Submit my renewal application']")	@CacheLookup WebElement submitBtn;
	@FindBy(how = How.XPATH, using = "//span[text()='Cancel']")	@CacheLookup WebElement cancelBtn;
	@FindBy(how = How.XPATH, using = "//span[text()='OK']")	@CacheLookup WebElement clickOKToOpenPaymentForm;
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Payment amount:')]")	@CacheLookup WebElement getAmount;
	@FindBy(how = How.XPATH, using = "//div[2]/span") @CacheLookup WebElement getTrackingCode;
	@FindBy(how = How.ID, using = "cardholderName") @CacheLookup WebElement cardHolderName;
	//@FindBy(how = How.XPATH, using = "//*[@id=\"cardholderNameField\"]/label") @CacheLookup WebElement cardHolderName;
	@FindBy(how = How.NAME, using = "cardNumber") @CacheLookup WebElement cardNumber;
	@FindBy(how = How.NAME, using = "expiryDateMonth") @CacheLookup WebElement expiryDateMonth;
	@FindBy(how = How.XPATH, using = "//html/body/div/form/div[3]/div/div[1]/select/option[5]") @CacheLookup WebElement selectMonth;
	@FindBy(how = How.NAME, using = "expiryDateYear") @CacheLookup WebElement expiryDateYear;
	@FindBy(how = How.XPATH, using = "//html/body/div/form/div[3]/div/div[2]/select/option[6]") @CacheLookup WebElement selectYear;
	@FindBy(how = How.NAME, using = "cvn") @CacheLookup WebElement cvnNumber;
	// If condition required - Cancel on UX "Do you wish to renew other authorisation that is due for renewals.": //a[4]/span/span/span[text()='Cancel']
			
	public UX_BKR_Lic_Renewal(WebDriver driver)  //constructor
	{
		this.driver = driver;
	}
	
	public void renewMyAuth()
	{
		renewMyAuthorisation.click();
		System.out.println("test clcik RMA");
	}
		
	public void submitRenewal_NoPermissionChange ()
	{
		try {
			int totalHives = Integer.parseInt(totalNoOfHives.getText());
			
			if (totalHives >= Integer.parseInt("50"))
			{
				totalNoOfHives.clear();
				totalNoOfHives.sendKeys("40");
			}
			else
			{
				changeClassNO.click();
				consent.click();
				submitBtn.click();
				//driver.switchTo().window("${win202}");
				
			}
			Thread.sleep(1000);
		}
		catch (InterruptedException e)		{			e.getMessage();		}		
	}
	
	public void submitPayment()
	{
		try
		{
			String parentHandle = driver.getWindowHandle(); // get the current window handle
				System.out.println(parentHandle);
			clickOKToOpenPaymentForm.click(); // click some link that opens a new window
			Thread.sleep(1000);
			for (String winHandle : driver.getWindowHandles()) {
			    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
			    	System.out.println(driver.getWindowHandle());
			}
			Thread.sleep(5000);
			//code to do something on new window
			System.out.println("Please verify the amount for Beekeeper Recreational: " + getAmount.getText());
			System.out.println("Please verify the tracking code submission in Smart Client: " + getTrackingCode.getText());
			//cardHolderName.getText();
			//System.out.println("cardHolderName is displayed" + cardHolderName.isDisplayed());
			//cardHolderName.sendKeys("Jack");
			//cardNumber.sendKeys("4444333322221111");
			//expiryDateMonth.click();
			//selectMonth.click();
			//expiryDateYear.click();
			//selectYear.click();
			//cvnNumber.sendKeys("234");

			driver.close(); // close newly opened window when done with it
			driver.switchTo().window(parentHandle); // switch back to the original window
		}
		catch (InterruptedException e)		{			e.getMessage();		}
	}

}

