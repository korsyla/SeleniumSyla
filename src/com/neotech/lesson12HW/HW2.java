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

public class HW2 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

//		Homework 2:
//			Go to https://hrm.neotechacademy.com/
//			Log in using our custom methods
//			Go to PIM menu
//			Add an employee
//			Go to Employee List
//			Get the list of the employees (Using tables - tr and td) 
//			Loop to search for the employee you added
//			When you find the employee - click on it.
//			Take a screenshot
		
//		Homework 2:
		setUp();
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username")); wait(1);
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password")); wait(1);
		
		click(driver.findElement(By.xpath("//button[text()='Login']"))); wait(2);
		
		click(driver.findElement(By.id("menu_pim_viewPimModule"))); wait(2);
		click(driver.findElement(By.linkText("Add Employee"))); wait(2);
		sendText(driver.findElement(By.id("first-name-box")), "Domiiniik"); wait(1);
		sendText(driver.findElement(By.id("last-name-box")), "Szoboszlai"); wait(1);
		selectDropdown(driver.findElement(By.id("location")), "Texas R&D");wait(3);
		sendText(driver.findElement(By.id("employeeId")), "80"); wait(2);
		click(driver.findElement(By.id("modal-save-button"))); wait(2);
		waitForClickability(driver.findElement(By.id("nickName"))); wait(2);
		click(driver.findElement(By.id("menu_pim_viewEmployeeList"))); wait(2);
		click(driver.findElement(By.linkText("chevron_right"))); wait(3);
		
		String expected = "Domiiniik Szoboszlai";
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='employeeListTable']/tbody/tr"));
		List<WebElement> firstCol = driver.findElements(By.xpath("//table[@id='employeeListTable']/tbody/tr/td[1]"));
		
		for(int i = 0; i < rows.size(); i++) 
		{
			String rowText = rows.get(i).getText();
//			System.out.println("Row Text is -> " + rowText);
			//If row contains Dominikkkk, I want to click on that ROW
			if(rowText.contains(expected)) 
			{

				firstCol.get(i).click();
				System.out.println("Clicked on record -> " + i);
				break;
			}
		}
	
		wait(5);
		waitForVisability(driver.findElement(By.id("otherId"))); wait(2);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenShot = ts.getScreenshotAs(OutputType.FILE);
		try 
		{
			Files.copy(screenShot, new File("screenshots/HRM/screenshot02.png"));
		} 
		catch (IOException e) 
		{
			System.out.println("Screenshot was NOT taken!!!");
			e.printStackTrace();
		}
		
		wait(3);
		
		tearDown();
		
		
		//1st WAY - ONE LINER
		//If condition is true, than Dominikkkk is found in row[i]
		//The column I want to click on is element with index i
//		driver.findElements(By.xpath("//table[@id='employeeListTable']/tbody/tr/td[2]")).get(i).click();
		
		//2nd WAY - Save the Column List first and then get the Specific Element to click on
//		List<WebElement> firstColumn = driver.findElements(By.xpath("//table[@id='employeeListTable']//td[1]"));
//		firstColumn.get(i).click();

	}

}
