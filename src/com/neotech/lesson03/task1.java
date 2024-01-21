package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
	
	public final static String url = "https://www.facebook.com/";

	public static void main(String[] args) throws InterruptedException {
		
		//FACEBOOK TASK XPATH ONLY!!!!

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		//ENTER USERNAME
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("johnusername");
		
		//ENTER PASSWORD
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("smithpassword");
		
		Thread.sleep(3000);
		
		//Click on Log In button
		//1. //button[@name='login']
		//2. //button[@type='submit']
		//3. //button[@id='u_0_5_p7'] ->> This is Generated, it will be different when page refresh
		//4. //button[contains(@id, 'u_0')]
		
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.findElement(By.xpath("//button[contains(@id, 'u_0')]")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
	}

}
