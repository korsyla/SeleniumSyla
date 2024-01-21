package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	
	public final static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	public final static String username = "Tester";
	public final static String password = "test";

	public static void main(String[] args) throws InterruptedException {

		
//		Open chrome browser
//		Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
//		Enter valid username and password
//		Click on login button
//		Then verify "Web Orders" is displayed and also username is displayed right top corner
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		//Store in Variable and than after send the password via VARIABLE
		WebElement userName = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
		userName.sendKeys(username);
		
		WebElement passWord = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
		passWord.sendKeys(password);
		
		//METHOD-CHAINING
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']")).click();
		Thread.sleep(2000);
		
		//Verify if WebOrders and USERNAME isDisplayed() right top of corner
		Boolean textDiplayed = driver.findElement(By.xpath("//h1[text()='Web Orders']")).isDisplayed();
		System.out.println("Is the test diplayed ->?? " + textDiplayed);
		Thread.sleep(2000);
		
		Boolean userNameDiplayed = driver.findElement(By.xpath("//div[contains(text(), 'Welc')]")).isDisplayed();
		System.out.println("Is the userName Diplayed ->??? " + userNameDiplayed);
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}

}
