package com.neotech.lesson13HW;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.CommonMethods;

public class HW2 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {

//		Homework 2: Scroll Down Continuously
//		Open chrome browser
//		Go to "https://the-internet.herokuapp.com/"
//		Click on the "Infinite Scroll" link
//		Scroll down by 500 pixels 10 times
//		Wait 1 second between each scroll
//		Scroll into the view of tag h3 (Infinite Scroll)
//		Close the browser

		setUp();
		
		click(driver.findElement(By.linkText("Infinite Scroll"))); wait(2);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		for(int i = 0; i<=9; i++) 
		{
			js.executeScript("window.scrollBy(0, 500)");
			wait(1);
		}
		
		
		WebElement infiniteScroll = driver.findElement(By.xpath("//h3[text()='Infinite Scroll']"));
		System.out.println("The text of tag H3 is -> " + infiniteScroll.getText());
		
		js.executeScript("arguments[0].scrollIntoView(true)", infiniteScroll);
		wait(3);
		
		
		
		
		
		
		tearDown();
		
		
	}

}
