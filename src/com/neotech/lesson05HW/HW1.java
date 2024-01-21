package com.neotech.lesson05HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.BaseClass;
import com.neotech.utilities.ConfigsReader;

public class HW1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

//		HW1: Orange HRM Application Login:
//			Open Chrome browser
//			Go to https://hrm.neotechacademy.com/
//			Enter valid username and password
//			Click on login button
//			Then verify that "span with id account-name" has the text "Jacqueline White".
//			Quit the browser
		
		//HW1
		// We call this setUp() METHOD before TESTING BEGINS!!!!!
		setUp();
		
		////We write our TEST code here 
		String username = ConfigsReader.getProperty("username"); //We give KEY and Returns VALUE
		String password = ConfigsReader.getProperty("password"); //We give KEY and Returns VALUE
		WebElement userName =  driver.findElement(By.xpath("//input[@id='txtUsername']"));
		userName.sendKeys(username);
		WebElement passWord = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		passWord.sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement accountName = driver.findElement(By.xpath("//span[@id='account-name']"));
		
		//We gave Attribute/KEY -> "id" and returns its value -> "account-name" and .equals("account-name") -> 
		// if they MATCH we go inside the IF() statement and -> so ..... THEY MATCH
		if(accountName.getAttribute("id").equals("account-name")) 
		{
			System.out.println("The text is: -> " + accountName.getText());
		}
		Thread.sleep(3000);
		
		//We call this METHOD after we're DONE with TESTING !!!!!!!!!!!!
		tearDown();
		
		
		
		
		
	}

}
