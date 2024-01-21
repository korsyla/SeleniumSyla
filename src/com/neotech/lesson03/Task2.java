package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	
	public final static String url = "https://www.facebook.com/";

	public static void main(String[] args) throws InterruptedException {
		
		//task using only CSS SELECTOR

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("johnUserName");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("smithPassWord");
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
	}

}
