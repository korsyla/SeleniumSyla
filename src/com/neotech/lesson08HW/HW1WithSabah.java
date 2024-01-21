package com.neotech.lesson08HW;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utilities.BaseClass;

public class HW1WithSabah extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

//		Homework 1: Use WebDriverWait
//      Verify element is enabled
//      Open chrome browser
		
//      Go to "https://the-internet.herokuapp.com/"
//      Click on the "Dynamic Controls" link
//      Click on enable button
//      Enter "Hello" and verify text is entered successfully
//      Close the browser
		
		setUp();
		//Implicit way -> we declare it once and will be applied to every element
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Find Dynamic Controls
		driver.findElement(By.linkText("Dynamic Controls")).click();
		Thread.sleep(3000);
		//Click on Enable button 
		driver.findElement(By.xpath("//form[@id='input-example']/button")).click();
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id='input-example']/input")));
		WebElement textBox = driver.findElement(By.xpath("//form[@id='input-example']/input"));
		textBox.sendKeys("Name");
		Thread.sleep(3000);
		
		
		tearDown();
		
		
		
	}

}
