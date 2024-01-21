package com.neotech.lesson09HW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.BaseClass;

public class HW2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

//		TC: Delete Orders
//
//		1) Open chrome browser
//		2) Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
//		3) Login to the application
//		4) Click on the checkbox of all orders with product FamilyAlbum
//		5) Delete Selected orders
//		6) Verify the orders have been deleted
//		7) Quit the browser
		
		
		setUp();
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		Thread.sleep(2000);
		
		String expected = "FamilyAlbum";
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
		System.out.println("The amount or rows is -> " + rows.size());
		
		for(int row = 1; row < rows.size(); row++) 
		{
			String rowText = rows.get(row).getText();
			System.out.println(row + " " + rowText);
			
			if(rowText.contains(expected))  //This IF-Statement will execute ONLY if it contains LINDA
			{
//				String path = "//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[3,7,9]/td[1]";
				WebElement checkBox = driver.findElement
						(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+ (row +1) +"]/td[1]"));
				checkBox.click();
				Thread.sleep(2000);
			}
		}
		
		System.out.println("----------------------------------------------------");
		driver.findElement(By.id("ctl00_MainContent_btnDelete")).click();
		String expectdProduct = "FamilyAlbum";
		
		List<WebElement> colProduct = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[3]"));
		System.out.println("Product column size is -> " + colProduct.size());
		
		System.out.println("----------------------------------------------------");
		
		for(WebElement column : colProduct) 
		{
			System.out.println("The product type is -> " + column.getText());
		}

		
		Thread.sleep(2000);
		tearDown();
		
		
		
		
	}

}
