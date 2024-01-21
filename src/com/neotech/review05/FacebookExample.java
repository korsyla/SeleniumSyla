package com.neotech.review05;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookExample {

	final static String url = "https://www.facebook.com/";
	
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		// You can specify the version of Chrome Browser you want to use
		// options.setBrowserVersion();

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver(options);
		driver.get(url);

		Thread.sleep(1000);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		Thread.sleep(1000);

		driver.findElement(By.id("email")).sendKeys("yourEMAIL@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("yourPASSWORD");

		driver.findElement(By.name("login")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[text()='Neotech Smith']")).click();
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		for (int i = 1; i <= 15; i++) {
			js.executeScript("window.scrollBy(0, 300)");
			Thread.sleep(500);
		}

		Thread.sleep(2000);

		driver.quit();
		

		
	}

}
