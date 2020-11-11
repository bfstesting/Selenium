/**
 * 
 */
package com.au.byteUX.Package;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

/**
 * @author sarkah01
 *
 */
public class ScrollByPage {
	
    WebDriver driver;
    
    public void ByPage() {
        //System.setProperty("webdriver.chrome.driver", "E://Selenium//Selenium_Jars//chromedriver.exe");
        //driver = new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Launch the application		
        //driver.get("http://demo.guru99.com/test/guru99home/");

        //This will scroll the web page till end.		
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        System.out.println("page scrolled");
    }

}
