package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomeWork2 {

	public static void main(String[] args) throws InterruptedException {

		
//		HW2: Opening Page on Firefox Browser
//		Open Firefox browser
//		Navigate to “https://www.redfin.com/”
//		Verify that you have navigated to (https://www.redfin.com/)
//		End the Session (close the browser).
		//HomeWork2
		
		//Which browser am I using/locating!!!
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		
		//Here we open the browser!!!!
		WebDriver driver = new FirefoxDriver();
		
		//We launch the actual URL here!!!!
		driver.get("https://www.redfin.com/");
		
		String currentURL = driver.getCurrentUrl();
		String excpectedURL = "https://www.redfin.com/";
		
		if(currentURL.equalsIgnoreCase(excpectedURL)) 
		{
			System.out.println("Current URL -> " + currentURL + " = " +  excpectedURL + " <- excpected URL");
		}
		else 
		{
			System.out.println("The URL does not match Exectly!!!");
		}
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
	}

}
