package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1WSabah {
	
	public final static String url = "https://demo.guru99.com/test/newtours/";

	public static void main(String[] args) throws InterruptedException {

		
//		HW1:
//		Open chrome browser
//		Go to "https://demo.guru99.com/test/newtours/"
//		Click on Register Link
//		Fill out ALL required info
//		Click Submit
//		User successfully registered
//		(Create the script using different locators)
		
		//Decide which browser we using and driver location
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(url); // we can access this cus its STATIC above within class
		driver.manage().window().maximize();
		//We find elemnts with driver.findElement(BY.LinkText) 
		
		//OR USING PARTIALLINKTEXT
		// Click on Register
		driver.findElement(By.partialLinkText("REGIS")).click();
		
		//OR ANOTHER STEP -> it RETURNS WEBELEMENT NOT A STRING
		WebElement register = driver.findElement(By.linkText("REGISTER"));
		register.click();
		
		//FILL Out the FORM -? firstname last etcc
		driver.findElement(By.name("firstName")).sendKeys("John");
		driver.findElement(By.name("lastName")).sendKeys("Smith");
		driver.findElement(By.name("phone")).sendKeys("111-111-3333");
		driver.findElement(By.id("userName")).sendKeys("js@gmail.com");
		
		
		//address info
		driver.findElement(By.name("address1")).sendKeys("123 Prospect St");
		driver.findElement(By.name("city")).sendKeys("NYC");
		driver.findElement(By.name("state")).sendKeys("NY");
		driver.findElement(By.name("postalCode")).sendKeys("0007");
		
		//Dealing with DROP DOWN -> skipped for now
		
		//USER INFO
		driver.findElement(By.id("email")).sendKeys("John123");
		driver.findElement(By.name("password")).sendKeys("john123");
		driver.findElement(By.name("confirmPassword")).sendKeys("john123");
		
		
		
		// Those are only just to slow down the execution to see the info being filled out
		Thread.sleep(3000);
		
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(3000);
		
		String expectedURL = "https://demo.guru99.com/test/newtours/";
		String actualURL = driver.getCurrentUrl();
		
		if(expectedURL.equalsIgnoreCase(actualURL)) 
		{
			System.out.println("Test passed");
		}
		else 
		{
			System.out.println("Test Failed");
		}
		
		
		
		driver.quit();
		
		
	}

}
