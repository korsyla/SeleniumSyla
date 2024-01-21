package com.neotech.lesson11HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.CommonMethods;

public class HW1WithSabah extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

//		Homework 1:
//	    FrameDemo at com.neotech.lesson07 using the CommonMethods.java
		

//		https://jqueryui.com/tooltip/

		setUp();
		wait(2);
		
		switchToFrame(0);
		WebElement ageBox = driver.findElement(By.xpath("//input[@id='age']"));
		sendText(ageBox, "20");
		wait(2);
		
		driver.switchTo().defaultContent();
		
		switchToFrame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		sendText(driver.findElement(By.id("age")), "Namei");
		wait(2);
		
		driver.switchTo().defaultContent();
		wait(2);
		
		
	
		
		tearDown();
		
		
		
	}

}
