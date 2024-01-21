package com.neotech.lesson09HW;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.BaseClass;

public class HW1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
//
//		TC: Update Customer Information
//
//		1) Open chrome browser
//		2) Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
//		3) Login to the application
//		4) Verify customer "Susan McLaren" is present in the table
//		5) Click on customer details
//		6) Update customers last name and credit card info
//		7) Verify updated customers name and credit card number is displayed in table
//		8) Close browser
		
		//HOMEWORK1
		setUp();
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		Thread.sleep(2000);

		WebElement table = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody"));
		String expected = "Susan McLaren";
		String actual = table.getText();
		
		if(actual.contains(expected)) 
		{
			System.out.println(expected + " is in the table");
		}
		else 
		{
			System.out.println(expected + " is NOT in the table");
		}
		
		System.out.println("--------------------------------------------------");
		Thread.sleep(2000);
		
		WebElement customerDetails = driver.findElement(By.xpath("//table/tbody/tr[6]/td[13]/input"));
		customerDetails.click();
		
		WebElement lastName = driver.findElement(By.xpath("//input[@value='Susan McLaren']"));
		lastName.clear();
		Thread.sleep(2000);
		lastName.sendKeys("Susan MacAllister");
		
		driver.findElement(By.xpath("//input[@value='Visa']")).click();
		WebElement cardNumber = driver.findElement(By.xpath("//input[@value='999888777888']"));
		cardNumber.clear();
		Thread.sleep(2000);
		cardNumber.sendKeys("12345678910");
		Thread.sleep(2000);
		WebElement cardExpeire = driver.findElement(By.xpath("//input[@value='04/10']"));
		cardExpeire.clear();
		Thread.sleep(2000);
		cardExpeire.sendKeys("05/28");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Update")).click();
		
		WebElement updatedTable = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody"));
		
		String expLastName = "Susan MacAllister";
		String expCardNumber = "12345678910";
		String actuall = updatedTable.getText();
		
		if(actuall.contains(expLastName) && actuall.contains(expCardNumber)) 
		{
			System.out.println(expLastName + " with new card Number " + expCardNumber);
		}
		else 
		{
			System.out.println(expLastName + " and " + expCardNumber + " are NOT updated");
		}
	
		Thread.sleep(3000);
		tearDown();
		
		
	}

}
