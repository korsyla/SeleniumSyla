package com.neotech.lesson09;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.BaseClass;
import com.neotech.utilities.ConfigsReader;

public class DynamicTable extends BaseClass {

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
		
		for(int i = 0; i<rows.size(); i++)  //LOOP through ALL the ROWS
		{
			String rowText = rows.get(i).getText();
			System.out.println("Row Text -> " + rowText);
			
			//Our CONDITION is -> if ROW contains Linda, CLICK on that ROW
			
			if(rowText.contains(expected)) 
			{
				//1st WAY
				//If this condition is true, then Linda is found in row[i]
				//GET all the 2nd COLUMN values for all ROWS
				//The column I want to lcik on, is ELEMENT with index i
//				driver.findElements(By.xpath("//table[@id='employeeListTable']//td[2]")).get(i).click();
				
				
				//2nd WAY:
				//We can save the whole COLUMN LIST, and then get the SPECIFIC element to click on
				List<WebElement> firstColumn = driver.findElements(By.xpath("//table[@id='employeeListTable']//td[2]"));
				//We say index i because this will ONLYYY apply to LINDA not any other individual ,,,
				//Since we are in the contains(Linda) condition, will ONLYYYY apply to LINDA and NO ONE ELSE
				firstColumn.get(i).click();
				Thread.sleep(3000);
				
				System.out.println("Cliked on Index: " + i);
				
				//We use break; because once we find Linda we don't need to check anymore
				break;
				
			}
			
		}
		
		
		
		tearDown();
		
		

	}

}
