package com.neotech.pagesfactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utilities.BaseClass;



public class FileUploadPageElements {

	// Without Page Factory
	// public WebElement filePathInput = driver.findElement(By.id("image_file"));

	// With Page Factory
	@FindBy(id = "image_file")
	public WebElement filePathInput;

	@FindBy(xpath = "//input[@id='image_file']/following-sibling::span")
	public WebElement uploadBtn;

	@FindBy(css = "div.ContactUs")
	public WebElement contactDiv;

	@FindBy(className = "css-0")
	public WebElement screenshotDiv;

	public FileUploadPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
