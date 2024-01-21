package com.neotech.lesson06HW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utilities.BaseClass;

public class HW1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		
//		Homework 1:
//	        Amazon Department List Verification
//	        Open chrome browser
//	        Go to "http://amazon.com/"
//	        Verify how many department options available.
//	        Print each department 
//	        Select Computers
//	        Quit browser
		
		setUp();
		
		WebElement departmentDDButton = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		departmentDDButton.click();
		
		Select allOptionsDeprtment = new Select(departmentDDButton);
		System.out.println("The amount of all Department Options are... -> " + allOptionsDeprtment.getOptions().size());
		Thread.sleep(3000);
		
		System.out.println("-------------------------------------------------------------");
		
		List<WebElement> options = allOptionsDeprtment.getOptions();
		
		for(int i = 0; i<options.size(); i++) 
		{
//			allOptionsDeprtment.selectByIndex(i);
//			Thread.sleep(1000);
			System.out.println(options.get(i).getText());
		}
	
		allOptionsDeprtment.selectByValue("search-alias=computers");
	
		Thread.sleep(3000);
		
		tearDown();
		
		
		

		
	}

}
