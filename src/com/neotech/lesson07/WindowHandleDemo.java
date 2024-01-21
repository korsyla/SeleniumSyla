package com.neotech.lesson07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.BaseClass;

public class WindowHandleDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		// https://accounts.google.com/signup

		
		setUp();
		
		Thread.sleep(2000);
		//This is the TITLE of our URL
		System.out.println(driver.getTitle());
		
		//This gives us a UNIQUE ID for this TAB/WINDOW 
		System.out.println("Handle or Unique ID is -> " + driver.getWindowHandle());
		
		//Here we clicked on the HELP link / and we HAVE 2 WINDOWS/TABS OPEN
		driver.findElement(By.xpath("//a[@class ='WgJpmf']")).click();
		
		Thread.sleep(2000);
		//Here we are putting all the open WINDOWS/TABS in a SET COLLECTION / only if they're UNIQUE
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println("The number of all open windows/tabs is -> " + allWindowHandles.size());
		
		//Lets ITERATE them / WE CAN ALSO USE ENHANCED FOR LOOP
		Iterator<String> it = allWindowHandles.iterator();
		String window1 = it.next();  //This gives us the 1st element in the SET Collection
		String window2 = it.next(); //This gives us the 2nd element in the SET Collection
		
		System.out.println("Window1 is -> " + window1);
		System.out.println("Window2 is -> " + window2);
		
		//Lets SWITCH FOCUS to the 2nd WINDOW/TAB -> Help link
		driver.switchTo().window(window2);
		
		//We get the Title of the Help TAB
		String helpTabTitle = driver.getTitle();
		System.out.println("Title of the HELP TAB is -> " + helpTabTitle);
		
		//This will close the FOCUSED tab/window
		driver.close();
		
		
		Thread.sleep(2000);
		tearDown();
		
		
	}

}
