package com.neotech.lesson07HW;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.BaseClass;

public class HW1 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {

//		==================  HW_1_Handling Multiple Windows =======================
//		1) Launch the browser and open the site "http://demo.guru99.com/popup.php"
//		2) Click on link "Click Here". When the user clicks on the "Click Here" link, new child window opens.
//		3) On the Child Window, Enter your email ID and submit.
//		4) Then Access Credentials will be Displayed on submitted page. You will see the child window is open in new tab.
//		5) Close the Child window on which credentials are displayed.Switch to the parent window.
//		6) Quit all browsers
		
		
		
//		HW_1_Handling Multiple Windows
		setUp();
		Thread.sleep(2000);
		
		WebElement clickHere = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickHere.click();
		System.out.println("The Handle/ID of MAIN PAGE URL is -> " + driver.getWindowHandle());
		
		Set<String> allTabHandles =driver.getWindowHandles();
		
		Iterator<String> it = allTabHandles.iterator();
		
		String firstWindow = it.next();
		String secondWindow = it.next();
		
		driver.switchTo().window(secondWindow);
		Thread.sleep(2000);
		System.out.println("The Handle/ID of Click HERE TAB is -> " + driver.getWindowHandle());
		
		WebElement emailIDBox = driver.findElement(By.xpath("//input[@name='emailid']"));
		emailIDBox.sendKeys("kosyl@gmail.com");
		
		WebElement submitButton = driver.findElement(By.xpath("//input[@name='btnLogin']"));
		submitButton.click();
		Thread.sleep(2000);
		
		driver.close();
		
		Thread.sleep(3000);
		tearDown();
		
		
	}

}
