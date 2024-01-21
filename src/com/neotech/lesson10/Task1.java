package com.neotech.lesson10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.BaseClass;
import com.neotech.utilities.ConfigsReader;

public class Task1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

//		TC 1: Disciplinary Cases Search Validation
//
//		Open chrome browser
//		Go to https://hrm.neotechacademy.com/
//		Login into the application
//		Select Discipline
//		Select Disciplinary Cases
//		Click on Filter (Up-Right next to Help)
//		Select from June 6, 2023 to July 15, 2023
//		Click on Search
//		Validate that there are no rows in result table
//		Quit the browser
		
		
		setUp();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//login
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//span[text()='Discipline']")).click();
		driver.findElement(By.id("menu_discipline_viewDisciplinaryCases")).click();
		
		//Notice we have a iFrame, so we have to move into the FRAME -> Switch to frame with ID
		driver.switchTo().frame("noncoreIframe");
		
		//We switched to IFrame, not lets click on the Filter Element
		driver.findElement(By.id("searchModal")).click();
		Thread.sleep(2000);
		
		
		
		//Click on on the First  Calendar!!!!!!!!!!!!!!!
		
		driver.findElement(By.id("DisciplinaryCaseSearch_createdDateFrom")).click();
		Thread.sleep(2000);
		
		//Select the month Select July
		driver.findElement(By.xpath("//div[@id='DisciplinaryCaseSearch_createdDateFrom_root']//input")).click();
		Thread.sleep(2000);
		//click on July
		driver.findElement(By.xpath("//div[@id='DisciplinaryCaseSearch_createdDateFrom_root']//li/span[text()='July']")).click();
		
		List<WebElement> julyDates = driver.findElements
				(By.xpath("//table[@id='DisciplinaryCaseSearch_createdDateFrom_table']//tbody/tr/td"));
		
		for(WebElement date : julyDates) 
		{
			if(date.getText().equals("5"))
			{
				date.click();
				break;
			}
		}
		Thread.sleep(3000);
		
		
		
		//LETS CLICK ON THE OTHER CALENDAR!!!!!!!!!!!!!!!!
		
		driver.findElement(By.id("DisciplinaryCaseSearch_createdDateTo")).click();
		Thread.sleep(2000);
		
		//Click on the month
		driver.findElement(By.xpath("//div[@id='DisciplinaryCaseSearch_createdDateTo_root']//input[1]")).click();
		Thread.sleep(2000);
		
		//Click on August
		driver.findElement(By.xpath("//div[@id='DisciplinaryCaseSearch_createdDateTo_root']//ul/li/span[text()='August']")).click();
		
		//Dates of August in a LIST
		List<WebElement> augustDates = driver.findElements(By.xpath("//table[@id='DisciplinaryCaseSearch_createdDateTo_table']//tbody/tr/td"));
		
		for(WebElement date : augustDates) 
		{
			if(date.getText().equals("5")) 
			{
				date.click();
				break;
			}
		}
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("searchBtn")).click();
		
	
		
		Thread.sleep(5000);
		tearDown();
		
		
		
		
	}

}
