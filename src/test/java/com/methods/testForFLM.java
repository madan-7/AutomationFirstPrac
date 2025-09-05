package com.methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testForFLM {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/login/");
		 WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 
		 //driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Iphone");
		//driver.findElement(By.id("email")).sendKeys("ReyazBahi");
		 
			/*
			 * driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Bhai");
			 * Thread.sleep(5000);
			 * 
			 * driver.findElement(By.id("u_0_4_ic")).click();
			 */
		 
		 
		  
		 
		 driver.findElement(By.xpath("//div[@class='_9lsa']/div")).click();
		   // System.out.println("Befor clicking: "+ selected.isSelected()); //false
		 
		 
			/*
			 * WebElement pass =
			 * driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
			 * "//input[@id='pass']"))); pass.sendKeys("123");
			 * 
			 * WebElement clickButton =
			 * driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(
			 * "//div[@class='_9lsa']"))); clickButton.click();
			 */
		   
		    //clicking the button here
		   // selected.click();
		 
		//driver.findElement(By.id("pass")).sendKeys("Reyaz@123");
		
		
	}

}
