package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchCSS {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.amazon.com/";
		
		driver.get(url);
		Thread.sleep(2000);
		
		// # means -> id
		// twotabsearchtextbox -> any element
		
		WebElement search = driver.findElement(By.cssSelector(""));
		
		
		 
		 
		
		
	}

}
