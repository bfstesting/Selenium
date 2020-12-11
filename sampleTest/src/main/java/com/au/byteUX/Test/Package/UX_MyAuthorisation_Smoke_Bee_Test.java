
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
			String url = ReadProperties.getObject("config","trainUX");
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
			myAuth.multipleAuthorisation_select_Bee();
			Thread.sleep(3000);
			
			System.out.println("My Authorisation Menu Item is displayed: "+myAuth.getAuthTabResult());
			Assert.assertTrue(myAuth.getAuthTabResult(),"Failed to load Auth tab");
			
			Thread.sleep(5000);
			
			//select Notices tab
			myAuth.noticesTab();
			System.out.println("Notices Tab Result is Displayed: "+myAuth.getNoticesTabResult());
			//Assert.assertTrue(myAuth.getNoticesTabResult(),"Failed to load Notices Tab"); //no use
			Thread.sleep(2000);
			
			//select Export tab
			myAuth.exportTabClick();
			System.out.println("Export Tab Result is Displayed: "+myAuth.getExportTabResult());
			//Assert.assertTrue(myAuth.getExportTabResult());
			Thread.sleep(3000);
			
			//Select ChangeHistory Tab
			myAuth.changeHistoryTabClick();	
			System.out.println("ChangeHistory Tab Result is Displayed: "+myAuth.getChangeHistoryTabResult());
			//Assert.assertTrue(myAuth.getChangeHistoryTabResult());
			Thread.sleep(3000);
			
			//Actions
			//Update Primary location Action
			myAuth.updatePrimaryLocationClick();
			Thread.sleep(3000);
			System.out.println("Update Primary Location Form is displayed: "+myAuth.getupdatePrimaryLocationResult());
			//Assert.assertTrue(myAuth.getupdatePrimaryLocationResult());
			myAuth.saveAndCloseClick();
			
			//Notice of sale Action
			if(myAuth.noticeActionClick())
			{
				Thread.sleep(2000);
				if(myAuth.getnoticeActionResult()) {
					System.out.println("Notice of sale or disposal of Beehives form is displayed");
					myAuth.saveAndCloseNoticeClick();
					Thread.sleep(2000);
				}
				else
				{
					System.out.println("Failed to Display Notice of Sale or disposal form");
				}
				
				//Assert.assertTrue(myAuth.getnoticeActionResult());
				
			}
			else {
				System.out.println("Failed to click Notice of sale Action");
			}
			
	
			//Cancel Auth Action
			if(myAuth.cancelAuthActionClick()) {
				Thread.sleep(2000);
				
				//Assert.assertTrue(myAuth.getcancelAuthActionResult());
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
	
