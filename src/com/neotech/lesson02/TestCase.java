package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {

	public static void main(String[] args) throws InterruptedException {

		// Test Case
		// Open chrome browser
		// Go to “https://demo.guru99.com/test/newtours/”
		// Click on Register Link
		//
		// Fill out just
		// First Name:
		// Last Name:
		// Phone:
		// Email:
		// And Click Submit
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		Thread.sleep(2000); // This makes us wait a few seconds before going further
		
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Eden");
		driver.findElement(By.name("lastName")).sendKeys("Hazard");
		driver.findElement(By.name("phone")).sendKeys("111-222-33333");
		driver.findElement(By.id("userName")).sendKeys("EdenHazard");
		
		Thread.sleep(5000);
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
	
		
		
	}

}
