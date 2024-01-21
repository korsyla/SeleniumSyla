package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeDriverRe2 {

	public static void main(String[] args) throws InterruptedException {

		
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.youtube.com/");
		
		
		String currentURL = driver.getCurrentUrl();
		String excpectedURL = "https://www.youtube.com/";
		String titleURL = driver.getTitle();
		
		
		
		if(currentURL.equalsIgnoreCase(excpectedURL)) 
		{
			System.out.println("Current URL matches Excpected URL");
			System.out.println("Current URL is -> " + currentURL);
			System.out.println("Expected URL is -> " + excpectedURL);
			System.out.println("Title of Website is -> " + titleURL);
		}
		else 
		{
			System.out.println("Current URL does not match Expected URL");
		}
		
		
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
	}

}
