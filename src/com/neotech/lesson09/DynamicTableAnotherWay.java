package com.neotech.lesson09;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.BaseClass;
import com.neotech.utilities.ConfigsReader;

public class DynamicTableAnotherWay extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

//		https://hrm.neotechacademy.com/
		
		setUp();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//LOGIN
		//get the username and password in Configuration file and send it their boxes 
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		Thread.sleep(3000);
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		Thread.sleep(3000);
				
		//log In Button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
				
		//PIM button
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		Thread.sleep(3000);
		//CLICK on Employee List
		driver.findElement(By.xpath("//span[text()='Employee List']")).click();
		Thread.sleep(2000);
		
		//Find all the ROWS that CONTAIN Linda
		//Get all the Texts of the ROWS, and if they contain LINDA than click on LINDA
		
		String expected = "Linda";
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='employeeListTable']/tbody/tr"));
		
		
		for(int i = 0; i < rows.size(); i++) 
		{
			String rowText = rows.get(i).getText();
			System.out.println(i + " " + rowText);
			
			if(rowText.contains(expected)) 
			{
				//At this point, we know that Linda will be in record number i
				//Let us assume Linda is in the ROW with index i = 4 -> (4+1) -> from the table) 
				//Then we can buld this xpath //table[@id='employeeListTable']/tbody/tr[5]/td[1]
				
				String path = "//table[@id='employeeListTable']/tbody/tr["+(i+1)+ "]/td[1]";
				
				driver.findElement(By.xpath(path)).click();
				
				break;
				
			}
		}
		
		
		
		
		
		
		Thread.sleep(5000);
		tearDown();
		
		
		
	}

}
