package com.TakeScreenShorts;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShortsMethods {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
	/*	//1) to capture web page
		
		//TakesScreenshot object converting to WebDriver
		TakesScreenshot ss =(TakesScreenshot) driver;	
		
			
		//Setting path to download(we don't no where ist will store)
		File sourceFolder = ss.getScreenshotAs(OutputType.FILE);
		
		//Creating our won files path by creating folders
		File targetFolder = new File(System.getProperty("user.dir")+"\\ScreenShorts\\fullPage.png");
		
		
		
		//linking both source and target
		sourceFolder.renameTo(targetFolder);
	*/	
		
		
		//2) To Capturing group of elements	in webPage	
		//Xpath to locate all elements (maybe its in from tag)		
		WebElement findElement = driver.findElement(By.xpath("//div[@class='widget HTML' and @id='HTML12']"));
		
		//Here we are getting from the WebElement 
		File sourceFolder = findElement.getScreenshotAs(OutputType.FILE);
		
		//Creating our won files path by creating folders
		File targetFolder = new File(System.getProperty("user.dir")+"\\ScreenShorts\\particularData1.png");
				
		//linking both source and target
		sourceFolder.renameTo(targetFolder);
		
		
		//3) To Capturing particular elements in webPage
		
		/*
		 * WebElement findElement2 = driver.findElement(By.
		 * xpath("//div[@class=\"fauxborder-left header-fauxborder-left\"]")); File
		 * sourceFolder = findElement2.getScreenshotAs(OutputType.FILE);
		 * 
		 * File targetFolder = new
		 * File(System.getProperty("user.dir")+"\\ScreenShorts\\singleWebElemet.png");
		 * sourceFolder.renameTo(targetFolder);
		 * 
		 */
		
		
		
	}

}
