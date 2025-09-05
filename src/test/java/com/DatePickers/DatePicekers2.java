package com.DatePickers;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicekers2 {
	
	
	public static void selectYearMonth(WebDriver driver, String month,String year) {

		while (true) {
		    Select yearSelect = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		    String currentYear = yearSelect.getFirstSelectedOption().getText();
		    System.out.println("Current year: " + currentYear + " | Target year: " + year);

		    if (currentYear.equals(year)) {
		        break;
		    }
		    
		    driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); // previous
		   
		}
		
		WebElement month_drop=driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		Select monthdrp=new Select(month_drop);
		monthdrp.selectByVisibleText(month);
	}
	
	
	public static void selectDate(WebDriver driver, String date) {	
	

		//date selection
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td//a"));

		for(WebElement dt:allDates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}	


		}
	}

	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		//Set Implicitly load, use to load page properly.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		//get() used to load the driver
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();

		//select and click the date box
		driver.findElement(By.xpath("//input[@id='dob']")).click();


		//Req DOB
		String month="May";
		String year ="2024";
		String date="10";

		selectYearMonth(driver, month, year);
		selectDate(driver, date);

		
	
	}
	
}




