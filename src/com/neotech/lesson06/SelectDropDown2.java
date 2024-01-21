package com.neotech.lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utilities.BaseClass;

public class SelectDropDown2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

//		https://demoqa.com/select-menu
		
		setUp();
		
		Thread.sleep(2000);
		
		//We locate the Element
		WebElement oldmenuSelect = driver.findElement(By.id("oldSelectMenu"));
		
		//Create SELECT object using WebElement of the Select tag
		Select selDD = new Select(oldmenuSelect);
		
		selDD.selectByIndex(1);
		Thread.sleep(3000);
		
		//Getting all the options within Select Tag -> using .getOptions();
		List<WebElement> allOptions = selDD.getOptions();
		System.out.println("The size of all Options is -> " + allOptions.size());
		
		System.out.println("-----------------------------------------");
		
		for(WebElement option : allOptions)        
		{
			option.click();
			System.out.println(option.getText());
			Thread.sleep(1000);
		}
		
		
//		for(int i = 0; i <allOptions.size(); i++) 
//		{
//			selDD.selectByIndex(i);
//			Thread.sleep(1000);
//		}
		
		
		WebElement otherMenu = driver.findElement(By.id("withOptGroup"));
		otherMenu.click();
		
		Thread.sleep(5000);
		
		
		
		tearDown();
		
		
		
		
	}

}
