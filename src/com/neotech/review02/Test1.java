package com.neotech.review02;

import com.neotech.utilities.ConfigsReader;
import com.neotech.utilities.Constants;



public class Test1 {
	
	public static void main(String[] args) {
		
		//Lets read configuration.properties file
//		String path = System.getProperty("user.dir") + "/configs2/conf.properties";
//		System.out.println(path);
		
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPETH);
		
		String browser = ConfigsReader.getProperty("browser");
		System.out.println("browser is ->  " + browser);
		
		System.out.println("url is -> " +ConfigsReader.getProperty("url"));
		
		
		
		
		
		
	}

}
