package com.neotech.review03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.BaseClass;

public class PrintTableData extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		// Go to https://the-internet.herokuapp.com/tables
		// I want you to print all the data from the tbody of the second table
		// Create the path dynamically
		// Don't print the last column
		
		setUp();
		Thread.sleep(2000);
		
		//We want to print all the data from the second table
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table2']/tbody/tr"));
		System.out.println("The amount of rows are -> " +  rows.size());
		
		//We only need the amount of COLUMNS for the FIRST because when we iterrate in a LOOP its going to apply for every ROW
		//VERYYYY IMPORTANTTTTT !!!!!!!!!!!! Only the amount of columns for 1st ROW to iterate in a LOOP which applies to all ROWS 
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='table2']/tbody/tr[1]/td"));
		System.out.println("The amount of first row columns are -> " + cols.size());
		
		System.out.println("----------------------------------------");
		
		for(int row = 1; row<=rows.size(); row++)  //Iterating the ROWS
		{
			for(int col = 1; col<cols.size(); col++) // We skipping the last COLUMN
			{
				//Iterating the columns
				WebElement everyCell = driver.findElement(By.xpath("//table[@id='table2']/tbody/tr["+ row +"]/td["+ col +"]"));
				System.out.print(everyCell.getText() + " | ");
			}
			System.out.println();
		}
		
		
		Thread.sleep(3000);
		tearDown();
		
		
	}

}
