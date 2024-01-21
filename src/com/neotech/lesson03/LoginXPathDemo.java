package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginXPathDemo {
	
	public final static String url = "http://neotechacademy-sis.com:9000/Test/";

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		//Relative XPath for username
		driver.findElement(By.xpath("//input[@id='tUsername']")).sendKeys("Admin");
		
		//Create an Xpath for the password
		driver.findElement(By.xpath("//input[@name='tPassword']")).sendKeys("Neotech$123");
		
		Thread.sleep(3000);
		
		//login XPath
		driver.findElement(By.xpath("//input[@id=\"bLogin\"]")).click();
		
		Thread.sleep(3000);
		
		//1st way
		//driver.findElement(By.linkText("Students")).click();
		
		//2nd way 
		driver.findElement(By.xpath("//a[contains(text(), 'Student')]")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
	}

}
