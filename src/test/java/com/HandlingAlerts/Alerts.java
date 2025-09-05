package com.HandlingAlerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();

		/*	
		//1) Normal alert with OK button
		  //Find alert box and click on that box (if alert box contains only one button
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

		//Switching to alert window [this was we can not inspect bcz alerts windows was diff and web page was diff.
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);

		//accept alerts
		alert.accept();

		//or we can write in one line.
		driver.switchTo().alert().accept();
		 */

		/*	//2) Confirmation alert with OK & Cancel buttons.

		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();

		//Switching to alert window
		Alert alert = driver.switchTo().alert();
		Thread.sleep(5000);
		//alert.accept();   //close the alert window using OK button
		//alert.dismiss();	//close the alert window using Cancel button


		//Capturing the text on alerts windows,

		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		 */

		//3) Prompt alerts --input boxes

		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();

		//validating text content in alert JS window page
		String text = alert.getText();
		System.out.println(text);
		//Validating text 
		if(text.equals("I am a JS prompt")) {
			System.out.println("As expected text was displying: "+text);
		}else {
			System.out.println("As expected text was not displying");
		}

		//passing some text to that input alert box [Its pass internally we cannot view in ]
		alert.sendKeys("Hello");

		//Accepting button
		alert.accept();


		String text2 = driver.findElement(By.xpath("//p[@id='result']")).getText();

		if(text2.contains("Hell")) {
			System.out.println("Test pass");
		}
		else {
			System.out.println("Katham..ByeBye");
		}


		//


	}

}
