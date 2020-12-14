package com.au.byteUX.Test.Package;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.au.byteUX.Package.LocalDriverManager;
import com.au.byteUX.Page.Package.LoginPage;
import com.au.byteUX.Page.Package.MyAccount;
import com.au.byteUX.Page.Package.SelectSubject;

import lib.ReadProperties;

//This class has been created to execute in Train only. 
//We need to find a way to parameterise that so selected URL from testng.xml file can be picked up.

public class UX_MyAccount_Smoke_Test {

	WebDriver driver;
	
	public UX_MyAccount_Smoke_Test()  //constructor
	{
	}
	
	//Verify MyAccount Menu Item - exists
	
	@Test	
	public void verifyMyAccTabClick() throws InterruptedException, FileNotFoundException, IOException
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
		subject.selectSubject("My Account");
		Thread.sleep(2000);
		
		MyAccount MyAccount = PageFactory.initElements(driver, MyAccount.class);
		String actualHeaderText = MyAccount.getAccountHeaderText();
		Assert.assertEquals(actualHeaderText, "Account holder information");
		
		//verify Auth tab in My Account - exists
		MyAccount.authorisationTab();
		Thread.sleep(2000);
		String tabResult = MyAccount.getAuthTabResult();
		Assert.assertEquals(tabResult, "Authority Number");
		
		//Verifying Contacts tab in My Account - exists
		MyAccount.contactsTab();
		Thread.sleep(2000);
		//String tabResult = MyAccount.getContactTabResult();
		//Verifiy grid value
		Assert.assertEquals(tabResult, "First Name");
		
		//Verifying Interest tab on My Account - exists
		MyAccount.interestsTab();
		Thread.sleep(2000);
		//String tabResult = MyAccount.getInterestTabResult();
		//Verify grid value
		Assert.assertEquals(tabResult, "Pref Comm Method");
		
		//Verifying Invoices tab in My Account - exists
		MyAccount.invoicesTab();
		Thread.sleep(2000);
		//Verify grid value
		//String tabResult = MyAccount.getInvoicesTabResult();
		Assert.assertEquals(tabResult, "Unpaid Invoices");

	}
	
}
