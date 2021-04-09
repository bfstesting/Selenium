package com.au.byteUX.ProductionIssue;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.au.byteUX.Page.Package.LoginPage;
import com.au.byteUX.Page.Package.MyAuthorisation;
import com.au.byteUX.Test.Package.HelperClass;

public class PrintReport extends HelperClass{
		
		SoftAssert softAssert;
		
		
		public PrintReport() {
			softAssert = new SoftAssert();
		}
		@BeforeMethod
		public void init() throws FileNotFoundException, IOException {
			driver.get("https://test.bfs.dpi.nsw.gov.au/UXTest/sso");
			LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
			loginPage.LoginToUX("shivayogi@gmail.com", "Happy!23");
//			driver.get("https://train.bfs.dpi.nsw.gov.au/UXTrain");
//			LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
//			loginPage.LoginToUX("beekeeperuat@gmail.com", "Happy!23");
		}
		
		
		@Test

		// C660 - Update Account Details

		public void Print() {
			try {
				Thread.sleep(5000);
				//Select Beekeeper Auth
				driver.findElement(By.xpath("//span[(text()='My Authorisations')]")).click();
				System.out.println("Authorisation clicked");
				Thread.sleep(7000);
				//driver.findElement(By.name("My Authorisations")).click();
				MyAuthorisation myAuth = PageFactory.initElements(driver, MyAuthorisation.class);
				myAuth.multipleAuthorisation_select_RTO();
				System.out.println("RTO selected");
				Thread.sleep(10000);
				WebElement requestStatReport = driver.findElement(By.xpath("//div[text()='Request Stats Report']"));
				requestStatReport.click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//fieldset/div[2]/.//tr[5]/td[1]/.//input")).sendKeys("16/03/2021");
				driver.findElement(By.xpath("//fieldset/div[2]/.//tr[5]/td[2]/.//input")).sendKeys("17/03/2021");
				//driver.findElement(By.xpath("//span[text()='Submit']")).click();
				Thread.sleep(4000);
			
				String parentHandle = driver.getWindowHandle(); // get the current window handle
				//System.out.println(parentHandle);
				//driver.findElement(By.xpath("//a[@href='Click here to run report']")).click();
				driver.findElement(By.xpath("//span[text()='Submit']")).click();
				System.out.println("Submit Clicked");
				Thread.sleep(5000);
				
				if(driver.getWindowHandles().size()> 1)
				{
					for (String winHandle : driver.getWindowHandles()) {
				    driver.switchTo().window(winHandle);  //new window that opens up
				    System.out.println(driver.getWindowHandle());
				    Thread.sleep(6000);
					}
					System.out.println("Switching to Parent Window: "+parentHandle); //old window
    			    driver.switchTo().window(parentHandle);
					//Thread.sleep(6000);
					String reportText = driver.findElement(By.xpath("//div[contains(text(),'successful.')]")).getText();
					System.out.println ("Report Generated: "+ reportText);
					//driver.switchTo().window(parentHandle); // switch back to the original window
					softAssert.assertTrue(true,"Report generated Successfully!!");
				}
				else {
					System.out.println("Not able to print the Report");
					softAssert.assertTrue(false,"Not able to Print the Report! New window is not created");
				}
				
			Thread.sleep(6000);
			softAssert.assertAll();
			//driver.close();
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
		
		
		
		
		
		


