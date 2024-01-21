package com.neotech.review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.BaseClass;

public class HandlingFrames extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		// https://the-internet.herokuapp.com/iframe
		
		setUp();
		Thread.sleep(3000);
		
		//1st way switching by index 
//		driver.switchTo().frame(0);
		
		//2nd way switching by ID or NAME
//		driver.switchTo().frame("mce_0_ifr");
		
		//3rd way, switching by WebElement
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
		driver.switchTo().frame(frameElement);
		
		WebElement bodyText = driver.findElement(By.xpath("//body[@id='tinymce']"));
		bodyText.clear();
		Thread.sleep(3000);
		bodyText.sendKeys("Madrid won 2-1");
		
		//When we're inside a frame, to Find an element outside the FRAME, -----
		//We need to switch the FOCUS outside the frame and back to the MAIN page in order to ACCESS elements on main page
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Elemental Selenium")).click();
		
		
		
		
		Thread.sleep(3000);
		tearDown();
		
		
		
	}

}
