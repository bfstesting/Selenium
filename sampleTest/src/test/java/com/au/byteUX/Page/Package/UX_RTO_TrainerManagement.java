package com.au.byteUX.Page.Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UX_RTO_TrainerManagement {
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//div[text()='Trainer Management']") @CacheLookup WebElement trainerManagement;
	@FindBy(how=How.XPATH,using="//span[text()='Trainer Management']") @CacheLookup WebElement headerOnTrainerMgt;
	@FindBy(how=How.XPATH,using="//div[text()='Apply for New Trainer']") @CacheLookup WebElement applyNewTrainer;
	@FindBy(how=How.XPATH,using="//a[2]/.//span[text()='Trainer Application']") @CacheLookup WebElement headerOnApplyTrainer;
	@FindBy(how=How.XPATH,using="//div[3]/table/.//table[2]/.//td[1]/div/span") @CacheLookup WebElement selectTrainerToCancel;
	@FindBy(how=How.XPATH,using="//div[text()='Cancel Trainer']") @CacheLookup WebElement cancelTrainer;
	@FindBy(how=How.XPATH,using="//div[text()='Cancel Alert']") @CacheLookup WebElement headerOnCancelTrainer;
	
		
		public UX_RTO_TrainerManagement(WebDriver driver)  //constructor
		{
			this.driver = driver;
		}
		
		//Click on Trainer Management
		 public boolean trainerManagementClick(){
		    	try{
		    		trainerManagement.click();
				System.out.println("Clicked on Trainer Management Action");
				return true;
		    	}
		    	catch(Exception e)
		    	{
		    		e.getMessage();
		    		return false;
		    	}
			}
		 //Get header On Trainer Mgt Result
		 public Boolean getheaderOnTrainerMgt(){
		    	Boolean result=false;
		    	try{
		    		result= headerOnTrainerMgt.isDisplayed();
		    	}
		    	catch(Exception e)
		    	{
		    		result= false;
		    		e.getMessage();
		    	}
				return result;
			}
		//Click on applyNewTrainer
		 public boolean applyNewTrainerClick(){
		    	try{
		    		applyNewTrainer.click();
				System.out.println("Clicked on Apply New Trainer");
				return true;
		    	}
		    	catch(Exception e)
		    	{
		    		e.getMessage();
		    		return false;
		    	}
			}
		 //Get header On header On Apply Trainer Result
		 public Boolean getheaderOnApplyTrainer(){
		    	Boolean result=false;
		    	try{
		    		result= headerOnApplyTrainer.isDisplayed();
		    	}
		    	catch(Exception e)
		    	{
		    		result= false;
		    		e.getMessage();
		    	}
				return result;
			}
		 
}
