package com.neotech.lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utilities.CommonMethods;

public class ActionsClassDemo extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

//		https://www.amazon.com/
		
		setUp();
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.id("nav-link-accountList")));
		wait(5);
	
		WebElement el = driver.findElement(By.linkText("Start here."));
		
		if(el.getText().contains("Start")) 
		{
			System.out.println("Menu was displayed!!");
		}
		else 
		{
			
			System.out.println("Menu was NOT displayed!!");
		}
		
		//Perform a right click
		action.contextClick().perform();
		wait(5);
		
		
		//Go to search box - click on it - and send text - and double click
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		
		//We can do method chaining because they're all of ACTIONS Class methods
		action.moveToElement(searchBox).click().sendKeys("Iphone 15").doubleClick().pause(2000).perform();
		wait(3);
		
		
		
		tearDown();
		
		
		
		
		
	}

}
