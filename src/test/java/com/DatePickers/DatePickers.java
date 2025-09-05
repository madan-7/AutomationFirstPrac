package com.DatePickers;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickers {

	public static void main(String[] args) {

	WebDriver driver = new ChromeDriver();
		
		//Set Implicitly load, use to load page properly.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
			
	//get() used to load the driver
	    driver.get("https://jqueryui.com/datepicker/");
	    driver.manage().window().maximize();
	    
		//switch to frame
		driver.switchTo().frame(0);
	    
	    //1) if date picker allows to enter date value directly.
	    	//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("08/5/2025"); // MM/DD/YYYY
	    
	    //2) dynamic date pickers
	    
		//expected dates
	    String years="2025";
	    String months="October";
	    String dates="3";
	    
	    //clicking on date picker box
	    driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	    
	    while(true) {
	    	
	    	//taking month and year by xpath
	    	String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	    	String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	    
	    //condition to match our actual and expected dates
	    if(month.equals(months) && year.equals(years)) {
	    	break;
	    }
	    
	    driver.findElement(By.xpath("//a[@data-handler='next']")).click(); //to check for future
	   // driver.findElement(By.xpath("//a[@data-handler='prev']")).click(); //to check for past
	    
	}
	    
	    //clicking on date after the opening month and year by above process  
	
	    	List<WebElement> findElements = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
	    	
	    	for(WebElement listDates: findElements ) {
	    	
	    		if(listDates.getText().equals(dates)) {
	    			listDates.click();
	    			break;
	    			    		}
	    	}
	    	
	    	
	    	
	    }
	}

