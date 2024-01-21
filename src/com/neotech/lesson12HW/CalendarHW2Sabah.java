package com.neotech.lesson12HW;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;
import com.neotech.utilities.CommonMethods;
import com.neotech.utilities.ConfigsReader;

public class CalendarHW2Sabah extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
//		Homework 2:
//		Go to https://hrm.neotechacademy.com/
//		Log in using our custom methods
//		Go to PIM menu
//		Add an employee
//		Go to Employee List
//		Get the list of the employees (Using tables - tr and td) 
//		Loop to search for the employee you added
//		When you find the employee - click on it.
//		Take a screenshot
		

		setUp();
		//LogIN
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username")); wait(1);
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password")); wait(1);
		click(driver.findElement(By.xpath("//button[@type='submit']"))); wait(1);
		//Navigate to PIM
		click(driver.findElement(By.id("menu_pim_viewPimModule"))); wait(1);
		
		//Click on Add Employee
		click(driver.findElement(By.linkText("Add Employee")));
		
		//Send all data of New Employee
		sendText(driver.findElement(By.id("first-name-box")), "Trentyyy"); 
		sendText(driver.findElement(By.id("last-name-box")), "Alexander Arnond"); 
		selectDropdown(driver.findElement(By.id("location")), "Sample Location");
		click(driver.findElement(By.id("modal-save-button"))); 
		waitForVisability(driver.findElement(By.id("employeeId"))); 
		
		
		
		
		//Get the employee ID since its VERY UNIQUE to verify the employee we just added 
		String empID = driver.findElement(By.id("employeeId")).getAttribute("value");
		System.out.println("Employee ID is -> " + empID);
		
		//Now, lets go to the Employee List
		click(driver.findElement(By.id("menu_pim_viewEmployeeList")));
		
		
		//This is a flag -> which means we don't have it(The ID we looking for), soon as i have it stop/break the loop
		boolean found = false; // Found = False  -> found 
											  //-> !found -> go inside the while LOOP
		//While NOT found / !found  .... go inside the while() loop ->
		while(!found) 
		{
			//We Getting all the id's on the page / initally it will start with 1st page
			List<WebElement> idList = driver.findElements(By.xpath("//table[@id='employeeListTable']/tbody/tr/td[2]"));
			
			//Compare to find the id of the new employee we just created
			for(WebElement elementID : idList) 
			{
				if(elementID.getText().equals(empID)) 
				{
					found = true; //found becomes true 
					elementID.click(); // we click o the element
					break; // we break out of the loop
				}
			}
			
			//If i come at this point and the found = False, the employee is not on this page
			
			//!found -> NOT FOUND ... if NOT FOUND go to the next page
			//This if will only execute if Employee name is not found!!!
			if(!found)   
			{
				System.out.println("I will check on the next page!!!");
				click(driver.findElement(By.linkText("chevron_right"))); wait(2);
			}
			
		}
		
		//wait for personal details form to show
		
		waitForVisability(driver.findElement(By.id("employeeId"))); wait(2);
	
		
		//Take a screenshot
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File picture = ts.getScreenshotAs(OutputType.FILE);
		try 
		{
			Files.copy(picture, new File("screenshots/Lesson13/screenshotHW201.png"));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		tearDown();
		
	}

}
