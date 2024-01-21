package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommand2 {

	public static void main(String[] args) throws InterruptedException {

		
//		1. Open chrome browser
//		2. Navigate to “https://www.zillow.com/”
//		3. Navigate to “https://www.google.com/”
//		4. Navigate back to Zillow Page
//		5. Refresh current page
//		6. Verify url contains “Zillow”
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.zillow.com/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}

}
