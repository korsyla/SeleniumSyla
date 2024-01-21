package com.neotech.lesson12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.CommonMethods;

public class CalendarHW extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		// Extra practice
		// Go to this link:
		// https://demo.seleniumeasy.com/bootstrap-date-picker-demo.html

		// Select 22/01/2022 in the first Calendar

		// Select a range of dates in the -> Date Range Example :
		
		
		setUp();
		WebElement dateTextBox = driver.findElement(By.xpath("//input[@type='text']"));
		click(dateTextBox);
		
		String expectedMonthYear = "January 2022";
		
		//LETS LOCATE THE CORRECT MONTH AND YEAR -> January 2022
		while(true)  //This is infinite loop, so we need to have a condition to break; and it breaks the infinite loop
		{
			WebElement monthYear = driver.findElement(By.xpath("//div[1]/table/thead/tr[2]/th[2]"));
			String monthYearText= monthYear.getText();
			
			if(monthYearText.equals(expectedMonthYear)) 
			{
				break;
			}
			click(driver.findElement(By.xpath("//div[1]/table/thead/tr[2]/th[1]")));
		}
		
		wait(5);
		
		//Now we need to click on the correct DAY
		String expectedDay = "22";
		
		List<WebElement> days = driver.findElements(By.xpath("//table[@class='table-condensed']/tbody/tr/td"));
		
		//Iterate all days until I find find 22nd and than click on it
		for(WebElement day : days) 
		{
			if(day.getText().equals(expectedDay)) 
			{
				day.click();
				break;
			}
		}
		
		wait(3);
		

		
		//Lets Verify that we selected the correct date ->  22/01/2022
		
		String expectedDate = "22/01/2022";
		
		
		if(dateTextBox.getAttribute("value").equals(expectedDate)) 
		{
			System.out.println("Test Passed");
		}
		else 
		{
			System.out.println("Test Failed");
		}
		
		
		
		tearDown();
		
		
		
		
	}

}
