package com.neotech.review03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.BaseClass;

public class WebTableExample extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		// https://neotech.vercel.app/tables
		
		setUp();
		Thread.sleep(2000);
		
		//Find the number of ROWS
		List<WebElement> allRows = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("Number of rows is -> " + allRows.size());
		
		//Find number of COLUMNS in the first ROW
		List<WebElement> columns = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		System.out.println("Number of Columns on first ROW is -> " + columns.size());
		
		//Find the number of all CELLS in the Table
		List<WebElement> allCells = driver.findElements(By.xpath("//table/tbody/tr/td"));
		System.out.println("Number of all cells in the table is -> " + allCells.size());
		
		System.out.println("------------------------------------------");
		
		//If I was to print 1st row of the TABLE
		
		//1st WAY is STATIC WAY, getting the data from the first ROW
		List<WebElement> firstRow = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		for(WebElement cell : firstRow) 
		{
			System.out.print(cell.getText() + " | ");
		}
		System.out.println();
		System.out.println("----------------------------------");
		
		
		//2nd WAY is DYNAMIC way, getting the DATA from the 1st ROW
		
		for(int i = 1; i<=columns.size(); i++ ) 
		{
			String path = "//table/tbody/tr[1]/td["+ i +"]";
//			System.out.println("The path is -> " + path);
			
			WebElement cell = driver.findElement(By.xpath(path));
			System.out.print(cell.getText() + " | ");
		}
		System.out.println();
		System.out.println("----------------------------------");
		
		System.out.println("Lets Print all The Cells of all the ROWS");
		
		for(int row = 1; row<=allRows.size(); row++) 
		{
			for(int col = 1; col<=columns.size(); col++) 
			{
				WebElement cell = driver.findElement(By.xpath("//table/tbody/tr["+ row +"]/td["+ col +"]"));
				System.out.println(cell.getText());
				
			}
			System.out.println();
		}
		
		
		
		Thread.sleep(3000);
		tearDown();
		
		
		
		
	}

}
