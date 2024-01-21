package com.neotech.lesson12;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.neotech.utilities.CommonMethods;
import com.neotech.utilities.ConfigsReader;

public class Task1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

//		https://hrm.neotechacademy.com/
		
		setUp();

		//login, sendtext to username and leave password empty
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		
		click(driver.findElement(By.xpath("//button[text()='Login']")));
		wait(2);
		
		
		
		//get the camera //downcasting our driver
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//Take the screenshot/picture
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		
		//Now, Save the screenshot in my folder
		try 
		{
			Files.copy(sourceFile, new File("screenshots/HRM/screenshot02.png"));
		} 
		catch (IOException e) 
		{
			System.out.println("Could not save the screenshot!!!");
			e.printStackTrace();
		}
		
		
		
		tearDown();
		
		
	}

}
