package com.HandlingMouseActions;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();

		//Set Implicitly load, use to load page properly.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//get() used to load the driver
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();

		//xpath to select the right click elements
		WebElement findElement = driver.findElement(By.xpath("//span[normalize-space()='right click me']"));
		WebElement findElement1 = driver.findElement(By.xpath("//span[normalize-space()='Paste']"));

		//Action interface 
		Actions actions = new Actions(driver);

		//Right click context and performing action
		actions.contextClick(findElement).perform();

		Thread.sleep(3000);
		findElement1.click();
		Thread.sleep(3000);

		//Alerts accept
		driver.switchTo().alert().accept();


	}

}
