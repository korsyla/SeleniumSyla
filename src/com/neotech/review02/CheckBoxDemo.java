package com.neotech.review02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.BaseClass;


public class CheckBoxDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		// Go to https://demoqa.com/automation-practice-form
		// Check Female
		// Select all the Hobbies
		// See if they are selected after you select each of them
		
		setUp();
		
		Thread.sleep(3000);
		//Cannot click on the input because the input does not allow it
//		driver.findElement(By.id("gender-radio-1")).click();
		
		//We are able to click on the label
		driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
		Thread.sleep(2000);
		
		//Locating and clicking on the Female element
		driver.findElement(By.xpath("//label[@for='gender-radio-2']")).click();
		Thread.sleep(2000);
		
		//Clicking on the sports
//		driver.findElement(By.xpath("//div[@id='hobbiesWrapper']/div[2]//label")).click();
//		Thread.sleep(3000);
		
		//It will return all the WebElements with that XPATH in List
		//List<WebElement> allElments = driver.findElements(By.xpath("//div[@id='hobbiesWrapper']/div[2]//label"));
		
		List<WebElement> checkBoxList = driver.findElements(By.xpath("//div[@id='hobbiesWrapper']/div[2]//label"));
		
		for(WebElement checkBox : checkBoxList ) 
		{
			checkBox.click();
			Thread.sleep(2000);
		}
		
		
		
		tearDown();
		
		
		
	}

	private static void findElements(By xpath) {
		// TODO Auto-generated method stub
		
	}

}
