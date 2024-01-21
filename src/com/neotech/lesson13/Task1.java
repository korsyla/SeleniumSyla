package com.neotech.lesson13;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.neotech.utilities.CommonMethods;

public class Task1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		// https://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload
		
		setUp();
		
		//Our file path we want to Upload or send to our Chose File element
		String filePath = System.getProperty("user.dir") + "/screenshots/Lesson13/screenshotHW201.png";
		
		//We locating our WebElement Choose File, and sending the filePath that we want to our WebElelent Choose File
		sendText(driver.findElement(By.id("gwt-debug-cwFileUpload")), filePath); wait(2);
		
		click(driver.findElement(By.xpath("//button[@class='gwt-Button']")));; wait(2);
		
		//Once we clicked, Alert showed up
		System.out.println("Aler text is -> " + getAlertText());
		acceptAlert(); wait(2);
		
		
		//Take a screenshot once we accept the ALERT
		TakesScreenshot ts = (TakesScreenshot) driver;
		File picture = ts.getScreenshotAs(OutputType.FILE);
		
		try 
		{
			Files.copy(picture, new File("screenshots/Lesson13/FileUpload.png"));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		
		
		
		
		tearDown();
		
		
	}

}
