
	package com.au.byteUX.Test.Package;

	import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
	import java.io.IOException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.Assert;
	import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.au.byteUX.Package.LocalDriverManager;
	import com.au.byteUX.Page.Package.LoginPage;
	import com.au.byteUX.Page.Package.MyAccount;
    import com.au.byteUX.Page.Package.MyAuthorisation;
    import com.au.byteUX.Page.Package.SelectSubject;
import com.au.byteUX.Page.Package.UX_BKR_Lic_Permission;

import lib.ReadProperties;

	public class UX_MyAuthorisation_Smoke_RTO_Test { 

		WebDriver driver;       //constructor
		SoftAssert softAssert;
		
		public UX_MyAuthorisation_Smoke_RTO_Test() 
		{
			softAssert = new SoftAssert();
		}
		
		
		//Verify MyAuthorisation Menu Item - bees - exists
		
		@Test	
		public void verifyMyAuthTabClick() throws InterruptedException, FileNotFoundException, IOException
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
			subject.selectSubject("My Authorisation");
			System.out.println("Clicked on My Authorisation Menu Item");
			Thread.sleep(3000);
			// Select BeekeeperAuthorisation
			MyAuthorisation myAuth = PageFactory.initElements(driver, MyAuthorisation.class);
			UX_BKR_Lic_Permission myLP = PageFactory.initElements(driver, UX_BKR_Lic_Permission.class);
			//myAuth.multipleAuthorisation_select_Bee();
			Thread.sleep(3000);
			
			//Verify Authorisation menu item 
			if(myAuth.multipleAuthorisation_select_RTO()){
				Thread.sleep(3000);
				if(myAuth.getAuthTabResult()) {
					System.out.println("RTO License permission is selected from My Authorisation Menu Item");
					Thread.sleep(4000);
				}
				else
				{
					System.out.println("Not able to select RTO from Authorisation Menu item list");
					softAssert.assertTrue(false,"Not able to select RTO from Authorisation Menu item list");
				}
			}
			else {
				System.out.println("Failed to click on the RTO License permission from Authorisation menu item");
				softAssert.assertTrue(false,"Failed to click on the RTO License permission from Authorisation menu item");
			}
			
			Thread.sleep(5000);
			
			
			//select Training Info tab
			if(myLP.trainingInfoTab()){
				Thread.sleep(2000);
				
				if(myLP.trainingInfoTabResult()) {
					System.out.println("Training Info Tab Result is Displayed");
					Thread.sleep(2000);
				}
				else
				{
					System.out.println("Not able to fetch Training Info tab Result");
					softAssert.assertTrue(false,"Not able to fetch Training Info tab Result");
				}
			}
			else {
				System.out.println("Failed to click Training Info Tab");
				softAssert.assertTrue(false,"Failed to click Training Info Tab");
			}
			
			//select Trainer tab
			if(myLP.trainerTab()){
				Thread.sleep(2000);
				
				if(myLP.trainerTabResult()) {
					System.out.println("Trainer Tab Result is Displayed");
					Thread.sleep(2000);
				}
				else
				{
					System.out.println("Not able to fetch Trainer tab Result");
					softAssert.assertTrue(false,"Not able to fetch Trainer tab Result");
				}
			}
			else {
				System.out.println("Failed to click Trainer Tab");
				softAssert.assertTrue(false,"Failed to click Trainer Tab");
				//Assert.assertTrue(myAuth.exportTabClick());
			}
			Thread.sleep(3000);
			
			//Select Training Tab
			if(myLP.trainingTab()){
				Thread.sleep(2000);
				
				if(myLP.trainingTabResult()) {
					System.out.println("Training Button is Enabled");		
					Thread.sleep(2000);
				}
				else
				{
					System.out.println("Not able to fetch Training Button");
					softAssert.assertTrue(false,"Not able to fetch Training Button");
				}
				
			}
			else {
				System.out.println("Failed to find Training Button");
				softAssert.assertTrue(false,"Failed to find Training Button");
			}
			Thread.sleep(2000);
			
			
			//Select Payments Tab
			if(myLP.paymentsTab()){
				Thread.sleep(2000);
				
				if(myLP.paymentsTabResult()) {
					System.out.println("Payments Tab is Clicked");		
					Thread.sleep(2000);
				}
				else
				{
					System.out.println("Not able to fetch Payments Tab");
					softAssert.assertTrue(false,"Not able to fetch Payments Tab");
				}
				
			}
			else {
				System.out.println("Failed to click Payments Tab");
				softAssert.assertTrue(false,"Failed to click Payments Tab");
			}
			Thread.sleep(2000);
			
			
			//select Training Info tab
			
		/*	if(myLP.trainingInfoTab()){
				Thread.sleep(2000);
				
				if(myLP.trainingInfoTabResult()) {
					System.out.println("Training Info Tab Result is Displayed");
					Thread.sleep(2000);
				}
				else
				{
					System.out.println("Not able to fetch Training Info tab Result");
					softAssert.assertTrue(false,"Not able to fetch Training Info tab Result");
				}
			}
			else {
				System.out.println("Failed to click Training Info Tab");
				softAssert.assertTrue(false,"Failed to click Training Info Tab");
			}
			
			
			//select Training Info tab
			
			if(myLP.trainingInfoTab()){
				Thread.sleep(2000);
				
				if(myLP.trainingInfoTabResult()) {
					System.out.println("Training Info Tab Result is Displayed");
					Thread.sleep(2000);
				}
				else
				{
					System.out.println("Not able to fetch Training Info tab Result");
					softAssert.assertTrue(false,"Not able to fetch Training Info tab Result");
				}
			}
			else {
				System.out.println("Failed to click Training Info Tab");
				softAssert.assertTrue(false,"Failed to click Training Info Tab");
			}
			
			
			//select Training Info tab
			
			if(myLP.trainingInfoTab()){
				Thread.sleep(2000);
				
				if(myLP.trainingInfoTabResult()) {
					System.out.println("Training Info Tab Result is Displayed");
					Thread.sleep(2000);
				}
				else
				{
					System.out.println("Not able to fetch Training Info tab Result");
					softAssert.assertTrue(false,"Not able to fetch Training Info tab Result");
				}
			}
			else {
				System.out.println("Failed to click Training Info Tab");
				softAssert.assertTrue(false,"Failed to click Training Info Tab");
			}
			
			
			//Actions
			//Update Primary location Action
			if(myAuth.updatePrimaryLocationClick()){
				Thread.sleep(3000);
				if(myAuth.getupdatePrimaryLocationResult()) {
					System.out.println("Update Primary Location Form is displayed");
					myAuth.saveAndCloseClick();		
					Thread.sleep(2000);
				}
				else
				{
					System.out.println("Not able to fetch Primary Location form");
					softAssert.assertTrue(false,"Not able to fetch Primary Location form");
				}
				
			}
			else {
				System.out.println("Failed to click update Primary Location Action");
				softAssert.assertTrue(false,"Failed to click update Primary Location Action");
			}
			
			Thread.sleep(2000);
			
			//Notice of sale Action
			if(myAuth.noticeActionClick())
			{
				Thread.sleep(3000);
				if(myAuth.getnoticeActionResult()) {
					System.out.println("Notice of sale or disposal of Beehives form is displayed");
					myAuth.saveAndCloseNoticeClick();
					Thread.sleep(2000);
				}
				else
				{
					System.out.println("Failed to Display Notice of Sale or disposal form");
					softAssert.assertTrue(false,"Failed to Display Notice of Sale or disposal form");
				}
				
			}
			else {
				System.out.println("Failed to click Notice of sale Action");
				softAssert.assertTrue(false,"Failed to click Notice of sale Action");
			}
			
	
			//Cancel Auth Action
			if(myAuth.cancelAuthActionClick()) {
				Thread.sleep(3000);
				if(myAuth.getcancelAuthActionResult()) {
					System.out.println("Cancel Authorisation Form is Displayed");
					myAuth.popupCancelClick();			
					Thread.sleep(2000);
				}
				else
				{
					System.out.println("Not able to fetch Cancel Authorisation text");
					softAssert.assertTrue(false,"Not able to fetch Cancel Authorisation text");
				}
			}
			else {
				System.out.println("Failed to click cancel Auth Action");
				softAssert.assertTrue(false,"Failed to click cancel Auth Action");
			}*/
			softAssert.assertAll();
			driver.close();
		}	
		
	}
	
