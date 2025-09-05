package com.HandlingMouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {

WebDriver driver = new ChromeDriver();
		
		//Set Implicitly load, use to load page properly.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	//get() used to load the driver
	    driver.get("https://demo.nopcommerce.com/");
	    driver.manage().window().maximize();
	    
	    WebElement findElement = driver.findElement(By.xpath("(//a[normalize-space()='Computers'])[1]"));
	    
	    WebElement findElement1 = driver.findElement(By.xpath("(//a[normalize-space()='Notebooks'])[1]"));

	    //Here sending the object ref to actions Interface
	    Actions action = new Actions(driver);
	    
	    // mouse hover to req web element and click (build() ---> create action and perform()--->  complete the action.
	    	//action.moveToElement(findElement).moveToElement(findElement1).click().build().perform();
	    
	    //or we can use directly perform() bez internally its call build() only
	    action.moveToElement(findElement).moveToElement(findElement1).click().perform();
	    
	    
	    
	}

}
