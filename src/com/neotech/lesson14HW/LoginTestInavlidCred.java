package com.neotech.lesson14HW;

import com.neotech.pagesfactory.LoginPageUsingFactory;
import com.neotech.utilities.CommonMethods;
import com.neotech.utilities.ConfigsReader;

public class LoginTestInavlidCred extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

//		TC 2: Orange HRM wrong password validation
//		1. Go to https://hrm.neotechacademy.com/
//		2. Enter valid username and wrong password
//		3. Click on login button
//		4. Verify error message with text "Invalid credentials" is displayed
		
		setUp();
		LoginPageUsingFactory loginPage = new LoginPageUsingFactory();
		
		sendText(loginPage.username, ConfigsReader.getProperty("username")); wait(2);
		
		sendText(loginPage.password, "wrongPassword"); wait(2);
		
		click(loginPage.loginButn); wait(2);
		
		
		String expectedCredentials = "Invalid Credentials";
		String actualCredentials = loginPage.invalidCredentials.getText();
		
		
		if(expectedCredentials.contains(actualCredentials)) 
		{
			System.out.println("Invalid credentials is deisplayed -> " + loginPage.invalidCredentials.isDisplayed());
		}
		else 
		{
			System.out.println("Invalid credentials is deisplayed -> " + loginPage.invalidCredentials.isDisplayed());
		}
		
		
		wait(2);
		tearDown();
		
		
	}

}
