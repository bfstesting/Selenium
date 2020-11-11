/**
 * 
 */
package com.au.byteUX.Test.Package;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.au.byteUX.Package.BrowserFactory;

/**
 * @author sarkah01
 *
 */
public class HelperClass {

	public static WebDriver driver;
	BrowserFactory obj;

	public HelperClass() {

	}

	@BeforeSuite
	//public void beforeSuite(WebDriver driver) {
		//this.driver = driver;

	//}
	public void beforeSuite() {
		System.out.println("in @BeforeSuite");
	}
	

	@BeforeClass
	public void beforeClass() {
		System.out.println("in @BeforeClass");

	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("in @BeforeMethod");
		HelperClass.driver = BrowserFactory.startBrowser(driver, "chrome",
				"https://train.bfs.dpi.nsw.gov.au/UXTrain/sso");

	}
	
	@SuppressWarnings("static-access")
	@AfterMethod
	public void afterMethod() {
		this.driver.close();

	}
	
	@AfterSuite
	public void afterSuite() throws IOException
	{
		driver.quit();
	}

}
