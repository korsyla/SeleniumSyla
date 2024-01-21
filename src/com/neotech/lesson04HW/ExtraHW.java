package com.neotech.lesson04HW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtraHW {
	
	public final static String url = "https://demo.seleniumeasy.com/basic-checkbox-demo.html";

	public static void main(String[] args) throws InterruptedException {

		//Play with check boxes and radio buttons in these pages
		//https://demo.seleniumeasy.com/basic-checkbox-demo.html
	
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
//		List<WebElement> singleCheckBox =  driver.findElements(By.xpath("//div[@class='checkbox']/form/label/input"));
//		
//		for(WebElement el : singleCheckBox) 
//		{
//			el.click();
//			System.out.println("Is this Element Enabled ->?? " + el.isEnabled() );
//			System.out.println("Is this element Selected ->?? " + el.isSelected());
//		}
		
		
		//Other 4 CheckBoxes
//		List<WebElement> fourBoxes = driver.findElements(By.xpath("//div[@class='checkbox']/label/input"));
//		
//		for(WebElement el : fourBoxes) 
//		{
//			el.click();
//		}
//		
//		Thread.sleep(2000);
		
		WebElement checkAll = driver.findElement(By.xpath("//input[@id='check1']"));
		checkAll.click();
		Thread.sleep(3000);
		checkAll.click();
		Thread.sleep(3000);
		checkAll.click();
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
	}

}
