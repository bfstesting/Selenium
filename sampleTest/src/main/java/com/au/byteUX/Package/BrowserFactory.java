/**
 * 
 */
package com.au.byteUX.Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author sarkah01
 *
 */
public class BrowserFactory {
	
static WebDriver driver;
	
	public static WebDriver startBrowser(WebDriver driver, String browserName, String url)
	{
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarkah01\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();			
		}
		else if (browserName.equalsIgnoreCase("IE"))
		{
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(url);
		
		return driver;
	}

}
