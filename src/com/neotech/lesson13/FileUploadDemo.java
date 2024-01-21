package com.neotech.lesson13;

import org.openqa.selenium.By;

import com.neotech.utilities.CommonMethods;

public class FileUploadDemo extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		// https://the-internet.herokuapp.com/
		
		setUp();
		
		click(driver.findElement(By.linkText("File Upload")));wait(1);
		
		//Lets locate the path of the screenshot or file we want to upload from our PC
		//System.getProperty("user.dir") -> Gets us the path up to our project, C:\Users\sylak\eclipse-workspace\SeleniumSyla
		///screenshots/Lesson13/screenshotHW201.png" -> this is our other part location of the file
		String filePath = System.getProperty("user.dir") + "/screenshots/Lesson13/screenshotHW201.png";
		
		//Lets send the location of my path(filePath) to WebElement element Chose File
		//We are locating the WebElement element Chose File, and sending the filePath that we want to WebElement Chose File
		sendText(driver.findElement(By.id("file-upload")), filePath);
		wait(3);
		
		//Click on upload button
		click(driver.findElement(By.id("file-submit"))); wait(3);
		
		
		
		tearDown();
		
		
	}

}
