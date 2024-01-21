package com.neotech.lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utilities.CommonMethods;

public class DragAndDropDemo extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

//		https://jqueryui.com/droppable/
		
		setUp();
		
		//Switch to frame first
		switchToFrame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		
		//Locate the drag and drop elements
		WebElement dragElement = driver.findElement(By.id("draggable"));
		WebElement dropElement = driver.findElement(By.id("droppable"));
		
		//Call the Actions class and create an object out of actions class to call its class methods
		Actions action = new Actions(driver);
		action.dragAndDrop(dragElement, dropElement).perform();
		
		//Another way to drag and drop 
		action.clickAndHold(dragElement).moveToElement(dropElement).release().perform();
		
		
		
		
		
		
		tearDown();
		
		
	}

}
