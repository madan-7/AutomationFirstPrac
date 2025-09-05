package com.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMenthods {

	
	
	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
		
		
		
		    driver.get("https://demo.nopcommerce.com/register");
		    
		    
		    //isDisplayed() used to display the web element text displayed or not [Text]
		    boolean displayed = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		    System.out.println(displayed);
		    
		  //isEnabled() used to find the web element enable or not (checkbox/radio]
		   boolean enabled = driver.findElement(By.xpath("//button[@name='register-button']")).isEnabled();
		 
		    System.out.println(enabled);
		    
		    
		  //isSelected() used to select the web element selected or not (radio/checkbox/dropdowns]
		   WebElement selected = driver.findElement(By.xpath("//input[@type='radio']"));
		    System.out.println("Befor clicking: "+ selected.isSelected()); //false
		   
		    //clicking the button here
		    selected.click();
		    
		    System.out.println("After click: "+ selected.isSelected());// true
		    
		    
		    
		    
		    
		    
		    
		    
		    
		
	}
}
