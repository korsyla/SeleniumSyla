package com.neotech.pagesfactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utilities.BaseClass;

public class HRMLoginPageFactory2 {
	
//	Homework 2: OrangeHRM Login
//    Navigate to https://hrm.neotechacademy.com/
//    Login to the application by writing xpath based on "following and preceding siblings"

	
	@FindBy(xpath = "//form[@class='form-body']/div[2]/input")
	public WebElement passwordBox;
	
	@FindBy(xpath = "//form[@class='form-body']/div[2]/following-sibling::div/button")
	public WebElement loginButton;
	
	@FindBy(xpath = "//form[@class='form-body']/div[2]/preceding-sibling::div/input")
	public WebElement usernameBox;
	
	
	//This is for initializing all the elements in THIS class/page
	public HRMLoginPageFactory2() 
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
}
