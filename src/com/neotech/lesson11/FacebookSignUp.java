package com.neotech.lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.CommonMethods;

public class FacebookSignUp extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

//		 * Facebook dropdown verification Open chrome browser Go to
//		 * https://www.facebook.com/r.php Verify: month dd has 12 month options day dd
//		 * has 31 day options year dd has 118 year options Select your date of birth
//		 * Quit browser
//		 */
		
		setUp();
		wait(2);
		
		//Find the Month, 1st we have to locate the element always
		WebElement month = driver.findElement(By.id("month"));
		selectDropdown(month, 4); //index 4 means the 5 ELEMENT in the WEBSITE
		
		wait(2);
		
		//1st LOCATE the day ELEMENT
		WebElement day = driver.findElement(By.id("day"));
		selectDropdown(day, "25");
		
		wait(2);
		
		WebElement year = driver.findElement(By.id("year"));
		selectDropdown(year, "2020");
		
		wait(2);
		
		
		tearDown();
		
		
	}

}
