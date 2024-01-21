package com.neotech.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.BaseClass;

public class ImplicitWaitDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		//Implicit WAY
		//If element is not found, it will continue to wait for 30 seconds
		//After 30seconds, an exception is thrown
		//If the element is found before 30 seconds, the execution continues
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement spanElement = driver.findElement(By.xpath("//span[@id=\"button1\"]/p"));
		spanElement.click();
		Thread.sleep(5000);
		
		
		tearDown();
		
		
		
		
	}

}
