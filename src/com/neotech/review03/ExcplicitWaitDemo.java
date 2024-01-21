package com.neotech.review03;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utilities.BaseClass;

public class ExcplicitWaitDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

//		https://demo.seleniumeasy.com/jquery-download-progress-bar-demo.html
		
		setUp();
//		Thread.sleep(3000);
////////////////////////////////////////////////////////////////////////////		
//		IMPLICIT WAY
//		Implicit WAY -> usually done right after driver creating if used
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		
//		driver.findElement(By.id("downloadButton")).click();
//		
//		driver.findElement(By.xpath("//div[text()='Complete!']"));
////////////////////////////////////////////////////////////////////////////	
		
////////////////////////////////////////////////////////////////////////////		
//		//EXPLICIT WAY
//		driver.findElement(By.id("downloadButton")).click();
//		Thread.sleep(3000);
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//		//WAIT until element is visible by maximum of 15 seconds!!
//		//If element is found even in 2-3 seconds it will be executed 
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Complete!']")));
//		
//		WebElement completeText = driver.findElement(By.xpath("//div[text()='Complete!']"));
//		System.out.println("The complete text is -> " + completeText.getText());
////////////////////////////////////////////////////////////////////////////
		
		//FLUENTWAIT
		
		driver.findElement(By.id("downloadButton")).click();
		
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver);
		fluentWait.withTimeout(Duration.ofSeconds(15)); //maximum wait is 15 seconds
		fluentWait.pollingEvery(Duration.ofSeconds(2)); //Try every 2 seconds
		fluentWait.ignoring(NoSuchElementException.class); //IGNORE this EXCEPTION
		
		fluentWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Close']")));
		
		//Now We know that the close button is clickable
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		
		Thread.sleep(3000);
		tearDown();
		
		
		
	}

}
