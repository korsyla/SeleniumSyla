package com.neotech.lesson09;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.BaseClass;

public class WebTableDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
//		https://demo.seleniumeasy.com/table-search-filter-demo.html
		
		setUp();
		
		System.out.println(" ------------- TABLE HEADER -----------------");
		
		 List<WebElement> headerData = driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
		 
		 Iterator<WebElement> itHeader =  headerData.iterator();
		 
		 while(itHeader.hasNext()) 
		 {
			String headerText = itHeader.next().getText();
			System.out.print(headerText + " | ");
		 }
		 System.out.println();
		 
		 System.out.println("-----------------------------------------------");
		 
		 
		 //We can get the number of ROWS on the WebTable
		 List<WebElement> rows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
		 System.out.println("The amount of rows on the table is -> " + rows.size());
		 
		 System.out.println(" ------------- TABLE BODY -----------------");
		
		 List<WebElement> rowData = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td"));
		 
		 for(WebElement rowCellData : rowData) 
		 {
			 System.out.println(rowCellData.getText());
		 }
		 System.out.println();
		 
		 
		 
		 
		
		
		tearDown();
		
		
		
	}

}
