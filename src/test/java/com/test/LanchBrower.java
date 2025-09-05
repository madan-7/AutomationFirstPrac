package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LanchBrower {
	
	public static void main(String[] args) {
		
		
	WebDriver driver = new ChromeDriver();
	
	//loading driver
	
	driver.get("https://www.mycart.org/index.php");
	

	/*
	 * WebElement findElement = driver.findElement(By.id("query"));
	 * 
	 * findElement.sendKeys("Selenium");
	 */
		
	//entering for searching key
	//	driver.findElement(By.name("search")).sendKeys("Spring");
		//driver.quit();
	
	//Clicking on link text
	//	driver.findElement(By.linkText("Contact Us")).click();
	
	List<WebElement> findElements = driver.findElements(By.className("nav navbar-nav"));
	System.out.println(findElements.size());
	
	}

}
