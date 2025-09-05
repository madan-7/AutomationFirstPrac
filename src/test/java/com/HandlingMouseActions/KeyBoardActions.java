package com.HandlingMouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		//Set Implicitly load, use to load page properly.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//get() used to load the driver
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		//Actions class
			Actions actions = new Actions(driver);
			
			driver.findElement(By.id("inputText1")).sendKeys("Wellcome to assam"); 
			
			//Ctrl+A ( to select text in box)
			actions.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
			
			//Ctrl+C ( to copy text in box)
			actions.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
			
			//Ctrl+tap ( to move one text box to another text box)			
			actions.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
			
			//Ctrl+V ( Here past the next in next text box)	
			actions.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
			
			
			//if we are using 3 keys (ctrl+Shift+A)
			Actions sendKeys = actions.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL);
	}

}
