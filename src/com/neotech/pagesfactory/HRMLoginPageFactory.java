package com.neotech.pagesfactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utilities.BaseClass;

public class HRMLoginPageFactory {
	
	//This is for Homework 1: OrangeHRM Login
		//Navigate to https://hrm.neotechacademy.com/
	    //Login to the application by writing xpath based on "parent and child relation"
	
	@FindBy(xpath = "//form[@class='form-body']/div[1]/input")
	public WebElement usernameBox;
	
	@FindBy(xpath = "//form[@class='form-body']/div[2]/input")
	public WebElement passwordBox;
	
	@FindBy(xpath = "//form[@class='form-body']/div[3]/button")
	public WebElement loginBtn;
	
	
	//Here we are initializing all the elements from THIS page/class
	public HRMLoginPageFactory() 
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
	
	
	
	

}
