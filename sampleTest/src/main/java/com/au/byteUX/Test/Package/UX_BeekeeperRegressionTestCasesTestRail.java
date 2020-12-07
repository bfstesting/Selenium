/**
 * adding comments
 */
package com.au.byteUX.Test.Package;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.au.byteUX.Package.LocalDriverManager;
import com.au.byteUX.Page.Package.ActivityHistory;
import com.au.byteUX.Page.Package.UX_BKR_LP_BeeHive;
import com.au.byteUX.Page.Package.AddHiveLocation;
import com.au.byteUX.Page.Package.HiveDetails_Notice;
import com.au.byteUX.Page.Package.LoginPage;
import com.au.byteUX.Page.Package.MyAccount;
import com.au.byteUX.Page.Package.MyAuthorisation;
import com.au.byteUX.Page.Package.NoticeOfSaleOrDisposal;
import com.au.byteUX.Page.Package.SelectSubject;
import com.au.byteUX.Page.Package.UpdateAccountDetails;
import com.au.byteUX.Page.Package.UpdatePrimaryLocation;
import junit.framework.Assert;
import lib.ReadProperties;
import lib.TodaysDate;

/**
 * @author sarkah01
 *
 */
public class UX_BeekeeperRegressionTestCasesTestRail {

	String url;
	String username;
	String password;
	String driverLocation;

	public UX_BeekeeperRegressionTestCasesTestRail() {
	}

	//@Test

	// C660 - Update Account Details
	// C662 - Update Primary Location

	public void UpdateAccountDetailsAndPrimaryLocation() {
		try {

			// login to UX
			// driver.get(url);
			// LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
			// loginPage.LoginToUX(username, password);
			// Thread.sleep(5000);
			// System.out.println("Thread " + Thread.currentThread().getId());
			// System.out.println("HashcodeebDriver instance = " +
			// LocalDriverManager.getDriver().hashCode());
			WebDriver driver = LocalDriverManager.getDriver();
			url = ReadProperties.getObject("config","url");
			username = ReadProperties.getObject("config","userName1");
			password = ReadProperties.getObject("config","password");
			driver.get(url);

			LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
			loginPage.LoginToUX(username, password);
			Thread.sleep(5000);
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
			update.update1Field_To_Open_PrimaryLocation_Update_Form(ReadProperties.getObject("data", "Reason1"),
					ReadProperties.getObject("data", "MobileNumber1"));
			Thread.sleep(10000);
			// Submit Primary Location Form
			UpdatePrimaryLocation update1 = PageFactory.initElements(driver, UpdatePrimaryLocation.class);
			update1.update1Field_On_PrimaryLocation_Form(ReadProperties.getObject("data", "Reason2"),
					ReadProperties.getObject("data", "MobileNumber2"));
			Thread.sleep(10000);

			ActivityHistory activityHistory = PageFactory.initElements(driver, ActivityHistory.class);
			List<String> actualSubjects = activityHistory.retrieveSubject("Account details change", TodaysDate.getTodaysDate());

			for (String actualSubject : actualSubjects) {

				System.out.println("Actual Subject:" + actualSubject);

				if (actualSubject.contains("account details")) {
					Assert.assertTrue(actualSubject.contains("Submitted account details"));
				} else {
					Assert.assertTrue(actualSubject.contains("Primary location update"));
				}
			}

		} catch (Exception e) {

			Assert.fail("UpdateAccountDetailsAndPrimaryLocation Exception");
			// e.printStackTrace();
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

	// @Test

	// C661 - Add Hive Brand and Hive Location

	public void AddHiveBrandAndHiveLocation() {
		try {
			// login to UX
			System.out.println("Thread " + Thread.currentThread().getId());
			System.out.println("HashcodeebDriver instance = " + LocalDriverManager.getDriver().hashCode());
			WebDriver driver = LocalDriverManager.getDriver();
			driver.get("https://train.bfs.dpi.nsw.gov.au/UXTrain/sso");
			username = ReadProperties.getObject("config","userName1");
			password = ReadProperties.getObject("config","password");
			LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
			loginPage.LoginToUX(username, password);
			Thread.sleep(5000);
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

			Assert.fail("AddHiveBrandAndHiveLocation Exception");
			// e.printStackTrace();

		}
	}

	@Test

	public void addHiveLocationAddress() {
		try {
			// login to UX
			// System.out.println(Thread.currentThread().getId());
			// driver.get(url);
			// LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
			// loginPage.LoginToUX(username, password);
			// Thread.sleep(8000);
			// Select Authorisation Subject
			WebDriver driver = LocalDriverManager.getDriver();
			url = ReadProperties.getObject("config","url");
			username = ReadProperties.getObject("config","userName1");
			password = ReadProperties.getObject("config","password");
			driver.get(url);
			LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
			loginPage.LoginToUX(username, password);
			Thread.sleep(8000);
			SelectSubject subject = PageFactory.initElements(driver, SelectSubject.class);
			subject.selectSubject("My Authorisation");
			Thread.sleep(2000);
			// Select Beekeeper Authorisation
			MyAuthorisation myAuth = PageFactory.initElements(driver, MyAuthorisation.class);
			myAuth.multipleAuthorisation_select1();
			myAuth.addHiveLocation();
			// Add Hive Location
			AddHiveLocation hiveLocation = PageFactory.initElements(driver, AddHiveLocation.class);
			hiveLocation.addHiveLocationAddress(ReadProperties.getObject("data", "NickName"),
					ReadProperties.getObject("data", "HiveLocationAddress"));

			Thread.sleep(10000);

			ActivityHistory activityHistory = PageFactory.initElements(driver, ActivityHistory.class);
			List<String> actualSubjects = activityHistory.retrieveSubject("Location Added", TodaysDate.getTodaysDate());
			for (String actualSubject : actualSubjects) {
				System.out.println("Actual Subject:" + actualSubject);
				Assert.assertEquals("New Hive location has been added:", actualSubject);
			}

		} catch (Exception e) {

			Assert.fail("addHiveLocationAddress Exception");
			e.printStackTrace();

		}
	}

	// @Test
	public void addHiveLocationLocality() {
		try {
			// login to UX
			// System.out.println(Thread.currentThread().getId());
			// driver.get(url);
			// LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
			// loginPage.LoginToUX("sushamakailash@gmail.com", "Happy!23");
			// Thread.sleep(8000);
			// Select Authorisation Subject
			WebDriver driver = LocalDriverManager.getDriver();
			url = ReadProperties.getObject("config","url");
			username = ReadProperties.getObject("config","userName2");
			password = ReadProperties.getObject("config","password");
			driver.get(url);
			LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
			loginPage.LoginToUX(username, password);

			SelectSubject subject = PageFactory.initElements(driver, SelectSubject.class);
			subject.selectSubject("My Authorisation");
			Thread.sleep(2000);
			// Select Beekeeper Authorisation
			MyAuthorisation myAuth = PageFactory.initElements(driver, MyAuthorisation.class);
			myAuth.multipleAuthorisation_select1();
			myAuth.addHiveLocation();
			// Add Hive Location
			AddHiveLocation hiveLocation = PageFactory.initElements(driver, AddHiveLocation.class);
			hiveLocation.addHiveLocationLocality("Nick");

			Thread.sleep(10000);

		} catch (Exception e) {
			Assert.fail("addHiveLocationLocality Exception");
			// System.out.println("addHiveLocationLocality Exception");
			// e.printStackTrace();

		}
	}
	
	//@Test

	public void addHiveBrand() {
		try {
			// login to UX
			// System.out.println(Thread.currentThread().getId());

			// Thread.sleep(8000);
			// Select Authorisation Subject
			WebDriver driver = LocalDriverManager.getDriver();
			url = ReadProperties.getObject("config","url");
			username = ReadProperties.getObject("config","userName1");
			password = ReadProperties.getObject("config","password");

			driver.get(url);
			LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
			loginPage.LoginToUX(username, password);
			SelectSubject subject = PageFactory.initElements(driver, SelectSubject.class);
			subject.selectSubject("My Authorisation");
			Thread.sleep(2000);
			// Select Beekeeper Authorisation
			MyAuthorisation myAuth = PageFactory.initElements(driver, MyAuthorisation.class);
			myAuth.multipleAuthorisation_select1();

			myAuth.addHiveBrand();
			//myAuth.addHiveLocation();
			//Add Hive Brand

			UX_BKR_LP_BeeHive hiveBrand = PageFactory.initElements(driver, UX_BKR_LP_BeeHive.class);

			hiveBrand.addHiveBrand(ReadProperties.getObject("data", "HiveBrand"));


			Thread.sleep(10000);
			ActivityHistory activityHistory = PageFactory.initElements(driver, ActivityHistory.class);

			List<String> actualSubjects = activityHistory.retrieveSubject("Added Hive Brand", TodaysDate.getTodaysDate());

			for (String actualSubject : actualSubjects) {

				System.out.println("Actual Subject:" + actualSubject);

				Assert.assertTrue(actualSubject.contains("Added Hive Brand"));
                
			}
			
		} catch (Exception e) {
			Assert.fail("Add Hive Brand Exception");
			// e.printStackTrace();

		}
	}
	
	//@Test

	// C660 - Update Account Details

	public void NoticeOfSale() {
		try {

			WebDriver driver = LocalDriverManager.getDriver();
			url = ReadProperties.getObject("config","url");
			username = ReadProperties.getObject("config","userName1");
			password = ReadProperties.getObject("config","password");

			driver.get(url);
			LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
			loginPage.LoginToUX(username, password);
			SelectSubject subject = PageFactory.initElements(driver, SelectSubject.class);
			subject.selectSubject("My Authorisation");
			Thread.sleep(2000);
			//Select Beekeeper Authorisation
			MyAuthorisation myAuth = PageFactory.initElements(driver, MyAuthorisation.class);
			myAuth.multipleAuthorisation_select1();
			myAuth.noticeAction();
			//Add Notice - Sold
			NoticeOfSaleOrDisposal Notice = PageFactory.initElements(driver, NoticeOfSaleOrDisposal.class);
			//Notice.addHiveDetails();
			
			HiveDetails_Notice NoticeDetails = PageFactory.initElements(driver, HiveDetails_Notice.class);
			//NoticeDetails.selectMedthodOfDisposal("Sold");
						
			//NoticeDetails.soldOrGifted("Heena", "6 avenue of the americas", "2511202001", "2", "0456455667");
			Notice.addHiveDetails();
			NoticeDetails.selectMedthodOfDisposal(ReadProperties.getObject("data", "MedthodOfDisposal"));
			NoticeDetails.destroyedOrLostOrStolen(ReadProperties.getObject("data", "DestroyedOrLostOrStolen")); //This is not working
			Notice.submitNoticeForm("43");
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}
