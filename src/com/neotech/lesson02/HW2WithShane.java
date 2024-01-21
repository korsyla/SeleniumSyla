package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HW2WithShane {

	public static void main(String[] args) throws InterruptedException {

//		HW2: Opening Page on Firefox Browser
//		Open Firefox browser
//		Navigate to “https://www.redfin.com/”
//		Verify that you have navigated to (https://www.redfin.com/)
//		End the Session (close the browser).
		
		
		//Locating the Driver
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		
		//Creating new Object /  We open the browser
		WebDriver driver = new FirefoxDriver();
		
		//It will open the URL Website
		//TRY USING VARIABLES AS MUCH AS POSSIBLEEEE AND USE THE VARIABLEE 
		//EXAMPLE... VARIABLE = URL
		String url = "https://www.redfin.com";
		driver.get(url); 
		
		Thread.sleep(1000); // One Second
		
		//Get the current URL of the Page
		String currentURL = driver.getCurrentUrl();
		
		if(url.equals(currentURL)) 
		{
			System.out.println("Test Passed");
		}
		else 
		{
			System.out.println("Test Failed");
			System.out.println("Current URL is -> " + currentURL);
			System.out.println("Expected URL is - > " + url);
		}
		
		
		Thread.sleep(500);
		
		driver.quit();
		
		
	}

}
