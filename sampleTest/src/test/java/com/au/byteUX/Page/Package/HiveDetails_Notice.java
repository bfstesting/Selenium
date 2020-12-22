/**
 * 
 */
package com.au.byteUX.Page.Package;

import java.util.List;

import org.openqa.selenium.Keys;
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
	
	@FindBy(how=How.XPATH,using="//fieldset[.//div[1]/div[text()='Hives Details']]/div[2]/.//div[2]")
		@CacheLookup WebElement selectAMedthodOfDisposal;
	
	@FindBy(how=How.XPATH,using="//html/.//li[contains(text(),'Sold')]") @CacheLookup WebElement selectSold;
	@FindBy(how=How.XPATH,using="//html/.//li[contains(text(),'Gifted')]") @CacheLookup WebElement selectGifted;
	@FindBy(how=How.XPATH,using="//html/.//li[contains(text(),'Destroyed')]") @CacheLookup WebElement selectDestroyed;
	@FindBy(how=How.XPATH,using="//html/.//li[contains(text(),'Lost')]") @CacheLookup WebElement selectLost;
	@FindBy(how=How.XPATH,using="//html/.//li[contains(text(),'Stolen')]") @CacheLookup WebElement selectStolen;
	@FindBy(how=How.XPATH,using="//fieldset[.//div[1]/div[contains(text(),'Details of the person')]]/.//input")
		@CacheLookup List<WebElement> FieldsOnTheFormForSoldOrGifted;
	
	@FindBy(how=How.XPATH,using="//fieldset[.//div[1]/div[contains(text(),'Details of the hive')]]/.//input")
		@CacheLookup List<WebElement> FieldsOnTheFormForDestroyedOrLostOrStolen;
	
	@FindBy(how=How.XPATH,using="//fieldset[.//div[1]/div[contains(text(),'Details of the person')]]/.//textarea") 
		@CacheLookup WebElement CommentForSoldOrGifted;
	
	@FindBy(how=How.XPATH,using="//fieldset[.//div[1]/div[contains(text(),'Details of the hive')]]/.//textarea") 
		@CacheLookup WebElement CommentForDestroyedOrLostOrStolen;
	
	@FindBy(how=How.XPATH,using="//div[2]/div/div/div/.//span[text()='']") @CacheLookup WebElement save;
	@FindBy(how=How.XPATH,using="//html/body/ul/li[1]/div") @CacheLookup WebElement selectAddress;
	@FindBy(how=How.XPATH,using="//fieldset[.//div[1]/div[contains(text(),'Details of the hive')]]/.//tr[1]/td[1]/.//div[2]") 
		@CacheLookup WebElement selectHBNumber;
	
	public HiveDetails_Notice(WebDriver driver)  //constructor
	{
		this.driver = driver;
	}
	
	
	public void selectMedthodOfDisposal(String MethodOfDisposal) throws InterruptedException
	{
		System.out.println("Inside selectMedthodOfDisposal method");
		selectAMedthodOfDisposal.click();
		if (MethodOfDisposal.equals("Sold"))
		{
			selectSold.click();
		}
		
		else if (MethodOfDisposal.equals("Gifted"))
		{
			selectGifted.click();
		}
		
		else if (MethodOfDisposal.equals("Destroyed"))
		{
			selectDestroyed.click();
		}
		
		else if (MethodOfDisposal.equals("Lost"))
		{
			selectLost.click();
		}
		
		else if (MethodOfDisposal.equals("Stolen"))
		{
			selectStolen.click();
		}
		System.out.println("Exiting of selectMedthodOfDisposal method");
	}
	
	
	public void soldOrGifted(String PurchasersName, String PurchasersAddress, String PurchasersHB,
			String NumberOfHivesInvolved, String PurchasersPhone) throws InterruptedException
	{
				System.out.println("Inside soldOrGifted method");
		FieldsOnTheFormForSoldOrGifted.get(0).clear();
		FieldsOnTheFormForSoldOrGifted.get(0).sendKeys(PurchasersName);
		
		FieldsOnTheFormForSoldOrGifted.get(1).clear();
		FieldsOnTheFormForSoldOrGifted.get(1).sendKeys(PurchasersAddress);
		selectAddress.click();
		
		FieldsOnTheFormForSoldOrGifted.get(2).clear();
		FieldsOnTheFormForSoldOrGifted.get(2).sendKeys(PurchasersHB);
		
		FieldsOnTheFormForSoldOrGifted.get(3).clear();
		FieldsOnTheFormForSoldOrGifted.get(3).sendKeys(NumberOfHivesInvolved);
		
		FieldsOnTheFormForSoldOrGifted.get(5).clear();
		FieldsOnTheFormForSoldOrGifted.get(5).sendKeys(PurchasersPhone);
		
		save.click();
		System.out.println("Exiting soldOrGifted method");
	}
	
	
	public void destroyedOrLostOrStolen(String NumberOfHivesInvolved) throws InterruptedException
	{
		System.out.println("Inside destroyedOrLostOrStolen method");
		selectHBNumber.click();
		selectHBNumber.sendKeys(Keys.ARROW_DOWN); // This is not working
		selectHBNumber.sendKeys(Keys.TAB);
				
		FieldsOnTheFormForDestroyedOrLostOrStolen.get(1).clear();
		FieldsOnTheFormForDestroyedOrLostOrStolen.get(1).sendKeys(NumberOfHivesInvolved);
		
		save.click();
		
		System.out.println("Exiting destroyedOrLostOrStolen method");
	}

}
