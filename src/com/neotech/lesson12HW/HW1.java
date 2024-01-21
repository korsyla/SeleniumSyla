package com.neotech.lesson12HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utilities.CommonMethods;

public class HW1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

//		Homework 1:
//			Open chrome browser
//			Go to https://demo.guru99.com/test/drag_drop.html
//			Drag the following blocks in different ways
//			Drag BANK to DEBIT SIDE
//			Drag SALES to CREDIT SIDE
//			Drag 5000 to DEBIT SIDE
//			Drag 5000 to CREDIT SIDE
//			Close the browser
		
//		Homework 1:
		
		setUp();
		wait(2);
		
		Actions action = new Actions(driver);
		
		WebElement bankDrag = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement bankDrop = driver.findElement(By.id("bank"));
//		action.clickAndHold(bankDrag).moveToElement(bankDrop).release().perform();
		action.dragAndDrop(bankDrag, bankDrop).perform();
		wait(3);
		
		WebElement salesDrag = driver.findElement(By.id("credit1"));
		WebElement salesDrop = driver.findElement(By.xpath("//ol[@class='field15 ui-droppable ui-sortable']"));
//		action.dragAndDrop(salesDrag, salesDrop).perform();
		action.clickAndHold(salesDrag).moveToElement(salesDrop).release().perform();
		wait(3);
		
		WebElement amountDrag = driver.findElement(By.id("fourth"));
		WebElement debitDrop = driver.findElement(By.id("amt7"));
//		action.dragAndDrop(amountDrag, amountDrop).perform();
		action.clickAndHold(amountDrag).moveToElement(debitDrop).release().perform();
		wait(3);
		
		WebElement amountDrag2 = driver.findElement(By.id("fourth"));
		WebElement creditDrop = driver.findElement(By.id("amt8"));
//		action.clickAndHold(amountDrag2).moveToElement(creditDrop).release().perform();
		action.dragAndDrop(amountDrag2, creditDrop).perform();
		wait(5);
		
		tearDown();
		

		
		
	}

}
