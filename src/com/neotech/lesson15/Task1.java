package com.neotech.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.CommonMethods;

public class Task1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

	//Go to https://the-internet.herokuapp.com/key_presses
		//Press TAB, ESC & ENTER
		
		setUp();
		
		WebElement searchBox = driver.findElement(By.id("target"));
		
		//This clicks on escape on the element we found
		searchBox.sendKeys(Keys.ESCAPE); wait(1);
		
		//This clicks on Tab on the element we found
		searchBox.sendKeys(Keys.TAB); wait(1);
		
		//We sending Test
		searchBox.sendKeys("Test");
		
		//This clicks on Enter on the element we found
		searchBox.sendKeys(Keys.ENTER); wait(2);
		
		//keychaining
//		searchBox.sendKeys(Keys.TAB.ESCAPE.ENTER);
		
		
		tearDown();
		
		
		
	}

}
