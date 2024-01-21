package com.neotech.lesson09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.BaseClass;

public class Task1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
//		Open chrome browser
//		Go to "https://www.techlistic.com/p/demo-selenium-practice.html"
//		Verify table contains "Financial Center".
//		Print name of all column headers
//		Print data of all rows
//		Quit Browser
		
		
		setUp();
		Thread.sleep(2000);
		
		WebElement table = driver.findElement(By.xpath("//table[@class='tsc_table_s13']"));
		
		String expected = "Financial Center";
		String actual = table.getText();
		
		if(actual.contains(expected)) 
		{
			System.out.println(expected + " is in the table");
		}
		else 
		{
			System.out.println(expected + " is not in the table");
		}
		
		System.out.println("----------- ALL COLUMN HEADERS ----------------");
		
		List<WebElement> headerData = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/thead/tr/th"));
		
		for(WebElement cell : headerData) 
		{
			System.out.print(cell.getText() + " | ");
		}
		System.out.println();
		
		
		System.out.println("----------- ALL ROW BODY HEADERS ----------------");
		
		List<WebElement> rowData = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));
		
		for(WebElement row : rowData) 
		{
			System.out.println(row.getText());
		}
		
		
		
		Thread.sleep(2000);
		tearDown();
		
		
	}

}
