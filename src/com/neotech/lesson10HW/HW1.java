package com.neotech.lesson10HW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utilities.BaseClass;

public class HW1 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {

//		Homework: American Airlines Flight Search
//
//		Open chrome browser
//		Go to https://www.aa.com/homePage.do
//		Enter From and To
//		Select departure as December 14 of 2022
//		Select arrival as December 22 of 2022
//		Click on search
//		Close browser
		
		setUp();
		Thread.sleep(2000);
		
		//Get Depart from JFK
		
		driver.findElement(By.linkText("From airport look up")).click();
		Select selDDCountry = new Select(driver.findElement(By.id("countryCode")));
		selDDCountry.selectByVisibleText("United States");
		Select selDDState = new Select(driver.findElement(By.id("stateCode")));
		selDDState.selectByVisibleText("New York");
		Thread.sleep(2000);
		

		//Depart from JFK
		List<WebElement> airPortCode = driver.findElements(By.xpath("//div[@id='airportLookupDialog']//tbody/tr/td/a/span[1]"));
		
		for(WebElement code : airPortCode) 
		{
			if(code.getText().equals("JFK")) 
			{
				code.click();
			}
		}
		
		//Depart To NEWARK Liberty int'l
		
		driver.findElement(By.linkText("To airport look up")).click();
		Select selCountry = new Select(driver.findElement(By.id("countryCode")));
		selCountry.selectByValue("US");
		Select selState = new Select(driver.findElement(By.id("stateCode")));
		selState.selectByValue("NJ");
		Thread.sleep(3000);
		
		List<WebElement> jerseyAirCodes = driver.findElements(By.xpath("//table[@id='airportsSection']/tbody/tr/td[3]/a/span[1]"));
		
		for(WebElement code : jerseyAirCodes) 
		{
			if(code.getText().equals("EWR")) 
			{
				code.click();
			}
		} 
		
		
		//Click on Depart Calendar
		driver.findElement(By.xpath("//form[@id=\"reservationFlightSearchForm\"]//button[1]")).click();
		Thread.sleep(3000);
		
		
		//DEPART MONTH
		
		String departMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month'][1]")).getText();
		System.out.println(departMonth);
		
		
		while(!departMonth.equals("December")) 
		{
			driver.findElement(By.xpath("//a[@data-handler='next']")).click();
			
			departMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month'][1]")).getText();
		}
		
		
		List<WebElement> departDays = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//table/tbody/tr/td"));
		
		for(WebElement day : departDays) 
		{
			if(day.getText().equals("14")) 
			{
				day.click();
				break;
			}
		}
		Thread.sleep(3000);
		
		
		//Click on RETURN CALENDAR
		driver.findElement(By.xpath("//*[@id=\"reservationFlightSearchForm\"]/div[4]/div[2]/div/button")).click();
		
		//Return Month
		String returnMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month'][1]")).getText();
		
		while(!returnMonth.equals("December")) 
		{
			System.out.println("While we're not in December");
		}
		
		
		List<WebElement> returnDays = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//table/tbody/tr/td"));
		
		for(WebElement day : returnDays) 
		{
			if(day.getText().equals("22")) 
			{
				day.click();
				break;
			}
		}
		
		
//		WebElement searchButton = driver.findElement(By.id("flightSearchForm.button.reSubmit"));
//		searchButton.click();
		Thread.sleep(3000);
		
		
		Thread.sleep(3000);
//		tearDown();
		
		
	}

}
