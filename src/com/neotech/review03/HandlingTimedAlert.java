package com.neotech.review03;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utilities.BaseClass;

public class HandlingTimedAlert extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		// https://neotech.vercel.app/alerts
		
		setUp();
		Thread.sleep(2000);
		
		WebElement alertButton =  driver.findElement(By.id("btnAlert"));
		alertButton.click();
		Thread.sleep(2000);
		
		//Lets switch to the alert now / Hanlding Alert
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println("The text of the alert is -> " + alertText);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(3000);
		
		//Handling the Delayed Alert
		 driver.findElement(By.id("btnDelayedAlert")).click();
		 
		 
		 //RE-Assigning to new Delayed ALERT
		 //The alert is not present YET
//		 alert = driver.switchTo().alert();
		 
//		 This kind of waiting is not good cus we waiting too long 
//		 Thread.sleep(10000); -> 
//		 alert = driver.switchTo().alert();
		 
//		 This is wait for MAX of 30 sec, and this type of wait is RECOMMENDED
//		 However if wait lasts 3 seconds it will locate it immediately and not wait all 30 seconds
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.alertIsPresent());
		 
		 //If the alert is present in 3 seconds, it will wait for only 3 seconds no more than that
		 
		 
		 
		 
		 
		
		tearDown();
		
	}

}
