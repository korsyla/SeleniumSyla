package com.neotech.lesson06HW;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.BaseClass;

public class HW2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

//		Homework 2:
//	        Alert text verification
//	        Open chrome browser
//	        Go to https://demoqa.com/
//	        Click on "Alerts, Frame & Windows" link
//	        Click on "Alerts" links on the left side
//	        Click on button to see Alert
//	        Verify alert box with text "You clicked a button" is present
//	        Click on 3rd button in the page
//	        Verify alert box with text "Do you confirm action?" is present and click "confirm"
//	        Click on 4 th button in the page and enter your name and click ok.
//	        Quit browser
		
		setUp();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Alerts']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
		
		Alert seeAlertButton = driver.switchTo().alert();
		System.out.println("First Alert text is -> " + seeAlertButton.getText());
		seeAlertButton.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Alert thirdButton = driver.switchTo().alert();
		System.out.println("Second Alert text is -> " + thirdButton.getText());
		thirdButton.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.id("promtButton")).click();
		Alert fourthButton = driver.switchTo().alert();
		fourthButton.sendKeys("KorabSyla");
		Thread.sleep(3000);
		fourthButton.accept();
		Thread.sleep(3000);
	
//		tearDown();
		
		
	}

}
