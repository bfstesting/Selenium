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

/**
 * @author sarkah01
 *
 */
public class HiveDetails_Notice {
	
WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//fieldset[.//div[1]/div[text()='Hives Details']]/div[2]/.//div[2]") @CacheLookup WebElement selectMedthodOfDisposal;
	@FindBy(how=How.XPATH,using="//html/.//li[contains(text(),'Sold')]") @CacheLookup WebElement selectSold;
	@FindBy(how=How.XPATH,using="//html/.//li[contains(text(),'Gifted')]") @CacheLookup WebElement selectGifted;
	@FindBy(how=How.XPATH,using="//html/.//li[contains(text(),'Destroyed')]") @CacheLookup WebElement selectDestroyed;
	@FindBy(how=How.XPATH,using="//html/.//li[contains(text(),'Lost')]") @CacheLookup WebElement selectLost;
	@FindBy(how=How.XPATH,using="//html/.//li[contains(text(),'Stolen')]") @CacheLookup WebElement selectStolen;
	@FindBy(how=How.XPATH,using="//fieldset[.//div[1]/div[contains(text(),'Details of the person')]]/.//input") @CacheLookup List<WebElement> InputFieldsOnTheForm;
	@FindBy(how=How.XPATH,using="//fieldset[.//div[1]/div[contains(text(),'Details of the person')]]/.//textarea") @CacheLookup WebElement Comments;
	@FindBy(how=How.XPATH,using="//div[2]/div/div/div/.//span[text()='']") @CacheLookup WebElement save;
	@FindBy(how=How.XPATH,using="/html/body/ul/li[1]/div") @CacheLookup WebElement selectAddress;
	
	
	public HiveDetails_Notice(WebDriver driver)  //constructor
	{
		this.driver = driver;
	}
	
	public void soldOrGifted(String PurchasersName, String PurchasersAddress, String PurchasersHB,
			String NumberOfHivesInvolved, String PurchasersPhone) throws InterruptedException
	{
		
		InputFieldsOnTheForm.get(0).clear();
		InputFieldsOnTheForm.get(0).sendKeys(PurchasersName);
		
		InputFieldsOnTheForm.get(1).clear();
		InputFieldsOnTheForm.get(1).sendKeys(PurchasersAddress);
		selectAddress.click();
		
		InputFieldsOnTheForm.get(2).clear();
		InputFieldsOnTheForm.get(2).sendKeys(PurchasersHB);
		
		InputFieldsOnTheForm.get(3).clear();
		InputFieldsOnTheForm.get(3).sendKeys(NumberOfHivesInvolved);
		
		InputFieldsOnTheForm.get(5).clear();
		InputFieldsOnTheForm.get(5).sendKeys(PurchasersPhone);
		
		save.click();


	}

}
