package com.neotech.lesson07;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.BaseClass;

public class WindowHandlePractice extends BaseClass{

	public static void main(String[] args) throws InterruptedException {

//		https://demoqa.com/browser-windows
		
		setUp();
		
		Thread.sleep(2000);
		
		System.out.println("Title of main page is -> " + driver.getTitle());
		//This will give us the HANDLE/ID of the MAIN PAGE/WINDOW/TAB
		String mainPageID = driver.getWindowHandle();
		System.out.println("Main page ID/Handle is -> " + mainPageID);
		Thread.sleep(2000);
		
		//1st TAB is our URL
		
		//LETS click on the NEW TAB Button
		//Even though we clicked on the new tab button, OUR FOCUS is still on the MAIN PAGE
		driver.findElement(By.id("tabButton")).click(); // OPENING 2nd tab
		
		Thread.sleep(1000);
		//Even though we clicked on the new tab button, OUR FOCUS is still on the MAIN PAGE
		//LETS Click on the NEW WINDOW button
		driver.findElement(By.id("windowButton")).click(); //OPENING 3rd TAB
		
		Thread.sleep(1000);
		
		//Even though we clicked on the NEW WINDOW button, OUR FOCUS is still on the MAIN PAGE
		driver.findElement(By.id("messageWindowButton")).click(); //OPENING 4th TAB
		
		//AT THIS MOMENT OUR FOCUS IS STILL ON THE MAIN PAGE EVEN THOUGH WE OPEN 3 TABS
		
		//lets get all the HANDLES/ID of the pages/tabs/windows we opened
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println("The size of all Window/Tab Handlesor ID's is -> " + allWindowHandles.size());
		
		for(String handle : allWindowHandles) 
		{
			if(!handle.equals(mainPageID)) //this means if handle/id of main PAGE is NOT equals to the main Page ID
			{
				//Switch to that page/handle/id
				driver.switchTo().window(handle);
				Thread.sleep(2000);
				//Lets Close the PAGE
				driver.close();
			}
		}
		
		
		
		Thread.sleep(2000);
		tearDown();
		
		
	}

}
