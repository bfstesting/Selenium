package com.au.byteUX.Page.Package;

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
public class AddHiveBrand {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//fieldset[.//div/div[text()='Existing Hive Brand Reason']]/.//div/div[2]")
	@CacheLookup WebElement reason;
	@FindBy(how=How.XPATH,using="//html/body/div[17]/div[1]/ul/li[2]") @CacheLookup WebElement SelectFirstItem;
	@FindBy(how=How.XPATH,using="//fieldset[.//div[text()='Details']]/.//td[1]/.//input") @CacheLookup WebElement hiveBrandNumber;
	@FindBy(how=How.XPATH,using="//div[2]/.//div/div/div/a[2]/.//span[text()=''") @CacheLookup WebElement saveForm;
	
	public AddHiveBrand(WebDriver driver)  //constructor
	{
		this.driver = driver;
	}
	
		
	public void addHiveBrand (String HiveBrandNumber)
	{
		try {
			reason.click();
			SelectFirstItem.click();
			hiveBrandNumber.sendKeys(HiveBrandNumber);
			saveForm.click();
			Thread.sleep(1000);
		}		catch (InterruptedException e)		{			e.printStackTrace();		}		
	}
}
