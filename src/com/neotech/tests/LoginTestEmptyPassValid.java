package com.neotech.tests;

import com.neotech.pagesfactory.LoginPageUsingFactory;
import com.neotech.utilities.CommonMethods;
import com.neotech.utilities.ConfigsReader;

public class LoginTestEmptyPassValid extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

//		TC 1: Orange HRM blank password validation
//		1. Go to https://hrm.neotechacademy.com/
//		2. Enter valid username and leave password field empty
//		3. Click on login button
//		4. Verify error message with text "Password cannot be empty" is displayed
		
		setUp();
		
		//This line has to be called after our driver is created
		LoginPageUsingFactory loginPage = new LoginPageUsingFactory();
		
		sendText(loginPage.username, ConfigsReader.getProperty("username")); wait(2);
		
		click(loginPage.loginButn); wait(2);
		
		String expectedText = "Password cannot be empty";
		String actualText = loginPage.passEmptyError.getText();
		
		if(expectedText.equals(actualText)) 
		{
			System.out.println("Password cannot be empty, is diapleyd? -> " + loginPage.passEmptyError.isDisplayed());
		}
		else 
		{
			System.out.println("Password cannot be empty, is diapleyd? -> " + loginPage.passEmptyError.isDisplayed());
		}
		
		
		
		
		
		
		
		wait(2);
		tearDown();
		
		
		
	}

}
