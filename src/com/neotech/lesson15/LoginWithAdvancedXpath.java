package com.neotech.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.CommonMethods;
import com.neotech.utilities.ConfigsReader;

public class LoginWithAdvancedXpath extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		WebElement userName = driver.findElement(By.xpath("//div[@class='input-field'][1]/input"));
		sendText(userName, ConfigsReader.getProperty("username")); wait(1);
		
		WebElement password = driver.findElement(By.xpath("//div[@class='input-field'][1]/following-sibling::div/input"));
		sendText(password, ConfigsReader.getProperty("password")); wait(1);
		
		WebElement loginBtn = driver.findElement(By.xpath("//input[@id='txtPassword']/../following-sibling::div/button"));
//		 //input[@id='txtPassword']/../following-sibling::div/button");
		click(loginBtn); wait(2);
		
		
		
		tearDown();
		
		
	}

}
