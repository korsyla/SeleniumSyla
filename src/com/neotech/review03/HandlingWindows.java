package com.neotech.review03;

import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utilities.BaseClass;

public class HandlingWindows extends BaseClass{

	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		String window1ID = driver.getWindowHandle();
		System.out.println("The handle/Unique ID of url is -> " + window1ID);
		
		driver.findElement(By.id("google")).click();
		Thread.sleep(3000);
		
		System.out.println("----------------------------");
		
		//We're not able to locate elements, as focus is still on MAIN Page even after clicking a new window
		//We gota Switch focus from main page to second window page as we have 2 windows open
		 Set<String> allWindowHandles = driver.getWindowHandles();
		 
		 for(String windowID : allWindowHandles) 
		 {
			System.out.println("Each window Handle/Id is -> " + windowID); 
			
			if(!windowID.equals(window1ID)) 
			{
				driver.switchTo().window(windowID);
				Thread.sleep(2000);
			}
			
		 }
		
		 //Now that we're switched to second Window, we can locate the ELEMENTS
		 driver.findElement(By.name("q")).sendKeys("Hello, how are you?");
		
		Thread.sleep(5000);
		
		
		
		tearDown();
		
		
		
	}

}
