package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.instagram.com/";
		//driver.get(url);
		//.get() method does not keep history to be able to go back and forward
		
		//.navigate() mathod will KEEP History and be able to go back and forward 
		//Will not wait for page to be loaded 
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
		driver.manage().window().minimize();
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		//New Web Page
		driver.navigate().to("https://www.mlssoccer.com/");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.fifa.com/fifaplus/en");
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.quit();
		
		
		

	}

}
