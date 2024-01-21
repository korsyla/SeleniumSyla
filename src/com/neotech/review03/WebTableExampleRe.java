package com.neotech.review03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.BaseClass;

public class WebTableExampleRe extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		// https://neotech.vercel.app/tables
		
		setUp();
		Thread.sleep(2000);
		
		//Find AMOUNT of ROWS
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("Amount of rows is -> " + rows.size());
		
		//Find AMOUNT of COLUMNS in the FIRST row
		List<WebElement> columns = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		System.out.println("Amount of columns in first row is -> " + columns.size());
		
		//Find the AMOUNT of ALL CELLS in the TABLE
		List<WebElement> cells = driver.findElements(By.xpath("//table/tbody/tr/td"));
		System.out.println("Amount of Cells is -> " + cells.size());
		
		System.out.println("--------------------------------------");
		
		//Print the first ROW of the TABLE
		
		//1st way STATIC WAY - of getting the data from the 1st ROW
		List<WebElement> firstRowData = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		
		for(WebElement data : firstRowData) 
		{
			System.out.print(data.getText() + " | ");
		}
		System.out.println();
		
		System.out.println("--------------------------------------");
		
		
		//2nd Way, DYNAMIC WAY - of getting the data from the 1st ROW
		for(int i = 1; i<= columns.size(); i++) 
		{
//			driver.findElement(By.xpath("//table/tbody/tr[1]/td[" + i + "]"));
			
			String path = "//table/tbody/tr[1]/td[" + i + "]";
//			System.out.println(path);
			
			WebElement cell = driver.findElement(By.xpath(path));
			System.out.print(cell.getText() + " | ");
		}
		System.out.println();
		
		
		System.out.println("--------------------------------------");
		System.out.println("Lets print ALL the cells of all the ROWS");
		System.out.println("--------------------------------------");
		
		
		//LETS print all the Cells in DYNAMIC WAY
		
		for(int row = 1; row <= rows.size(); row++) //Iterating the ROWS
		{
			for(int col =1; col <= columns.size(); col++)  //Iterating the COLUMNS
			{
//				String path = "//table/tbody/tr["+ row +"]/td[" + col + "]";
//				System.out.println(path);
				
				// or we can give the XPATH -> //table/tbody/tr["+ row +"]/td[" + col + "].... instead of path
				WebElement cell = driver.findElement(By.xpath("//table/tbody/tr["+ row +"]/td[" + col + "]")); 
				System.out.println(cell.getText());
			}
			System.out.println();
		}
		
		
		
		
		Thread.sleep(2000);
		tearDown();
		
		
		
	}

}
