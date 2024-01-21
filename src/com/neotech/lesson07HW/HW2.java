package com.neotech.lesson07HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utilities.BaseClass;

public class HW2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

//		=================   HW_2_Handling Frames =================================
//		1) Launch the browser and open the site "https://chercher.tech/practice/frames-example-selenium-webdriver"
//		2) Verify on the page header "Not a Friendly Topic" displayed
//		3) Click on the Inner Frame Check box
//		4) Choose baby Cat from Animals dropdown
//		5) Quit the browser
		
		
		setUp();
		Thread.sleep(2000);
		System.out.println("Title of the MAIN PAGE is -> " +  driver.getTitle());
		
		String topicPageHeader = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
		System.out.println("The topic Page Header displays: -> " + topicPageHeader);
		
		WebElement topicMainFrame = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(topicMainFrame);  //HERE we switched to the MAIN FRAME
		
		driver.switchTo().frame("frame3");  //Here we switch to the INNER/CHILD FRAME
		WebElement innerCheckBox = driver.findElement(By.xpath("//input[@id='a']"));
		innerCheckBox.click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		driver.switchTo().frame("frame2");
		
//		Select animalSel = new Select(driver.findElement(By.id("animals")));
//		animalSel.selectByValue("babycat");
//		OR in TWO STEPS
		WebElement selButton = driver.findElement(By.id("animals"));
		Select animalSelect = new Select(selButton);
		animalSelect.selectByValue("babycat");
		
		
		Thread.sleep(3000);
		tearDown();
		
		
		
	}

}
