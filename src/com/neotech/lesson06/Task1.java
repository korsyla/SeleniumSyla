package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utilities.BaseClass;

public class Task1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * Facebook dropdown verification 
		 * Open chrome browser 
		 * Go to https://www.facebook.com/r.php Verify: 
		 * month dd has 12 month options 
		 * day dd has 31 day options 
		 * year dd has 118 year options 
		 * Select your date of birth
		 * Quit browser
		 */
		
		setUp();
		
		
		//1st Way
		//Create a WebElement for each
		//Create a select for each
		//Call the options for each
		
		
		//2nd WAY
		Select sMonth = new Select(driver.findElement(By.id("month")));
		Select sDay = new Select(driver.findElement(By.id("day")));
		Select sYear = new Select(driver.findElement(By.id("year")));
		
		//Here we are getting all the amount of Options in SIZE of  options DropDowns
		System.out.println("The number of options for YEAR is -> " + sYear.getOptions().size());
		System.out.println("The number of options for YEAR is -> " + sMonth.getOptions().size());
		System.out.println("The number of options for YEAR is -> " + sDay.getOptions().size());
		
		
		//Lets Select our Birthday NOW!!!!
		sYear.selectByVisibleText("1992");
		sMonth.selectByValue("11");
		sDay.selectByIndex(23);
		
		Thread.sleep(3000);
		
		
		tearDown();
		
		
		
		
	}

}
