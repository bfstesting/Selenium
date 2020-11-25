package com.au.byteUX.Page.Package;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.au.byteUX.Package.LocalDriverManager;
//add comments
public class ActivityHistory {
	
	WebDriver driver;
	
	public ActivityHistory(WebDriver driver)  //constructor
	{
		this.driver = driver;
	}

	public List<String> retrieveSubject(String taskType, String date) {
		
		SelectSubject subject = PageFactory.initElements(driver, SelectSubject.class);
		subject.selectSubject("Home");
		
		List<String> subjects = new ArrayList<>();
		
		List<WebElement> subjectList = driver.findElements(By.xpath("//tbody/tr[.//td[1]/div[text()='"+taskType+"'] and .//td[3]/div[text()='"+date+"']]/td[2]/div"));
		
		for(WebElement subjectElement : subjectList) {
			subjects.add(subjectElement.getText());
		}
		
		return subjects;
		
	}
}
