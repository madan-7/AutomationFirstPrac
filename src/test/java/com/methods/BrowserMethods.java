package com.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	
	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver = new ChromeDriver();
		
		
		//get () used to load the driver
		    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    
		    Thread.sleep(4000);
		    
		    driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		    Thread.sleep(4000);
		    
		    //its will close the main window (1st opended window by driver.		    
		  //  driver.close();
		    
		    //its will close the all open window by driver	
		    driver.quit();
	}
}
