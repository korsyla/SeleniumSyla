package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxes {

	public final static String url = "https://fs2.formsite.com/meherpavan/form2/index.html";
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//1st way -> ONE LINE, locate element and send keys in one line 
		//Locating elemtn multiple times
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']")).sendKeys("Student");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']")).sendKeys("student2");
		Thread.sleep(2000);
		
		//2nd way, CODE REDUNDENCY, and RE-USABILITY
		// This way is better, to store it in a VARIABLE
		WebElement phone =  driver.findElement(By.cssSelector("input#RESULT_TextField-3"));
		phone.sendKeys("111-222-3333");
		Thread.sleep(2000);
		phone.clear();
		
		phone.sendKeys("111-111-1111");
		Thread.sleep(3000);
		
		//Getting the value of the Attribute
		String size = phone.getAttribute("size");
		System.out.println("The value of maxlength is -> " + size);
		
		WebElement country = driver.findElement(By.name("RESULT_TextField-4"));
		String countryClass = country.getAttribute("class");
		System.out.println("The class attribute of country WebElement is -> " + countryClass);
		Thread.sleep(3000);
		
		
		
		//Getting the Text of page Header Volunteer Sign Up inside the WebElement
		String headerText = driver.findElement(By.xpath("//h1[text()='Volunteer Sign Up']")).getText();
		System.out.println("The header text is -> " + headerText);
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
