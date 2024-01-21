package com.neotech.lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utilities.BaseClass;
import com.neotech.utilities.ConfigsReader;

public class DropDownDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		driver.findElement(By.id("tUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("tPassword")).sendKeys(ConfigsReader.getProperty("password"));
		
		Thread.sleep(2000);
		
		
		WebElement dd =  driver.findElement(By.id("dAcademicYear_list"));
		
		//This WebElement is a select tag 
		//We use SELECT CLASS AND ITS METHODS
		Select selDD = new Select(dd);
		
		//1st Way to select elements
		selDD.selectByIndex(0); //1st option is selected
		Thread.sleep(2000);
		
		//2nd way to select elements
		selDD.selectByValue("10");
		Thread.sleep(2000);
		
		//3rd way to select elements
		selDD.selectByVisibleText("2014-2015");
		Thread.sleep(2000);
		
		//The select object also has access to the LIST<WebElements>
		List<WebElement> options = selDD.getOptions();
		System.out.println("The size of list is : " + options.size());
		
		for(int i = 0; i<options.size(); i++) 
		{
			selDD.selectByIndex(i);
			Thread.sleep(2000);
		}
		
		
		
		
		tearDown();
		
		
		
	}

}
