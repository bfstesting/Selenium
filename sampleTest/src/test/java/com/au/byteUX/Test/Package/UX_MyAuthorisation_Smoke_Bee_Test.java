
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
	import com.au.byteUX.Page.Package.UX_Ext_Company_MyAccount;
    import com.au.byteUX.Page.Package.MyAuthorisation;
    import com.au.byteUX.Page.Package.SelectSubject;
	import lib.ReadProperties;

	public class UX_MyAuthorisation_Smoke_Bee_Test { 

		WebDriver driver;       //constructor
		SoftAssert softAssert;
		
		public UX_MyAuthorisation_Smoke_Bee_Test() 
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
			//myAuth.multipleAuthorisation_select_Bee();
			Thread.sleep(3000);
			
			//Verify Authorisation menu item 
			if(myAuth.multipleAuthorisation_select_Bee()){
				Thread.sleep(3000);
				if(myAuth.getAuthTabResult()) {
					System.out.println("Beekeeper License permission is selected from My Authorisation Menu Item");
					Thread.sleep(4000);
				}
				else
				{
					System.out.println("Not able to select Beekeeper from Authorisation Menu item list");
					softAssert.assertTrue(false,"Not able to select Beekeeper from Authorisation Menu item list");
				}
			}
			else {
				System.out.println("Failed to click on the Beekeper License permission from Authorisation menu item");
				softAssert.assertTrue(false,"Failed to click on the Beekeper License permission from Authorisation menu item");
			}
			
			Thread.sleep(5000);
			
			//select Notices tab
			
			/*myAuth.noticesTab();
			System.out.println("Notices Tab Result is Displayed: "+myAuth.getNoticesTabResult());
			Assert.assertTrue(myAuth.getNoticesTabResult(),"Failed to load Notices Tab"); //no use*/
		
			if(myAuth.noticesTab()){
				Thread.sleep(3000);
				
				if(myAuth.getNoticesTabResult()) {
					System.out.println("Notices Tab Result is Displayed");
					Thread.sleep(3000);
				}
				else
				{
					System.out.println("Not able to fetch Notices tab Result");
					softAssert.assertTrue(false,"Not able to fetch Notices tab Result");
				}
			}
			else {
				System.out.println("Failed to click Notices Tab");
				softAssert.assertTrue(false,"Failed to click Notices Tab");
			}
			
			//select Export tab
			if(myAuth.exportTabClick()){
				Thread.sleep(3000);
				
				if(myAuth.getExportTabResult()) {
					System.out.println("Export Tab Result is Displayed");
					Thread.sleep(3000);
				}
				else
				{
					System.out.println("Not able to fetch Export tab Result");
					softAssert.assertTrue(false,"Not able to fetch Export tab Result");
				}
			}
			else {
				System.out.println("Failed to click Export Tab");
				softAssert.assertTrue(false,"Failed to click Export Tab");
				//Assert.assertTrue(myAuth.exportTabClick());
			}
			Thread.sleep(3000);
			
			//Select ChangeHistory Tab
			if(myAuth.changeHistoryTabClick()){
				Thread.sleep(3000);
				
				if(myAuth.getChangeHistoryTabResult()) {
					System.out.println("ChangeHistory Tab Result is Displayed");		
					Thread.sleep(3000);
				}
				else
				{
					System.out.println("Not able to fetch Change History tab Result");
					softAssert.assertTrue(false,"Not able to fetch Change History tab Result");
				}
				
			}
			else {
				System.out.println("Failed to click Change History Tab");
				softAssert.assertTrue(false,"Failed to click Change History Tab");
			}
			Thread.sleep(3000);
			
			//Actions
			//Update Primary location Action
			if(myAuth.updatePrimaryLocationClick()){
				Thread.sleep(3000);
				if(myAuth.getupdatePrimaryLocationResult()) {
					System.out.println("Update Primary Location Form is displayed");
					myAuth.saveAndCloseClick();		
					Thread.sleep(3000);
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
			
			Thread.sleep(3000);
			
			//Notice of sale Action
			if(myAuth.noticeActionClick())
			{
				Thread.sleep(3000);
				if(myAuth.getnoticeActionResult()) {
					System.out.println("Notice of sale or disposal of Beehives form is displayed");
					myAuth.saveAndCloseNoticeClick();
					Thread.sleep(3000);
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
					if(myAuth.popupCancelClick())
					{
						Thread.sleep(3000);
					}
					else
					{
						System.out.println("Not able to cancel Popup box");
						softAssert.assertTrue(false,"Not able to cancel Popup box");
					}
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
			}
			softAssert.assertAll();
			driver.close();
		}	
		
	}
	
