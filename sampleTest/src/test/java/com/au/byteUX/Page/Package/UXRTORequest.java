package com.au.byteUX.Page.Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UXRTORequest {
WebDriver driver;
	
@FindBy(how=How.XPATH,using="//div[text()='Request Stats Report']") @CacheLookup WebElement requestStatsReport;
@FindBy(how=How.XPATH,using="//span[text()='RTO Request']") @CacheLookup WebElement headerOnStatsReport;
@FindBy(how=How.XPATH,using="//div[text()='Order Blank Certificate Stock']") @CacheLookup WebElement orderBlankCert;
@FindBy(how=How.XPATH,using="//span[text()='RTO Request']") @CacheLookup WebElement headerOnOrderCert;
	
	public UXRTORequest(WebDriver driver)  //constructor
	{
		this.driver = driver;
	}
	
	//Click on Request stats Report
		 public boolean requestStatsReportClick(){
		    	try{
		    		requestStatsReport.click();
				System.out.println("Clicked on Request Stats Report Action");
				return true;
		    	}
		    	catch(Exception e)
		    	{
		    		e.getMessage();
		    		return false;
		    	}
			}
		 //Get Request stats Report form Result
		 public Boolean getheaderOnStatsReport(){
		    	Boolean result=false;
		    	try{
		    		result= headerOnStatsReport.isDisplayed();
		    	}
		    	catch(Exception e)
		    	{
		    		result= false;
		    		e.getMessage();
		    	}
				return result;
			}
		//Click on order Blank Cert
		 public boolean orderBlankCertClick(){
		    	try{
		    		orderBlankCert.click();
				System.out.println("Clicked on Order Blank Cert Action");
				return true;
		    	}
		    	catch(Exception e)
		    	{
		    		e.getMessage();
		    		return false;
		    	}
			}
		 //Get header On Order Cert Result
		 public Boolean getheaderOnOrderCert(){
		    	Boolean result=false;
		    	try{
		    		result= headerOnOrderCert.isDisplayed();
		    	}
		    	catch(Exception e)
		    	{
		    		result= false;
		    		e.getMessage();
		    	}
				return result;
			}

}
