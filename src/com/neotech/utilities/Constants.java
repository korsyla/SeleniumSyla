package com.neotech.utilities;

public class Constants {
	
	//****************   1st STEP  **********************
	
	//These are our CONSTANS PATHS to OUR CONFIGS and DRIVERS FILES in our PROJECT that will NOT Change
	//These are JUST ONLYYY location of our chromedriver.exe / geckodriver.exe / configuration.properties
	
	//With this, we locating the filepath/location of  configuration.properties that has key=value pairs
	public static final String CONFIGURATION_FILEPETH = System.getProperty("user.dir") + "/configs/configuration.properties";
	
	//Here, we are locating the chromedriver.exe
	//("user.dir") - is location of our project + "/drivers/chromedriver.exe";
	public static final String CHROME_DRIVER_PATH = System.getProperty("user.dir") + "/drivers/chromedriver.exe";
	
	//Here, we are locating the geckodriver.exe -> 
	//("user.dir") - is location of our project + "/drivers/geckodriver.exe
	public static final String GECKO_DRIVER_PATH = System.getProperty("user.dir") + "/drivers/geckodriver.exe";
	
	public static final int EXCPLICIT_WAIT_TIME = 25;
	
	public static final int IMPLICIT_WAIT_TIME = 15;
	
	
	//user.dir -> gives us the location of our Project + configs + configuration.properties
	//String filePath = System.getProperty("user.dir") + "/configs/configuration.properties";
	//System.out.println(filePath);
	
}
