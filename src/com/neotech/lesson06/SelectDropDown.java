package com.neotech.lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utilities.BaseClass;
import com.neotech.utilities.ConfigsReader;

public class SelectDropDown extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		//http://neotechacademy-sis.com:9000/Test/
		
		setUp();
		
		Thread.sleep(3000);
		
		WebElement userNameBox = driver.findElement(By.id("tUsername"));
		userNameBox.sendKeys(ConfigsReader.getProperty("username"));
		Thread.sleep(2000);
		
		WebElement passwordBox = driver.findElement(By.name("tPassword"));
		passwordBox.sendKeys(ConfigsReader.getProperty("password"));
		Thread.sleep(2000);
		
//		WebElement loginButton = driver.findElement(By.xpath("//input[@id='bLogin']"));
//		loginButton.click();
//		Thread.sleep(3000);
		
		WebElement AcadYearDD = driver.findElement(By.xpath("//select[@id='dAcademicYear_list']"));
		
		Select dropDown = new Select(AcadYearDD);
		
		//1st Way -> by index
		dropDown.selectByIndex(1);
		
		//2nd Way -> by Value
		dropDown.selectByValue("10");
		
		Thread.sleep(3000);
		
		//3rd Way -> 
		dropDown.selectByVisibleText("2015-2016");
		Thread.sleep(3000);
		
		
		//The SELECT class/object, also has access to the OPTIONS list 
		List<WebElement> allOptions = dropDown.getOptions();
		System.out.println("The size of all options is -> " + allOptions.size());
		
		for(int i = 0; i<allOptions.size(); i++) 
		{
			dropDown.selectByIndex(i);
			Thread.sleep(1000);
		}
		
		
		
		
		
		
//		for(WebElement option : allOptions) 
//		{
//			option.click();
//			Thread.sleep(2000);
//		}
		
		
		
		tearDown();
		
		
		
	}

}
