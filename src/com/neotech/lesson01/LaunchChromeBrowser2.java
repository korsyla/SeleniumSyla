package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChromeBrowser2 {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://www.facebook.com/";
		
		
		if(currentURL.equalsIgnoreCase(expectedURL)) 
		{
			System.out.println("Current URL matches Expected URL");
			System.out.println("Current TITLE is -> " + driver.getTitle());
			System.out.println("Current URL is -> " + driver.getCurrentUrl());
		}
		else 
		{
			System.out.println("Current URL does NOT match Expected URL");
		}
		
		Thread.sleep(5000);
		
		//driver.quit();
	}

}
