package com.neotech.lesson11HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.CommonMethods;

public class HW1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
//		Homework 1:
//		    FrameDemo at com.neotech.lesson07 using the CommonMethods.java
//		=================   HW_2_Handling Frames =================================
//		1) Launch the browser and open the site "https://chercher.tech/practice/frames-example-selenium-webdriver"
//		2) Verify on the page header "Not a Friendly Topic" displayed
//		3) Click on the Inner Frame Check box
//		4) Choose baby Cat from Animals dropdown
//		5) Quit the browser
		
		
		setUp();
		wait(2);
		
		WebElement pageHeader = driver.findElement(By.xpath("//label/span[text()='Not a Friendly Topic']"));
		System.out.println("On the page header is displayed -> " + pageHeader.getText());
		wait(2);
		
		switchToFrame("frame1");
		WebElement topicTextBox = driver.findElement(By.xpath("//input[@type='text']"));
		sendText(topicTextBox, "Not a Friendly Topic");
		wait(2);
		System.out.println("Is topic textBox displayed? -> " + topicTextBox.isDisplayed());
		
		WebElement childFrame = driver.findElement(By.xpath("//iframe[@id='frame3']"));
		switchToFrame(childFrame);
		driver.findElement(By.id("a")).click();
		wait(3);
		driver.switchTo().defaultContent();
		
		WebElement secondFrame = driver.findElement(By.xpath("//iframe[@id='frame2']"));
		switchToFrame(secondFrame);
		WebElement selDDElement = driver.findElement(By.id("animals"));
		selectDropdown(selDDElement, "Baby Cat");
		wait(3);
		tearDown();
		
	}

}

