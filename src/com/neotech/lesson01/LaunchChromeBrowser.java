package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {

		//We have added everything we need on the communication path
			// Meaning we added Selenium language binding (Selenium Java librarys)
			//We added chromedriver
		//All we have to do now, is to use Seleniium classes to call
			//The ChromeDriver and open / close the Chrome Browser
		
		//If java cannot find our chromedriver location 
		//This is for safety*
		//This is where my driver is located
		//Java class
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		//Open the Browser
		//Webdriver and ChromeDriver come from those JARS we downloaded
		//Selenium Class
		WebDriver driver = new ChromeDriver();  //This is Upcasting 
		
		
		driver.get("https://www.neotechacademy.com/");
		
		//pause the execution for 5000 milliseconds = 5 seconds
		Thread.sleep(5000);
		
		//Close the browser
		driver.quit();
		
	}

}
