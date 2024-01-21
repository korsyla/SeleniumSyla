package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1WithShane {

	public static void main(String[] args) throws InterruptedException {

//		HW1: Amazon Page Title Verification: 
//		Open chrome browser
//		Go to “https://www.amazon.com/”
//		Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
//		End the Session (close the browser).
	
		//Locate The Chrome Driver
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		//Creating new Object ChromeDriver / Up-Casting / opening browser as well
		WebDriver driver = new ChromeDriver();
		
		//It will open the browser URL website
		driver.get("https://www.amazon.com/");
		
		
		String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equalsIgnoreCase(actualTitle)) 
		{
			System.out.println("Test passed");
		}
		else 
		{
			System.out.println("Test Failed");
		}
		
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
	}

}
