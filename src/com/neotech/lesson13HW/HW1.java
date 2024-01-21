package com.neotech.lesson13HW;

import org.openqa.selenium.By;

import com.neotech.utilities.CommonMethods;

public class HW1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
//		Homework 1: File Upload
//		Upload a file:
//		http://webdriveruniversity.com/File-Upload/index.html
		
		setUp();
		
		String filePath = System.getProperty("user.dir") + "/screenshots/Lesson13/FileUpload.png";
		
		sendText(driver.findElement(By.id("myFile")), filePath); wait(1);
		click(driver.findElement(By.id("submit-button"))); wait(1);
		
		System.out.println("The text of ALERT is -> " + getAlertText());
		acceptAlert(); wait(3);
		
		
		tearDown();
		
		
		
		
		
	}

}
