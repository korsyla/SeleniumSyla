package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2WSabah {

	public final static String url = "https://www.facebook.com/";
	
	public static void main(String[] args) throws InterruptedException {

//		HW2: Facebook sign up:
//		Open chrome browser
//		Go to "https://www.facebook.com/"
//		Click on Sign Up link
//		Enter first name
//		Enter last name
//		Enter email address
//		Re-enter email address
//		Click on Sign Up button
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		//The code is way faster than the Internet/page
		// So it could happen that it does not find a certain element 
		//For now we will use Thread.sleep();
		Thread.sleep(2000); // Just in case it doesn't execute enough 
		
		driver.findElement(By.name("firstName")).sendKeys("John");
		driver.findElement(By.name("lastName")).sendKeys("Wick");
		driver.findElement(By.name("reg_email_")).sendKeys("jw@email.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("password_step_input")).sendKeys("johnwick123");
		
		
		
		Thread.sleep(3000);

	}

}
