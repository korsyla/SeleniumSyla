package com.neotech.lesson15HW;

import com.neotech.pagesfactory.HRMLoginPageFactory2;
import com.neotech.utilities.CommonMethods;
import com.neotech.utilities.ConfigsReader;

public class HRMLoginPageTest2 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

//		Homework 2: OrangeHRM Login
//	    Navigate to https://hrm.neotechacademy.com/
//	    Login to the application by writing xpath based on "following and preceding siblings"
		
		setUp();
		
		HRMLoginPageFactory2 login = new HRMLoginPageFactory2();
		
		sendText(login.usernameBox, ConfigsReader.getProperty("username")); wait(1);
		sendText(login.passwordBox, ConfigsReader.getProperty("password")); wait(1);
		jsClick(login.loginButton); wait(2);
		
		
		
		tearDown();

		
		
	}

}
