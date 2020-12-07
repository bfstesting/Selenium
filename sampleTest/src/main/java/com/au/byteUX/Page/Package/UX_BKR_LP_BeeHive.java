package com.au.byteUX.Page.Package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Keys;
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
public class UX_BKR_LP_BeeHive {

	WebDriver driver;
	Properties properties;

	//@FindBy(how = How.XPATH, using = properties. //"//fieldset[.//div/div[text()='Existing Hive Brand Reason']]/.//div/div[2]")
	@CacheLookup
	WebElement reason;
	@FindBy(how = How.XPATH, using = "//fieldset[.//div/div[text()='Existing Hive Brand Reason']]/.//input")
	@CacheLookup
	WebElement enterReason;
	@FindBy(how = How.XPATH, using = "//html/body/div[14]/div[1]/ul/li")
	@CacheLookup
	WebElement selectFirstItem;
	@FindBy(how = How.XPATH, using = "//fieldset[.//div[text()='Details']]/.//tr[1]/td[1]/.//input")
	@CacheLookup
	WebElement hiveBrandNumber;
	@FindBy(how = How.XPATH, using = "//div[13]/.//a[2]/.//span[text()='']")
	@CacheLookup
	WebElement saveForm;

	public UX_BKR_LP_BeeHive(WebDriver driver) throws 
IOException
	{
		this.driver = driver;
		File src=new File("./Configuration/UX_BKR_LP_BeeHive.proprety");
		FileInputStream fis = new FileInputStream(src);
		Properties pro=new Properties();
		pro.load(fis);
	}

	public void addHiveBrand(String HiveBrandNumber) {
		try {
			reason.click();
			enterReason.sendKeys("I received this Hive Brand Number as part of my family business.");
			enterReason.sendKeys(Keys.TAB);
			hiveBrandNumber.sendKeys(HiveBrandNumber);
			saveForm.click();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Exception is == " + e.getMessage());;
		}
	}
	
	public void addHB(String HiveBrandNumber) {
		try {
			reason.click();
			enterReason.sendKeys("I received this Hive Brand Number as part of my family business.");
			enterReason.sendKeys(Keys.TAB);
			hiveBrandNumber.sendKeys(HiveBrandNumber);
			saveForm.click();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Exception is == " + e.getMessage());;
		}
	}
}
