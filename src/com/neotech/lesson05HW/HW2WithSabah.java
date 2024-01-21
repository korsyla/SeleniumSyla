package com.neotech.lesson05HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.BaseClass;
import com.neotech.utilities.ConfigsReader;

public class HW2WithSabah extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * Orange HRM Application Negative Login:
		 * Open Chrome browser 
		 * Go to https://hrm.neotechacademy.com/ 
		 * Enter valid username 
		 * Leave password field empty 
		 * Verify error message with text "Password cannot be empty" 
		 * is displayed.
		 */
		
		
		setUp();
		
		String username = ConfigsReader.getProperty("username");
		String password = ""; //do we have to send anything
		
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		Thread.sleep(3000);
		
		WebElement errorMsg = driver.findElement(By.id("txtPassword-error"));
		
		if (errorMsg.isDisplayed())
		{
			System.out.println("Test passed!");
		}
		else
		{
			System.out.println("Test failed!");
		}
		
		
		Thread.sleep(2000);
		
		tearDown();
		
	}
		
		
	}


