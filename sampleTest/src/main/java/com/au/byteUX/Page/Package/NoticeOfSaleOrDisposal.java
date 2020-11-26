package com.au.byteUX.Page.Package;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NoticeOfSaleOrDisposal {
	
WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//tbody/.//div[1]/.//div[.//div[1]/div[text()='Hive Details']]/div[2]/div") @CacheLookup WebElement addHiveDetails;
	@FindBy(how=How.XPATH,using="//tbody/.//div[2]/div[2]/.//table/.//td") @CacheLookup List<WebElement> submittedHiveDetails;
	@FindBy(how=How.XPATH,using="//fieldset/.//tr[2]/td[1]/label/.//span/input") @CacheLookup WebElement stillKeepBeesYes;
	@FindBy(how=How.XPATH,using="//label[.//span[text()='Remaining number of hives']]/.//input") @CacheLookup WebElement remainingHives;
	@FindBy(how=How.XPATH,using="//fieldset/.//tr[2]/td[3]/label/.//span/input") @CacheLookup WebElement stillKeepBeesNo;
	@FindBy(how=How.XPATH,using="//fieldset[.//div[text()='Consent']]/.//input") @CacheLookup WebElement consent;
	@FindBy(how=How.XPATH,using="//span[text()='Submit']") @CacheLookup WebElement submit;
	
	
	public NoticeOfSaleOrDisposal(WebDriver driver)  //constructor
	{
		this.driver = driver;
	}
	
	public void submitNoticeForm(String RemainingHives) throws InterruptedException
	{
		
		//add checkpoint to verify that the details entered on the hive details form is reflected here
		//submittedHiveDetails. .get(0).getText().compareTo(addAString);
		stillKeepBeesYes.click();
		
		remainingHives.clear();
		remainingHives.sendKeys(RemainingHives);
		
		consent.click();
		submit.click();		
		
	}
	
	public void addHiveDetails() throws InterruptedException
	{
		System.out.println("Inside addHiveDetails method");
		//add checkpoint to verify that the details entered on the hive details form is reflected here
		//submittedHiveDetails. .get(0).getText().compareTo(addAString);
		addHiveDetails.click();
		System.out.println("Exiting addHiveDetails method");
	}

}
