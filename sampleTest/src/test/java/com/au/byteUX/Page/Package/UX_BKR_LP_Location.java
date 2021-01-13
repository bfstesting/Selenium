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
public class UX_BKR_LP_Location {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//fieldset[.//div[text()='Authorisation Location']]/.//tr[4]/.//input") @CacheLookup WebElement enterAddress;
	@FindBy(how=How.XPATH,using="//fieldset[.//div[text()='Authorisation Location']]/.//tr[1]/.//input") @CacheLookup WebElement nickName;
	@FindBy(how=How.XPATH,using="//html/body/ul/li[1]/div") @CacheLookup WebElement SelectFirstItem;
	@FindBy(how=How.XPATH,using="//label[text()='Enter locality']") @CacheLookup WebElement localityRadioBtn;
	@FindBy(how=How.XPATH,using="//li[52]") @CacheLookup WebElement selectLocality;
	@FindBy(how=How.XPATH,using="//div[2]/.//div/div/div/a[2]/.//span[text()='']") @CacheLookup WebElement saveForm;
	
	
	public UX_BKR_LP_Location(WebDriver driver)  //constructor
	{
		this.driver = driver;
	}
	
		
	public void addHiveLocationAddress (String NickName, String HiveLocationAddress)
	{
		try {
			//start date and end date are not added
			nickName.sendKeys(NickName);
			enterAddress.sendKeys(HiveLocationAddress);
			SelectFirstItem.click();
			saveForm.click();
			Thread.sleep(1000);
		}		catch (InterruptedException e)		{			e.printStackTrace();		}		
	}
	
	
	public void addHiveLocationLocality (String NickName)
	{
		try {
			//start date and end date are not added
			nickName.sendKeys(NickName);
			localityRadioBtn.click();
			selectLocality.click();
			saveForm.click();
			Thread.sleep(1000);
		}		catch (InterruptedException e)		{			e.printStackTrace();		}	
	}
}
