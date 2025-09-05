package com.HandlingAlerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Here we are locating the frame bez webdriver don't have access to locate frames
	  WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	  
		//Switching to frames by locating above xpath
		driver.switchTo().frame(frame1);		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Frame1");
		
		//Again moving to default/starting point		
		driver.switchTo().defaultContent();
		
		
		//Here we are locating the frame2
		  WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		  
			//Switching to frames by locating above xpath
			driver.switchTo().frame(frame2);		
			driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Frame2");
			
			//Again moving to default/starting point		
			driver.switchTo().defaultContent();
			
			//Here we are locating the frame3 
			  WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
			  
				//Switching to frames by locating above xpath
				driver.switchTo().frame(frame3);		
				driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("frame3");
				
				//locating the nested frame's (click on iframe URL and take xpath)
				driver.switchTo().frame(0);
			    driver.findElement(By.xpath("//div[@id='i6']//div[@class='AB7Lab Id5V1']")).click(); 
				
			  //Again moving to default/starting point		
				driver.switchTo().defaultContent();
				
				
				//Here we are locating the frame5
				  WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
				  
					//Switching to frames by locating above xpath
					driver.switchTo().frame(frame5);		
					driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Frame5");
										
		
		
	}

}
