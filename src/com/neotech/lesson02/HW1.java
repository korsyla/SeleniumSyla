package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {

	public static void main(String[] args) throws InterruptedException {

//		
//		HW1:
//			Open chrome browser
//			Go to "https://demo.guru99.com/test/newtours/"
//			Click on Register Link
//			Fill out ALL required info
//			Click Submit
//			User successfully registered
//			(Create the script using different locators)
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Cody");
		driver.findElement(By.name("lastName")).sendKeys("Gakpo");
		driver.findElement(By.name("phone")).sendKeys("111-222-3333");
		driver.findElement(By.id("userName")).sendKeys("CGakpo@neotech.com");
		driver.findElement(By.name("address1")).sendKeys("Anfield Stadium");
		driver.findElement(By.name("city")).sendKeys("Liverpool");
		driver.findElement(By.name("state")).sendKeys("England");
		driver.findElement(By.name("postalCode")).sendKeys("01234");
		driver.findElement(By.name("country")).sendKeys("UNITED KINGDOM");
		driver.findElement(By.id("email")).sendKeys("CodyGakpo");
		driver.findElement(By.name("password")).sendKeys("Gakpo123");
		driver.findElement(By.name("confirmPassword")).sendKeys("Gakpo123");
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
	}

}
