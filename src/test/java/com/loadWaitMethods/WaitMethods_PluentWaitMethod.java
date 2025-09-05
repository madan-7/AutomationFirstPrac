package com.loadWaitMethods;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class WaitMethods_PluentWaitMethod {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
	 Wait<WebDriver> fluentWait = new FluentWait<WebDriver> (driver)
			 .withTimeout(Duration.ofSeconds(10))
			 .pollingEvery(Duration.ofSeconds(2))
			 .ignoring(NoSuchElementException.class);
		
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    driver.manage().window().maximize();
		    
		    WebElement until = fluentWait.until(new Function<WebDriver, WebElement>() {
		    	public WebElement apply(WebDriver driver) {
		    	WebElement element=	driver.findElement(By.xpath("//input[@name='username']"));
		    	 return element;
		    	}
		    });
		    
		    until.sendKeys("Admin");
		    
		    
		    
	}

}
