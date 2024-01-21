package com.neotech.lesson05;

import com.neotech.utilities.BaseClass;
import com.neotech.utilities.ConfigsReader;

public class OrangeHRM3 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		// ALL the steps are done from this METHOD located in BaseClass
		/**
		 * Reading the configuration.propertiess file /  
		 * Selecting the type of "browser" based on KEY-VALUE from configuration.propertiess file  / 
		 * Opening one of the browsers based on KEY-VALUE from configuration.propertiess file /
		 * Navigating to the given URL Website from configuration.propertiess file 
		 */
		setUp();
		
		
		//We write our TEST code here 
		String title = driver.getTitle();
		System.out.println("Title is -> " + title);
		String userName = ConfigsReader.getProperty("username");
		System.out.println("User name is " + userName);
		Thread.sleep(3000);
		
		
		
		//Here we quit() the browser / after we done with our TESTING
		tearDown();
		
		
	}

}
