package com.HandlingAlerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutheticatedPopUps {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		
				//Syntax passing credentionals in load URL
		//https://username:password@the-internet.herokuapp.com/basic_auth
		
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
