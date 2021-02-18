package com.au.byteUX.Test.Package;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.au.byteUX.Package.LocalDriverManager;
import com.au.byteUX.Page.Package.LoginPage;
import com.au.byteUX.Page.Package.UX_Ext_Company_MyAccount;
import com.au.byteUX.Page.Package.SelectSubject;

import lib.ReadProperties;

//This class has been created to execute in Train only. 
//We need to find a way to parameterise that so selected URL from testng.xml file can be picked up.

public class UX_MyAccount_Smoke_Test {

	WebDriver driver;
	SoftAssert softAssert;
	
	public UX_MyAccount_Smoke_Test()  //constructor
	{
		softAssert = new SoftAssert();
	}
	
	//Verify MyAccount Menu Item - exists
	
	@Test	
	public void verifyMyAccTabClick() throws InterruptedException, FileNotFoundException, IOException
	{
		WebDriver driver = LocalDriverManager.getDriver();
		String url = ReadProperties.getObject("config","UX");
		String username = ReadProperties.getObject("config","external_User_Deb_Syd");
		String password = ReadProperties.getObject("config","external_pwd");
		driver.get(url);
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.LoginToUX(username, password);
		Thread.sleep(5000);
		
		SelectSubject subject = PageFactory.initElements(driver, SelectSubject.class);
		subject.selectSubject("My Account");
		System.out.println("Clicked on My Account Menu Item");
		Thread.sleep(2000);
		
		UX_Ext_Company_MyAccount MyAccount = PageFactory.initElements(driver, UX_Ext_Company_MyAccount.class);
		if(MyAccount.getAccountHeaderText()) {
			System.out.println("My Account Form is Displayed");
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("Not able to fetch the My Account page header text");
			softAssert.assertTrue(false,"Not able to fetch the My Account page header text");
		}
		
		//verify Auth tab in My Account - exists
		if(MyAccount.authorisationTab()){
			Thread.sleep(2000);
			if(MyAccount.getAuthTabResult()) {
				System.out.println("Authorisation Tab Result is Displayed");
				Thread.sleep(3000);
			}
			else
			{
				System.out.println("Not able to fetch Authorisation tab Result");
				softAssert.assertTrue(false,"Not able to fetch Authorisation tab Result");
			}
		}
		else {
			System.out.println("Failed to click Authorisation Tab");
			softAssert.assertTrue(false,"Failed to click Authorisation Tab");
		}
		
		//Verifying Contacts tab in My Account - exists
		if(MyAccount.contactsTab()){
			Thread.sleep(3000);
			if(MyAccount.getContactTabResult()) {
				System.out.println("Contact Tab Result is Displayed");
				Thread.sleep(3000);
			}
			else
			{
				System.out.println("Not able to fetch Contact tab Result");
				softAssert.assertTrue(false,"Not able to fetch Contact tab Result");
			}
		}
		else {
			System.out.println("Failed to click Contact Tab");
			softAssert.assertTrue(false,"Failed to click Contact Tab");
		}
		
		//Verifying Interest tab on My Account - exists
		if(MyAccount.interestsTab()){
			Thread.sleep(3000);
			if(MyAccount.getInterestTabResult()) {
				System.out.println("Interest Tab Result is Displayed");
				Thread.sleep(3000);
			}
			else
			{
				System.out.println("Not able to fetch Interest tab Result");
				softAssert.assertTrue(false,"Not able to fetch Interest tab Result");
				Thread.sleep(3000);
			}
		}
		else {
			System.out.println("Failed to click Interest Tab");
			softAssert.assertTrue(false,"Failed to click Interest Tab");
		}
		
		//Verifying unpaid Invoices tab in My Account - exists
		if(MyAccount.invoicesTab()){
			Thread.sleep(3000);
			if(MyAccount.getInvoicesTabResult()) {
				System.out.println("Unpaid Invoices Tab Result is Displayed");
				Thread.sleep(3000);
			}
			else
			{
				System.out.println("Not able to fetch Unpaid Invoices tab Result");
				softAssert.assertTrue(false,"Not able to fetch unpaid Invoices tab Result");
			}
		}
		else {
			System.out.println("Failed to click Unpaid Invoices Tab");
			softAssert.assertTrue(false,"Failed to click Unpaid Invoices Tab");
		}
		
		//Verifying All Invoices tab in My Account - exists
				if(MyAccount.allInvoicesTab()){
					Thread.sleep(3000);
					if(MyAccount.getAllInvoicesTabResult()) {
						System.out.println("All Invoices Tab Result is Displayed");
						Thread.sleep(3000);
					}
					else
					{
						System.out.println("Not able to fetch All Invoices tab Result");
						softAssert.assertTrue(false,"Not able to fetch All Invoices tab Result");
					}
				}
				else {
					System.out.println("Failed to click All Invoices Tab");
					softAssert.assertTrue(false,"Failed to click All Invoices Tab");
				}
				
				//Verifying Audit tab on My Account - exists
				if(MyAccount.auditsTab()){
					Thread.sleep(3000);
					if(MyAccount.getAuditTabResult()) {
						System.out.println("Audit Tab Result is Displayed");
						Thread.sleep(3000);
					}
					else
					{
						System.out.println("Not able to fetch Auidt tab Result");
						softAssert.assertTrue(false,"Not able to fetch Audit tab Result");
						Thread.sleep(3000);
					}
				}
				else {
					System.out.println("Failed to click Audit Tab");
					softAssert.assertTrue(false,"Failed to click Audit Tab");
				}
				
				//Verifying Inspection tab on My Account - exists
				if(MyAccount.inspectionsTab()){
					Thread.sleep(3000);
					if(MyAccount.getInspectionTabResult()) {
						System.out.println("Inspection Tab Result is Displayed");
						Thread.sleep(3000);
					}
					else
					{
						System.out.println("Not able to fetch Inspection tab Result");
						softAssert.assertTrue(false,"Not able to fetch Inspection tab Result");
						Thread.sleep(3000);
					}
				}
				else {
					System.out.println("Failed to click Inspection Tab");
					softAssert.assertTrue(false,"Failed to click Inspection Tab");
				}
				
		//Verifing Update Account Details form in My Account - Exists
		if(MyAccount.updateAccountDetails()){
			Thread.sleep(3000);
			if(MyAccount.getUpdateAccountDetailsResult()) {
				System.out.println("Update Account Details form is Displayed");
				Thread.sleep(3000);
				MyAccount.saveAndCloseClick();
				Thread.sleep(3000);
			}
			else
			{
				System.out.println("Not able to fetch Update Account Details form");
				
				softAssert.assertTrue(false,"Not able to fetch Update Account Details form");
			}
		}
		else {
			System.out.println("Failed to click Update Account Details form");
			softAssert.assertTrue(false,"Failed to click Update Account Details form");
		}
		
		//Verifing Send User Invite form in My Account - Exists
				if(MyAccount.sendUserInvite()){
					Thread.sleep(3000);
					if(MyAccount.okButtonClick())
					{
						Thread.sleep(3000);
					if(MyAccount.getsendUserInviteResult()) {
						System.out.println("Send User Invite form is Displayed");
						Thread.sleep(3000);
						//should write xpath for Close  
					}
					else
					{
						System.out.println("Not able to fetch Send User Invite Form");
						softAssert.assertTrue(false,"Not able to fetch Send User Invite Form");
					}
					}else
					{
						System.out.println("Not able to Click on Ok Button insend user invite");
						softAssert.assertTrue(false,"Not able to Click on Ok Button in send user invite");

					}
				}
				else {
					System.out.println("Failed to click Send User Invite");
					softAssert.assertTrue(false,"Failed to click Send User Invite");
				}
				
		softAssert.assertAll();
		driver.close();
	}
	
}
