package com.neotech.lesson05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.neotech.utilities.ConfigsReader;
import com.neotech.utilities.Constants;

public class OrangeHRM2 {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		//This is a combination of ConfigsReader class and Constants class in .Utilities package which are public
		//LETS Read Configuration File
		//This -> ConfigsReader.readProperties() is asking for the location of the file (Constants.CONFIGURATION_FILEPETH)
		//This ONE liner below will read all the key-values info in the configuration.propertiess file 
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPETH);
		
		//ConfigsReader.getProperty -> We give the KEY and it returns us the value from configuration.propertiess file
		//We gave browser(key) and it returns chrome(value)
		String browser = ConfigsReader.getProperty("browser");
		//System.out.println("The browser is: " + browser);
		
		//Here, ONE for the browsers will open based on if its chrome or firefox
		switch (browser.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
			driver = new ChromeDriver();
			break;

		case "firefox":
			System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER_PATH);
			driver = new FirefoxDriver();
			break;

		default:
			break;
		}
		
		
		//Here we go to the website/url -> https://hrm.neotechacademy.com/
		String website = ConfigsReader.getProperty("url");
		driver.get(website);
		
		//This is where the testing starts
		String title = driver.getTitle();
		System.out.println("Title is -> " + title);
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		//JUST Printing out the paths/location of files
//		System.out.println(Constants.CONFIGURATION_FILEPETH);
//		System.out.println(Constants.CHROME_DRIVER_PATH);
//		System.out.println(Constants.GECKO_DRIVER_PATH);
		
	}

}
