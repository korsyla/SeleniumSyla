package com.neotech.tests;

import com.neotech.pagesfactory.DashboardPageUsingFactory;
import com.neotech.pagesfactory.LoginPageUsingFactory;
import com.neotech.utilities.CommonMethods;
import com.neotech.utilities.ConfigsReader;

public class LoginTestUsingFactory extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
//		https://hrm.neotechacademy.com/
		
		setUp();
		
		//Lets create an OBJECT of our LoginPageUsingFactory class FIRST
		//At this point the elements are not located because we are using the Factory
		LoginPageUsingFactory login = new LoginPageUsingFactory();
		
		//Sending username 
		sendText(login.username, ConfigsReader.getProperty("username")); wait(1);
		
		//Sending password
		sendText(login.password, ConfigsReader.getProperty("password")); wait(1);
		
		//click on login button
		click(login.loginButn);
		
		
		
		//Validate the ornageHRMLogo
		
		//Lets create an OBJECT of our DashboardPageUsingFactory class FIRST
		
		DashboardPageUsingFactory dashboard = new DashboardPageUsingFactory();
		
		if(dashboard.hrmLogo.isDisplayed()) 
		{
			System.out.println("Test passed!");
		}
		else 
		{
			System.out.println("Test failed!!");
		}
		
		
		//Lets validate that the Dashobard name "Jacqueline White" is displayed
		String expectedName = "Jacqueline White";
		String actualName = dashboard.hrManagrName.getText();
		
		if(expectedName.equals(actualName)) 
		{
			System.out.println(expectedName + " is displayed!!");
		}
		else 
		{
			System.out.println(expectedName + " is NOT displayed!!");
		}
		
		wait(3);
		tearDown();

		
	}

}
