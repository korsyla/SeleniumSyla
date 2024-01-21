package com.neotech.review02;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.BaseClass;


public class AlertDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		//https://nxtgenaiacademy.com/alertandpopup/
		
		setUp();
		
		
		
		Thread.sleep(2000);
		
		WebElement confirmAlertBox = driver.findElement(By.name("confirmalertbox"));
		confirmAlertBox.click();
		Thread.sleep(2000);
		
		//When an ALERT is open, we cannot interact with ANYTHING in the main page 
		//driver.findElement(By.name("promptalertbox1234")).click();
		
		//We FIRST need to take care of the ALERT or (JavaScript Pop-Up)
		Alert confirmAlert = driver.switchTo().alert();
		Thread.sleep(2000);
		
		System.out.println("The text of alert is -> " + confirmAlert.getText());
		Thread.sleep(2000);
		
		//Deal with Alert by Accept or Dismiss 1st
	//	dealWithAlert.dismiss();   OR .accept
		confirmAlert.accept();
		Thread.sleep(2000);
		
		//After we Accept/Cancel the ALERT, than after we can deal with the Main Page
		driver.findElement(By.name("promptalertbox1234")).click();
		Thread.sleep(2000);
		
		Alert promtAlert = driver.switchTo().alert();
		promtAlert.sendKeys("Yes");
		promtAlert.accept();
		
		//Click on Alert BOX
		WebElement alBox = driver.findElement(By.name("alertbox"));
		alBox.click();
		Thread.sleep(2000);
		
		//Lets take care of the Alert BOX Alert
		Alert alertBox = driver.switchTo().alert();
		System.out.println("Alert box Alert TEXT is -> " + alertBox.getText());
		alertBox.accept();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("promptalertbox1234")).click();
		
		Alert promtAlertBox = driver.switchTo().alert();
		promtAlertBox.sendKeys("No");
		promtAlertBox.accept();
		
		Thread.sleep(2000);
		
		
		tearDown();
			
		
		
		
		
	}

}
