package com.neotech.lesson08HW;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.neotech.utilities.BaseClass;

public class HW2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
//		Homework 2: Same as Homework1 -> Use FluentWait
//      Verify element is enabled
		
//      Open chrome browser
//      Go to "https://the-internet.herokuapp.com/"
//      Click on the "Dynamic Controls" link
//      Click on enable button
//      Enter "Hello" and verify text is entered successfully
//      Close the browser
		
		setUp();
		
		WebElement dynamicControls = driver.findElement(By.xpath("//a[text()='Dynamic Controls']"));
		dynamicControls.click();
		Thread.sleep(3000);
		
		WebElement enableButton = driver.findElement(By.xpath("//button[text()='Enable']"));
		enableButton.click();
		Thread.sleep(3000);
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(2));
		wait.ignoring(NoSuchElementException.class);
		
		WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
		wait.until(ExpectedConditions.elementToBeClickable(textBox));
		Thread.sleep(3000);
		textBox.sendKeys("Hello");
		Thread.sleep(3000);
		
		System.out.println("Is there text Entered in the Text Box: -> " + textBox.isDisplayed());
		
		
		tearDown();
		

	}

}
