package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {

	public static void main(String[] args) throws InterruptedException {

//		HW1: Amazon Page Title Verification: 
//			Open chrome browser
//			Go to “https://www.amazon.com/”
//			Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
//			End the Session (close the browser).
		
		
		//This is for Which Browser do I want to use
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		//We are opening the browser here
		WebDriver driver = new ChromeDriver();
		
		//We are launching the actual URL here 
		driver.get("https://www.amazon.com/");
		
		//Assigning the current title that we currently have and using
		String actualTitle = driver.getTitle();
		String excpectedURL = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		
		if(actualTitle.equalsIgnoreCase(excpectedURL)) 
		{
			System.out.println(driver.getTitle());
		}
		else 
		{
			System.out.println("Actual URL Title is -> " + actualTitle);
			System.out.println("Excpected URL -> " + excpectedURL);
			System.out.println("The actual URL does not match the Excpected URL ");
		}
	
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
		
		
		
		
	
		
		
		

		
	}

}
