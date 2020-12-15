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
	@FindBy(how = How.XPATH, using = "span[text()='OK']")	@CacheLookup WebElement clickOKToOpenPaymentForm;
	@FindBy(how = How.XPATH, using = "//div[2]/div/div/div")	@CacheLookup WebElement getAmount;
	@FindBy(how = How.XPATH, using = "//div[2]/span") @CacheLookup WebElement getTrackingCode;
	
	
			
	public UX_BKR_Lic_Renewal(WebDriver driver)  //constructor
	{
		this.driver = driver;
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

			//code to do something on new window
			getAmount.getText();
			getTrackingCode.getText();
			//driver.close(); // close newly opened window when done with it
			//driver.switchTo().window(parentHandle); // switch back to the original window
		}
		catch (InterruptedException e)		{			e.getMessage();		}
	}

}

