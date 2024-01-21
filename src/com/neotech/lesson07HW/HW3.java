package com.neotech.lesson07HW;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utilities.BaseClass;

public class HW3 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

//		================== HW_3 Overall Practice of WebElements and handling Windows, Alerts ======
//	1) Launch the browser and open the site "https://www.tutorialspoint.com/selenium/selenium_automation_practice"
//	2) Fill in the all text boxes, Choose your preferred radio button, check box and drop down option 
//	   EXCEPT Profile Picture (Dissmiss this Section)
//	3) Click on the Button and you will see an Alert pops up then click Ok
//	4) When user clicks on Ok new Window will open then get All window handles and get the size and Quit all of them
		
		
		//Homework3
		setUp();
		Thread.sleep(2000);
		WebElement fName = driver.findElement(By.name("firstname"));
		fName.sendKeys("Trent");
		Thread.sleep(2000);
		WebElement lName = driver.findElement(By.name("lastname"));
		lName.sendKeys("Alexander-Arnold");
		Thread.sleep(2000);
		driver.findElement(By.name("sex")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("exp")).click();
		Thread.sleep(2000);
		WebElement date = driver.findElement(By.xpath("//div[@class='table-wrapper']//tr[5]//td[2]/input"));
		date.click();
		date.sendKeys("09/13/2023");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Selenium Webdriver']")).click();
		Thread.sleep(2000);
		
		WebElement allContinents = driver.findElement(By.xpath("//select[@name='continents']"));
		Select selContinent = new Select(allContinents);
		selContinent.selectByVisibleText("Europe");
		
		WebElement allCommands = driver.findElement(By.xpath("//select[@name='selenium_commands']"));
		Select selCommand = new Select(allCommands);
		selCommand.selectByVisibleText("Navigation Commands");
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		Thread.sleep(2000);
		
		Alert alertButton = driver.switchTo().alert();
		alertButton.accept();
		Thread.sleep(2000);
		
		System.out.println("The title of crruent WINDOW is -> " + driver.getTitle());
	
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println("The size of all Window handles/ID's is -> " + allWindowHandles.size());
		
		Iterator<String> it = allWindowHandles.iterator();
		String window1 = it.next(); //This gives us the 1st element in the SET Collection
		String window2 = it.next();  //This gives us the 2nd element in the SET Collection
		
		System.out.println("Window1's Handle/ID is -> " + window1);
		System.out.println("Window2's Handle/ID is -> " + window2);
		
		Thread.sleep(3000);
		tearDown();
		
//		for(String windowHandle : allWindowHandles) 
//		{
//			System.out.println(" The window hanadle ID is -> " + windowHandle);
//			Thread.sleep(2000);
//		}
		
		
		
		Thread.sleep(3000);
		tearDown();
		
		
		
		
	}

}
