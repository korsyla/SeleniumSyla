package com.neotech.lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utilities.BaseClass;
import com.neotech.utilities.ConfigsReader;

public class DropDownDemoRedue extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		//http://neotechacademy-sis.com:9000/Test/
		
		setUp();
		
		String username = ConfigsReader.getProperty("username");
		String password = ConfigsReader.getProperty("password");
		
		WebElement usernameBox = driver.findElement(By.id("tUsername"));
		usernameBox.sendKeys(username);
		WebElement passwordBox = driver.findElement(By.id("tPassword"));
		passwordBox.sendKeys(password);
		
		System.out.println("User name is: " + username + " Password is: " + password);
		Thread.sleep(2000);
		
		WebElement dropDowns = driver.findElement(By.id("dAcademicYear_list"));
		
		//this element is a select tag
		Select selDropDown = new Select(dropDowns);
		
		//1st way to select elements
		//Here, the 1st option is selected
		selDropDown.selectByIndex(0);  
		
		Thread.sleep(3000);
		
		//2nd way to select elements
		selDropDown.selectByValue("10");
		
		Thread.sleep(3000);
		
		//3rd way to select elements
		selDropDown.selectByVisibleText("2014-2015");
		
		Thread.sleep(3000);
		
		
		//The SELECT object/class has also Access to LIST as a whole
		List<WebElement> allDDOptions = selDropDown.getOptions();
		System.out.println("The size of the whole list is -> " + allDDOptions.size());
		
		for(int i =0; i<allDDOptions.size(); i++ ) 
		{
			selDropDown.selectByIndex(i);
			Thread.sleep(2000);
		}
		
		
		
		
		
		
		
		
		tearDown();
		
		
		
		
	}

}
