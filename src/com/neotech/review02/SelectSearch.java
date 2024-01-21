package com.neotech.review02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utilities.BaseClass;

public class SelectSearch extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		// Go to https://amazon.com
		// select books from the search dropdown
		// type Harry potter
		// and click on Search
		// check "Kindle Unlimited Eligible" checkbox on the left
		
		
		setUp();
		
		
		Thread.sleep(3000);
		//
		WebElement searchDDElement = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		//TO Create a Select Class -> the WebElement (searchDDElement)  HAS to be a SELECT or WITHING a SELECT
		Select selectDD = new Select(searchDDElement);
		
//		Print all the options of the DROP-DOWN
//		List<WebElement> allOptionsList = selectDD.getOptions();
//		for(WebElement option : allOptionsList) 
//		{
//			System.out.println(option.getText());
//		}
//		Thread.sleep(3000);
		
		//3 different ways to SELECT one drop down options
//		selectDD.selectByIndex(4);
//		Thread.sleep(3000);
//		selectDD.selectByValue("search-alias=electronics");
//		Thread.sleep(3000);
		selectDD.selectByVisibleText("Books");
		Thread.sleep(3000);
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.clear();
		searchBox.click();
		searchBox.sendKeys("Harry potter");
		
		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		searchButton.click();
		Thread.sleep(3000);
		
//		WebElement kindleBox = driver.findElement(By.xpath("//span[text()='Kindle Unlimited Eligible']"));
//		kindleBox.click();
//		Thread.sleep(2000);
//		
//		WebElement kindleBoxDeselct = driver.findElement(By.xpath("//span[text()='Kindle Unlimited Eligible']"));
//		kindleBoxDeselct.click();
		
		List<WebElement> elementList = driver.findElements(By.xpath("//li[@id='p_n_feature_twenty_browse-bin/13054657011']"));
//		List<WebElement> elementList = driver.findElements(By.xpath("//li[@class='a-spacing-micro']"));
		System.out.println("There are -> " + elementList.size() + " <- elements with that XPATH");
		
		for(WebElement el : elementList) 
		{
			String elementText = el.getText();
			if(elementText.equals("Kindle Unlimited Eligible")) 
			{
				el.click();
				break;
			}
		}
		
		
		Thread.sleep(3000);
		
	//	tearDown();
		
		
		
	}

}
