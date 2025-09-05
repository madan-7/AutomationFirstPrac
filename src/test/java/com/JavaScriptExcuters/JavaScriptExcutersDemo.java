package com.JavaScriptExcuters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExcutersDemo {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Java Script executer is interface so we are up casting to WebDriver(I) from ChromeDriver(C)
		JavascriptExecutor js= (JavascriptExecutor) driver ;
			
		//xpath to send values to input box
		WebElement input = driver.findElement(By.xpath("//input[@id='name']"));
		
		//executing by JS method 
		js.executeScript("arguments[0].setAttribute('value','Madan')", input);
		
		//xpath to click the radio Button/check boxes
		WebElement radioButton = driver.findElement(By.xpath("//input[@id='sunday']"));
				
		//executing by method 
		js.executeScript("arguments[0].click()", radioButton);
				
		
		
	}

}
