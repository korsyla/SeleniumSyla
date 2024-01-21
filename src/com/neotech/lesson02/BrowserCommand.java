package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommand {

	public static void main(String[] args) throws InterruptedException {

		
//			1. Open chrome browser
//			2. Navigate to “https://www.zillow.com/”
//			3. Navigate to “https://www.google.com/”
//			4. Navigate back to Zillow Page
//			5. Refresh current page
//			6. Verify url contains “Zillow”
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//1st Way -> doesn't keep History 
		//Waits for page to be fully loaded
		//driver.get("https://www.zillow.com/");
		
		//2nd way -> keeps history
		driver.navigate().to("https://www.zillow.com/");
		
		Thread.sleep(1000);
		
		//Makes it full Screen
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();; -> samething as maximize
		
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		//
		
		driver.navigate().to("Thread.sleep(1000);");
		Thread.sleep(1000);
		
		//Brings us back to previous pagesite Zillow
		driver.navigate().back();
		Thread.sleep(1000);
		
		//Brings us Forward to Google pagesite
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
