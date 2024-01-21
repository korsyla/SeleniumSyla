package com.neotech.lesson04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {
	
	public final static String url = "https://fs2.formsite.com/meherpavan/form2/index.html";

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		//SELECTING   RADIO-BUTTONS
		//We storing it in a VARIABlE than we use variable to click element Male Button
		WebElement maleRadioButton = driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-7_0']"));
		maleRadioButton.click();
		Thread.sleep(2000);
		
		//Or we can do METHOD CHAINING -> but only if its used ONCE
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		Thread.sleep(2000);
		
		
		//SELECTIONG CHECK-BOXES
		WebElement wedensdayCheckBox = driver.findElement(By.cssSelector("label[for='RESULT_CheckBox-8_3']"));
		wedensdayCheckBox.click();
		Thread.sleep(3000);
		
		
		//Selecting multiple Radio Buttons and Checkboxes all at ONCE
		//findElements will return a List of WebElements -> 9 in this case
		List<WebElement> elements = driver.findElements(By.xpath("//table[@class='inline_grid choices']/tbody/tr/td/label"));
		
		//Now lets click on each RadioButton and CheckBox with looping through the LIST
		
		for(WebElement el : elements) 
		{
			el.click();
			Thread.sleep(2000);
		}
		
		
		
		//Now lets click on Female/Saturday/Sunday with looping through the LIST
//		
//		for(WebElement el : elements) 
//		{
//			String text = el.getText();
//			
//			if(text.equals("Female")) 
//			{
//				el.click();
//			}
//			else if(text.equals("Saturday")) 
//			{
//				el.click();
//	
//			}
//			else if(text.equals("Sunday"))
//			{
//				el.click();
//			}
//			
//			Thread.sleep(1000);
//			
//		}
//		
		driver.quit();
		
		
		
		
		
	}

}
