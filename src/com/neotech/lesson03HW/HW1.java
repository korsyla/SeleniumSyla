package com.neotech.lesson03HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
	
	public final static String url = "http://demo.guru99.com/test/newtours/";

	public static void main(String[] args) throws InterruptedException {

//		Homework 1:
//		    Using xPath ONLY
//		    TC 2: Mercury Tours Registration: 
//		        Open chrome browser
//		        Go to “http://demo.guru99.com/test/newtours/”
//		        Click on Register Link
//		        Fill out all required info
//		        Click Submit
//		        User successfully registered
		
		//Using xPath ONLY
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(@href, 'ster.php')]")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Trent");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Alexander-Arnold");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("111-222-3333");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("TrentAA@liverpool.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Anfield");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Liverpool");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("England");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("11");
		driver.findElement(By.xpath("//select[@name='country']")).sendKeys("UNITED KINGDOM");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("TrentAA");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("AATrent@123");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("AATrent@123");
		
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//input[@name='submit']")).click();
		//driver.findElement(By.xpath("//input[contains(@src, 'mit.gif')]")).click();
		
		Thread.sleep(5000);
		
		//driver.quit();
		
		
		
		
		
		
		
		
	}

}
