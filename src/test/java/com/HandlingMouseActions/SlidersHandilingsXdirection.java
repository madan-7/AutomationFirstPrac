package com.HandlingMouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SlidersHandilingsXdirection {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();

		//Set Implicitly load, use to load page properly.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//get() used to load the driver
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/#google_vignette");
		driver.manage().window().maximize();
		
		//Actions class
			Actions actions = new Actions(driver);


		//1)locating the web element of X-direction.(Forward)
		WebElement loca = driver.findElement(By.xpath(" (//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
		
		//find original locations
		Point location = loca.getLocation();
		System.out.println("Current location of web element: " +location);  //(58, 249)

		
		
		//performing actions
		actions.dragAndDropBy(loca, 100, 249).perform();
		
		//checking its moved or not by getLoaction().
		Point location1 = loca.getLocation();
		System.out.println("after location of web element: " +location1);
		
	
		Thread.sleep(3000);
		//2)locating the web element of X-direction.(Backward)
				WebElement max = driver.findElement(By.xpath(" (//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
				
				//find original locations
				Point maxValue = max.getLocation();
				System.out.println("Current location of web element: " +maxValue);  //613, 256)

								
				//performing actions
				actions.dragAndDropBy(max, -113, 256).perform();
				
				//checking its moved or not by getLoaction().
				Point locat = max.getLocation();
				System.out.println("after location of web element: " +locat);

	}

}
