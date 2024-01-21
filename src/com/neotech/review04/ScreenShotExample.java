package com.neotech.review04;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;
import com.neotech.utilities.CommonMethods;

public class ScreenShotExample extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		// https://www.facebook.com/
		
		setUp();
		wait(2);
		
		//Taking the screenshot of the whole page
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("screenshots/FACEBOOK/FacebookLogin.png");
		
		try 
		{
			Files.copy(source, destination);
		} 
		catch (IOException e) {
			System.out.println("Could not save the screenshot!");
			e.printStackTrace();
		}
		
		System.out.println("----------------------------------------------------------------------");
		
		
		//Taking the screenshot of a WebElement [form]
		WebElement facebookSection = driver.findElement(By.xpath("//form[@data-testid =  'royal_login_form']"));
		
		TakesScreenshot ts2 = (TakesScreenshot)facebookSection;
		File source2 = ts2.getScreenshotAs(OutputType.FILE);
		File destination2 = new File("screenshots/FACEBOOK/facebookSection.png");
		
		try 
		{
			Files.copy(source2, destination2);
		} 
		catch (IOException e) {
			System.out.println("Could not save the screenshot!");
			e.printStackTrace();
		}
		
		wait(2);
		
		
		
		
		
		tearDown();
		
		
		
		
	}

}
