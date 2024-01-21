package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.BaseClass;

public class FrameDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
//		https://jqueryui.com/tooltip/
		
		setUp();
		
		Thread.sleep(2000);
		//To locate an element. 1st we need to switch to the FRAME
		
		//There are 3 ways to switch to a FRAME
		
		//1st WAY. switch to FRAME by INDEX
		driver.switchTo().frame(0);
		
		//Now that we switched to the frame, We can Locate the elements
		WebElement ageBox = driver.findElement(By.id("age"));
		ageBox.sendKeys("age");
		Thread.sleep(2000);
		
		//This element is outside the FRAME, driver.findElement(By.xpath("//a[text()='Checkboxradio']"));
		
		//If we're in a FRAME and we want to click an ELEMENT outside the frame 
		//WE 1st have to switch outside of the FRAME to the MAIN PAGE, than select the Element outside the FRAME 
		driver.switchTo().defaultContent();
		
		//2nd WAY, to SWITCH to the id or name
		// IN this case our FRAME does not have name or id
		
		//3rd way, switch to the FRAME by using a WebElement -> XPATH or CSS Selector
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		
		//OR we can do ONE LINER
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		//NOW we are INSIDE the FRAME
		WebElement age = driver.findElement(By.id("age"));
		//We clearing the PREVIOUS info we had in the Age BOX
		age.clear();
		Thread.sleep(2000);
		age.sendKeys("30");
		
		//NOW lets SWITCH OUTSIDE of the IFRAME...... 
		//LETS switch back to the MAIN PAGE
		driver.switchTo().defaultContent();
		
		
		
		
		
		
		
		Thread.sleep(2000);
		
		tearDown();
		
		
		
	}

}
