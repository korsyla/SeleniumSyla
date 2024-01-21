package com.neotech.lesson08;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utilities.BaseClass;

public class FluentWaitDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {

		http://webdriveruniversity.com/Ajax-Loader/index.html
		
		setUp();
		
		//We may combine implicit and Fluent wait
		//This is the IMPLICIT Wait WAY
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//This is the Explicit Wait Way 
		//Using object to call element specifically
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(3));
		wait.ignoring(NoSuchElementException.class);
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='button1']/p")));
		
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@id='button1']/p"))));
		
		WebElement clickMeButton = driver.findElement(By.xpath("//span[@id='button1']/p"));
		System.out.println("is Span visible: -> " + clickMeButton.isDisplayed());
		
		
		Thread.sleep(3000);
		
		
		tearDown();
		
		
		
	}

}
