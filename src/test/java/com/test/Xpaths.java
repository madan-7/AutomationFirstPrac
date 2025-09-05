package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths {

	
	public static void main(String[] args) {
		
		
		  WebDriver driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  String search = "T-Shirts";
		  
		  driver.get("https://demo.nopcommerce.com/");
		 
		
		//X path by Relative(Partial xpath) by single attribute
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys(search);
		
		//X path by Relative(Partial xpath) by single multiple attribute
		//driver.findElement(By.xpath("//input[@name='q'][@aria-label='Search store']")).sendKeys(search);
		
		//X path by Relative(Partial xpath) by 'and' operator
		//driver.findElement(By.xpath("//input[@name='q' and @aria-label='Search store']")).sendKeys(search);
		
		//X path by Relative(Partial xpath) by 'or' operator
		//driver.findElement(By.xpath("//input[@name='q' or @aria-label='search store']")).sendKeys(search);
		
		//X-Path with Text() -- Inner text
		//driver.findElement(By.xpath("//a[text()=' Electronics ']")).click();
	
		//X-Path with Text() --  text
	/*	boolean text = driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).isDisplayed();
		System.out.println(text);
		String out = driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).getText();
		System.out.println(out);
		
		if(out.equals("Welcome to our store")) {
			System.out.println("Test pass");
		}else
			System.out.println("Test failed");
			*/
		
		//X-path with contains()
		//driver.findElement(By.xpath("//input[contains(@placeholder, 'Sea')]")).sendKeys(search);
		
		//X-path with starts-with()
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys(search);
		
		//X-Path with chained operator
		
		boolean come = driver.findElement(By.xpath("//div[@class='hea der-logo']/a/img")).isDisplayed();
		System.out.println(come);
	}
	

}
