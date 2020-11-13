/**
 * 
 */
package com.au.byteUX.Test.Package;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.au.byteUX.Page.Package.AddHiveBrand;
import com.au.byteUX.Page.Package.AddHiveLocation;
import com.au.byteUX.Page.Package.LoginPage;
import com.au.byteUX.Page.Package.MyAccount;
import com.au.byteUX.Page.Package.MyAuthorisation;
import com.au.byteUX.Page.Package.SelectSubject;
import com.au.byteUX.Page.Package.UpdateAccountDetails;
import com.au.byteUX.Page.Package.UpdatePrimaryLocation;
import junit.framework.Assert;
import lib.ReadProperties;

/**
 * @author sarkah01
 *
 */
public class UX_BeekeeperRegressionTestCasesTestRail extends HelperClass {
	
	String url;
	String username;
	String password;
	@BeforeMethod
	public void init() throws FileNotFoundException, IOException {
		
		url = ReadProperties.getObject("url");
		username = ReadProperties.getObject("userName1");
		password = ReadProperties.getObject("password");
		
		driver.get(url);
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.LoginToUX(username, password);
		
	}
	public UX_BeekeeperRegressionTestCasesTestRail() {
	}

	@Test

	// C660 - Update Account Details
	// C662 - Update Primary Location

	public void UpdateAccountDetailsAndPrimaryLocation() {
		try {
			// login to UX
			//driver.get(url);
			//LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
			//loginPage.LoginToUX(username, password);
			//Thread.sleep(5000);
			// Navigate to My Account
			SelectSubject subject = PageFactory.initElements(driver, SelectSubject.class);
			subject.selectSubject("My Account");
			Thread.sleep(2000);
			// click on update account details
			MyAccount MyAccount = PageFactory.initElements(driver, MyAccount.class);
			MyAccount.updateAccountDetails();
			Thread.sleep(5000);
			// Enter values in the fields
			UpdateAccountDetails update = PageFactory.initElements(driver, UpdateAccountDetails.class);
			update.update1Field_To_Open_PrimaryLocation_Update_Form("Test To check if Premises form loads",
					"0456456545");
			Thread.sleep(10000);
			// Submit Primary Location Form
			UpdatePrimaryLocation update1 = PageFactory.initElements(driver, UpdatePrimaryLocation.class);
			update1.update1Field_On_PrimaryLocation_Form("Test Automation", "0256454534");
			Thread.sleep(10000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * 
	 * Successful Test Run on: 10/10/2020
	 * 
	 * page scrolled login successful Update Account Details form is open Text on
	 * the dialog box: Thank you, your request has been received. The changes to
	 * your account will appear on the portal within 10 business days. Would you
	 * also like to update your primary location details? Primary Location Update
	 * form is open where form title is: [[[ChromeDriver: chrome on WINDOWS
	 * (49e573b819a2fadb0eabf25880aaf750)] -> xpath:
	 * //a[2]/span/span/span[text()='Update Primary Location Form']]] Update Account
	 * Details form is submitted. Please approve/reject Primary Location form is
	 * submitted. Please approve/reject PASSED:
	 * UpdateAccountDetailsAndPrimaryLocation
	 * 
	 * =============================================== Default test Tests run: 1,
	 * Failures: 0, Skips: 0 ===============================================
	 * 
	 */

	@Test

	// C661 - Add Hive Brand and Hive Location

	public void AddHiveBrandAndHiveLocation() {
		try {
			// login to UX
			//driver.get(url);
			//LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
			//loginPage.LoginToUX(username, password);
			//Thread.sleep(5000);
			// Navigate to My Account
			SelectSubject subject = PageFactory.initElements(driver, SelectSubject.class);
			subject.selectSubject("My Account");
			Thread.sleep(2000);
			// click on update account details
			MyAccount MyAccount = PageFactory.initElements(driver, MyAccount.class);
			MyAccount.updateAccountDetails();
			Thread.sleep(5000);
			// Enter values in the fields
			UpdateAccountDetails update = PageFactory.initElements(driver, UpdateAccountDetails.class);
			update.update1Field_To_Open_PrimaryLocation_Update_Form("Test To check if Premises form loads",
					"0456456545");
			Thread.sleep(10000);
			// Submit Primary Location Form
			UpdatePrimaryLocation update1 = PageFactory.initElements(driver, UpdatePrimaryLocation.class);
			update1.update1Field_On_PrimaryLocation_Form("Test Automation", "0256454534");
			Thread.sleep(10000);

		} catch(Exception e) {e.printStackTrace();}
	}
	
	@Test
	public void addHiveLocationAddress() {
		try {
			//login to UX
			//System.out.println(Thread.currentThread().getId());
			//driver.get(url);
			//LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
			//loginPage.LoginToUX(username, password);
			//Thread.sleep(8000);
			//Select Authorisation Subject
			SelectSubject subject = PageFactory.initElements(driver, SelectSubject.class);
			subject.selectSubject("My Authorisation");
			Thread.sleep(2000);
			//Select Beekeeper Authorisation
			MyAuthorisation myAuth = PageFactory.initElements(driver, MyAuthorisation.class);
			myAuth.multipleAuthorisation_select1();
			myAuth.addHiveLocation();
			//Add Hive Location
			AddHiveLocation hiveLocation = PageFactory.initElements(driver, AddHiveLocation.class);
			hiveLocation.addHiveLocationAddress("Nick1", "6 avenue of the americas");
			
			Thread.sleep(10000);
			
		} catch(Exception e) {e.printStackTrace();}
	}
	
	@Test
	public void addHiveLocationLocality() {
		try {
			//login to UX
			//System.out.println(Thread.currentThread().getId());
			//driver.get(url);
			//LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
			//loginPage.LoginToUX("sushamakailash@gmail.com", "Happy!23");
			//Thread.sleep(8000);
			//Select Authorisation Subject
			SelectSubject subject = PageFactory.initElements(driver, SelectSubject.class);
			subject.selectSubject("My Authorisation");
			Thread.sleep(2000);
			//Select Beekeeper Authorisation
			MyAuthorisation myAuth = PageFactory.initElements(driver, MyAuthorisation.class);
			myAuth.multipleAuthorisation_select1();
			myAuth.addHiveLocation();
			//Add Hive Location
			AddHiveLocation hiveLocation = PageFactory.initElements(driver, AddHiveLocation.class);
			hiveLocation.addHiveLocationLocality("Nick");
			
			Thread.sleep(10000);
			
		} catch(Exception e) {e.printStackTrace();}
	}
	
	@Test
	public void addHiveBrand() {
		try {
			//login to UX
			//System.out.println(Thread.currentThread().getId());
			
			//Thread.sleep(8000);
			//Select Authorisation Subject
			SelectSubject subject = PageFactory.initElements(driver, SelectSubject.class);
			subject.selectSubject("My Authorisation");
			Thread.sleep(2000);
			//Select Beekeeper Authorisation
			MyAuthorisation myAuth = PageFactory.initElements(driver, MyAuthorisation.class);
			myAuth.multipleAuthorisation_select1();
			myAuth.addHiveLocation();
			//Add Hive Brand
			AddHiveBrand hiveBrand = PageFactory.initElements(driver, AddHiveBrand.class);
			hiveBrand.addHiveBrand("TD12");
			Thread.sleep(10000);
		} catch(Exception e) {e.printStackTrace();}
	}

}
