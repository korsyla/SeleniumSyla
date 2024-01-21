package com.neotech.lesson05HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.BaseClass;
import com.neotech.utilities.ConfigsReader;

public class HW2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
//
//		TC 2: Orange HRM Application Negative Login: 
//			Open Chrome browser
//			Go to https://hrm.neotechacademy.com/
//			Enter valid username
//			Leave password field empty
//			Verify error message with text "Password cannot be empty" is displayed.
		
		//HW2
		// We call this setUp() METHOD before TESTING BEGINS!!!!!
		setUp();
		
		//We write our TEST code here 
		String userName = ConfigsReader.getProperty("username"); //We give KEY and returns VALUE
		String passWord = ConfigsReader.getProperty("password"); //We give KEY and returns VALUE
		WebElement username =  driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.sendKeys(userName);
		WebElement logInButton = driver.findElement(By.xpath("//button[@type='submit']"));
		logInButton.click();
		Thread.sleep(2000);
		
		WebElement errorMessage = driver.findElement(By.xpath("//span[text()='Password cannot be empty']"));
		
		if(errorMessage.getText().equals("Password cannot be empty")) 
		{
			System.out.println("Test of the Error Message is: -> " + errorMessage.getText());
			System.out.println("Is error Message Displayed?: -> " + errorMessage.isDisplayed());
		}
		else 
		{
			System.out.println("Test failed");
		}
		
		Thread.sleep(2000);
		
		
		//We call this METHOD after we're DONE with TESTING !!!!!!!!!!!!
		tearDown();
		
		
		
	}

}
