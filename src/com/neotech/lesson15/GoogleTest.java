package com.neotech.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.CommonMethods;

public class GoogleTest extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

//		https://www.google.com/
		
		setUp();
		
		WebElement searchBox = driver.findElement(By.name("q")); 
		
		sendText(searchBox, "bitcoin");  wait(2);
		
		//This just hits enter on the seachbox after bitcoin was send to searchbox
		searchBox.sendKeys(Keys.ENTER); wait(2);
		
		
		
		
		
		
		
		tearDown();
		
		
		
	}

}
