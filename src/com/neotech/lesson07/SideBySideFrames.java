package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.BaseClass;

public class SideBySideFrames extends BaseClass{

	public static void main(String[] args) throws InterruptedException {

//		TC 1: Frame verification
//		Open chrome browser
//		Go to https://demoqa.com/frames
//		Verify the headers in both frames
//		Quit the browser
		
		setUp();
		
		Thread.sleep(2000);
		//Switching to FRAME using ID or NAME / in this case ID is AVAILABLE
		driver.switchTo().frame("frame1");
		
		//HERE WE are inside the 1st FRAME / LETS GET THE TEXT 
		WebElement samplePage = driver.findElement(By.id("sampleHeading"));
		String samplePageText = samplePage.getText();
		System.out.println("Sample Page Frame Text is -> " + samplePageText);
		
		//Lets SWITCH to MAIN PAGE from Sample Page Frame before we SWITCH to ANOTHER NEW FRAME
		driver.switchTo().defaultContent();
		
		//Lets Switch to ANOTHER NEW SIDe BY SIDE FRAME / LETS GET THE TEXT
		driver.switchTo().frame("frame2");
		//Now, we can locate elements inside the new 2nd frame
		String frame2Text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("The txt for 2nd Frame is -> " + frame2Text);
		
		
		
		
		Thread.sleep(2000);
		tearDown();
		
		
	}

}
