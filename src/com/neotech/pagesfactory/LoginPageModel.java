package com.neotech.pagesfactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.CommonMethods;
import com.neotech.utilities.ConfigsReader;

public class LoginPageModel extends CommonMethods {
	
	//This is our Public Class Model with Public WebElements
	//We can call these in another Testing class when we create an object of the LoginPage Constructor Class

	public WebElement username = driver.findElement(By.id("txtUsername"));

	public WebElement password = driver.findElement(By.id("txtPassword"));
	
	public WebElement logInButn = driver.findElement(By.xpath("//button[@type='submit']"));
	
	//Logging in just by calling this method
	//However we still need to create an boject of our class LoginPageModel at test page first 
	// login
	public void login() 
	{
		sendText(username, ConfigsReader.getProperty("username"));
		sendText(password, ConfigsReader.getProperty("password"));
		click(logInButn);
	}
		
}
