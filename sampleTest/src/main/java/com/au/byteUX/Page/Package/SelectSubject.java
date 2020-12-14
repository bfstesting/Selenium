/**
 * 
 */
package com.au.byteUX.Page.Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author sarkah01
 *
 */
public class SelectSubject {
	
	WebDriver driver;
	@FindBy(how=How.XPATH,using="//span[(text()='home')]") @CacheLookup WebElement home;
	@FindBy(how=How.XPATH,using="//span[(text()='My Account')]") @CacheLookup WebElement myaccount;
	@FindBy(how=How.XPATH,using="//span[(text()='My Authorisations')]") @CacheLookup WebElement myauthorisation;
	@FindBy(how=How.XPATH,using="//span[(text()='My Profile')]") @CacheLookup WebElement myprofile;
	@FindBy(how=How.XPATH,using="//span[(text()='Contact Us')]") @CacheLookup WebElement contactus;
	
	
	public SelectSubject(WebDriver driver)  //constructor
	{
		this.driver = driver;
	}
	
	public void selectSubject(String subject)
	{
		if (subject.equals("Home"))
		{
			home.click();
		}
		
		else if (subject.equals("My Account"))
		{
			myaccount.click();
			System.out.println("Clicked on My Account Menu Item");
		}

		else if (subject.equals("My Authorisation"))
		{
			myauthorisation.click();
			System.out.println("Clicked on My Authorisation Menu Item");
		}

		else if (subject.equals("My Profile"))
		{
			myprofile.click();
		}
		
		else if (subject.equals("Contact Us"))
		{
			contactus.click();
		}
	}
	

}
