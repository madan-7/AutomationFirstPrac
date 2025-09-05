package com.DatePickers;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickers3 {

	
public static void selectYearmoth(WebDriver driver, String year, String month) {
		
		while(true) {
		WebElement findElement = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		
		Select select = new Select(findElement);
		
		String text = select.getFirstSelectedOption().getText();
		
		String text2 = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		if(text.equals(month) && text2.equals(year)) {
					
			break;
		}
		
		//for selecting previous dates.
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		
		}
}
	

	public static void selectDate(WebDriver driver, String date) {
		
		
		List<WebElement> text = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td//a"));
		
		for(WebElement element: text) {
			if(element.getText().equals(date)) {
				element.click();
				break;
			}
			
		
		}
		
	}
	
	
	//this was to click previous dates if need future dates then change 32 line.
	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		//Set Implicitly load, use to load page properly.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		//get() used to load the driver
		driver.get("https://dummy-tickets.com/buyticket");
		driver.manage().window().maximize();
		
		//select HOTEL
		driver.findElement(By.xpath("//a[@data-tab='#twotabtabtwo']")).click();

		//select and click the date box
		driver.findElement(By.xpath("//input[@placeholder='Check In Date']")).click();


		//Req DOB
		String month="May";
		String year ="2024";
		String date="10";
		
		selectYearmoth(driver, year, month);
		selectDate(driver, date);
		
				
	}
	
	
	}


