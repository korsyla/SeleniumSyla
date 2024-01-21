package com.neotech.lesson12;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputFilter.Config;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.neotech.utilities.CommonMethods;
import com.neotech.utilities.ConfigsReader;

public class ScreenShotDemo extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

//		url = https://hrm.neotechacademy.com/
		
		setUp();
		
		//Send username and password and LOGIN
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));
		
		click(driver.findElement(By.xpath("//button[text()='Login']")));
		wait(2);
		
		
		//I want to take a screenshot 
		//Type of driver is WebDriver
		//In fact the instance is ChromeDriver (WebDriver driver = new ChromeDriver();)
		//From WebDriver down to the ChromeDriver itself
		
		
		//This is my camera
		//We are creating an object of this object of TakesScreenshot (We are downcasting)
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		
		//This is the screenshot, but it is not saved anywhere
		//sourceFile is the screenshot/picture we took
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		
		
		//Saving this file or where do i save the screenshot....
		//We have to create the fodler ourselves in our Project before running the test case and saving the file
		// The screenshot01.png can be named whatever name we want to name it
		//This can be done using many libraries
		try 
		{
			Files.copy(sourceFile, new File("screenshots/HRM/screenshot01.png"));
		} 
		catch (IOException e) 
		{
			System.out.println("Screenshot was NOT saved!!");
			e.printStackTrace();
		}
		
		
		
		
		tearDown();
		
		
		
	}

}
