
	package com.au.byteUX.Test.Package;

	import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
	import java.io.IOException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.Assert;
	import org.testng.annotations.Test;
	import com.au.byteUX.Package.LocalDriverManager;
	import com.au.byteUX.Page.Package.LoginPage;
	import com.au.byteUX.Page.Package.MyAccount;
    import com.au.byteUX.Page.Package.MyAuthorisation;
    import com.au.byteUX.Page.Package.SelectSubject;
	import lib.ReadProperties;

	public class UX_MyAuthorisation_Smoke_Bee_Test { 

		WebDriver driver;
		
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
				}
			}
			else {
				System.out.println("Failed to click on the beekeper License permission from Authorisation menu item");
			}
			
			Thread.sleep(5000);
			
			//select Notices tab
			
			/*myAuth.noticesTab();
			System.out.println("Notices Tab Result is Displayed: "+myAuth.getNoticesTabResult());
			Assert.assertTrue(myAuth.getNoticesTabResult(),"Failed to load Notices Tab"); //no use*/
		
			if(myAuth.noticesTab()){
				Thread.sleep(2000);
				
				if(myAuth.getNoticesTabResult()) {
					System.out.println("Notices Tab Result is Displayed");
					Thread.sleep(2000);
				}
				else
				{
					System.out.println("Not able to fetch Notices tab Result");
				}
			}
			else {
				System.out.println("Failed to click Notices Tab");
			}
			
			//select Export tab
			if(myAuth.exportTabClick()){
				Thread.sleep(2000);
				
				if(myAuth.getExportTabResult()) {
					System.out.println("Export Tab Result is Displayed");
		
					Thread.sleep(2000);
				}
				else
				{
					System.out.println("Not able to fetch Export tab Result");
				}
			}
			else {
				System.out.println("Failed to click Change History Tab");
				Assert.assertTrue(myAuth.exportTabClick());

			}
			Thread.sleep(3000);
			
			//Select ChangeHistory Tab
			if(myAuth.changeHistoryTabClick()){
				Thread.sleep(2000);
				
				if(myAuth.getChangeHistoryTabResult()) {
					System.out.println("ChangeHistory Tab Result is Displayed");		
					Thread.sleep(2000);
				}
				else
				{
					System.out.println("Not able to fetch Change History tab Result");
				}
				
			}
			else {
				System.out.println("Failed to click Change History Tab");

			}
			Thread.sleep(2000);
			
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
				}
				
			}
			else {
				System.out.println("Failed to click update Primary Location Action");

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
				}
				
			}
			else {
				System.out.println("Failed to click Notice of sale Action");
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
				}
			}
			else {
				System.out.println("Failed to click cancel Auth Action");
			}
			
			driver.close();
		}	
		
	}
	
