package com.neotech.lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utilities.CommonMethods;

public class WaitExcplicitTest extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		
		setUp();
		
		WebDriverWait wait = getWaitObject();
		waitForVisability(driver.findElement(By.id("button1")));
		
		wait(3);
		
		
		tearDown();
		
		
	}

}
