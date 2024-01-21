package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.amazon.com/";
		
		driver.get(url);
		Thread.sleep(2000);
		
		//8 LOCATORS
		//id, name, className -> but class name is tricky, linkText, partialLinkText, tagName -> not preffered
		//xPath, CSSSelector -> are very strong to useee
		
		WebElement searchText =  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchText.sendKeys("Messi jersey");
		
		Thread.sleep(3000);
		
		WebElement searchButton =  driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchButton.click();
		Thread.sleep(2000);
		
		
		
		
		
		
		driver.quit();
		
		
		
	}

}
