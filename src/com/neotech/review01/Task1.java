package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.selenium.dev/");
		driver.navigate().to("https://www.google.com/");
//		driver.navigate().back();
//		driver.navigate().forward();
		
		for(int i = 0; i<=10; i++) 
		{
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().forward();
			Thread.sleep(2000);
		}
		
		driver.quit();
		
		
	}

}
