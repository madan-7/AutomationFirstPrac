package com.HandlingAlerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlertsByExpilcilyWait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//Creating ExpilcilyWait load
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//Xpath to clicking alerts element
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();		
		
		//Capturing alert using conditions until
		Alert myAlert = driverWait.until(ExpectedConditions.alertIsPresent());
		
		myAlert.accept();
		
		

	}

}
