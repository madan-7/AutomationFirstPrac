package com.loadWaitMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoad {
	
	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	
	//Checking the page loading with duration
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	    
	    //Adding implicitly wait.
	 //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	    
	   driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

}
}