package com.neotech.lesson08HW;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utilities.BaseClass;

public class HW1 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
//		Homework 1: Use WebDriverWait
//        Verify element is enabled
//        Open chrome browser
		
//        Go to "https://the-internet.herokuapp.com/"
//        Click on the "Dynamic Controls" link
//        Click on enable button
//        Enter "Hello" and verify text is entered successfully
//        Close the browser
		
		setUp();
		
		WebElement dynamicControls = driver.findElement(By.linkText("Dynamic Controls"));
		dynamicControls.click();
		
		WebElement enableButton = driver.findElement(By.xpath("//button[text()='Enable']"));
		enableButton.click();
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));
		
		WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(3000);
		textBox.sendKeys("Hello");
		
		System.out.println("Is there text Entered in the Text Box: -> " + textBox.isDisplayed());
		
		
		Thread.sleep(5000);
		tearDown();
		
		
	}

}
