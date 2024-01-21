package com.neotech.lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.CommonMethods;
import com.neotech.utilities.ConfigsReader;

public class JavaScriptDemo extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

//		https://hrm.neotechacademy.com/
		
		setUp();
		
		
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password =  driver.findElement(By.id("txtPassword"));
		
		sendText(username, ConfigsReader.getProperty("username"));
		sendText(password, ConfigsReader.getProperty("password"));
		
		wait(2);
		
		
		//Create a JavaScriptExecuter Object -> 
		//we are DOWNCASTING driver into JavaScriptExecuter, so we can access the JavascriptExecuter methods()
		// username, password -> are the Arguments / username is argument[0], password is argument[1]
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.backgroundColor='blue';"
				+ "arguments[1].style.backgroundColor='red';", username, password);
		
		wait(3);
		
		
		//Lets Log in, by clicking on the LOGIN BUTTON
		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//button[@type='submit']")));
		
		//Lets go to EMPLOYEE LIST
		//Navigate to PIM
		click(driver.findElement(By.id("menu_pim_viewPimModule"))); wait(1);
				
		//Click on Employee LIST
		click(driver.findElement(By.linkText("Employee List")));
		wait(3);
		
		//scroll with JS using pixels -> scroll down by 1000pxls
		//Scrolling down since its a positive value
		js.executeScript("window.scrollBy(0, 1000)");
		
		//Scrolling up since its a negative value
		js.executeScript("window.scrollBy(0, -100)");
		
		
		
		//scroll into VIEW of a certain ELEMENT
		//This is the MOST Important feature in JAVASCRIPT!!!!!!!!!!!!!!!!!!!!!!!!!!!
		WebElement homeButton = driver.findElement(By.id("home-menu-trigger"));
		
		//This -> arguments[0].scrollIntoView(true) / will scroll into the view of the homeButton WebElement
		// arguments[0] Refers to homeButton / which is argument index 0
		js.executeScript("arguments[0].scrollIntoView(true)", homeButton); wait(3);
		
		
		
		
		tearDown();
		
		
		
	}

}
