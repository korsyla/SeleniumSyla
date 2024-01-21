package com.neotech.review04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.CommonMethods;

public class CalendarHandling extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		// Go to this link: https://jqueryui.com/
		// Click on Datepicker from the left menu
		// Show the Calendar
		// Select 12/25/2023 from the Calendar
		// Verify that you have selected 12/25/2023
		
		setUp();
		
		wait(2);
		
		//1st WAY using Selenium Click method
//		driver.findElement(By.linkText("Datepicker")).click();
		wait(2);
		
		//2nd WAY, using CLICK() from COmmon Methods
		click(driver.findElement(By.linkText("Datepicker")));
		wait(2);
		
		//SwitchToFrame
		
		//1st WAY, using Selenium driver.switchTo().frame(0); INDEX/NAMEorID/WEbElement
//		driver.switchTo().frame(0);
		
		//2nd WAY, using switchToFrame() Methods from OUR Common Methods INDEX - OR-  WebElement by locating it or NameORID
		switchToFrame(0);
		
		//Locate and click on DATE Calendar box Element
		driver.findElement(By.id("datepicker")).click();
		wait(2);
		
		
		//Now that we clicked on Calendar 
		String expectedMonthYear = "December 2024";
		
		while(true)  //This is infinite loop, so we need to have a condition to break; and it breaks the infinite loop
		{
			WebElement monthyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
			String monthYearText = monthyear.getText();
			
			if(monthYearText.equals(expectedMonthYear)) 
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[text()='Next']")).click();
		}
		
		wait(2);
		
		//Now we need to click on the correct date
		String expectedDay = "25";
		List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		
		for(WebElement day : days) 
		{
			if(day.getText().equals(expectedDay)) 
			{
				day.click();
				break;
			}
		}
		wait(2);
		
		
		//Lets Verify that we selected the correct date -> 12/25/2024
		String expectedDate = "12/25/2024";
		WebElement dateTextBox = driver.findElement(By.id("datepicker"));
		
		if(dateTextBox.getAttribute("value").equals(expectedDate)) 
		{
			System.out.println("Test Passed!!!");
		}
		else 
		{
			System.out.println("Test Failed!!");
		}
		
		
		tearDown();
		
		
		// Extra practice
				// Go to this link:
				// https://demo.seleniumeasy.com/bootstrap-date-picker-demo.html

				// Select 22/01/2022 in the first Calendar

				// Select a range of dates in the -> Date Range Example :
		
	}

}
