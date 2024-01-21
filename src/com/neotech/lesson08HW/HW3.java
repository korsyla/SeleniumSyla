package com.neotech.lesson08HW;

import java.time.Duration;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utilities.BaseClass;
import com.neotech.utilities.ConfigsReader;

public class HW3 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

//		Homework 3:
//	        Add Employee
//	        Open chrome browser
//	        Go to "https://hrm.neotechacademy.com/"
//	        Login into the application
//	        Click on PIM > Add Employee 
//	        Add Employee
//	        Log out 
//	        Quit the browser
		
		setUp();
		String userName = ConfigsReader.getProperty("username");
		String passWord = ConfigsReader.getProperty("password");
		
		WebElement usernameBox = driver.findElement(By.id("txtUsername"));
		usernameBox.sendKeys(userName);
		Thread.sleep(2000);
		WebElement passwordBox = driver.findElement(By.id("txtPassword"));
		passwordBox.sendKeys(passWord);
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
		Thread.sleep(2000);
		
		WebElement pim = driver.findElement(By.xpath("//span[text()='PIM']"));
		pim.click();
		Thread.sleep(2000);
		
		WebElement addEmploye = driver.findElement(By.xpath("//span[text()='Add Employee']"));
		addEmploye.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='employeeId']")));
		WebElement fname = driver.findElement(By.xpath("//input[@id='first-name-box']"));
		fname.sendKeys("Trent");
		Thread.sleep(2000);
		
		WebElement lName = driver.findElement(By.xpath("//input[@id='last-name-box']"));
		lName.sendKeys("Alexander-Arnold");
		Thread.sleep(3000);
		
		WebElement selDD = driver.findElement(By.id("location"));
		Select select = new Select(selDD);
		select.selectByVisibleText("Texas R&D");
		Thread.sleep(3000);
		
		WebElement saveButton = driver.findElement(By.id("modal-save-button"));
		saveButton.click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='firstName']")));
		driver.findElement(By.xpath("//i[text()='keyboard_arrow_down']")).click();
		Thread.sleep(3000);
		
		WebElement logout = driver.findElement(By.id("logoutLink"));
		logout.click();
		Thread.sleep(3000);
		
		tearDown();
		
		
	}

}
