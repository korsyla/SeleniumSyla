package com.neotech.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utilities.BaseClass;

public class ExplicitWayDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

//		http://webdriveruniversity.com/Ajax-Loader/index.html
		
		setUp();
		
		//Explicit WAY
		//We created an WebDriverWait object WAIT1, which we can call elements specifically and not on the DRIVE level like implicit does
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//We are defining a condition for which element to wait for up to 20 seconds
		//SPECIFIC ELEMENT ONLYYY!!!!!!
		wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@id='button1']/p"))));
		
		 WebElement clickMeButton = driver.findElement(By.xpath("//span[@id='button1']/p"));
		 System.out.println("is Span visible: -> " + clickMeButton.isDisplayed());
		
		
		Thread.sleep(3000);
		tearDown();

		
		
	}

}
