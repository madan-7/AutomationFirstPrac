package com.JavaScriptExcuters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPages {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		//1)Scrolling the page until pixel reaches
	//	js.executeScript("window.scrollBy(0,2000)", "");
		//Printing pixel value 
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
		WebElement elem = driver.findElement(By.xpath("//h2[normalize-space()='Pagination Web Table']"));
		
		//2)Scrolling upto text visible by xpath
	//	js.executeScript("arguments[0].scrollIntoView();", elem);
	//	System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//3)Scroll with end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//4)Scroll from bottom to top
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)","");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
	}

}
