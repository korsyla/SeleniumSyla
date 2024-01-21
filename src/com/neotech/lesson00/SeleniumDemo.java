package com.neotech.lesson00;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) throws InterruptedException {

		//set.property -> where is the location/path of chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		// This below will open the chromebrowser and it will get website neotech academy
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.neotechacademy.com/");
		  
		  String title = driver.getTitle();
		  System.out.println("title - " + title);
		  Thread.sleep(5000); // 5000 milliseconds = 5 seconds
		  driver.quit();
		
	}

}
