package com.au.byteUX.Page.Package;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import lib.ReadProperties;

/**
 * @author sarkah01
 *
 */
public class LoginPage {
	
	WebDriver driver;
	String login_xpath;
	
	
	@FindBy(how=How.CSS,using="#email") @CacheLookup WebElement un;
	@FindBy(how=How.ID,using="password") @CacheLookup WebElement pwd;
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Log In')]") @CacheLookup WebElement btn;
	@FindBy(how=How.XPATH,using="//div[contains(@class,'Secondary-add')]") @CacheLookup WebElement add;
	@FindBy(how=How.XPATH,using="//div[contains(@class,'Secondary-remove')]") @CacheLookup WebElement remove;
	@FindBy(how=How.XPATH,using="//span[text()='']") @CacheLookup WebElement save;
	@FindBy(how=How.XPATH,using="//span[text()='�?�']") @CacheLookup WebElement cancel;
	@FindBy(how=How.XPATH,using="//span[text()='�?�']") @CacheLookup WebElement back;
	
	
	public LoginPage(WebDriver driver) throws FileNotFoundException, IOException  //constructor
	{
		this.driver = driver;
		this.login_xpath = ReadProperties.getObject("OR", "AddLogin_xpath");
	}
	
	public void LoginToUX (String uid, String pass)
	{
		try {
			Thread.sleep(1000);
			un.sendKeys(uid);
			Thread.sleep(1000);
			pwd.sendKeys(pass);
			//added a command to scroll the page - if I clicked on the button directly, the cursor was trying to click on the footer where the button is not available.
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			btn.click();
			System.out.println("login successful");
			Thread.sleep(5000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void addTemplate()
	{
		add.click();
		System.out.println("Add template");		
	}
	
	public void removeTemplate()
	{
		remove.click();
		System.out.println("Remove template");
	}
	
	public void saveForm()
	{
		save.click();		
	}
	
	public void cancelForm()
	{
		cancel.click();
	}
	
	public void backButton()
	{
		back.click();
	}

}
