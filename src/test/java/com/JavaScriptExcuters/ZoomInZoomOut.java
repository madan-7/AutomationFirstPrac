package com.JavaScriptExcuters;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInZoomOut {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(5000);
		//maximize page
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//minimize page
	//	driver.manage().window().minimize();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//using JS we are handling page sizes
		
		js.executeScript("document.body.style.zomm='50%'"); //set zoom level 50%
		Thread.sleep(5000);
		js.executeScript("document.body.style.zoom='90%'"); //Set zoom level to 89%
		Thread.sleep(5000);
	}

}
