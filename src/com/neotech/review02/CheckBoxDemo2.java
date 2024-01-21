package com.neotech.review02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.BaseClass;



public class CheckBoxDemo2 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		// Go to https://demoqa.com/automation-practice-form
		// Check Female
		// Select all the Hobbies

		setUp();
		
		Thread.sleep(3000);
		WebElement femaleButton = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
		femaleButton.click();
		Thread.sleep(3000);
		
		List<WebElement> hobbiesList = driver.findElements(By.xpath("//div[@id='hobbiesWrapper']/div[2]//label"));
		
		//Lets click them ONE by ONE
		for(WebElement hobby : hobbiesList) 
		{
			hobby.click();
			System.out.println(hobby.getText());
			Thread.sleep(2000);
		}
		
		Thread.sleep(3000);
		
		for(WebElement hobby2 : hobbiesList) 
		{
			hobby2.click();
			Thread.sleep(2000);
		}
		
		Thread.sleep(3000);
		tearDown();
		

		
		
	}

}
