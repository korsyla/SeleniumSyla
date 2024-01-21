package com.neotech.tests;

import com.neotech.pagesfactory.DashboardPageModel;
import com.neotech.pagesfactory.LoginPageModel;
import com.neotech.utilities.CommonMethods;
import com.neotech.utilities.ConfigsReader;

public class LoginTestUsingPOM extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
//		https://hrm.neotechacademy.com/
		
		setUp();
		
		//1st we create an object(login) of our Public class LoginPageModel 
		//WebElements are created just by creating this object of our Constructor class LoginPage below 
		LoginPageModel login = new LoginPageModel();
		
		//Send username 
		sendText(login.username, ConfigsReader.getProperty("username"));
		
		//Send the password
		sendText(login.password, ConfigsReader.getProperty("password"));
		
		//Click the login Button
//		login.logInButn.click();
//		login.login(); -> this is our login method from our LoginPageModel that we created .. this does username/password and login 
		click(login.logInButn);
		
		
		wait(3);
		
		
		//Lets create an object of our Public Class DashboardpageModel
		//WebElements are created just by creating this object of our Constructor class DashboardpageModel below 
		DashboardPageModel dashboard = new DashboardPageModel();
		
		if(dashboard.hrmLogo.isDisplayed()) 
		{
			System.out.println("Test passed!!");
		}
		else 
		{
			System.out.println("Test Failed!!");
		}

		
		//Lets validate that the Dashobard name "Jacqueline White" is displayed
		String expectedname = "Jacqueline White";
		String actualname = dashboard.hrManagerName.getText();
		
		if(actualname.equals(expectedname)) 
		{
			System.out.println(expectedname + " is displayed!!");
		}
		else 
		{
			System.out.println(expectedname + " is NOT displayed!!");
		}
		
		
		wait(2);
		tearDown();

		
		
	}

}
