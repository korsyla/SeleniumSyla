package com.neotech.lesson07HW;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utilities.BaseClass;

public class HW1WithShane extends BaseClass{

	public static void main(String[] args) throws InterruptedException {

//		==================  HW_1_Handling Multiple Windows =======================
//		1) Launch the browser and open the site "http://demo.guru99.com/popup.php"
//		2) Click on link "Click Here". When the user clicks on the "Click Here" link, new child window opens.
//		3) On the Child Window, Enter your email ID and submit.
//		4) Then Access Credentials will be Displayed on submitted page. You will see the child window is open in new tab.
//		5) Close the Child window on which credentials are displayed.Switch to the parent window.
//		6) Quit all browsers
		
		setUp();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(2000);
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		String parentWindow = it.next();  //it gives 1st item in the SET / Parent Element
		String childWindow = it.next(); //It gives 2nd item in the SET / Child Element
		
		//Lets switch FOCUS to child WINDOW cus even when we click on child window, the focus is still on PARENT
		driver.switchTo().window(childWindow);
		
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("test@me.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(2000);
		
		//Get USERNAME TEXT
		String userID =driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[2]")).getText();
		
		//Get PASSWORD TEXT
		String password = driver.findElement(By.xpath("//tr[5]/td[2]")).getText();
		
		System.out.println("User ID is -> " + userID);
		System.out.println("Password is -> " + password);
		
		//CLosing the CHILD window
		//We have 2 options -> driver.close() and or SWITCH to parent window
		
		
		
		
		
		
		

		Thread.sleep(5000);
		tearDown();

		
	}

}
