package com.neotech.lesson05HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.BaseClass;
import com.neotech.utilities.ConfigsReader;

public class HW1WithSabah extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

//		HW1: Orange HRM Application Login:
//		Open Chrome browser
//		Go to https://hrm.neotechacademy.com/
//		Enter valid username and password
//		Click on login button
//		Then verify that "span with id account-name" has the text "Jacqueline White".
//		Quit the browser
		
		
		//set up the browser
				setUp();
				//Declaring driver location
				//Initializing ConfigsReader
				//Initialize the driver
				//Go to URL

				//Where are my credentials??? config.properties
				String username = ConfigsReader.getProperty("username");
				String password = ConfigsReader.getProperty("password");
				
				System.out.println("user name is: " + username + " " + "Password is: " + password);
				
				WebElement usernameBox = driver.findElement(By.id("txtUsername"));
				WebElement passwordBox = driver.findElement(By.id("txtPassword"));
				WebElement loginBtn = driver.findElement(By.cssSelector("button[type='submit']"));
				
				//send credentials to the boxes
				usernameBox.sendKeys(username);
				passwordBox.sendKeys(password);
				loginBtn.click();
				
				Thread.sleep(3000);
				
				String expected = "Jacqueline White";
				String actual = driver.findElement(By.id("account-name")).getText();
				
				
				if(expected.equals(actual))
				{
					System.out.println("Test passed!");
				}
				else
				{
					System.out.println("Test failed!");
				}
				
				Thread.sleep(3000);
				
				//close the browser
				tearDown();

		
	}

}
