package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utilities.BaseClass;

public class DropDownDemo2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		//https://demoqa.com/select-menu
		
		setUp();
		
		//Lets focus on DropDown from website -> Old Style Select Menu
		//*********** Its Tag is SELECT -> Meaning we can use Select class **************
		
		//We locating/finding the DropDown Element
		WebElement oldMenu = driver.findElement(By.id("oldSelectMenu")); 
		
		//Creating select Object, using the WebElement of the Select Tag
		//Storing the oldMenu DropDown into new Select Object
		Select selDD = new Select(oldMenu);
		
		selDD.selectByIndex(1);
		Thread.sleep(2000);
		
		
		WebElement otherMenu = driver.findElement(By.id("withOptGroup"));
		otherMenu.click();
		
		Thread.sleep(2000);
		
		

		
		
		tearDown();
		
		
		
	}

}
