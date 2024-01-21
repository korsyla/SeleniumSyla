package com.neotech.lesson04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllEbayLinks {
	
	public final static String url = "https://www.ebay.com";

	public static void main(String[] args) throws InterruptedException {

		// Go to "https://www.ebay.com"
		// Get All links on ebay and print the count of all links
		// Iterate all the links and print those that have text
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		//List<WebElement> allLinks = driver.findElements(By.xpath("//a")); 
		//OR
		
		//Here we got all the links and put them in variable allList LIST 
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		
		
		//Lets LOOP the LIST one by one
		
		int count = 0;
		for(WebElement link : allLinks) 
		{
			if(!link.getText().isEmpty()) // This means if link is not EMPTY with TEXT in it
			{
				System.out.println(link.getText());
				count++;
			}
		}
		
		
		System.out.println("The total numbers of links is -> " + allLinks.size());
		Thread.sleep(3000);
		
		System.out.println("The number of links with TEXT is -> " + count);
		
		Thread.sleep(3000);
		
		
		
		driver.quit();
		
		
		
		
	}

}
