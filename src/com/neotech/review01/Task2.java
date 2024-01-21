package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {

		// Go to https://demoqa.com/text-box
		// Fill the form and submit
		// Use xPath or CSS Selector
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		String url = "https://demoqa.com/text-box";
		driver.get(url);
		driver.findElement(By.cssSelector("input#userName")).sendKeys("Donald Trumph");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("dt@trumph.org");
		//Even though there are 2 elemtns we can use the 1st one as long as its selected to the correct element
		driver.findElement(By.cssSelector("textarea.form-control")).sendKeys("123 Marolago");
		
		//Finding an element using multiple attributes
		driver.findElement(By.cssSelector("textarea[class= 'form-control'][id='currentAddress']")).sendKeys("Towers");
		//XPATH likes this ->> //textarea[@class='form-control'][id='currentAddress']
		
		driver.findElement(By.cssSelector("button#submit")).click();
		
		
		
	}

}
