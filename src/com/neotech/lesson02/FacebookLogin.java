package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		
		

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//Type your email in the username box
		driver.findElement(By.id("email")).sendKeys("neo@gmail.com");
		
		//Type your password in the password box
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("34kadland");
		Thread.sleep(3000);
		
		//Click Login button
		//For Login button ID changes every refresh so use Name or something
		//driver.findElement(By.id("u_0_5_6G")).click();
		
		//Click forgotten password
		driver.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(3000);
		
		driver.quit();

	}

}
