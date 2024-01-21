package com.neotech.lesson05;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRM1 {
	
	

	public static void main(String[] args) throws IOException, InterruptedException {

		//user.dir -> gives us the location of our Project + configs + configuration.properties
		String filePath = System.getProperty("user.dir") + "/configs/configuration.properties";
		//System.out.println(filePath);
		
		//FileInputStream To read the file 
		FileInputStream fis = new FileInputStream(filePath);
		//Create properties objects
		Properties prop = new Properties();
		prop.load(fis);
		//prop.load(fis); -> we making sure we reached the info in configuration.properties by using prop
		System.out.println(prop);
		
		
		//NOW WE STARTING WITH SELENIUM CLASSES AND METHODS
		//Null means we don't know what the browser is going to be so its more dynamic
		WebDriver driver = null;
		
		if(prop.getProperty("browser").equals("chrome")) 
		{
			//Open chromer browser
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			 driver = new ChromeDriver();
			
		}
		else if (prop.getProperty("browser").equals("firefox")) 
		{
			//open fireFox Driver
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		//Lets get the website 
		String website = prop.getProperty("url");
		driver.get(website);
		
		String title = driver.getTitle();
		System.out.println("Title is-> " + title);
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
//		if(browser.toLowerCase() == "chrome") {
//			System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
//			driver = new ChromeDriver();
//		} else if (browser.toLowerCase() == "firefox") {
//			System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER_PATH);
//			driver = new FirefoxDriver();
//		}
		
		
		
		
		
	}

}
