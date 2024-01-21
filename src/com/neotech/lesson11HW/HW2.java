package com.neotech.lesson11HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.CommonMethods;

public class HW2 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
//		Homework 2:
//		    WindowHandleDemo at com.neotech.lesson07 using the CommonMethods.java
		
//		==================  HW_1_Handling Multiple Windows =======================
//		1) Launch the browser and open the site "http://demo.guru99.com/popup.php"
//		2) Click on link "Click Here". When the user clicks on the "Click Here" link, new child window opens.
//		3) On the Child Window, Enter your email ID and submit.
//		4) Then Access Credentials will be Displayed on submitted page. You will see the child window is open in new tab.
//		5) Close the Child window on which credentials are displayed.Switch to the parent window.
//		6) Quit all browsers
		
		
		setUp();
		driver.findElement(By.linkText("Click Here")).click();
		wait(2);
		
		switchToChildWindow();
		WebElement emailIDTextbox = driver.findElement(By.xpath("//input[@name='emailid']"));
		sendText(emailIDTextbox, "kosyl@gmail.com");
		wait(3);
		
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
		WebElement accessHeaderVisibility = driver.findElement(By.xpath("//h2[text()='Access details to demo site.']"));
		waitForVisability(accessHeaderVisibility);
		System.out.println(accessHeaderVisibility.getText());
		
		wait(3);
		
		driver.close();
		
		wait(3);
		
		tearDown();
		

	}

}
