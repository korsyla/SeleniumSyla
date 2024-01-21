package com.neotech.review04;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;
import com.neotech.utilities.CommonMethods;

public class UploadExample extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

//		https://neotech.vercel.app/fileUpload
		
		setUp();
		wait(1);
		
		String filePath = System.getProperty("user.dir") + "/screenshots/FACEBOOK/facebookSection.png";
		
		driver.findElement(By.id("image_file")).sendKeys(filePath);
		wait(2);
		driver.findElement(By.id("btnUpload")).click();
		
		//Lets wait for the div with class "ContactUs" to be visible
		WebElement fileText =  waitForVisability(driver.findElement(By.id("upload_response")));
		System.out.println(fileText.getText());
		
		String expectedMessage = "File uploaded successfully!";
		String actualMessage = driver.findElement(By.id("upload_response")).getText();
		
		String destinationPath = "screenshots";
		if(actualMessage.contains(expectedMessage)) 
		{
			//Test Passed
			destinationPath = destinationPath + "/FACEBOOK/upload.png";
		}
		else 
		{
			//Test Failed
			destinationPath = destinationPath + "/FACEBOOK/upload.png";
		}
		
		TakesScreenshot ts = (TakesScreenshot) driver.findElement(By.xpath("//div[@class='MuiBox-root css-0']"));
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(destinationPath);
		
		try 
		{
			Files.copy(source, destination);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		wait(3);
		
		
		
		
		tearDown();

		
	}

}
