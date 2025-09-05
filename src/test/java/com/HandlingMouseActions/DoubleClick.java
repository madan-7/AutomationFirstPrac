package com.HandlingMouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		//Set Implicitly load, use to load page properly.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//get() used to load the driver
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		//Switching to frame
		driver.switchTo().frame("iframeResult");
		
		//xpath to get locate web elements
		WebElement filed1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement filed2 = driver.findElement(By.xpath("//input[@id='field2']"));		
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		//clearing input box
		filed1.clear();
		filed1.sendKeys("Madan");
		
		Actions actions = new Actions(driver);
		
		//performing the double click action
		actions.doubleClick(button).perform();
		
		//Here we are not get the text by getText(), we can use instead of that getAttribute("value in DOC structure") 
		String attribute = filed2.getAttribute("value");		
		
		
		//then compare input and out put
		if(attribute.equals("Madan")) {
			System.out.println("TestPass");
		}else {
			System.out.println("TestFailed...!");
		}


		
		
	}

}
