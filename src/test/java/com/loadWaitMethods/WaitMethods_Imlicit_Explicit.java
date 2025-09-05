package com.loadWaitMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMethods_Imlicit_Explicit {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		
		// get () used to load the driver
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		// implicitlyWait() used instead of [Thread.sleep()]
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		  // Explicit wait declaration
		WebDriverWait driverWait = new  WebDriverWait(driver, Duration.ofSeconds(10));
		  
		  WebElement element =
		  driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']"))); 
		  element.sendKeys("Admin");
		  
		  WebElement pass =
		  driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']"))); 
		  pass.sendKeys("admin123");
		  
		  WebElement clickButton = driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		  clickButton.click();
		  
		 
	}

}
