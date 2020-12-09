
	package com.au.byteUX.Test.Package;

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

	public class UX_BKR_Lic_Permission_MyAuthorisationTest { 

		WebDriver driver;
		
		//Verify MyAuthorisation tab 
		
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
			Assert.assertEquals(tabResult, "My Authorisation");
		}
		
		//verify notices tab
		@Test( dependsOnMethods={"verifyMyAuthTabClick"}	)	
		public void verifyNoticesTabClick() throws InterruptedException, FileNotFoundException, IOException
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
			myAuth.noticesTab();
			
			String tabResult = myAuth.getNoticesTabResult();
			Assert.assertEquals(tabResult, "Notification Type");
		}
		
		//verfiy Export tab
		@Test( dependsOnMethods={"verifyMyAuthTabClick"}	)	
		public void verifyExportTabClick() throws InterruptedException, FileNotFoundException, IOException
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
			myAuth.exportTabClick();
			
			String tabResult = myAuth.getExportTabResult();
			Assert.assertEquals(tabResult, "EXPORT REGISTRATION INFO ");
		}
		
		//verify ChangeHistory Tab
		@Test( dependsOnMethods={"verifyMyAuthTabClick"}	)	
		public void verifyChangeHistoryTabClick() throws InterruptedException, FileNotFoundException, IOException
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
			myAuth.changeHistoryTabClick();
			
			String tabResult = myAuth.getChangeHistoryTabResult();
			Assert.assertEquals(tabResult, "Date Changed");
		}
		
	}
	
