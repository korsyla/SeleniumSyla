package com.neotech.lesson04HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
	
	public final static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	public final static String username = "Tester";
	public final static String password = "test";	
	
	public static void main(String[] args) throws InterruptedException {

//		Open chrome browser
//		Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
//		Enter valid username
//		Clear username and enter again valid username
//		Leave password field empty
//		Click on login button
//		Verify error message with text "Invalid Login or Password." is displayed.
		
		//HomeWork#1
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
		userName.sendKeys(username);
		Thread.sleep(2000);
		userName.clear(); 
		userName.sendKeys(username);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']")).click();
		Thread.sleep(2000);
		
		WebElement errorMessage = driver.findElement(By.xpath("//span[text()='Invalid Login or Password.']"));
		System.out.println("Is Error Message Displayed?? -> " + errorMessage.isDisplayed());
		System.out.println("Text of Error Message is -> " + errorMessage.getText());
		
		Thread.sleep(2000);
	
		//driver.quit();
		
		
		
		
		
		
		
		
	}

}
