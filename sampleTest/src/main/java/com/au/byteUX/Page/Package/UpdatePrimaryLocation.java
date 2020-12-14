/**
 * 
 */
package com.au.byteUX.Page.Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * @author sarkah01
 *
 */
public class UpdatePrimaryLocation {

	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//label[.//span[text()='Reason']]/div/div/div/input")
	@CacheLookup	WebElement reason;

	@FindBy(how = How.XPATH, using = "//tr[7]/td[1]/label[.//span[text()='Phone']]/div/div/div/input")
	@CacheLookup	WebElement Phone;
	
	@FindBy(how=How.XPATH,using="//span[text()='']") @CacheLookup WebElement save;
	
	
	
	public UpdatePrimaryLocation(WebDriver driver) // constructor
	{
		this.driver = driver;
	}

	public void update1Field_On_PrimaryLocation_Form(String Reason1, String MobileNumber) {
		try {

			reason.sendKeys(Reason1);
			Phone.clear();
			Phone.sendKeys(MobileNumber);
			Thread.sleep(2000);
			
			LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
			loginPage.saveForm();
			
			//save.click();
			Thread.sleep(2000);
			System.out.println("Primary Location form is submitted. Please approve/reject");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}