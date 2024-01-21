package com.neotech.lesson10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.BaseClass;

public class CalendarDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

//		https://www.delta.com/
		
		setUp();
		Thread.sleep(2000);
		
		//First click on the Calendar
		driver.findElement(By.xpath("//div[@id='input_departureDate_1']")).click();
		
		
		//DEPARTURE MONTH!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		//locate the current Month Departure on The CALENDAR Header
		String departMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		
		
		//While Month is not April keep Looping through MONTHS!!!
		//We will see April on the Website when we get out of the LOOP
		while(!departMonth.equals("April"))  
		{
			//This is just clicking the NEXT ARROW ONLY, 
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			
			//This is Checking for the MONTH of DEPARTURE:
			//ONCE its April, We get out of the WHILE LOOP
			departMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		}
		
		
		//All the Days of April/May -> PATH
		List<WebElement> departDays = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));
		
		//Iterate what Specific Day We want
		for(WebElement day : departDays) 
		{
			String dayNum = day.getText();
			
			if(dayNum.equals("16")) 
			{
				//We Have to click on the day cus day is the Element and dayNum is a STRING
				day.click();
				break;
			}
		}
		
		
		
		//RETURNING MONTHHHH!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		//We will start from APRIL again to cover it just in case we want to return within April as well
		String returnMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		
		//While Month is not June keep Looping and clicking through MONTHS!!!
		//ONCE its June, We stop and get out of the WHILE LOOP
		while(!returnMonth.equals("June")) 
		{
			//This is just clicking the NEXT ARROW ONLY, 
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			
			//This is Checking for the MONTH of RETURN:
			//ONCE its June, We get out of the WHILE LOOP
			returnMonth = driver.findElement(By.xpath("//span[@class=\"dl-datepicker-month-0\"]")).getText();
		}
		
		
		//At the end of this LOOP it will be June
		//Select 5th of JUNE
		
		//Since we're in June / These are all days for JUNE  ->  //table[@class='dl-datepicker-calendar']/tbody/tr/td
		List<WebElement> returnDays = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));
															
		for(WebElement day : returnDays) 
		{
			String dayNum = day.getText();
			if(dayNum.equals("5")) 
			{
				day.click();
				break;
			}
		}
		
		
		
		//CLICK on the DONE Button
		driver.findElement(By.xpath("//button[@value='done']")).click();
		
		
		Thread.sleep(2000);
		tearDown();
		
		
		
	}

}
