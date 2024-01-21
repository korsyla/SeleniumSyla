package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {

	public static void main(String[] args) throws InterruptedException {

		
//		HW2: Facebook sign up:
//			Open chrome browser
//			Go to "https://www.facebook.com/"
//			Click on Sign Up link
//			Enter first name
//			Enter last name
//			Enter email address
//			Re-enter email address
//			Click on Sign Up button
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Sign Up")).click();
		driver.findElement(By.name("firstname")).sendKeys("Trent");
		driver.findElement(By.name("lastname")).sendKeys("Alexander-Arnold");
		driver.findElement(By.name("reg_email__")).sendKeys("TrentAA@neotech.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("TrentAA@neotech.com");
		driver.findElement(By.id("password_step_input")).sendKeys("AAlexanderTrent@123!");
		driver.findElement(By.id("month")).sendKeys("Jul");
		driver.findElement(By.id("day")).sendKeys("1");
		driver.findElement(By.name("birthday_year")).sendKeys("1998");
		driver.findElement(By.name("sex")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("websubmit")).click();
		
		driver.quit();		
		
		
		
		
	}

}
