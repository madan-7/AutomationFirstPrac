package com.HandlingMouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		//Set Implicitly load, use to load page properly.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//get() used to load the driver	
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		driver.manage().window().maximize();
		
		
		//switch to frame		
		WebElement frames = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frames );
		
		//Actions interface to perform some actions
		Actions actions = new Actions(driver);
		Thread.sleep(5000);
		
		//locating web elements on web page
		WebElement source= driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement target= driver.findElement(By.xpath("//div[@id='trash']"));
		
		//actions for drag and drop
		actions.dragAndDrop(source, target).perform();
		
		
		
		
	}

}









						






				
