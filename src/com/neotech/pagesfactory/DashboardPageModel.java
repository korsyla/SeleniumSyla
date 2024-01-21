package com.neotech.pagesfactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.CommonMethods;

public class DashboardPageModel extends CommonMethods {
	
	//This is our Public Class Page Model with Public WebElements
	//We can call these in another Testing class when we create an object of the LoginPage Constructor Class
	
	public WebElement hrmLogo = driver.findElement(By.id("ohrm-small-logo"));
	
	public WebElement hrManagerName = driver.findElement(By.id("account-name"));
	

}
