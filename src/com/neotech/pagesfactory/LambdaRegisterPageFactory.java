package com.neotech.pagesfactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utilities.BaseClass;

public class LambdaRegisterPageFactory {

	
	@FindBy(xpath = "//form[@class='form reg-custom']/div[2]/div/input")
	public WebElement passwordBox;
	
	@FindBy(xpath = "//input[@id='userpassword']/following-sibling::div/span")
	public WebElement show;
	
	@FindBy(xpath = "//input[@id='userpassword']/../../preceding-sibling::div/input")
	public WebElement emailBox;
	
	
	//Here we are initializing all the elements from THIS page/class
	public LambdaRegisterPageFactory() 
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
}
