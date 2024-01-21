package com.neotech.lesson15HW;

import com.neotech.pagesfactory.HRMLoginPageFactory;
import com.neotech.pagesfactory.LoginPageUsingFactory;
import com.neotech.utilities.CommonMethods;
import com.neotech.utilities.ConfigsReader;

public class HRMLoginPageTest extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		setUp();

		HRMLoginPageFactory login = new HRMLoginPageFactory();
		
		sendText(login.usernameBox, ConfigsReader.getProperty("username")); wait(1);
		sendText(login.passwordBox, ConfigsReader.getProperty("password")); wait(1);
		jsClick(login.loginBtn); wait(2);
		
		
		
		tearDown();

		
	}

}
