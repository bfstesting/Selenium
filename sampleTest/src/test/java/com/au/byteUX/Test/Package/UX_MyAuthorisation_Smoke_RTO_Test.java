
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
import com.au.byteUX.Page.Package.CertificatesIssued;
import com.au.byteUX.Page.Package.LoginPage;

	import com.au.byteUX.Page.Package.LoginPage;
	import com.au.byteUX.Page.Package.UX_Ext_Company_MyAccount;

    import com.au.byteUX.Page.Package.MyAuthorisation;
    import com.au.byteUX.Page.Package.SelectSubject;
import com.au.byteUX.Page.Package.UXRTORequest;
import com.au.byteUX.Page.Package.UX_BKR_Lic_Permission_RTO;

import lib.ReadProperties;

	public class UX_MyAuthorisation_Smoke_RTO_Test { 

		WebDriver driver;       //constructor
		SoftAssert softAssert;
		
		public UX_MyAuthorisation_Smoke_RTO_Test() 
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
			UX_BKR_Lic_Permission_RTO myLP = PageFactory.initElements(driver, UX_BKR_Lic_Permission_RTO.class);
			//myAuth.multipleAuthorisation_select_Bee();
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
			
			
			//select Training Info tab
			if(myLP.trainingInfoTab()){
				Thread.sleep(3000);
				
				if(myLP.trainingInfoTabResult()) {
					System.out.println("Training Info Tab Result is Displayed");
					Thread.sleep(3000);
				}
				else
				{
					System.out.println("Not able to fetch Training Info tab Result");
					softAssert.assertTrue(false,"Not able to fetch Training Info tab Result");
				}
			}
			else {
				System.out.println("Failed to click Training Info Tab");
				softAssert.assertTrue(false,"Failed to click Training Info Tab");
			}
			
			//select Trainer tab
			if(myLP.trainerTab()){
				Thread.sleep(3000);
				
				if(myLP.trainerTabResult()) {
					System.out.println("Trainer Tab Result is Displayed");
					Thread.sleep(3000);
				}
				else
				{
					System.out.println("Not able to fetch Trainer tab Result");
					softAssert.assertTrue(false,"Not able to fetch Trainer tab Result");
				}
			}
			else {
				System.out.println("Failed to click Trainer Tab");
				softAssert.assertTrue(false,"Failed to click Trainer Tab");
			}
			Thread.sleep(3000);
			
			//Select Training Tab
			if(myLP.trainingTab()){
				Thread.sleep(3000);
				
				if(myLP.trainingTabResult()) {
					System.out.println("Training Button is Enabled");		
					Thread.sleep(3000);
				}
				else
				{
					System.out.println("Not able to fetch Training Button");
					softAssert.assertTrue(false,"Not able to fetch Training Button");
				}
				
			}
			else {
				System.out.println("Failed to find Training Button");
				softAssert.assertTrue(false,"Failed to find Training Button");
			}
			Thread.sleep(3000);
			
			
			//Select Payments Tab
			if(myLP.paymentsTab()){
				Thread.sleep(3000);
				
				if(myLP.paymentsTabResult()) {
					System.out.println("Payments Tab is Clicked");		
					Thread.sleep(3000);
				}
				else
				{
					System.out.println("Not able to fetch Payments Tab");
					softAssert.assertTrue(false,"Not able to fetch Payments Tab");
				}
				
			}
			else {
				System.out.println("Failed to click Payments Tab");
				softAssert.assertTrue(false,"Failed to click Payments Tab");
			}
			Thread.sleep(3000);
			
			
			//select Export tab
			
			if(myLP.exportRTOTab()){
				Thread.sleep(3000);
				
				if(myLP.exportRTOTabResult()) {
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
			}
			
			
			//select Change History tab
			
			if(myLP.changeHistoryRTOTab()){
				Thread.sleep(3000);
				
				if(myLP.changeHistoryRTOTabResult()) {
					System.out.println("Change History Tab Result is Displayed");
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
			
			//Actions
			//Issue Certificate Action
			if(myLP.IssueCertificateClick())
			{
				Thread.sleep(3000);
				if(myLP.getheaderOnIssueCert()) {
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
			//Certificates Issues Action
			
			/*CertificatesIssued myCI = PageFactory.initElements(driver, CertificatesIssued.class);
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
												System.out.println("Unable to get Certiticate Name Change Header Text");
												softAssert.assertTrue(false,"Unable to get Certiticate Name Change Header Text");
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
			}
			*/
			//Request Stat Report Action
			UXRTORequest uxRTORequest = PageFactory.initElements(driver, UXRTORequest.class);
			
			if(uxRTORequest.requestStatsReportClick()){
				Thread.sleep(3000);
				if(uxRTORequest.getheaderOnStatsReport()) {
					System.out.println("Request Stats Report Form is displayed");
					Thread.sleep(3000);
					myLP.backButtonClick();
					Thread.sleep(3000);
				}
				else
				{
					System.out.println("Not able to fetch Request Stats Report Form");
					softAssert.assertTrue(false,"Not able to fetch Request Stats Report Form");
				}
				
			}
			else {
				System.out.println("Failed to click Request Stats Report Action");
				softAssert.assertTrue(false,"Failed to click Request Stats Report Action");
			}
			
			Thread.sleep(2000);

			//Order Blank Cert Action
			if(uxRTORequest.orderBlankCertClick()){
				Thread.sleep(3000);
				if(uxRTORequest.getheaderOnOrderCert()) {
					System.out.println("Order Blank Cert Form is displayed");
					Thread.sleep(3000);
					myLP.backButtonClick();
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
			
			
			//Cancel Authorisation Action
			if(myLP.clickCancelAuthorisation()) {
				Thread.sleep(3000);
				if(myLP.headerOnCancelAuth()) {
					System.out.println("Cancel Authorisation Form is Displayed");
					Thread.sleep(2000);
					myLP.clickCancelButton();			
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
			// Need to write for trainer Management
			softAssert.assertAll();
			driver.close();
		}	
		
	}
	
