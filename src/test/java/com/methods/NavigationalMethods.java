package com.methods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalMethods {

	public static void main(String[] args) throws MalformedURLException {

		WebDriver driver = new ChromeDriver();
		
		//For loading URL we can use get() and its accepted only String format
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		
		//For loading URL we can use Navigate().to() it will take String format and also object reference and by default its using get()
	//	URL myUrl  = new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	//	driver.navigate().to(myUrl);
		//or
	//	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	
	  //back() forward(), refresh(), using //Now we can open two URL's
	  driver.get("https://www.facebook.com/"); 
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  driver.navigate().back(); System.out.println("1st opend URL(after back): "+driver.getCurrentUrl());
	  
	  driver.navigate().forward();
	  System.out.println("2st opend URL(after forward): " +driver.getCurrentUrl());
	  
	  driver.navigate().refresh();
	  System.out.println("Refresh URL: "+ driver.getCurrentUrl());
	 
	}
	
	

}
