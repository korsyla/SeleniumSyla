package com.neotech.lesson09HW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.BaseClass;

public class HW1WithSabah extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

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
		
		
		setUp();
		
		//login
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		Thread.sleep(2000);
		
		// Verify customer "Susan McLaren" is present in the table
		
		//2nd WAY-> Since we need to click on the records details, 
		//We will get the ROWS
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
		
//		int rowIndex = -1;
		
		for(int i = 1; i < rows.size(); i++ ) 
		{
			String rowText = rows.get(i).getText();
			System.out.println(rowText);
			
			if(rowText.contains("Susan McLaren"))
			{
				System.out.println("Susan hasbeen found!!!");
//				 rowIndex = i+1; //Reassigning ROWINDEX 
				//Now since shes been found lets click on Order Details
				
				//PATH to the Order Details Button 
				 //The only thing is we don't know, is the row number Susan will be cus ROW MIGHT CHANGE!!!
				////table[@id='ctl00_MainContent_orderGrid']/tbody/tr[6???????]/td[13]
				
				System.out.println("Finding element i ---> " + i);
				String path = "//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+ (i+1) +"]/td[13]";
				System.out.println("Path is -> " + path);
				driver.findElement(By.xpath(path)).click();
				break;
			}
		}
		
		
		//UPDATE Customer INFO
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
		
		
		//Verify that the NAME changed
		//This XPATH was build in exact same ROW where Susan is, but the info is in the columns with index 2
		String newName = driver.findElement
				(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[6]/td[2]")).getText();
		
		System.out.println("new name is -> " + newName);
		
		
		
		Thread.sleep(3000);
		tearDown();
		
		
		
	}

}
