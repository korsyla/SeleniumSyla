package com.neotech.lesson06HW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utilities.BaseClass;

public class HW3 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {

//		Homework 3:
//	        Open chrome browser
//	        Go to "https://semantic-ui.com/modules/dropdown.html"
//	        Scroll down to "Multiple Selection"
//	        Click on drop down and select "CSS" and "HTML"
//	        Verify value has been selected
//	        Deselect 1 of the options from the dropdown
//	        Quit browser
		
		
		setUp();
		Thread.sleep(3000);
		
		WebElement multipleSelDD = driver.findElement(By.xpath("//div[text()='Skills']"));
		multipleSelDD.click();
		Thread.sleep(3000);
		
		WebElement cssButton = driver.findElement(By.xpath("//div[@data-value='css']"));
		cssButton.click();
		Thread.sleep(2000);
		
		WebElement htmlButton = driver.findElement(By.xpath("//div[@data-value='html']"));
		htmlButton.click();
		Thread.sleep(3000);
		
		WebElement isCSSdisplayed = driver.findElement(By.xpath("//a[@data-value='css']"));
		System.out.println("Is CSS button displayed -> " + isCSSdisplayed.isDisplayed());
		
		WebElement isHTMLdisplayed = driver.findElement(By.xpath("//a[@data-value='html']"));
		System.out.println("Is HTML button displayed -> " + isHTMLdisplayed.isDisplayed());
		Thread.sleep(3000);

		WebElement deleteCSS = driver.findElement(By.xpath("//i[@class='delete icon']"));
		deleteCSS.click();
		Thread.sleep(3000);
//		tearDown();
		
		
		
		
	}

}


//Thread.sleep(3000);     
//WebElement multipleSelDD = driver.findElement(By.xpath("//div[@class='ui fluid dropdown selection multiple']"));
//multipleSelDD.click();
//Thread.sleep(2000);
//
//WebElement cssButton = driver.findElement(By.xpath("//div[@data-value='css']"));
//cssButton.click();
//Thread.sleep(2000);
//
//WebElement htmlButton = driver.findElement(By.xpath("//div[@data-value='html']"));
//htmlButton.click();
//
//Thread.sleep(3000);
