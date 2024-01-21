package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCSSSelector {
	
	public final static String url = "http://neotechacademy-sis.com:9000/Test/";

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		//using xpath -> //input[@id='tUsername'] or //tag[@id= '.......']
		//using CSS -> input#tUsername  or tag#id
		
		//username
		driver.findElement(By.cssSelector("input#tUsername")).sendKeys("Admin");
		
		//password
		driver.findElement(By.cssSelector("#tPassword")).sendKeys("Neotech$123");
		
		
		//login button
		//css --> Formula 1 : tag#id
		//css --> Formula 2 : tag.class -> input.buttonBig
		driver.findElement(By.cssSelector("input.buttonBig")).click();
		
		Thread.sleep(3000);
		
		//click on the Students link
	
		// a[href$='a[href$='Personal.aspx']' -> tag[attribute = 'value'
		// //a[@href = '.....']
		driver.findElement(By.cssSelector("a[href$='Personal.aspx']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}

}
