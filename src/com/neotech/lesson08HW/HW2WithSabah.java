package com.neotech.lesson08HW;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.neotech.utilities.BaseClass;

public class HW2WithSabah extends BaseClass {

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
		
		//Implicit way -> we declare it once and will be applied to every element
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
		//Find Dynamic Controls
		driver.findElement(By.linkText("Dynamic Controls")).click();
		Thread.sleep(3000);
		//Click on Enable button 
		driver.findElement(By.xpath("//form[@id='input-example']/button")).click();
		Thread.sleep(3000);
		
		//FluentWait
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver);
		fluentWait.withTimeout(Duration.ofSeconds(10));
		fluentWait.pollingEvery(Duration.ofSeconds(2));
		fluentWait.ignoring(NoSuchElementException.class);
		
		WebElement textBox = driver.findElement(By.xpath("//form[@id='input-example']/input"));
		fluentWait.until(ExpectedConditions.elementToBeClickable(textBox));
		textBox.sendKeys("hello");
		Thread.sleep(5000);
		
		
		tearDown();
		
		
	}

}
