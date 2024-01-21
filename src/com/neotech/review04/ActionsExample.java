package com.neotech.review04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utilities.CommonMethods;

public class ActionsExample extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

//		http://webdriveruniversity.com/Actions/index.html
		
		setUp();
		wait(1);
		
		Actions act = new Actions(driver);
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// DRAG and DROP
		
		WebElement dragElement = driver.findElement(By.id("draggable"));
		WebElement dropElement = driver.findElement(By.id("droppable"));
		
		//One Way to Drag and drop , dragAndDrop ( FROM, TO)
//		act.dragAndDrop(dragElement, dropElement).perform();
//		wait(2);
		
		act.clickAndHold(dragElement).moveToElement(dropElement).pause(1000).release().perform();
		wait(2);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//Double Click
		
		WebElement dobleClickButt = driver.findElement(By.id("double-click"));
		
		act.doubleClick(dobleClickButt).perform();
		wait(3);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
//		Mouse Hover
		List<WebElement> hoverButtons = driver.findElements(By.xpath("//button[@class='dropbtn']"));
		
		for(WebElement button : hoverButtons) 
		{
			act.moveToElement(button).perform();
			wait(2);
		}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		WebElement holdReleaseButton = driver.findElement(By.id("click-box"));
		act.clickAndHold(holdReleaseButton).pause(2000).release().pause(2000).clickAndHold(holdReleaseButton).pause(2000).perform();
		wait(2);
		
		
		tearDown();
		
		
	}

}
