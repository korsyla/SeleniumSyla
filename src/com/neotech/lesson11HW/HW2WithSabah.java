package com.neotech.lesson11HW;

import org.openqa.selenium.By;

import com.neotech.utilities.CommonMethods;

public class HW2WithSabah extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

//		Homework 2:
//	    WindowHandleDemo at com.neotech.lesson07 using the CommonMethods.java
	//https://accounts.google.com/signup
		
		setUp();
		wait(2);
		System.out.println("Title of current page is - > " + driver.getTitle());
		
		//This method wait for an element to be cliackable and then clicks on it
		click(driver.findElement(By.linkText("Help")));
		wait(3);
		
		switchToChildWindow();
		System.out.println("Title of child window is -> " + driver.getTitle());
		
		wait(3);
		
		driver.close();
		
		
		tearDown();
		
		
	}

}
