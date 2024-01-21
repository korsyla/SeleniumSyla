package com.neotech.lesson04HW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
	
	public final static String url = "https://demoqa.com/radio-button";
	

	public static void main(String[] args) throws InterruptedException {
//
//		Radio Button Practice  
//		Open chrome browser
//		Go to "https://demoqa.com/radio-button"
//		Verify if all radio buttons are displayed and clickable
//		Click on all radio buttons
//		Verify radio buttons has been clicked successfully
//		Quit browser
		//HomeWork#2
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
		List<WebElement> radioButtons = driver.
				findElements(By.xpath("//div[@class='custom-control custom-radio custom-control-inline']/label"));
		
		for(WebElement el : radioButtons) 
		{
			el.click();
			System.out.println("Is " + el.getText() + " button displyed ? " +   el.isDisplayed());
			Thread.sleep(2000);
		}
	
		System.out.println("------------------------------------");
		WebElement noButton = driver.findElement(By.xpath("//label[@for='noRadio']"));
		noButton.click();
		System.out.println("Is No Button Enabled ?? -> " + noButton.isEnabled()); // on the HTML it says Disabled
		System.out.println("Is No Button Selected?? -> " + noButton.isSelected());
		System.out.println("Is No Button Displayed?? -> " + noButton.isDisplayed());
		
		Thread.sleep(3000);
		driver.quit();
		
		
	
	}

}
