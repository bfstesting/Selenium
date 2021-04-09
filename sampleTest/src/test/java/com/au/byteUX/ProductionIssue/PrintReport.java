package com.au.byteUX.ProductionIssue;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.au.byteUX.Page.Package.LoginPage;
import com.au.byteUX.Page.Package.MyAuthorisation;
import com.au.byteUX.Test.Package.HelperClass;

public class PrintReport extends HelperClass {
		
		@BeforeMethod
		public void init() throws FileNotFoundException, IOException {
			driver.get("https://test.bfs.dpi.nsw.gov.au/UXTrain");
			LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
			loginPage.LoginToUX("shivayogi@gmail.com", "Happy!23");
		}
		
		
		@Test

		// C660 - Update Account Details

		public void Print() {
			try {
				Thread.sleep(5000);
				//Select Beekeeper Auth
				driver.findElement(By.xpath("//span[(text()='My Authorisations')]")).click();
				//driver.findElement(By.name("My Authorisations")).click();
				MyAuthorisation myAuth = PageFactory.initElements(driver, MyAuthorisation.class);
				myAuth.multipleAuthorisation_select_RTO();
				driver.findElement(By.xpath("//div[(text()='Request Stats Report')]")).click();
				driver.findElement(By.xpath("//fieldset/div[2]/.//tr[5]/td[1]/.//input")).sendKeys("16/03/2021");
				driver.findElement(By.xpath("//fieldset/div[2]/.//tr[5]/td[2]/.//input")).sendKeys("17/03/2021");
				
				
				Thread.sleep(5000);
				
				String parentHandle = driver.getWindowHandle(); // get the current window handle
				System.out.println(parentHandle);
				driver.findElement(By.xpath("//span[(text()='Submit')]")).click();
				Thread.sleep(3000);
				for (String winHandle : driver.getWindowHandles()) {
			    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
			    System.out.println(driver.getWindowHandle());
			    System.out.println("Report Open");
				}
			    driver.close(); // close newly opened window when done with it
				driver.switchTo().window(parentHandle); // switch back to the original window
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
		
		
		
		
		
		


