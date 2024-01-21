package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxDriverRe {

	public static void main(String[] args) {

		
		//Which browser do I want to use
		//Here we are specifying which driver we gona use where is it located
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		
		//This is where we OPENNN the BROWSER / while creating a new object
		WebDriver driver = new FirefoxDriver();
		
		//.get() launches the browser URL that we Specified to open
		driver.get("https://www.amazon.com/");
		
		
		String actualURL = driver.getCurrentUrl();
		String excpectedURL = "https://www.amazon.com/";
		
		if(actualURL.equalsIgnoreCase(excpectedURL)) 
		{
			System.out.println("Title is: " + driver.getTitle());
		}
		else 
		{
			System.out.println("URL is Wrong!!");
		}
		
		
		
		
	}

}
