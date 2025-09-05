package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selectors {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		//it extends the browser/ maximize the browser window
		driver.manage().window().maximize();
		
		// by ID css selectors (tag#id)
	//	driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("tag#id");
	//	driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");// without tag also we can run (Tag as optional)
	
		//tag class (tag.className)
	//	driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("tag.className");
		
		//tag with attribute --- tag[attribute="value"]		
	//	driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("from tag[attribute]");
	//	driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("from tag[attribute]"); // tag was optional
		
		// tag class attribute tag -- className[attribute="value"]
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("tagClassAttribute");
	
	}
	
	

}
