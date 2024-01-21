package com.neotech.lesson07HW;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utilities.BaseClass;

public class HW2WithShane extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
//		=================   HW_2_Handling Frames =================================
//		1) Launch the browser and open the site "https://chercher.tech/practice/frames-example-selenium-webdriver"
//		2) Verify on the page header "Not a Friendly Topic" displayed
//		3) Click on the Inner Frame Check box
//		4) Choose baby Cat from Animals dropdown
//		5) Quit the browser
		
		setUp();
		Thread.sleep(2000);
		String labelText = driver.findElement(By.xpath("//label/span")).getText();
		System.out.println("Text of label -> " + labelText);
		
		//Moving inside the 1st FRAME
		driver.switchTo().frame("frame1");
		
		//Moving inside the INNER/Child Frame
		driver.switchTo().frame(0);
		
		//Now lets find the checkbox and click it
		driver.findElement(By.id("a")).click();
		
		//Switch focus back to main page
		driver.switchTo().defaultContent();
		
		//Switch into the frame by using 
		driver.switchTo().frame("frame2");
//		driver.switchTo().frame(1);
		
		Select sel = new Select(driver.findElement(By.id("animals")));
		sel.deselectByVisibleText("Baby Cat");
		
		
		
		Thread.sleep(2000);
		tearDown();

		

		
		
	}

}
