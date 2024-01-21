package com.neotech.review03;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utilities.BaseClass;

public class HandlingWindowsDisco extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();
		Thread.sleep(3000);
		
		driver.findElement(By.id("neo")).click();
		Thread.sleep(3000);
		
		//Lets get all the handles/id's of the open WINDOWS/TABS
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		Iterator<String> it = allWindowHandles.iterator();
		String window1 = it.next();
		String window2 = it.next();
		
		for(int i = 1; i<10; i++) 
		{
			driver.switchTo().window(window1);
			Thread.sleep(1000);
			driver.switchTo().window(window2);
			Thread.sleep(1000);
		}
		
		//This will close the current tab we're in ONLYY!!!!
		driver.close();
		//driver.quit(); -> will close the WHOLE driver with all TABS
		
		
		
		
		Thread.sleep(3000);
		tearDown();
		
		
		
	}

}
