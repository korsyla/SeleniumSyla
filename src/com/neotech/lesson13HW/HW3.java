package com.neotech.lesson13HW;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.CommonMethods;
import com.neotech.utilities.ConfigsReader;

public class HW3 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

//		Homework 3: 
//			Go to url: https://hrm.neotechacademy.com/
//			Log in using our custom methods
//			Go to PIM menu
//			Add an employee
//			Upload another image in the employee photo
		

		setUp();
		//LOGIN
		sendText(driver.findElement(By.id("txtUsername")),ConfigsReader.getProperty("username")); wait(1);
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password")); wait(1);
		click(driver.findElement(By.xpath("//button[text()='Login']"))); wait(1);
		
		//Click on PIM MENU /Add Employee
		click(driver.findElement(By.id("menu_pim_viewPimModule"))); wait(1);
		click(driver.findElement(By.id("menu_pim_addEmployee"))); wait(1);
		waitForVisability(driver.findElement(By.id("middle-name-box")));
		
		sendText(driver.findElement(By.id("first-name-box")), "Moo"); wait(1);
		sendText(driver.findElement(By.id("last-name-box")), "Salah"); wait(1);
		selectDropdown(driver.findElement(By.id("location")), "Texas R&D"); wait(1);
		
		//Lets get the Employee Id
		String employeeID = driver.findElement(By.id("employeeId")).getAttribute("value");
		System.out.println("Employee ID is -> " + employeeID);
		
		click(driver.findElement(By.id("modal-save-button")));
		waitForVisability(driver.findElement(By.id("employeeId")));
		click(driver.findElement(By.xpath("//img[@data-tooltip='Change Profile Picture']"))); wait(3);
		
		//Lets find the filePath and  Upload a PHOTO in employee photo
		String filePath = System.getProperty("user.dir") + "/screenshots/FileUpload.png";
		//use sendText() method for uploading a Photo
		sendText(driver.findElement(By.xpath("//input[@id='employeePicture']")), filePath);
		//Bug Maybe at this Save Button for uploading another image???
		WebElement saveButton = driver.findElement(By.xpath("//div[311]/form/div[2]/a[text()='Save']"));
		saveButton.click();
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//div[311]/form/div[2]/a[text()='Save']")));
		
		tearDown();
		
		
		
	}

}
