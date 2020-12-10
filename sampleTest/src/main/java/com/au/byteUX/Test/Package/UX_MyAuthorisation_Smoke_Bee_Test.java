
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
			Thread.sleep(2000);
			// Select BeekeeperAuthorisation
			MyAuthorisation myAuth = PageFactory.initElements(driver, MyAuthorisation.class);
			myAuth.multipleAuthorisation_select_Bee();
			Thread.sleep(2000);
		
			String tabResult = myAuth.getAuthTabResult();
			//Assert.assertEquals(tabResult, "My Authorisation");
			
			myAuth.noticesTab();
			String tabResult_notices = myAuth.getNoticesTabResult();
			//Assert.assertEquals(tabResult_notices, "Notification Type");
			
			myAuth.exportTabClick();
			String tabResult_export = myAuth.getExportTabResult();
			//Assert.assertEquals(tabResult_export, "EXPORT REGISTRATION INFO ");
			
			myAuth.changeHistoryTabClick();			
			String tabResult_changeHistory = myAuth.getChangeHistoryTabResult();
			//Assert.assertEquals(tabResult_changeHistory, "Date Changed");
			//assertTrue(tabResult_changeHistory.);
			
			//Add for actions
			
			
			//signout
			driver.close();
		}
		
		
		
		
		
	}
	
