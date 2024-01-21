package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFireFoxBrowser {

	
	
	public static void main(String[] args) throws InterruptedException {
		
	//	System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();

		//Which web Driver will we use -> chrome or firefox?
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
	//driver is just the object/ we can use any name for that 
	//This open the chromedriver
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.nytimes.com/games/wordle/index.html";
		driver.get(url);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		String currentURL = driver.getCurrentUrl();
		
		if(url.equalsIgnoreCase(currentURL)) 
		{
			System.out.println("URL's are the same");
		}
		else 
		{
			System.out.println("URL's are different");
		}
		
		System.out.println(url);
		System.out.println(currentURL);
		
		String title = driver.getTitle();
		System.out.println("Title is -> " + title);
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
	}

}
