package com.neotech.review05;

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
		// https://neotech.vercel.app/fileUpload

		setUp();

		String filePath = "/Users/limanaj/Downloads/Ensar.png"; //This is not in my filepath

		WebElement filePathInput = driver.findElement(By.id("image_file"));
		filePathInput.sendKeys(filePath);
		wait(2);

		WebElement upload = driver.findElement(By.xpath("//input[@id='image_file']/following-sibling::span"));
		upload.click();
		wait(1);

		String expectedText = "File uploaded successfully!";

		waitForVisability(driver.findElement(By.cssSelector("div.ContactUs")));
		String actualText = driver.findElement(By.cssSelector("div.ContactUs")).getText();

		String destination = "screenshots";
		if (actualText.equals(expectedText)) {
			destination += "/passed/image.png";
		} else {
			destination += "/failed/image.png";
		}

		TakesScreenshot ts = (TakesScreenshot) driver.findElement(By.className("css-0"));
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(destination);

		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}

		wait(1);

		tearDown();

	}

}
