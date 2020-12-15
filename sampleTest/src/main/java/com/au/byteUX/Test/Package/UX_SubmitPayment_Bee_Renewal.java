/**
 * 
 */
package com.au.byteUX.Test.Package;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.au.byteUX.Package.LocalDriverManager;
import com.au.byteUX.Page.Package.LoginPage;
import com.au.byteUX.Page.Package.UX_BKR_Lic_Renewal;

import lib.ReadProperties;

/**
 * @author sarkah01
 *
 */
public class UX_SubmitPayment_Bee_Renewal {
WebDriver driver;
	
		
	//Verify Renewal form submission
	
	@Test	
	public void verifyRenewal() throws InterruptedException, FileNotFoundException, IOException
	{
		WebDriver driver = LocalDriverManager.getDriver();
		String url = ReadProperties.getObject("config","UX");
		String username = ReadProperties.getObject("config","external_User_Deb_Syd");
		String password = ReadProperties.getObject("config","external_pwd");
		driver.get(url);
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		System.out.println("Test");
		loginPage.LoginToUX(username, password);
		System.out.println("Test");
		Thread.sleep(5000);
		
		UX_BKR_Lic_Renewal RenewPage = PageFactory.initElements(driver, UX_BKR_Lic_Renewal.class);
		RenewPage.submitRenewal_NoPermissionChange();
		RenewPage.submitPayment();
		Thread.sleep(5000);
	}

}
