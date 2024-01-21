package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.BaseClass;

public class NestedFrames extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		
		
		setUp();
		
		Thread.sleep(2000);
		
		//Switching to PARENT FRAME with ID or NAME
		driver.switchTo().frame("frame1"); //USING the id of the FRAME
		
		//NOW, lets switch to the CHILD/INNER FRAME -> with xpath/css/tag etccc....
		//Here we are locating the CHILD FRAME
		WebElement childFrame = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		//OR ONE LINER
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
		
		//HERE, we are SWITCHING to the CHILD FRAME
		driver.switchTo().frame(childFrame);
		
		//NOW OUR Focus is inside the CHILD FRAME
		WebElement childFrameText = driver.findElement(By.xpath("//body/p"));
		String childText = childFrameText.getText();
		System.out.println("Text inside the child frame is -> " + childText);
		
		//Now the FOCUS goes from CHILD -> to the MAIN PAGE DIRECTLY and it bypasses the PARENT FRAME
		driver.switchTo().defaultContent();

		
		
		Thread.sleep(2000);
		tearDown();
		
		
		
		
	}

}
