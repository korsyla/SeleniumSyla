package com.neotech.lesson06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.BaseClass;

public class AlertDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {

		//https://demo.guru99.com/test/delete_customer.php
		
		setUp();
		
		WebElement customerID =  driver.findElement(By.name("cusid"));
		customerID.sendKeys("1234");
		Thread.sleep(3000);
		WebElement submitButton = driver.findElement(By.name("submit"));
		submitButton.click();
		Thread.sleep(3000);
		
		//We're at the part NOW where the ALERT has POPED-UP
		//Here we have Shifted Focus From Webpage -> to the SHOWN ALERT
		Alert simpleAlert = driver.switchTo().alert();
		String alertText = simpleAlert.getText();
		System.out.println("The simple Alert text is -> " + alertText);
		
		//Scenario: Lets click CANCEL on the Alert!!
		simpleAlert.dismiss();
		
		
		Thread.sleep(3000);
		
		
		//Another Scenario: Lets click OK on the Alert now!!
		WebElement submitButton2 = driver.findElement(By.name("submit"));
		submitButton2.click();
		Thread.sleep(3000);
		Alert secondAlert = driver.switchTo().alert();
		
		Thread.sleep(2000);
		secondAlert.accept();
		Thread.sleep(3000);
		
		//Here is another Alert
		Alert lastConfirmationAlert = driver.switchTo().alert();
		System.out.println("The text of LastConfirmation alert is -> " + lastConfirmationAlert.getText());
		lastConfirmationAlert.accept();
		
		
		
		
		
		tearDown();
		
		
		
	}

}
