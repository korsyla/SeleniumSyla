package com.neotech.pagesfactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utilities.BaseClass;

public class DashboardPageUsingFactory {
	
	@FindBy(id = "ohrm-small-logo")   //public WebElement hrmLogo = driver.findElement(By.id("ohrm-small-logo"));
	public WebElement hrmLogo;
	
	@FindBy(id = "account-name")     //public WebElement hrManagerName = driver.findElement(By.id("account-name"));
	public WebElement hrManagrName;
	
	
	//This is my Constructor 
	//This means when we create an object BaseClass.driver will be the driver we will use
	//this -> means we are going to use the driver for everything in THIS class, all the WebElements etc
	public DashboardPageUsingFactory() 
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	

}

