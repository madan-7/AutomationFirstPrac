package com.HandlingMouseActions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();

		//Set Implicitly load, use to load page properly.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//get() used to load the driver
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Tab will open in new tap on same window
	//	driver.switchTo().newWindow(WindowType.TAB);
		
		//Window will open in new window
		driver.switchTo().newWindow(WindowType.WINDOW);		
		driver.get("https://www.facebook.com/login/");
		
		
	}

}
