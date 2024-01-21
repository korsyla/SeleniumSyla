package com.neotech.pagesfactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utilities.BaseClass;

public class LoginPageUsingFactory { //Here we can also extend our BaseCalss and just leave driver in the constructor

	@FindBy(id = "txtUsername")    //	public WebElement username = driver.findElement(By.id("txtUsername"));
	public WebElement username;
	
	@FindBy(id = "txtPassword")    //	public WebElement password = driver.findElement(By.id("txtPassword"));
	public WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")  //	public WebElement logInButn = driver.findElement(By.xpath("//button[@type='submit']"));
	public WebElement loginButn;
	
	@FindBy(id = "txtPassword-error")
	public WebElement passEmptyError;
	
	@FindBy(id = "toast-container")
	public WebElement invalidCredentials;

	
	//This is my Constructor 
	//This means when we create an object BaseClass.driver will be the driver we will use
	//this -> means we are going to use the driver for everything in THIS class, all the WebElements etc
	public LoginPageUsingFactory() 
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
	
	}
