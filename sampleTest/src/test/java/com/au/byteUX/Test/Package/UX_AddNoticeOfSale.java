package com.au.byteUX.Test.Package;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.au.byteUX.Package.LocalDriverManager;
import com.au.byteUX.Page.Package.ActivityHistory;
import com.au.byteUX.Page.Package.UX_BKR_LP_BeeHive;
import com.au.byteUX.Page.Package.UX_BKR_LP_Location;
import com.au.byteUX.Page.Package.LoginPage;
import com.au.byteUX.Page.Package.MyAccount;
import com.au.byteUX.Page.Package.MyAuthorisation;
import com.au.byteUX.Page.Package.SelectSubject;
import com.au.byteUX.Page.Package.UpdateAccountDetails;
import com.au.byteUX.Page.Package.UpdatePrimaryLocation;

import junit.framework.Assert;
import lib.ReadProperties;

public class UX_AddNoticeOfSale extends HelperClass {
		
		String url;
		String username;
		String password;
		@BeforeMethod
		public void init() throws FileNotFoundException, IOException {
			
			url = ReadProperties.getObject("config","trainUX");
			username = ReadProperties.getObject("config","external_User_Deb_Syd");
			password = ReadProperties.getObject("config","external_pwd");
			
			driver.get(url);
			LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
			loginPage.LoginToUX(username, password);
			
		}
		
		public UX_AddNoticeOfSale() {
		}

		@Test

		// C660 - Update Account Details

		public void NoticeOfSale() {
			try {

				SelectSubject subject = PageFactory.initElements(driver, SelectSubject.class);
				subject.selectSubject("My Authorisation");
				Thread.sleep(2000);
				//Select Beekeeper Auth
				MyAuthorisation myAuth = PageFactory.initElements(driver, MyAuthorisation.class);
				myAuth.multipleAuthorisation_select_Bee();
				
				//Add Notice - Sold
				UX_BKR_LP_Location hiveLocation = PageFactory.initElements(driver, UX_BKR_LP_Location.class);
				hiveLocation.addHiveLocationAddress("Nick1", "6 avenue of the americas");

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
		
		
		
		
		
		


