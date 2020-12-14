/**
 * 
 */
package com.au.byteUX.Test.Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.au.byteUX.Package.LocalDriverManager;
import com.au.byteUX.Page.Package.UX_BKR_LP_BeeHive;
import com.au.byteUX.Page.Package.LoginPage;
import com.au.byteUX.Page.Package.MyAuthorisation;
import com.au.byteUX.Page.Package.SelectSubject;
import junit.framework.Assert;
import lib.ReadProperties;
import lib.ReadPropertiesFile;

/**
 * @author sarkah01
 *
 */
public class TestingScripts {
		
	@Test

	// C660 - Update Account Details
	// C662 - Update Primary Location

	public void UpdateAccountDetailsAndPrimaryLocation() {
		try {
			
			WebDriver driver = LocalDriverManager.getDriver();
			driver.get(ReadProperties.getObject("UX_BKR_LP_BeeHive","url"));

			LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
			loginPage.LoginToUX(ReadProperties.getObject("config","userName1"), ReadProperties.getObject("config","password"));
			Thread.sleep(5000);
			// Navigate to My Account
			SelectSubject subject = PageFactory.initElements(driver, SelectSubject.class);
			subject.selectSubject("My Account");
			Thread.sleep(2000);
			// Enter values in the fields
			MyAuthorisation myAuth = PageFactory.initElements(driver, MyAuthorisation.class);
			myAuth.multipleAuthorisation_select_Bee();
			//Click on '+' button to add hive brand 
			myAuth.addHiveBrand();
			//Fill and Submit UX_BKR_LP_BeeHive detail form
			UX_BKR_LP_BeeHive hiveBrand = PageFactory.initElements(driver, UX_BKR_LP_BeeHive.class);
			hiveBrand.addHB("HB261120201");

		} catch (Exception e) {

			Assert.fail("UpdateAccountDetailsAndPrimaryLocation Exception");
		}
	}

}
