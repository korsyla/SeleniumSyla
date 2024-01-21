package com.neotech.lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.CommonMethods;
import com.neotech.utilities.ConfigsReader;

public class LoginTest extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

//		https://hrm.neotechacademy.com/
		
		setUp();
		
		wait(3);
		
		//Send the username
		//1st we have to find the element from the website there is no escaping from that
		WebElement userNameBox = driver.findElement(By.id("txtUsername"));
		//This means,  In the usernameBox, send the username we have stored from Configuration.properties
		sendText(userNameBox, ConfigsReader.getProperty("username"));
		
		//Sending the password
		WebElement passwordBox = driver.findElement(By.id("txtPassword"));
		//In  the passwordBox, send the password we have stored from Configuration.properties
		sendText(passwordBox, ConfigsReader.getProperty("password"));
		
		wait(2);
		
		//click on the Login Button -> Remember, 1st we HAVE to locate the Button
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
		
		wait(4);
		
		//Lets validate login success by locating the LOGO after we signed in
		WebElement hrmLogoo = driver.findElement(By.id("ohrm-small-logo"));
		
		if(hrmLogoo.isDisplayed()) 
		{
			System.out.println("We are logged in!!");
		}
		else 
		{
			System.out.println("We are not logged in!!");
		}
		
		wait(3);
		
		
		tearDown();
		
		
		
	}

}
