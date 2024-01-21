package com.neotech.review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.BaseClass;
import com.neotech.utilities.ConfigsReader;



public class LoginSIS extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		// Task until 2:10

		// Login to SIS Web Application
		// http://neotechacademy-sis.com:9000/Test/
		// username -> Admin
		// password -> Neotech$123
		
		setUp();
		
		
		Thread.sleep(2000);
		//Getting username / by not hardcoding, which is better 
		WebElement username = driver.findElement(By.id("tUsername"));
		username.sendKeys(ConfigsReader.getProperty("username"));
		
		//Getting password
		driver.findElement(By.name("tPassword")).sendKeys(ConfigsReader.getProperty("password"));
		
		driver.findElement(By.id("bLogin")).click();
		
		Thread.sleep(3000);
		
		
		tearDown();
		
		
	}

}
