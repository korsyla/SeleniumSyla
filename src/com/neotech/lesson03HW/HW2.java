package com.neotech.lesson03HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
	
	public final static String url = "http://demo.guru99.com/test/newtours/";

	public static void main(String[] args) throws InterruptedException {

//		Homework 2:
//		    Using CSS ONLY
//		    TC 2: Mercury Tours Registration: 
//		        Open chrome browser
//		        Go to “http://demo.guru99.com/test/newtours/”
//		        Click on Register Link
//		        Fill out all required info
//		        Click Submit
//		        User successfully registered
		
//	    Using CSS ONLY!!!
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement registerButton = driver.findElement(By.cssSelector("a[href='register.php']"));
		registerButton.click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("Dominik");
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("Szoboszlai");
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("111-888-8888");
		driver.findElement(By.cssSelector("input#userName")).sendKeys("DominikSzoboslai@liverpool.com");
		driver.findElement(By.cssSelector("input[name='address1']")).sendKeys("Anfield");
		driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Liverpool");
		driver.findElement(By.cssSelector("input[name='state']")).sendKeys("England");
		driver.findElement(By.cssSelector("input[name='postalCode']")).sendKeys("08080");
		driver.findElement(By.cssSelector("select[name='country']")).sendKeys("UNITED KINGDOM");
		driver.findElement(By.cssSelector("#email")).sendKeys("SzoboszlaiDominik");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Szoboszlai123");
		driver.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys("Szoboszlai123");
		Thread.sleep(3000);
		
		//driver.findElement(By.cssSelector("input[src='images/submit.gif']")).click();
		
		Thread.sleep(3000);
		
		//driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}

}
