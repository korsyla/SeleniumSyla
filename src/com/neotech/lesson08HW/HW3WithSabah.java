package com.neotech.lesson08HW;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utilities.BaseClass;
import com.neotech.utilities.ConfigsReader;

public class HW3WithSabah extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

//		Homework 3:
//        Add Employee
//        Open chrome browser
//        Go to "https://hrm.neotechacademy.com/"
//        Login into the application
//        Click on PIM > Add Employee 
//        Add Employee
//        Log out 
//        Quit the browser
		
		
		setUp();
		//implicit wait
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//get the username and password in Configuration file and send it their boxes 
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		Thread.sleep(3000);
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		Thread.sleep(3000);
		
		//log In Button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		//PIM button
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		Thread.sleep(3000);
		
		//Click on Add Employee
		driver.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(3000);
		
		WebDriverWait nameBoxWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		nameBoxWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name-box")));
		
		//Lets send Employee Data
		driver.findElement(By.id("first-name-box")).sendKeys("Name");
		driver.findElement(By.id("last-name-box")).sendKeys("LastName");
		
		
		WebElement selDD = driver.findElement(By.id("location"));
		Select select = new Select(selDD);
		select.selectByVisibleText("Texas R&D");
		
		WebDriverWait saveButtonWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		saveButtonWait.until(ExpectedConditions.elementToBeClickable(By.id("modal-save-button")));
		driver.findElement(By.id("modal-save-button")).click();
		Thread.sleep(5000);
		
		//Lets use FluentWait
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver);
		fluentWait.withTimeout(Duration.ofSeconds(10));
		fluentWait.pollingEvery(Duration.ofSeconds(2));
		
		fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("personal_details_tab")));
		
		//Lets Log Out now
		driver.findElement(By.id("account-job")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		
		
		tearDown();
		
		
	}

}
