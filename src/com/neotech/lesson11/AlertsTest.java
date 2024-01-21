package com.neotech.lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.CommonMethods;

public class AlertsTest extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		// https://demo.guru99.com/test/delete_customer.php
		
		setUp();
		wait(2);
		
		WebElement customerIDBox = driver.findElement(By.name("cusid"));
		sendText(customerIDBox, "12345");
		driver.findElement(By.name("submit")).click();
		
		wait(2);
		
		System.out.println(getAlertText()); //This method returns the text of the alert
		dissmisAlert();
		
		driver.findElement(By.name("submit")).click();
		wait(2);
		acceptAlert();
		wait(2);
		
		System.out.println(getAlertText());
		acceptAlert();
		
		wait(2);
		
		
		
		
		
		
		tearDown();
		
		
		
	}

}
