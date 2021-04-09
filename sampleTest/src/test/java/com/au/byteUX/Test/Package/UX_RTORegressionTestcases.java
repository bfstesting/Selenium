package com.au.byteUX.Test.Package;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.au.byteUX.Package.LocalDriverManager;
import com.au.byteUX.Page.Package.ActivityHistory;
import com.au.byteUX.Page.Package.CertificatesIssued;
import com.au.byteUX.Page.Package.LoginPage;
import com.au.byteUX.Page.Package.MyAuthorisation;
import com.au.byteUX.Page.Package.SelectSubject;
import com.au.byteUX.Page.Package.UXRTORequest;
import com.au.byteUX.Page.Package.UX_BKR_Lic_Permission_RTO;
import junit.framework.Assert;
import lib.ReadProperties;
import lib.TodaysDate;

public class UX_RTORegressionTestcases {
	String url;
	String username;
	String password;
	String driverLocation;
	SoftAssert softAssert;
	public UX_RTORegressionTestcases() {
		softAssert = new SoftAssert();
	}
	// Issue certificate
	//@Test
	
	// Testing stashing changes
	
	
	public void issueCertificate() throws FileNotFoundException, IOException, InterruptedException {

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
			// Select RTO Authorisation
			MyAuthorisation myAuth = PageFactory.initElements(driver, MyAuthorisation.class);
		
			UX_BKR_Lic_Permission_RTO myLP = PageFactory.initElements(driver, UX_BKR_Lic_Permission_RTO.class);

			Thread.sleep(3000);
			//Verify Authorization menu item 
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
			
			if(myLP.IssueCertificateClick())
			{
				Thread.sleep(3000);
				if(myLP.getheaderOnIssueCert()) // Need to write code for issuing certificate - pending
				{
					System.out.println("Issue Certificate Header is Displayed");
					Thread.sleep(3000);
					myLP.backButtonClick();
					if(myLP.clickNoButton()) {
						Thread.sleep(3000);
						System.out.println("Clicked No!");
					}
										
				}
				else {
					System.out.println("Failed to Display Issue Certificate Header");
					softAssert.assertTrue(false,"Failed to Display Issue Certificate Header");
				}
			}
			else {
				System.out.println("Failed to click Issue Certificate Action");
				softAssert.assertTrue(false,"Failed to click Issue Certificate Action");
			}
			Thread.sleep(3000);
	}
			
			//@Test
			//Certificates Issued Action
			
			public void CertificatesIssued() {
				try {

					WebDriver driver = LocalDriverManager.getDriver();
					url = ReadProperties.getObject("config","UX");
					username = ReadProperties.getObject("config","external_User_Deb_Syd");
					password = ReadProperties.getObject("config","external_pwd");

					driver.get(url);
					LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
					loginPage.LoginToUX(username, password);
					SelectSubject subject = PageFactory.initElements(driver, SelectSubject.class);
					subject.selectSubject("My Authorisation");
					Thread.sleep(2000);
					//Select RTO
					MyAuthorisation myAuth = PageFactory.initElements(driver, MyAuthorisation.class);
					myAuth.multipleAuthorisation_select_RTO();	
		UX_BKR_Lic_Permission_RTO myLP = PageFactory.initElements(driver, UX_BKR_Lic_Permission_RTO.class);

			Thread.sleep(6000);
			CertificatesIssued myCI = PageFactory.initElements(driver, CertificatesIssued.class);
			if(myCI.certificatesIssuedClick()) {
				
				if(myCI.getCertificateIssuesHeaderText()) {
					if(myCI.getReprintCertResultCount()!="0") {
						
						if(myCI.selectCertificate()) {
							
							if(myCI.clickReprint()) {
								
								if(myCI.getReprintPopupText()) {
									
									if(myLP.clickCancelButton()) {
										
										if(myCI.clickRequestNameChange()) {
											
											if(myCI.getCertChngReqHeadTxt()) {
												myLP.backButtonClick();
											}
											else {
												System.out.println("Unable to get Certificate Name Change Header Text");
												softAssert.assertTrue(false,"Unable to get Certificate Name Change Header Text");
											}
											
										}
										else {
											System.out.println("Unable to click Request Name change Action");
											softAssert.assertTrue(false,"Unable to click Request Name change Action");
										}
										
									}
									else {
										System.out.println("Unable to click Cancel Button on Alert");
										softAssert.assertTrue(false,"Unable to click Cancel Button on Alert");
									}
									
								}
								else {
									System.out.println("Unable to get Alert Box Text");
									softAssert.assertTrue(false,"Unable to get Alert Box Text");
								}
								
							}
							else {
								System.out.println("Unable to click Reprint");
								softAssert.assertTrue(false,"Unable to click Reprint");
							}
							
						}
					
						else
						{
							System.out.println("Unable to select Certificate");
							softAssert.assertTrue(false,"Unable to select Certificate");
						}
					}
					else {
						System.out.println("No Certificates to select!");
					}
					
				}
				else {
					System.out.println("Failed to Display Reprint Certificate");
					softAssert.assertTrue(false,"Failed to Display Reprint Certificate");
				}
				
			}
			else {
				System.out.println("Failed to Click Certificates Issued Action");
				softAssert.assertTrue(false,"Failed to Click Certificates Issued Action");
			
				} }catch (Exception e) {
					e.printStackTrace();
				}
				}
			
			//Request Stat Report Action
			@Test
			
			public void UXRTORequest() {
				try {

					WebDriver driver = LocalDriverManager.getDriver();
					url = ReadProperties.getObject("config","UX");
					username = ReadProperties.getObject("config","external_User_Deb_Syd");
					password = ReadProperties.getObject("config","external_pwd");

					driver.get(url);
					LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
					loginPage.LoginToUX(username, password);
					SelectSubject subject = PageFactory.initElements(driver, SelectSubject.class);
					subject.selectSubject("My Authorisation");
					Thread.sleep(2000);
					//Select RTO
					MyAuthorisation myAuth = PageFactory.initElements(driver, MyAuthorisation.class);
					myAuth.multipleAuthorisation_select_RTO();	
		UX_BKR_Lic_Permission_RTO myLP = PageFactory.initElements(driver, UX_BKR_Lic_Permission_RTO.class);

			Thread.sleep(3000);

			UXRTORequest uxRTORequest = PageFactory.initElements(driver, UXRTORequest.class);
			
			if(uxRTORequest.requestStatsReportClick()){
				Thread.sleep(3000);
				if(uxRTORequest.getheaderOnStatsReport()) {
					System.out.println("Request Stats Report Form is displayed");
					Thread.sleep(3000);
					driver.findElement(By.xpath("//fieldset/div[2]/.//tr[5]/td[1]/.//input")).sendKeys("16/03/2021");
					driver.findElement(By.xpath("//fieldset/div[2]/.//tr[5]/td[2]/.//input")).sendKeys("17/03/2021");
					//myLP.backButtonClick();
					Thread.sleep(3000);
					String parentHandle = driver.getWindowHandle();//Get current window
					driver.findElement(By.xpath("//span[text() = 'Submit']")).click();
					System.out.println("Submit clicked");
					Thread.sleep(5000);
					if(driver.getWindowHandles().size()>1)
					{
						for( String winhandle : driver.getWindowHandles())
						{
							driver.switchTo().window(winhandle);//new window that opens up
							Thread.sleep(6000);
						}
						System.out.println ("Switching to parent window: "+parentHandle);//old window
						driver.switchTo().window(parentHandle);
						
							String reportText = driver.findElement(By.xpath("//div[contains(text(),'successful.')]")).getText();
							System.out.println ("Report Generated: "+ reportText);
								softAssert.assertTrue(true, "Report genearted succdessfully");
						}
						else {
							System.out.println("Not able to print the report");
							softAssert.assertTrue(false,"Not able to Print the report! New window is not created");	
						}
					}
				else
				{
					System.out.println("Not able to fetch Request Stats Report Form");
					softAssert.assertTrue(false,"Not able to fetch Request Stats Report Form");
				}
				}
				
			else{ 
				System.out.println("Failed to click Request Stats Report Action");
				softAssert.assertTrue(false,"Failed to click Request Stats Report Action");
			}
				
			Thread.sleep(4000);

			//Order Blank Cert Action
			if(uxRTORequest.orderBlankCertClick()){
				Thread.sleep(3000);
				if(uxRTORequest.getheaderOnOrderCert()) {
					System.out.println("Order Blank Cert Form is displayed");
				// Need to write code for ordering blank certificate , at present it displays only form 
					Thread.sleep(3000);
					myLP.backButtonClick();// not ordering 
					Thread.sleep(3000);
				}
				else
				{
					System.out.println("Not able to fetch Order Blank Cert Form");
					softAssert.assertTrue(false,"Not able to fetch Order Blank Cert Form");
				}
				
			}
			else {
				System.out.println("Failed to click Order Blank Cert Action");
				softAssert.assertTrue(false,"Failed to click Order Blank Cert Action");
			}
			
			Thread.sleep(2000);
				 }
			catch (Exception e) {
					e.printStackTrace();
				}
				}
			
			
			
			//Cancel Authorisation Action
		//	@Test
			
			public void cancelAuthorisation() {
				try {

					WebDriver driver = LocalDriverManager.getDriver();
					url = ReadProperties.getObject("config","UX");
					username = ReadProperties.getObject("config","external_User_Deb_Syd");
					password = ReadProperties.getObject("config","external_pwd");

					driver.get(url);
					LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
					loginPage.LoginToUX(username, password);
					SelectSubject subject = PageFactory.initElements(driver, SelectSubject.class);
					subject.selectSubject("My Authorisation");
					Thread.sleep(2000);
					//Select RTO
					MyAuthorisation myAuth = PageFactory.initElements(driver, MyAuthorisation.class);
					myAuth.multipleAuthorisation_select_RTO();	
		UX_BKR_Lic_Permission_RTO myLP = PageFactory.initElements(driver, UX_BKR_Lic_Permission_RTO.class);

			Thread.sleep(3000);
			
			if(myLP.clickCancelAuthorisation()) {
				Thread.sleep(3000);
				if(myLP.headerOnCancelAuth()) {
					System.out.println("Cancel Authorisation Form is Displayed");
					Thread.sleep(2000);
					myLP.clickCancelButton();	// Need to write code for cancelling , at present it displays only cancel Auth form 		
					Thread.sleep(2000);
				}
				else
				{
					System.out.println("Not able to fetch Cancel Registration text");
					softAssert.assertTrue(false,"Not able to fetch Cancel Registration text");
				}
			}
			else {
				System.out.println("Failed to click cancel Authorisation Action");
				softAssert.assertTrue(false,"Failed to click cancel Authorisation Action");
			}
			Thread.sleep(2000);
			// Need to write code for trainer Management
			softAssert.assertAll();
			driver.close();
			} 
			catch (Exception e) {
			e.printStackTrace();
		}
		}
		
	}
		